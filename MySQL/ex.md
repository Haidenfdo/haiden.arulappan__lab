<h1>Creating Table 1</h1>

Create table students(id int primary key auto_increment,<br>
    -> name varchar(100) not nll,<br>
    -> email varchar(100) not null,<br>
    -> mobile_no bigint not null,<br>
    -> password varchar(100) not null,<br>
    -> gender char(1) not null,<br>
    -> dob date,<br>
    -> created_date timestamp not null default current_timestamp,<br>
    -> unique (email),<br>
    -> check (gender in ('M','F')));<br>

desc students;<br>

| Field        | Type         | Null | Key | Default           | Extra             |
|:----|:-----|:-----|:----|:----|:----|
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| name         | varchar(100) | NO   |     | NULL              |                   |
| email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| password     | varchar(100) | NO   |     | NULL              |                   |
| gender       | char(1)      | NO   |     | NULL              |                   |
| dob          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

8 rows in set (0.01 sec)

<h1>Creating Table 2</h1>
 create table student_class(id int primary key auto_increment,<br>
    -> student_id int not null,<br>
    -> class int not null,<br>
    -> status varchar(20) not null,<br>
    -> foreign key(student_id) references students(id),<br>
    -> check(class >=1 and class <=12),<br>
    -> check(status in ('ACTIVE','INACTIVE')));<br>
Query OK, 0 rows affected (0.05 sec)<br>

 desc student_class;

| Field      | Type        | Null | Key | Default | Extra          |
|:----|:----|:-----|:----|:----|:----|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |

4 rows in set (0.00 sec)


<h1>####1.Student Registration</h1>

insert into students(name,email,mobile_no,password,gender,dob,created_date) values('Haiden','haidenfdo@gmail.com',<br>9043494315,'password','M','2002-01-31','2021-07-20');<br>
Query OK, 1 row affected (0.01 sec)<br><br>

insert into students(name,email,mobile_no,password,gender,dob,created_date) values('vimal','pytacax@gmail.com',<br>9043494315,'password','M','2002-07-14','2021-07-20');<br>
Query OK, 1 row affected (0.01 sec)<br><br>

insert into students(name,email,mobile_no,password,gender,dob,created_date) values('rishi','brainy@gmail.com',<br>9043494315,'password','M','2002-08-20','2021-07-20');<br>
Query OK, 1 row affected (0.00 sec)<br><br>

<h1>####2.List All Students</h1>

select * from students;

| id | name   | email               | mobile_no  | password | gender | dob        | created_date        |
|:-----|:----|:----|:----|:-----|:----|:----|:-----|
|  1 | Haiden | haidenfdo@gmail.com | 9043494315 | password | M      | 2002-01-31 | 2021-07-20 00:00:00 |
|  2 | vimal  | pytacax@gmail.com   | 9043494315 | password | M      | 2002-07-14 | 2021-07-20 00:00:00 |
|  3 | rishi  | brainy@gmail.com    | 9043494315 | password | M      | 2002-08-20 | 2021-07-20 00:00:00 |

3 rows in set (0.00 sec)


<h1>###4.Update Password</h1>

update students set password='tacax' where id=2;<br>
Query OK, 1 row affected (0.01 sec)<br>
Rows matched: 1  Changed: 1  Warnings: 0<br>

mysql> select * from students;

| id | name   | email               | mobile_no  | password | gender | dob        | created_date        |
|:----|:----|:----|:----|:---|:---|:----|:----|
|  1 | Haiden | haidenfdo@gmail.com | 9043494315 | password | M      | 2002-01-31 | 2021-07-20 00:00:00 |
|  2 | vimal  | pytacax@gmail.com   | 9043494315 | tacax    | M      | 2002-07-14 | 2021-07-20 00:00:00 |
|  3 | rishi  | brainy@gmail.com    | 9043494315 | password | M      | 2002-08-20 | 2021-07-20 00:00:00 |

3 rows in set (0.00 sec)


<h1>####5.Enroll Students into class</h1>

insert into student_class(student_id,class,status) values(1,5,'ACTIVE');<br>
Query OK, 1 row affected (0.01 sec)<br>

 select * from student_class;

