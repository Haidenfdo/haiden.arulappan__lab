<h1>Inner Join</h1>

Select marklist.marks,marklist.grade,students.name
    -> from students
    -> inner join marklist
    -> on students.id=marklist.studid;
+-------+-------+----------+
| marks | grade | name     |
+-------+-------+----------+
|   100 | B     | Aswath   |
|   100 | B     | Santhanu |
+-------+-------+----------+
2 rows in set (0.00 sec)


<h1>Left Join</h1>


Select marklist.marks,marklist.grade,students.name
    -> from students
    -> left join marklist
    -> on students.id=marklist.studid;
+-------+-------+----------+
| marks | grade | name     |
+-------+-------+----------+
|   100 | B     | Aswath   |
|   100 | B     | Santhanu |
+-------+-------+----------+
2 rows in set (0.00 sec)


<h1>Right Join</h1>


Select marklist.marks,marklist.grade,students.name 
  from students 
  right join marklist
  on students.id=marklist.studid;
+-------+-------+----------+
| marks | grade | name     |
+-------+-------+----------+
|   100 | A     | NULL     |
|   100 | B     | Aswath   |
|   100 | B     | Santhanu |
+-------+-------+----------+
3 rows in set (0.00 sec)


<h1>Cross Join</h1>


Select marklist.marks,marklist.grade,students.name
  from students 
  cross join marklist 
  on students.id=marklist.studid;
+-------+-------+----------+
| marks | grade | name     |
+-------+-------+----------+
|   100 | B     | Aswath   |
|   100 | B     | Santhanu |
+-------+-------+----------+
2 rows in set (0.00 sec)