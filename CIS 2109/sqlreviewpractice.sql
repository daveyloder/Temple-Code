--- find salesman with least orders ---
SELECT
    SALESMAN_ID,
    COUNT(*)
FROM
    OT_ORDERS
WHERE
    SALESMAN_ID IS NOT NULL
GROUP BY
    SALESMAN_ID
ORDER BY
    COUNT(*) ASC FETCH FIRST 4 ROWS ONLY;

--- find salesman with least amount of orders new queriy ---

/* determine for each customer how many locations are in the same state as that
customer. Develop a list of all the customers by name
with the number of locations in the same state as that customer */
SELECT
    NAME,
    COUNT(LOCATION_ID)
FROM
    OT_CUSTOMERS C
    LEFT OUTER JOIN OT_LOCATIONS L
    ON L.STATE = SUBSTR(C.ADDRESS,
    -2)
GROUP BY
    NAME
ORDER BY
    COUNT(L.LOCATION_ID) DESC;

---- Find the most popular products i.e. those that have sold more than 650 units
SELECT
    PRODUCT_ID,
    SUM(QUANTITY /*[ DISTINCT | ALL ] EXPR*/ )
FROM
    OT_ORDER_ITEMS
GROUP BY
    PRODUCT_ID
HAVING
    SUM(QUANTITY /*[ DISTINCT | ALL ] EXPR*/ ) > 650
ORDER BY
    SUM(QUANTITY /*[ DISTINCT | ALL ] EXPR*/ ) DESC;

---- For each of these products list the order id's that include them, along with a count
---- of unique items included in each order ---
SELECT
    ORDER_ID,
    COUNT(DISTINCT PRODUCT_ID)
FROM
    OT_ORDER_ITEMS
WHERE
    ORDER_ID IN (
        SELECT
            ORDER_ID
        FROM
            OT_ORDER_ITEMS
        WHERE
            PRODUCT_ID IN (
                SELECT
                    PRODUCT_ID
                FROM
                    OT_ORDER_ITEMS
                GROUP BY
                    PRODUCT_ID
                HAVING
                    SUM(QUANTITY) > 650
            )
    )
GROUP BY
    ORDER_ID;

--- What are the other products?? (Only the other products)
--- Customer names of customers who have ordered (on same or different orders) both products 70  and 64:
SELECT
    CUSTOMER_ID,
    NAME
FROM
    OT_CUSTOMERS
    NATURAL JOIN OT_ORDERS
    NATURAL JOIN OT_ORDER_ITEMS
    NATURAL JOIN OT_PRODUCTS
WHERE
    PRODUCT_ID = 70 INTERSECT
    SELECT
        CUSTOMER_ID,
        NAME
    FROM
        OT_CUSTOMERS
        NATURAL JOIN OT_ORDERS
        NATURAL JOIN OT_ORDER_ITEMS
        NATURAL JOIN OT_PRODUCTS
    WHERE
        PRODUCT_ID = 64;