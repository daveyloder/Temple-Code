--- Examples of joins and counts

-- Counts locations per country
SELECT
    NVL(C.COUNTRY_NAME, 'UD'),
    COUNT(L.LOCATION_ID)
FROM
    OT_LOCATIONS L
    LEFT OUTER JOIN OT_COUNTRIES C
    ON L.COUNTRY_ID = C.COUNTRY_ID
GROUP BY
    C.COUNTRY_NAME;

--- VS
SELECT
    R.REGION_ID,
    REGION_NAME,
    COUNTRY_NAME,
    ADDRESS
FROM
    OT_LOCATIONS L
    RIGHT OUTER JOIN OT_COUNTRIES C
    ON L.COUNTRY_ID = C.COUNTRY_ID
 ---countries even without location
    RIGHT OUTER JOIN OT_REGION R
    ON R.REGION_ID = C.REGION_ID
 --- countries with regions including regions with no countries
;

--- Self-joins


--- the hub_id from warehouse should match the warehouse_id of the hub
SELECT
    WA.WAREHOUSE_NAME AS WNAME1,
    H.WAREHOUSE_NAME  AS HNAME1
FROM
    OT_WAREHOUSES WA
    INNER JOIN OT_WAREHOUSES H
    ON WA.HUB_ID = H.WAREHOUSE_ID;

SELECT
    W.WAREHOUSE_NAME AS WNAME,
    W.NBR_EMPLOYEES  AS WEMPL,
    H.WAREHOUSE_NAME AS HNAME
FROM
    OT_WAREHOUSES W
    INNER JOIN OT_WAREHOUSES H
    ON W.HUB_ID = H.WAREHOUSE_ID;

--- sub-queries
--- Selects countries where country_id has US, or UK
SELECT
    *
FROM
    OT_LOCATIONS
WHERE
    COUNTRY_ID IN('US', 'UK');

--- sub-queries of the same thing above but to look for a country_id stat starts with U.
SELECT
    *
FROM
    OT_LOCATIONS
WHERE
    COUNTRY_ID IN(
        SELECT
            COUNTRY_ID
        FROM
            OT_LOCATIONS
        WHERE
            COUNTRY_ID LIKE 'U%'
    );

--- Example (DO NOT RUN)
SELECT
    CUSTOMERNAME
FROM
    CUSTOMER_T
WHERE
    CUSTOMERID IN (
        SELECT
            CUSTOMERID
        FROM
            ORDER_T
    );

--- Example Query (DO NOT RUN)
SELECT
    COURSE_TITLE
FROM
    SECTION
WHERE
    SEMESTER ='Fall'
    AND YEAR = 2009
    AND COURSE_ID IN(
        SELECT
            COURSE_ID
        FROM
            SECTION
        WHERE
            SEMESTER='Spring'
            AND YEAR=2010
    );

--- Example Query for not in statement (DO NOT RUN)
SELECT
    COURSE_TITLE
FROM
    SECTION
WHERE
    SEMESTER ='Fall'
    AND YEAR = 2009
 --- Make sure to use NVL when using NOT IN
    AND COURSE_ID NOT IN(
        SELECT
            COURSE_ID
        FROM
            SECTION
        WHERE
            SEMESTER='Spring'
            AND YEAR=2010
    );

--- Correlated vs Noncorrelated Subqueries