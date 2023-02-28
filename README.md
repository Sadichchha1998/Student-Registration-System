Project :
<br>
Confirmation of the admission of the student to the academic programme after submission of a completed admission form with necessary supporting




![image](https://user-images.githubusercontent.com/110052591/221780753-78edb257-bb22-417f-a556-bd5e903b8039.png)

Student table:
<br>
create table students ( sRoll int primary key auto_increment, sEmail varchar(25) unique not null, sPassword varchar(15) NOT NULL, sName varchar(20) NOT NULL );
<br>

Admin table:
<br>
create table admin ( adminId int primary key auto_increment, a_name varchar(25) unique not null, a_Pass varchar(15) NOT NULL);
<br>

Course table:
<br>
create table courses ( c_id int primary key auto_increment, c_name varchar(25) unique not null, fee int NOT NULL, seats int NOT NULL );
<br>

Student_Course table:
<br>
create table student_course ( roll int, course int, foreign key (roll) references students(sRoll) on delete set null, foreign key (course) references courses(c_id) on delete set null );

<br>
Batch table:
<br>
create table batch ( bId int primary key auto_increment, bname varchar(25), duration int, cId int, seats int, foreign key (cId) references courses(c_id) ON DELETE Cascade );
<br>

student_batch table:
<br>
create table student_batch ( roll int, course int, bid int, foreign key (roll) references students(sRoll) ON DELETE CASCADE, foreign key (course) references courses(c_id) ON DELETE CASCADE, foreign key (bid) references batch(bId) ON DELETE CASCADE );
<br>
insert into students(semail,spassword,sname) values('Sad@gmail.com','Sad','Sadu');
<br>
insert into courses(c_name,fee,seats) values('DSa',5000,0);
<br>
insert into admin(a_name,a_Pass) values('Sadichchha','Vikrant');
<br>
insert into batch(bname,duration,cId,seats) values('Java',5,1,5090);
