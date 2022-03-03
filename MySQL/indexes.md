Select *from students;

| id | name   | age  | gender |
|:----|:-----|:-----|:----|
|  1 | haiden |   20 | M      |
|  2 | aswath |   18 | M      |
|  3 | sanboi |   18 | M      |


3 rows in set (0.00 sec)


 Show index from students;

| Table    | Non_unique | Key_name      | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
|:----|:-----|:-----|:------|:------|:-----|:-----|:-----|:-----|:----|:-----|:----|:-----|:-----|:----|
| students |          0 | PRIMARY       |            1 | id          | A         |           2 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| students |          1 | ui_id         |            1 | id          | A         |           3 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| students |          1 | personal_info |            1 | name        | A         |           3 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |


3 rows in set (0.01 sec)


<h1>Create Index</h1>

Create index categories on students(age);<br>
  Query OK, 0 rows affected (0.05 sec)<br>
  Records: 0  Duplicates: 0  Warnings: 0


  Show index from students;

| Table    | Non_unique | Key_name      | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
|:----|:----|;----|:-----|:----|:----|:----|:----|:----|:-----|:----|:----|:-----|:-----|:-----|
| students |          0 | PRIMARY       |            1 | id          | A         |           2 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| students |          1 | ui_id         |            1 | id          | A         |           3 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| students |          1 | personal_info |            1 | name        | A         |           3 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
| students |          1 | categories    |            1 | age         | A         |           2 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |

4 rows in set (0.01 sec)




