-- Multiple Table Joins --
-- All employees and their departments --
SELECT
    EMPLOYEE_ID,
    DEPARTMENT_ID
FROM
    HR_EMPLOYEES E
    LEFT OUTER JOIN HR_DEPARTMENTS ED
    ON E.EMPLOYEE_ID = ED.EMPLOYEE_ID
    LEFT OUTER JOIN
 -- All departments and their employees --
 -- Self-Joins --
 -- Departments and their admin departments
    SELECT
        D.DEPARTMENT AS DEPARTMENT_NAME,
        AD.DEPARTMENT AS AD_NAME
    FROM
        DEPARTMENT D
        INNER JOIN DEPARTMENT AD
        ON D.ADMIN_DPT = AD.DEPARTMENT_ID;