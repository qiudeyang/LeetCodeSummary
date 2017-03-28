182.[Duplicate Emails](https://leetcode.com/problems/duplicate-emails/#/description) 

`SELECT Email FROM Person GROUP BY Email HAVING count(Email)>1;`

181.[Employees Earning More Than Their Managers](https://leetcode.com/problems/employees-earning-more-than-their-managers/#/description)

`SELECT e1.Name AS Employee FROM Employee e1,Employee e2 WHERE e1.ManagerId=e2.Id AND e1.Salary>e2.Salary;`

175.[Combine Two Tables](https://leetcode.com/problems/combine-two-tables/#/description)

`SELECT p.FirstName,p.LastName,a.City,a.State FROM Person AS p LEFT OUTER JOIN Address AS a ON(p.PersonId=a.PersonId);`

183.[Customers Who Never Order](https://leetcode.com/problems/customers-who-never-order/#/description)

`SELECT c.Name AS Customers FROM Customers c WHERE c.id NOT IN (SELECT CustomerId FROM Orders);`

197.[Rising Temperature](https://leetcode.com/problems/rising-temperature/#/description)

`SELECT w2.Id FROM Weather w1,Weather w2 WHERE w1.Temperature<w2.Temperature AND TO_Days(w2.Date)-TO_Days(w1.Date)=1;`

补充一下：以上是MySQL的解法，如果是PostgreSQL，则不需要`TO_Days`。


178.[Rank Scores](https://leetcode.com/problems/rank-scores/#/description)

`SELECT Score,(SELECT count(DISTINCT Score) FROM leetcode WHERE Score>=l.Score) AS rank FROM leetcode l ORDER BY Score DESC;`

180.[Consecutive Numbers](https://leetcode.com/problems/consecutive-numbers/#/description)

`SELECT DISTINCT l1.Num AS ConsecutiveNums FROM Logs l1,Logs l2,Logs l3 WHERE l1.Num=l2.Num AND l2.Num=l3.Num AND l3.id-l2.id=1 AND l2.id-l1.id=1;`

这方法好直白，也很实在。

176.[Second Highest Salary](https://leetcode.com/problems/second-highest-salary/#/description)

`SELECT max(Salary) AS SecondHighestSalary FROM Employee WHERE Salary<(SELECT max(Salary) FROM Employee);`

这道题在于如果没有第二高薪水，则返回NULL。如果保证一定存在，则用`SELECT Salary AS SecondHighestSalary FROM Employee ORDER BY Salary DESC LIMIT 1，OFFSET 1;`

196.[Delete Duplicate Emails](https://leetcode.com/problems/delete-duplicate-emails/#/description)

`DELETE p1 FROM Person p1,Person p2 WHERE p1.Id>p2.Id AND p1.Email=p2.Email;`

这方法好直白。

184.[Department Highest Salary](https://leetcode.com/problems/department-highest-salary/#/description)

`SELECT d.Name AS Department,e.Name AS Employee,e.Salary AS Salary FROM Employee AS e,Department AS d WHERE e.DepartmentId=d.Id AND Salary=(SELECT max(Salary) FROM Employee e2 WHERE e2.DepartmentId=d.Id);`

这种题用不了GROUP BY语句。

177.[Nth Highest Salary](https://leetcode.com/problems/nth-highest-salary/#/description)

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE M INT;
  SET M = N - 1;
  RETURN (
      SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT M,1
      
  );
END

262.[Trips and Users](https://leetcode.com/problems/trips-and-users/#/description)

SELECT Request_at as Day,
       ROUND(COUNT(IF(Status != 'completed', TRUE, NULL)) / COUNT(*), 2) AS 'Cancellation Rate'
FROM Trips
WHERE (Request_at BETWEEN '2013-10-01' AND '2013-10-03')
      AND Client_id NOT IN (SELECT Users_Id FROM Users WHERE Banned = 'Yes')
GROUP BY Request_at;

根本看不懂啊....

185.[Department Top Three Salaries](https://leetcode.com/problems/department-top-three-salaries/#/description)

select d.Name Department, e1.Name Employee, e1.Salary
from Employee e1 
join Department d
on e1.DepartmentId = d.Id
where 3 > (select count(distinct(e2.Salary)) from Employee e2 where e2.Salary > e1.Salary and e1.DepartmentId = e2.DepartmentId);

根本看不懂啊....
























