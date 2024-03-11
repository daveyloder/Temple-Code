--- Select Statements---

SELECT
 /* Can use functions
    Can use CASE selection
    Can include use alias */
    X
FROM
 /* Runs first */
    X
WHERE
 /* Conditions
    Can use functions in the where CLAUSE
    Can use math equations */
    X
 --- Joins (Inner and Outer) ---

 /*Inner Joins include what both have
  Outer includes everything between the to. 
  Can choose main table either left, right, or full (oracle specific)

*/
 --- Advanced Queries ---
 --- Subqueries ---
 --- Dual queries ---

 /* Always true, returns everything */
    SELECT
 --- ... ---
    FROM
 --- ... ---
    WHERE
        EXISTS(
            SELECT
                1
            FROM
                DUAL
        );