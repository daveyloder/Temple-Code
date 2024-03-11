UPDATE OT_LOCATIONS
SET
    STATE = 'NY'
WHERE
    LOCATION_ID = 7;

UPDATE OT_LOCATIONS
SET
    STATE = 'PA'
WHERE
    LOCATION_ID = 8;

UPDATE OT_LOCATIONS
SET
    STATE = 'PA'
WHERE
    LOCATION_ID = 6;

UPDATE OT_LOCATIONS
SET
    STATE = 'TX'
WHERE
    LOCATION_ID = 5;

COMMIT;

UPDATE OT_ORDER_ITEMS
SET
    PRODUCT_ID = 70
WHERE
    ORDER_ID = 12
    AND ITEM_ID = 12;

UPDATE OT_ORDER_ITEMS
SET
    PRODUCT_ID = 64
WHERE
    ORDER_ID = 12
    AND ITEM_ID = 11;

UPDATE OT_ORDER_ITEMS
SET
    PRODUCT_ID = 70
WHERE
    ORDER_ID = 20
    AND ITEM_ID = 2;

UPDATE OT_ORDER_ITEMS
SET
    PRODUCT_ID = 64
WHERE
    ORDER_ID = 20
    AND ITEM_ID = 1;

COMMIT;

--- Find salesman with least orders
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
    COUNT(*) ASC FETCH FIRST 1 ROWS ONLY;

--- Remove the Fetch first 1 rows to see that there are more

LAKSHMAN SUBRAMANYA

---- But there are more than 1 salespeople with so few orders:
SELECT
    SALESMAN_ID,
    COUNT(*)
FROM
    OT_ORDERS
GROUP BY
    SALESMAN_ID
HAVING
    COUNT(*) = (
        SELECT
            COUNT(*)
        FROM
            OT_ORDERS
        WHERE
            SALESMAN_ID IS NOT NULL
        GROUP BY
            SALESMAN_ID
        ORDER BY
            COUNT(*) ASC FETCH FIRST 1 ROWS ONLY
    );

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
    COUNT(LOCATION_ID) DESC;

---- Find the most popular products i.e. those that have sold more than 650 units
SELECT
    PRODUCT_ID,
    SUM(QUANTITY)
FROM
    OT_ORDER_ITEMS
GROUP BY
    PRODUCT_ID
ORDER BY
    SUM(QUANTITY) DESC;

---- For each of these products list the order id's that include them, along with a count
---- of unique items included in each order
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
                    SUM(QUANTITY) >650
            )
    )
GROUP BY
    ORDER_ID;

---- What are the other products?? (Only the other products)
SELECT
    ORDER_ID,
    PRODUCT_ID
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
                    SUM(QUANTITY) >650
            )
    )
    AND PRODUCT_ID NOT IN ((
        SELECT
            PRODUCT_ID
        FROM
            OT_ORDER_ITEMS
        GROUP BY
            PRODUCT_ID
        HAVING
            SUM(QUANTITY) >650
    ))
ORDER BY
    ORDER_ID,
    PRODUCT_ID;

--- Customer names of customers who have ordered (on same or different orders) both products 70  and 64:
--Query:

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

--- To get the customers who have purchased these products in the same order, all you have to
--- is add o1.orderid in the above select statement. Then you can select customername from (all the above)
---- to get the distinct values. But there are other ways as well:
-- Show the customer ID and name for all the customers who have ordered both products with IDs 3 and 4 on the same order
SELECT
    DISTINCT CUSTOMER_ID,
    NAME
FROM
    OT_CUSTOMERS
WHERE
    CUSTOMER_ID IN (
        SELECT
            CUSTOMER_ID
        FROM
            (
                SELECT
                    P3.ORDER_ID
                FROM
                    (
                        SELECT
                            ORDER_ID
                        FROM
                            OT_ORDER_ITEMS
                        WHERE
                            PRODUCT_ID = 70
                    ) P3,
                    (
                        SELECT
                            ORDER_ID
                        FROM
                            OT_ORDER_ITEMS
                        WHERE
                            PRODUCT_ID = 64
                    ) P4
                WHERE
                    P3.ORDER_ID = P4.ORDER_ID
            )            ORDERS,
            OT_ORDERS
        WHERE
            ORDERS.ORDER_ID = OT_ORDERS.ORDER_ID
    );