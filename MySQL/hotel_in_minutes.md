### show databases;

| Database           |
|:-----|
| blazers            |
| exercise           |
| hotelinminutes     |
| information_schema |
| mysql              |
| performance_schema |
| sys                |

7 rows in set (0.00 sec)


### use hotelinminutes;
Database changed


### mysql> show tables;
Empty set (0.00 sec)

### mysql> create table users(id int,name varchar(50),email varchar(50) primary key,password varchar(8),age int(3));<br>
 Query OK, 0 rows affected, 1 warning (0.04 sec)

### mysql> desc users;

| Field    | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:-----|:----|:---|
| id       | int         | NO  |     | NULL    |       |
| name     | varchar(50) | NO  |     | NULL    |       |
| email    | varchar(50) | NO  | PRI | NULL    |       |
| password | varchar(8)  | NO  |     | NULL    |       |
| age      | int         | NO  |     | NULL    |       |

5 rows in set (0.00 sec)

### mysql> insert into users values(1,'Haiden','haidenfdo@gmail.com','password',20);<br>
Query OK, 1 row affected (0.01 sec)


### mysql> insert into users values(2,'aswath','alone@gmail.com','aswathka',18);<br>
Query OK, 1 row affected (0.01 sec)


### select *from users;

| id   | name   | email               | password | age  |
|:-----|:----|:----|:-----|:----|
|    2 | aswath | alone@gmail.com     | aswathka |   18 |
|    1 | Haiden | haidenfdo@gmail.com | password |   20 |

2 rows in set (0.00 sec)

### mysql> create table roomform(id int,name varchar(40) primary key,email varchar(50),total_rooms int(2),adults int(2),childrens int(2),foreign key(email) references users(email));<br>
 Query OK, 0 rows affected, 3 warnings (0.05 sec)

### mysql> desc roomform;

| Field       | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| id          | int         | NO   |     | NULL    |       |
| name        | varchar(40) | NO   | PRI | NULL    |       |
| email       | varchar(50) | NO   | MUL | NULL    |       |
| total_rooms | int         | NO   |     | NULL    |       |
| adults      | int         | NO   |     | NULL    |       |
| childrens   | int         | NO   |     | NULL    |       |

6 rows in set (0.01 sec)

### mysql> insert into roomform values(1,'Haiden','haidenfdo@gmail.com',4,2,5);<br>
Query OK, 1 row affected (0.02 sec)


### mysql> insert into roomform values(2,'aswath','alone@gmail.com',3,3,2);<br>
Query OK, 1 row affected (0.00 sec)


### mysql> select * from roomform;

| id   | name   | email               | total_rooms | adults | childrens |
|:-----|:----|:----|:----|:---|:---|
|    2 | aswath | alone@gmail.com     |           3 |      3 |         2 |
|    1 | Haiden | haidenfdo@gmail.com |           4 |      2 |         5 |

2 rows in set (0.00 sec)


### mysql> create table review(id int,name varchar(40),feedback varchar(30),foreign key(name) references roomform(name));<br>
Query OK, 0 rows affected (0.05 sec)


### mysql> desc review;

| Field    | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| id       | int         | NO   |     | NULL    |       |
| name     | varchar(40) | NO   | MUL | NULL    |       |
| feedback | varchar(30) | NO   |     | NULL    |       |

3 rows in set (0.01 sec)


### mysql> insert into review values(1,'Haiden','good');<br>
Query OK, 1 row affected (0.01 sec)


### mysql> insert into review values(2,'aswath','excellent');<br>
Query OK, 1 row affected (0.01 sec)


### mysql> select * from review;

| id   | name   | feedback  |
|:----|:----|:----|
|    1 | Haiden | good      |
|    2 | aswath | excellent |

2 rows in set (0.00 sec)

### mysql> alter table review add constraint id primary key(id);<br>
Query OK, 0 rows affected (0.08 sec)
Records: 0  Duplicates: 0  Warnings: 0


