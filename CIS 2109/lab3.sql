-- Question 1a --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    JH.START_DATE,
    JH.JOB_ID
FROM
    HR_JOB_HISTORY JH,
    HR_EMPLOYEES   EM
WHERE
    EM.EMPLOYEE_ID=JH.EMPLOYEE_ID;

-- Question 1b --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    JH.START_DATE,
    JH.JOB_ID
FROM
    HR_EMPLOYEES   EM
    INNER JOIN HR_JOB_HISTORY JH
    ON EM.EMPLOYEE_ID=JH.EMPLOYEE_ID;

-- Question 1c --
SELECT
    EMPLOYEE_ID,
    FIRST_NAME,
    LAST_NAME,
    START_DATE,
    JOB_ID
FROM
    HR_EMPLOYEES
    NATURAL JOIN HR_JOB_HISTORY;

-- Question 2 --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    NVL(JH.START_DATE, TO_DATE('01/01/1900', 'MM-DD-YYYY')) AS START_DATE_WITH_NVL,
    NVL(JH.JOB_ID, -99)
FROM
    HR_EMPLOYEES   EM
    LEFT OUTER JOIN HR_JOB_HISTORY JH
    ON EM.EMPLOYEE_ID = JH.EMPLOYEE_ID;

-- Question 3a --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    DE.DEPARTMENT_NAME
FROM
    HR_EMPLOYEES   EM
    INNER JOIN HR_DEPARTMENTS DE
    ON EM.DEPARTMENT_ID = DE.DEPARTMENT_ID;

-- Question 3b --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    DE.DEPARTMENT_NAME
FROM
    HR_EMPLOYEES   EM
    LEFT OUTER JOIN HR_DEPARTMENTS DE
    ON EM.DEPARTMENT_ID = DE.DEPARTMENT_ID;

-- Question 3b2 --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    DE.DEPARTMENT_NAME
FROM
    HR_EMPLOYEES   EM
    LEFT OUTER JOIN HR_DEPARTMENTS DE
    ON EM.DEPARTMENT_ID = DE.DEPARTMENT_ID
WHERE
    EM.DEPARTMENT_ID IS NULL;

-- Question 3c --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    DE.DEPARTMENT_NAME
FROM
    HR_EMPLOYEES   EM
    RIGHT OUTER JOIN HR_DEPARTMENTS DE
    ON EM.DEPARTMENT_ID = DE.DEPARTMENT_ID;

-- Question 3c2 --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    DE.DEPARTMENT_NAME
FROM
    HR_EMPLOYEES   EM
    RIGHT OUTER JOIN HR_DEPARTMENTS DE
    ON EM.DEPARTMENT_ID = DE.DEPARTMENT_ID
WHERE
    EM.EMPLOYEE_ID IS NULL;

-- Question 3d --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    DE.DEPARTMENT_NAME
FROM
    HR_EMPLOYEES   EM
    FULL OUTER JOIN HR_DEPARTMENTS DE
    ON EM.DEPARTMENT_ID = DE.DEPARTMENT_ID;

-- Question 4a --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    MAX(JH.START_DATE),
    COUNT(JH.JOB_ID)
FROM
    HR_EMPLOYEES   EM
    INNER JOIN HR_JOB_HISTORY JH
    ON EM.EMPLOYEE_ID=JH.EMPLOYEE_ID
GROUP BY
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME;

-- Question 4b --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    MAX(JH.START_DATE),
    COUNT(JH.JOB_ID)
FROM
    HR_EMPLOYEES   EM
    LEFT OUTER JOIN HR_JOB_HISTORY JH
    ON EM.EMPLOYEE_ID=JH.EMPLOYEE_ID
GROUP BY
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME;

-- Question 5a --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    J.JOB_TITLE,
    JH.START_DATE
FROM
    HR_EMPLOYEES   EM
    INNER JOIN HR_JOB_HISTORY JH
    ON EM.JOB_ID = JH.JOB_ID
    INNER JOIN HR_JOBS J
    ON JH.JOB_ID = J.JOB_ID;