| id | student_id | class | status |
|:----|:---|:---|:----|
|  2 |          1 |     5 | ACTIVE |

1 row in set (0.00 sec)

 insert into student_class(student_id,class,status) values(2,6,'ACTIVE');<br>
Query OK, 1 row affected (0.01 sec)<br>

mysql> insert into student_class(student_id,class,status) values(3,5,'INACTIVE');<br>
Query OK, 1 row affected (0.01 sec)<br>

mysql> select * from student_class;

| id | student_id | class | status   |
|:---|:----|:----|:---|
|  2 |          1 |     5 | ACTIVE   |
|  3 |          2 |     6 | ACTIVE   |
|  4 |          3 |     5 | INACTIVE |
+
3 rows in set (0.00 sec)

<h1>####6.Find Students who are enrolled in the given class</h1>

select students.name,student_class.class<br>
    -> from students<br>
    -> inner join student_class<br>
    -> on students.id=student_class.id;

| name  | class |
|:----|:---|
| vimal |     5 |
| rishi |     6 |

2 rows in set (0.00 sec)<br>

 select students.name,student_class.class<br>
    -> from students<br>
    -> inner join student_class<br>
    -> on students.id=student_class.id<br>
    -> where student_class.class=5;<br>

| name  | class |
|:----|:---|
| vimal |     5 |

1 row in set (0.00 sec)


<h1>###7.Update Student Class information</h1>

update student_class set class=6 where id=2;<br>
Query OK, 1 row affected (0.01 sec)<br>
Rows matched: 1  Changed: 1  Warnings: 0<br>

 update student_class set class=6 where id=4;<br>
Query OK, 1 row affected (0.00 sec)<br>
Rows matched: 1  Changed: 1  Warnings: 0<br>

mysql> select *from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  2 |          1 |     6 | ACTIVE   |
|  3 |          2 |     6 | ACTIVE   |
|  4 |          3 |     6 | INACTIVE |
+----+------------+-------+----------+
3 rows in set (0.00 sec)

####8

delete from student_class where id=2;
Query OK, 1 row affected (0.01 sec)

mysql> select *from student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  3 |          2 |     6 | ACTIVE   |
|  4 |          3 |     6 | INACTIVE |
+----+------------+-------+----------+
2 rows in set (0.01 sec)


#####9

update students set dob=NULL where id=2 and 3;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 1  Changed: 0  Warnings: 0

mysql> select *from students;
+----+--------+---------------------+------------+----------+--------+------------+---------------------+
| id | name   | email               | mobile_no  | password | gender | dob        | created_date        |
+----+--------+---------------------+------------+----------+--------+------------+---------------------+
|  1 | Haiden | haidenfdo@gmail.com | 9043494315 | password | M      | 2002-01-31 | 2021-07-20 00:00:00 |
|  2 | vimal  | pytacax@gmail.com   | 9043494315 | tacax    | M      | NULL       | 2021-07-20 00:00:00 |
|  3 | rishi  | brainy@gmail.com    | 9043494315 | password | M      | 2002-08-20 | 2021-07-20 00:00:00 |
+----+--------+---------------------+------------+----------+--------+------------+---------------------+
3 rows in set (0.00 sec)

mysql> update students set dob=NULL where id=3;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select *from students;
+----+--------+---------------------+------------+----------+--------+------------+---------------------+
| id | name   | email               | mobile_no  | password | gender | dob        | created_date        |
+----+--------+---------------------+------------+----------+--------+------------+---------------------+
|  1 | Haiden | haidenfdo@gmail.com | 9043494315 | password | M      | 2002-01-31 | 2021-07-20 00:00:00 |
|  2 | vimal  | pytacax@gmail.com   | 9043494315 | tacax    | M      | NULL       | 2021-07-20 00:00:00 |
|  3 | rishi  | brainy@gmail.com    | 9043494315 | password | M      | NULL       | 2021-07-20 00:00:00 |
+----+--------+---------------------+------------+----------+--------+------------+---------------------+
3 rows in set (0.00 sec)


####10

