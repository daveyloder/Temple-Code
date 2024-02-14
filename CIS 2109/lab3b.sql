--- Question 1 ---
UPDATE HR_DEPARTMENTS
SET
    MANAGER_ID = 205
WHERE
    DEPARTMENT_ID = 120;

COMMIT;

--- Question 1a ---

SELECT
    E.FIRST_NAME,
    E.LAST_NAME
FROM
    HR_EMPLOYEES   E
    INNER JOIN HR_DEPARTMENTS D
    ON E.EMPLOYEE_ID = D.MANAGER_ID;

--- Question 1b (non-correlated) ---
SELECT
    E.FIRST_NAME,
    E.LAST_NAME
FROM
    HR_EMPLOYEES   E
WHERE
    E.EMPLOYEE_ID IN(
        SELECT
            MANAGER_ID
        FROM
            HR_DEPARTMENTS
    );

--- Question 1c (correlated) ---
SELECT
    FIRST_NAME,
    LAST_NAME
FROM
    HR_EMPLOYEES   E
WHERE
    E.EMPLOYEE_ID IN(
        SELECT
            MANAGER_ID
        FROM
            HR_DEPARTMENTS D
        WHERE
            D.MANAGER_ID = E.EMPLOYEE_ID
    );

--- Question 1d ---
SELECT
    FIRST_NAME,
    LAST_NAME
FROM
    HR_EMPLOYEES
WHERE
    EXISTS(
        SELECT
            MANAGER_ID
        FROM
            HR_DEPARTMENTS
        WHERE
            EMPLOYEE_ID = MANAGER_ID
    );

--- Question 1e ---

--- Question 2 ---
INSERT INTO HR_JOB_HISTORY VALUES (
    200,
    TO_DATE('01-JUL-07', 'DD-MON-YY'),
    TO_DATE('01-JAN-08', 'DD-MON-YY'),
    'AC_MGR',
    110
);

INSERT INTO HR_JOB_HISTORY VALUES (
    117,
    TO_DATE('01-JUL-08', 'DD-MON-YY'),
    TO_DATE('01-JAN-09', 'DD-MON-YY'),
    'AC_MGR',
    110
);

INSERT INTO HR_JOB_HISTORY VALUES (
    119,
    TO_DATE('01-JUL-08', 'DD-MON-YY'),
    TO_DATE('01-JAN-09', 'DD-MON-YY'),
    'AC_ACCOUNT',
    110
);

COMMIT;

--- Question 2a ---