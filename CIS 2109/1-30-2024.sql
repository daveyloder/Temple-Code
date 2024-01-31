Select *
    FROM HR_Employees, HR_Departments
where HR_Employees.Department_id = HR_Departments.Department_id 
Order by
    Employee_id;
-- Examples --
-- Inner Join --
-- Before --
Select c.country_id, country_name, location_id, address
    from ot_countries c, ot_locations l
    where c.country_id = l.country_id
        and country_name LIKE 'A%';
-- After --
Select c.country_id, country_name, location_id, address
from ot_countries c INNER Join ot_locations l ON c.country_id = l.country_id
where country_name like 'A%';

-- Outer Join --
-- Before -- 
-- Left Outer --
Select c.country_id, country_name, location_id, address
from ot_countries c Left Outer Join ot_locations l ON c.country_id = l.country_id;

-- Right Outer --
Select c.country_id, country_name, location_id, address
from ot_countries c Right Outer Join ot_locations l ON c.country_id = l.country_id;

-- Full Outer --
Select c.country_id, country_name,l.country_id, location_id, address
from ot_countries c Full Outer Join ot_locations l ON c.country_id = l.country_id;

-- Locations with no countries --
Select c.country_id, country_name,l.country_id, location_id, address
from ot_countries c Full Outer Join ot_locations l ON c.country_id = l.country_id
where c.country_id is Not null and l.country_id is not null;