select *from student_class where status='ACTIVE';
+----+------------+-------+--------+
| id | student_id | class | status |
+----+------------+-------+--------+
|  3 |          2 |     6 | ACTIVE |
+----+------------+-------+--------+
1 row in set (0.00 sec)


####11

select count(*),class from student_class where status='ACTIVE' group by class;
+----------+-------+
| count(*) | class |
+----------+-------+
|        1 |     6 |
|        1 |     5 |
+----------+-------+
2 rows in set (0.00 sec)

####12

select count(*),class from student_class where status='ACTIVE' group by class having count(*) <2;
+----------+-------+
| count(*) | class |
+----------+-------+
|        1 |     6 |
|        1 |     5 |
+----------+-------+
2 rows in set (0.00 sec)


####13

 select *from students inner join student_class on students.id=student_class.id;
+----+-------+------------------+------------+----------+--------+------+---------------------+----+------------+-------+--------+
| id | name  | email            | mobile_no  | password | gender | dob  | created_date        | id | student_id | class | status |
+----+-------+------------------+------------+----------+--------+------+---------------------+----+------------+-------+--------+
|  3 | rishi | brainy@gmail.com | 9043494315 | password | M      | NULL | 2021-07-20 00:00:00 |  3 |          2 |     6 | ACTIVE |
+----+-------+------------------+------------+----------+--------+------+---------------------+----+------------+-------+--------+
1 row in set (0.00 sec)


####14

select students.name,students.email,students.mobile_no,students.password,students.gender,students.dob,students.created_date,student_class.class
    -> from students
    -> inner join student_class
    -> on students.id=student_class.student_id
    -> where student_class.class=5;
+--------+---------------------+------------+----------+--------+------------+---------------------+-------+
| name   | email               | mobile_no  | password | gender | dob        | created_date        | class |
+--------+---------------------+------------+----------+--------+------------+---------------------+-------+
| Haiden | haidenfdo@gmail.com | 9043494315 | password | M      | 2002-01-31 | 2021-07-20 00:00:00 |     5 |
+--------+---------------------+------------+----------+--------+------------+---------------------+-------+
1 row in set (0.00 sec)

####3

select * from students where email='pytacax@gmail.com' and password='tacax';
+----+-------+-------------------+------------+----------+--------+------+---------------------+
| id | name  | email             | mobile_no  | password | gender | dob  | created_date        |
+----+-------+-------------------+------------+----------+--------+------+---------------------+
|  2 | vimal | pytacax@gmail.com | 9043494315 | tacax    | M      | NULL | 2021-07-20 00:00:00 |
+----+-------+-------------------+------------+----------+--------+------+---------------------+
1 row in set (0.00 sec)


#####15

select students.name,students.email,student_class.class from students right join student_class on students.id=student_class.id where students.email like('%y@gmail.com');
+-------+------------------+-------+
| name  | email            | class |
+-------+------------------+-------+
| rishi | brainy@gmail.com |     6 |
+-------+------------------+-------+
1 row in set (0.00 sec)


####17

select students.name,student_class.class
    -> from students
    -> left join student_class
    -> on students.id=student_class.id;
+--------+-------+
| name   | class |
+--------+-------+
| Haiden |  NULL |
| vimal  |  NULL |
| rishi  |     6 |
+--------+-------+
3 rows in set (0.00 sec)

####16

select *from students left join student_class on students.id=student_class.id where student_class.class is NULL;
+----+--------+---------------------+------------+----------+--------+------------+---------------------+------+------------+-------+--------+
| id | name   | email               | mobile_no  | password | gender | dob        | created_date        | id   | student_id | class | status |
+----+--------+---------------------+------------+----------+--------+------------+---------------------+------+------------+-------+--------+
|  1 | Haiden | haidenfdo@gmail.com | 9043494315 | password | M      | 2002-01-31 | 2021-07-20 00:00:00 | NULL |       NULL |  NULL | NULL   |
|  2 | vimal  | pytacax@gmail.com   | 9043494315 | tacax    | M      | NULL       | 2021-07-20 00:00:00 | NULL |       NULL |  NULL | NULL   |
+----+--------+---------------------+------------+----------+--------+------------+---------------------+------+------------+-------+--------+
2 rows in set (0.00 sec)






