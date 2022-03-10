### Creating table;

create table library(id int primary key auto_increment,author varchar(40) not null,type varchar(20) not null,name char(20) not null,price int(5));
Query OK, 0 rows affected, 1 warning (0.04 sec)

### mysql> desc library;

| Field  | Type        | Null | Key | Default | Extra          |
|:----|:----|:----|:-----|:----|:-----|
| id     | int         | NO   | PRI | NULL    | auto_increment |
| author | varchar(40) | NO   |     | NULL    |                |
| type   | varchar(20) | NO   |     | NULL    |                |
| name   | char(20)    | NO   |     | NULL    |                |
| price  | int         | YES  |     | NULL    |                |

5 rows in set (0.01 sec)

### inserting values;

mysql> insert into library(author,type,name,price) values('Haiden','history','the olden days',2000);
Query OK, 1 row affected (0.01 sec)

### mysql> select * from library;

| id | author | type    | name           | price |
|:----|:----|:-----|:-----|:----|
|  1 | Haiden | history | the olden days |  2000 |

1 row in set (0.00 sec)

### Inserting Values;

mysql> insert into library(author,type,name,price) values('Kaushik','novel','love each other',3000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into library(author,type,name,price) values('prasanna','Tech','pyhton master',3000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into library(author,type,name,price) values('vimal','story','STR',3000);
Query OK, 1 row affected (0.01 sec)

### mysql> select * from library;

| id | author   | type    | name            | price |
|:----|:----|:----|:-----|:----|
|  1 | Haiden   | history | the olden days  |  2000 |
|  2 | Kaushik  | novel   | love each other |  3000 |
|  3 | prasanna | Tech    | pyhton master   |  3000 |
|  4 | vimal    | story   | STR             |  3000 |

4 rows in set (0.00 sec)

### Selecting a name using sub Query;

mysql> select a.* from (select *from library where id=1) as a;

| id | author | type    | name           | price |
|:----|:----|:----|:-----|:----|
|  1 | Haiden | history | the olden days |  2000 |

1 row in set (0.00 sec)

### Selecting from the table whose book price has higher than 2000;

mysql> select a.* from (select *from library where price>2000) as a;

| id | author   | type  | name            | price |
|:----|:----|:----|:-----|:----|
|  2 | Kaushik  | novel | love each other |  3000 |
|  3 | prasanna | Tech  | pyhton master   |  3000 |
|  4 | vimal    | story | STR             |  3000 |

3 rows in set (0.00 sec)

### Joining the table with subquries;

mysql> select a.*,b.* from (select *from library where price>2000) as a,(select *from students where id=1) as b;

| id | author   | type  | name            | price | id | name   | age  | gender |

|  2 | Kaushik  | novel | love each other |  3000 |  1 | haiden |   20 | M      |
|  3 | prasanna | Tech  | pyhton master   |  3000 |  1 | haiden |   20 | M      |
|  4 | vimal    | story | STR             |  3000 |  1 | haiden |   20 | M      |

3 rows in set (0.00 sec)

### Selecting the values using subquery by like%;

select a.* from(select *from library where author like('K%')) as a;
+----+---------+-------+-----------------+-------+
| id | author  | type  | name            | price |
+----+---------+-------+-----------------+-------+
|  2 | Kaushik | novel | love each other |  3000 |
+----+---------+-------+-----------------+-------+
1 row in set (0.00 sec)