### create table bookings(id int,name varchar(40),totalrooms int(2),adults int(2),children int(2),foreign key(id) references review(id));<br>
Query OK, 0 rows affected, 3 warnings (0.06 sec)


### mysql> desc bookings;

| Field      | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| id         | int         | NO   | MUL | NULL    |       |
| name       | varchar(40) | NO   |     | NULL    |       |
| totalrooms | int         | NO   |     | NULL    |       |
| adults     | int         | NO   |     | NULL    |       |
| children   | int         | NO   |     | NULL    |       |

5 rows in set (0.00 sec)


### mysql> insert into bookings values(1,'Haiden',3,3,2);<br>
Query OK, 1 row affected (0.01 sec)

### mysql> insert into bookings values(2,'aswath',4,2,5);<br>
Query OK, 1 row affected (0.01 sec)

### mysql> select *from bookings;

| id   | name   | totalrooms | adults | children |
|:----|:----|:---|:----|:----|
|    1 | Haiden |          3 |      3 |        2 |
|    2 | aswath |          4 |      2 |        5 |

2 rows in set (0.00 sec)


### mysql> create table special_offers(id int primary key auto_increment,name varchar(40),Offer_date date);<br>
Query OK, 0 rows affected (0.04 sec)


### mysql> desc special_offers;

| Field      | Type        | Null | Key | Default | Extra          |
|:----|:---|:----|:---|:----|:----|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| name       | varchar(40) | NO   |     | NULL    |                |
| Offer_date | date        | NO   |     | NULL    |                |

3 rows in set (0.00 sec)


### mysql> insert into special_offers(name,Offer_date) values('Haiden','2022-03-16');<br>
Query OK, 1 row affected (0.01 sec)

### mysql> insert into special_offers(name,Offer_date) values('aswath','2022-03-18');<br>
Query OK, 1 row affected (0.01 sec)


### mysql> select * from special_offers;

| id | name   | Offer_date |
|:----|:---|:----|
|  1 | Haiden | 2022-03-16 |
|  2 | aswath | 2022-03-18 |

2 rows in set (0.00 sec)


### mysql> create table admins(name varchar(30) primary key,password char(8));<br>
Query OK, 0 rows affected (0.04 sec)


### mysql> desc admins;

| Field    | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| name     | varchar(30) | NO   | PRI | NULL    |       |
| password | char(8)     | NO   |     | NULL    |       |

2 rows in set (0.00 sec)


### mysql> insert into admins values('Haiden','password');<br>
Query OK, 1 row affected (0.02 sec)


### mysql> insert into admins values('aswath','aswathka');<br>
Query OK, 1 row affected (0.01 sec)


### mysql> select * from admins;

| name   | password |
|:----|:----|
| aswath | aswathka |
| Haiden | password |

2 rows in set (0.00 sec)


### mysql> desc review;

| Field    | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| id       | int         | NO   | PRI | NULL    |       |
| name     | varchar(40) | NO   | MUL | NULL    |       |
| feedback | varchar(30) | NO   |     | NULL    |       |

3 rows in set (0.00 sec)


 ### create table adding_hotels(name varchar(50),hotel_name varchar(50),owner_name varchar(40),phone_number int(10),foreign key(name) references admins(name));<br>
Query OK, 0 rows affected, 1 warning (0.04 sec)


### mysql> desc adding_hotels;

| Field        | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| name         | varchar(50) | NO   | MUL | NULL    |       |
| hotel_name   | varchar(50) | NO   |     | NULL    |       |
| owner_name   | varchar(40) | NO   |     | NULL    |       |
| phone_number | int         | NO   |     | NULL    |       |

4 rows in set (0.00 sec)


### mysql> insert into adding_hotels values('Haiden','Hilton','Haidenfdo',1234567890);<br>
Query OK, 1 row affected (0.01 sec)


### mysql> insert into adding_hotels values('aswath','Rangoli','aswathdon',1234567890);<br>
Query OK, 1 row affected (0.01 sec)


### mysql> select * from adding_hotels;

