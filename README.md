# AnytimeDevloper
# ATD-Assignment

create database studentdetails
Create table student

mysql> show tables;
+--------------------------+
| Tables_in_studentdetails |
+--------------------------+
| student                  |
+--------------------------+
1 row in set (0.02 sec)

mysql> desc student;
+--------------+-------------+------+-----+---------+----------------+
| Field        | Type        | Null | Key | Default | Extra          |
+--------------+-------------+------+-----+---------+----------------+
| STUDENT_NO   | int         | NO   | PRI | NULL    | auto_increment |
| STUDENT_NAME | varchar(30) | YES  |     | NULL    |                |
| STUDENT_DOB  | date        | YES  |     | NULL    |                |
| STUDENT_DOJ  | date        | YES  |     | NULL    |                |
+--------------+-------------+------+-----+---------+----------------+
4 rows in set (0.01 sec)
