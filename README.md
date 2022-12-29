# rhetorical-actor-7344
 Confirmation of the admission of the student to the academic programme after submission of a completed admission form with necessary supporting



1. Student table 
=================
CREATE TABLE Student(
roll int PRIMARY KEY auto_increment,
name varchar(16) NOT NULL,
gender varchar(1)  NOT NULL,
email varchar(24)  NOT NULL,
password varchar(16)  NOT NULL
);


2.Course table
================
CREATE TABLE Course(
c_id int PRIMARY KEY auto_increment,
c_name varchar (23)NOT NULL UNIQUE,
fee int NOT NULL,
Seats int NOT NULL
);

insert into course values(
5,'HTML',190,10);

insert into course values(
2,'JAVA111',1260,14);


insert into course values(
3,'JA111',1890,17);


3. Batch table 
================
CREATE TABLE Batch(
bid int primary key, 
bname varchar(24),
duration varchar(12),
c_id int,
Seats int NOT NULL
);
FOREIGN KEY (c_id) REFERENCES Course(c_id)

4. Student_batch table
=======================
CREATE TABLE Student_Batch(
roll int,
FOREIGN KEY (roll) REFERENCES Student(roll),
cid int,
bid int,
FOREIGN KEY (bid) REFERENCES Batch(bid));

FOREIGN KEY (cid) REFERENCES Student_Course(cid),

5.Student_course table 
======================== 
CREATE TABLE  Student_course(
roll int,
FOREIGN KEY (roll) REFERENCES Student(roll),
cid int
);

FOREIGN KEY (cid) REFERENCES Course(c_id)

6.Admin table 
=============
CREATE TABLE Admin(
admin_id int PRIMARY KEY auto_increment,
a_name varchar(20),
a_user varchar(27),
a_pass varchar(24)
);

CREATE TABLE Eployee(
eid int PRIMARY KEY auto_increment,
String name varchar(20),
String adress varchar(20),
salary int
);
=================================================
CREATE TABLE Admin
(
adminid int PRIMARY KEY auto_increment,
a_name varchar(16) NOT NULL,
a_user varchar(24) NOT NULL UNIQUE,
a_pass varchar(24) NOT NULL
);

---------------------------------

CREATE TABLE Batch
(
batchid int PRIMARY KEY,
batchname varchar(12),
courseid int,
seats int NOT NULL,
FOREIGN KEY (courseid) references Course(c_id)
);

----------------------------------

CREATE TABLE Course(
c_id int PRIMARY KEY auto_increment,
c_name varchar(24) NOT NULL UNIQUE,
fee int NOT NULL
);

----------------------------------

CREATE TABLE Student(
roll int PRIMARY KEY auto_increment,
name varchar(16) NOT NULL,
gender varchar(1) NOT NULL,
email varchar(24) NOT NULL UNIQUE,
password varchar(16) NOT NULL
);

--------------------------------

CREATE TABLE student_course(
roll int,
cid int,
FOREIGN KEY (cid) references Course(c_id),
FOREIGN KEY (roll) references Student(roll)
);


CREATE TABLE batch_student(
Studentroll int,
courseid int,
batchid int,
PRIMARY KEY (Studentroll,courseid),
FOREIGN KEY (batchid) references Batch(batchid),
FOREIGN KEY (courseid) references Course(c_id),
FOREIGN KEY (studentroll) references Student(roll)
);
===================================================================
