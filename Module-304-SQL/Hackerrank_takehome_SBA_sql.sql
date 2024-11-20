

-- ============== SBA 2 - TAKE HOME =========================
select * from student;
select * from studentcourse;
select * from course;

-- 2) LISTS NUMBER OF COURSES OF EACH DEPARTMENT
SELECT d.name AS 'Department Name', COUNT(c.deptId) AS 'Number of Courses'
FROM department d, course c
WHERE c.deptId = d.id
GROUP BY d.name
ORDER BY COUNT(c.deptId) asc, d.name asc;

-- 3)LISTS COURSE AND NUMBER OF STUDENTS IN THAT COURSE
SELECT c.name AS 'Course Name', COUNT(sc.studentId) AS 'Number of Students'
FROM course c, studentcourse sc, student s
WHERE sc.courseId = c.id
    AND sc.studentId = s.id
GROUP BY c.name
ORDER BY COUNT(sc.studentId) DESC, c.name ASC;

-- 4)LIST COURSES WITHOUT FACULTY
SELECT c.name AS 'Course Name' 
FROM course c 
WHERE c.id NOT IN (SELECT fc.courseId FROM facultycourse fc) 
ORDER BY c.name asc;

-- 5) LIST NUMBER OF STUDENTS IN COURSES WIHTOUT FACULTY
SELECT c.name AS 'Course Names', 
COUNT(sc.courseId) AS 'Number of Students'
FROM course c, studentcourse sc 
WHERE c.id NOT IN (SELECT fc.courseId FROM facultycourse fc)
    AND c.id = sc.courseId
GROUP BY c.name
ORDER BY COUNT(sc.courseId) DESC, c.name ASC;

-- 6) Lists total number of students enrolled each year
SELECT COUNT(DISTINCT sc.studentId) AS 'Total Number Of Students', YEAR(sc.startDate) AS Year
FROM studentcourse sc, student s
WHERE sc.studentId = s.id
GROUP BY YEAR(sc.startDate)
ORDER BY YEAR(sc.startDate) ASC, 
    COUNT(DISTINCT sc.studentId) DESC;

-- 7) List Start date and total number of students enrolled in August of each year
SELECT DATE(sc.startDate) AS 'Start Date', 
COUNT(DISTINCT sc.studentId) AS 'Total Number Of Students'
FROM studentcourse sc, student s
WHERE sc.studentId = s.id
    AND MONTH(sc.startDate) = 8
GROUP BY YEAR(sc.startDate), DATE(sc.startDate)
ORDER BY DATE(Sc.startDate) ASC, 
COUNT(DISTINCT sc.studentId) ASC;

-- 8) LIst students name and number of courses in their major 
SELECT s.firstname AS 'First Name', s.lastname AS 'Last Name',
COUNT(sc.courseId) AS 'Number of Major Courses'
FROM student s, course c, studentcourse sc, department d
WHERE s.id = sc.studentId
    AND sc.courseId = c.id
    AND c.deptId = d.id
    AND s.majorId = d.id
GROUP BY sc.studentId 
ORDER BY COUNT(sc.courseId) DESC, 
s.firstname ASC, 
s.lastname ASC;

-- 9) List Name and Average of students with less than 50%
SELECT s.firstname AS 'First Name', s.lastname AS 'Last Name',
ROUND(AVG(sc.progress),1) AS 'Average Progress' 
FROM student s, studentcourse sc
WHERE s.id = sc.studentId
GROUP BY sc.studentId
HAVING ROUND(AVG(sc.progress),1) < 50 
ORDER BY ROUND(AVG(sc.progress),1) DESC, s.firstname ASC,
s.lastname ASC;

-- 10) LIST COURSE NAME AND STUDENT"S AVERAGE PROGRESS IN THAT COURSE
SELECT c.name AS 'Course Name', 
ROUND(AVG(sc.progress),1) AS 'Average Progress' 
FROM studentcourse sc, course c
WHERE c.id = sc.courseId
GROUP BY sc.courseId
ORDER BY ROUND(AVG(sc.progress),1) DESC, c.name ASC;

-- 11) COURSE WITH THE HIGHEST AVERAGE PROGRESS
SELECT c.name AS 'Course Name', 
ROUND(AVG(sc.progress),1) AS 'Average Student Progress' 
FROM studentcourse sc, course c
WHERE sc.courseId = c.id
GROUP BY sc.courseId
ORDER BY ROUND(AVG(sc.progress),1) DESC 
LIMIT 1;

-- 12) LIST FACULTY NAME AND THE AVERAGE PROGRESS OF THEIR COURSES
SELECT f.firstname AS 'First Name', f.lastname AS 'Last Name',
ROUND(AVG(sc.progress),1) AS 'Average Progress'
FROM faculty f, course c, studentcourse sc, facultycourse fc
WHERE sc.courseId = c.id
    AND f.id = fc.facultyId
    AND fc.courseId = c.id
GROUP BY f.id
ORDER BY ROUND(AVG(sc.progress),1) DESC, f.firstname ASC,
f.lastname ASC;

-- 13) MIN AND MAX GRADES
SELECT s.firstname 'First Name', s.lastname AS 'Last Name', 
CASE
        WHEN MIN(sc.progress) < 40 THEN 'F'
        WHEN MIN(sc.progress) < 50 THEN 'D'
        WHEN MIN(sc.progress) < 60 THEN 'C'
        WHEN MIN(sc.progress) < 70 THEN 'B'
        ELSE 'A'
    END AS `Minimum Grade`,
CASE  
        WHEN MAX(sc.progress) < 40 THEN 'F'
        WHEN MAX(sc.progress) < 50 THEN 'D'
        WHEN MAX(sc.progress) < 60 THEN 'C'
        WHEN MAX(sc.progress) < 70 THEN 'B'
        ELSE 'A'
    END AS `Maximum Grade`
FROM studentcourse sc
JOIN student s
ON sc.studentId = s.id
GROUP BY sc.studentId
ORDER BY `Minimum Grade` DESC, `Maximum Grade` DESC,
    s.firstname ASC, s.lastname ASC;