| name   | hotel_name | owner_name | phone_number |
|:----|:----|:----|:----|
| Haiden | Hilton     | Haidenfdo  |   1234567890 |
| aswath | Rangoli    | aswathdon  |   1234567890 |

2 rows in set (0.00 sec)


<h1>Bookings</h1>

### mysql> select users.id,users.name,roomform.total_rooms,roomform.adults,roomform.childrens,roomform.room_no
    -> from users
    -> inner join roomform
    -> on users.id=roomform.id;

| id   | name   | total_rooms | adults | childrens | room_no |
|:----|:---|:----|:----|:----|:----|
|    2 | aswath |           3 |      3 |         2 |       8 |
|    1 | Haiden |           4 |      2 |         5 |      22 |

2 rows in set (0.01 sec)


### mysql> select users.id,users.name,review.feedback
    -> from users
    -> inner join review
    -> on users.id=review.id
    -> where review.feedback='good';


| id   | name   | feedback |
|:----|:----|:----|
|    1 | Haiden | good     |

1 row in set (0.00 sec)


### mysql> select roomform.id,roomform.name,roomform.room_no,employees.emp_id,emp_name
    -> from roomform
    -> left join employees
    -> on roomform.id=employees.emp_id;


| id   | name   | room_no | emp_id | emp_name |
|:----|:----|:----|:----|:----|
|    2 | aswath |       8 |      2 | musaraf  |
|    1 | Haiden |      22 |      1 | deepak   |

2 rows in set (0.00 sec)


###### creating index;


###  mysql> create index pers_id
  ###  -> on users(email);
Query OK, 0 rows affected (0.05 sec)
Records: 0  Duplicates: 0  Warnings: 0

### mysql> show index from users;

| Table | Non_unique | Key_name | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
|:----|:----|:-----|:----|:---|:----|:----|:----|:----|:-----|:----|:----|:----|:----|:---|
| users |          0 | PRIMARY  |            1 | email       | A         |           2 |     NULL |   NULL |      | BTREE      |         |               | NO      | NULL       |
| users |          1 | pers_id  |            1 | email       | A         |           2 |     NULL |   NULL |      | BTREE      |         |               | NO      | NULL       |

2 rows in set (0.02 sec)


##### subquery;

``` mysql> select a.*,b.* from(select * from users where age>18) as a,(select * from roomform where room_no=8) as b;

| id   | name   | email               | password | age  | roll_id | id   | name   | email           | total_rooms | adults | childrens | room_no |
|:----|:----|:----|:---|:----|:----|:----|:----|:----|:----|:-----|:----|:---|
|    1 | Haiden | haidenfdo@gmail.com | password |   20 |       1 |    2 | aswath | alone@gmail.com |           3 |      3 |         2 |       8 |

1 row in set (0.01 sec)


### multiple subquery;

   ``` mysql> select name,email,age,roll_id
   -> from users
   -> where (name,age) IN
   -> (select name,age
   -> from users
   -> group by name);


| name   | email               | age  | roll_id |
|:---|:----|:---|:---|
| aswath | alone@gmail.com     |   18 |       2 |
| Haiden | haidenfdo@gmail.com |   20 |       1 |

2 rows in set (0.00 sec)



#### creating view;

```mysql> create view server_list as select emp_name,emp_salary from employees where emp_id=1 and emp_id=2;
Query OK, 0 rows affected (0.01 sec)

``` mysql> select * from server_list;
Empty set (0.01 sec)

``` mysql> desc server_list;

| Field      | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:---|:----|:---|
| emp_name   | varchar(40) | NO   |     | NULL    |       |
| emp_salary | int         | NO   |     | NULL    |       |

2 rows in set (0.00 sec)




```desc bill;

| Field      | Type        | Null | Key | Default | Extra |
|:----|:----|:---|:----|:---|:----|
| name       | varchar(40) | YES  | MUL | NULL    |       |
| bill_id    | int         | NO   | PRI | NULL    |       |
| order_id   | int         | YES  |     | NULL    |       |
| total_bill | int         | YES  |     | NULL    |       |