-- Question 5b --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    J.JOB_TITLE,
    JH.START_DATE
FROM
    HR_EMPLOYEES   EM
    INNER JOIN HR_JOB_HISTORY JH
    ON EM.JOB_ID = JH.JOB_ID
    INNER JOIN HR_JOBS J
    ON JH.JOB_ID = J.JOB_ID
WHERE
    JH.START_DATE = EM.HIRE_DATE;

-- Question 5c --
SELECT
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    J.JOB_TITLE,
    JH.START_DATE
FROM
    HR_EMPLOYEES   EM
    LEFT OUTER JOIN HR_JOB_HISTORY JH
    ON EM.JOB_ID = JH.JOB_ID
    LEFT OUTER JOIN HR_JOBS J
    ON JH.JOB_ID = J.JOB_ID;

-- Question 5d --
SELECT
    J.JOB_TITLE,
    EM.EMPLOYEE_ID,
    EM.FIRST_NAME,
    EM.LAST_NAME,
    JH.START_DATE
FROM
    HR_EMPLOYEES   EM
    RIGHT OUTER JOIN HR_JOB_HISTORY JH
    ON EM.JOB_ID = JH.JOB_ID
    RIGHT OUTER JOIN HR_JOBS J
    ON JH.JOB_ID = J.JOB_ID;

-- Question 6a --
SELECT
    E.EMPLOYEE_ID,
    E.FIRST_NAME,
    E.LAST_NAME,
    E.HIRE_DATE,
    M.EMPLOYEE_ID AS MANAGER_ID,
    M.FIRST_NAME  AS MANAGER_FIRST_NAME,
    M.LAST_NAME   AS MANAGER_LAST_NAME,
    M.HIRE_DATE   AS MANAGER_HIRE_DATE
FROM
    HR_EMPLOYEES E
    INNER JOIN HR_EMPLOYEES M
    ON E.EMPLOYEE_ID = M.MANAGER_ID;

-- Question 6b --
SELECT
    E.EMPLOYEE_ID,
    E.FIRST_NAME,
    E.LAST_NAME,
    E.HIRE_DATE,
    M.EMPLOYEE_ID AS MANAGER_ID,
    M.FIRST_NAME  AS MANAGER_FIRST_NAME,
    M.LAST_NAME   AS MANAGER_LAST_NAME,
    M.HIRE_DATE   AS MANAGER_HIRE_DATE
FROM
    HR_EMPLOYEES E
    LEFT OUTER JOIN HR_EMPLOYEES M
    ON E.EMPLOYEE_ID = M.MANAGER_ID;

-- Question 6c --
SELECT
    E.EMPLOYEE_ID,
    E.FIRST_NAME,
    E.LAST_NAME,
    E.HIRE_DATE,
    M.EMPLOYEE_ID AS MANAGER_ID,
    M.FIRST_NAME  AS MANAGER_FIRST_NAME,
    M.LAST_NAME   AS MANAGER_LAST_NAME,
    M.HIRE_DATE   AS MANAGER_HIRE_DATE
FROM
    HR_EMPLOYEES E
    RIGHT OUTER JOIN HR_EMPLOYEES M
    ON E.EMPLOYEE_ID = M.MANAGER_ID;

-- Question 6d --
SELECT
    E.EMPLOYEE_ID,
    E.FIRST_NAME,
    E.LAST_NAME,
    E.HIRE_DATE,
    M.EMPLOYEE_ID AS MANAGER_ID,
    M.FIRST_NAME  AS MANAGER_FIRST_NAME,
    M.LAST_NAME   AS MANAGER_LAST_NAME,
    M.HIRE_DATE   AS MANAGER_HIRE_DATE
FROM
    HR_EMPLOYEES E
    INNER JOIN HR_EMPLOYEES M
    ON E.EMPLOYEE_ID = M.MANAGER_ID
WHERE
    E.HIRE_DATE < M.HIRE_DATE;