<h1>Not Null:</h1><br>
      Create table Constraints(Firstname varchar(255) NOT NULL);


<h1>Primary Key:</h1><br>
      Create table Constraints(Id int(3) PRIMARY KEY AUTO_INCREMENT);


<h1>Unique Key:</h1><br>
      Create table Constraints(Email varchar(255) UNIQUE);


<h1>Default:</h1><br>
      Create table Constraints(Department varchar(255) DEFAULT 'Tech');


<h1>Check:</h1><br>
      Create table Constraints(Age int(2) NOT NULL, CHECK (Age>=21));


<h1>Foreign Key</h1>
Create table marklist(studid int,marks int(3),grade varchar(5),personal_id int,foreign key(personal_id) references students(id));<br>
    Query OK, 0 rows affected, 1 warning (0.04 sec)


Insert into marklist values(1,100,'A',2);<br>
     Query OK, 1 row affected (0.01 sec)


Select *from marklist;

| studid | marks | grade | personal_id |
|:----|:----|:----|:----|
|      1 |   100 | A     |           2 |

1 row in set (0.00 sec)