4 rows in set (0.00 sec)

desc bill;

| Field      | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| name       | varchar(40) | YES  | MUL | NULL    |       |
| bill_id    | int         | NO   | PRI | NULL    |       |
| order_id   | int         | YES  |     | NULL    |       |
| total_bill | int         | YES  |     | NULL    |       |

4 rows in set (0.00 sec)

mysql> desc bookings;

| Field      | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| id         | int         | YES  | MUL | NULL    |       |
| name       | varchar(40) | YES  |     | NULL    |       |
| totalrooms | int         | YES  |     | NULL    |       |
| adults     | int         | YES  |     | NULL    |       |
| children   | int         | YES  |     | NULL    |       |

5 rows in set (0.00 sec)

mysql> desc employees;

| Field      | Type        | Null | Key | Default | Extra          |
|:----|:----|:----|:----|:-----|:----|
| emp_id     | int         | NO   | PRI | NULL    | auto_increment |
| emp_name   | varchar(40) | YES  |     | NULL    |                |
| emp_salary | int         | YES  |     | NULL    |                |

3 rows in set (0.00 sec)

mysql> desc manager;

| Field      | Type | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| manager_id | int  | YES  | MUL | NULL    |       |
| order_id   | int  | YES  |     | NULL    |       |

2 rows in set (0.00 sec)

mysql> desc payment;

| Field      | Type | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:---|
| payment_id | int  | YES  |     | NULL    |       |
| bill_id    | int  | YES  | MUL | NULL    |       |

2 rows in set (0.00 sec)

mysql> desc review;

| Field    | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| id       | int         | NO   | PRI | NULL    |       |
| name     | varchar(40) | YES  | MUL | NULL    |       |
| feedback | varchar(30) | YES  |     | NULL    |       |

3 rows in set (0.00 sec)

mysql> desc room;

| Field           | Type        | Null | Key | Default | Extra |
|:---|:----|:----|:-----|:----|:----|
| room_no         | int         | YES  |     | NULL    |       |
| occupied_status | varchar(20) | YES  |     | NULL    |       |
| manager_id      | int         | YES  | MUL | NULL    |       |
| customer_id     | int         | YES  |     | NULL    |       |

4 rows in set (0.01 sec)

mysql> desc roomform;

| Field       | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| id          | int         | YES  |     | NULL    |       |
| name        | varchar(40) | NO   | PRI | NULL    |       |
| email       | varchar(50) | YES  | MUL | NULL    |       |
| total_rooms | int         | YES  |     | NULL    |       |
| adults      | int         | YES  |     | NULL    |       |
| childrens   | int         | YES  |     | NULL    |       |
| room_no     | int         | YES  |     | NULL    |       |

7 rows in set (0.01 sec)

mysql> desc server;

| Field     | Type | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:----|
| server_id | int  | YES  | MUL | NULL    |       |
| order_id  | int  | YES  |     | NULL    |       |

2 rows in set (0.00 sec)

mysql> desc server_list;

| Field      | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:-----|:----|
| emp_name   | varchar(40) | YES  |     | NULL    |       |
| emp_salary | int         | YES  |     | NULL    |       |

2 rows in set (0.01 sec)

mysql> desc special_offers;

| Field      | Type        | Null | Key | Default | Extra          |
|:----|:----|:----|:----|:----|:----|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| name       | varchar(40) | YES  |     | NULL    |                |
| Offer_date | date        | YES  |     | NULL    |                |

3 rows in set (0.00 sec)

mysql> desc users;

| Field    | Type        | Null | Key | Default | Extra |
|:----|:----|:----|:----|:----|:---|
| id       | int         | YES  |     | NULL    |       |
| name     | varchar(50) | YES  |     | NULL    |       |
| email    | varchar(50) | NO   | PRI | NULL    |       |
| password | varchar(8)  | YES  |     | NULL    |       |
| age      | int         | YES  |     | NULL    |       |
| roll_id  | int         | YES  |     | NULL    |       |

6 rows in set (0.00 sec)








