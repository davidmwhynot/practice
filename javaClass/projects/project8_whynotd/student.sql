create table if not exists student (
	student_number int(8) not null primary key auto_increment,
	student_fname varchar(50) not null,
	student_lname varchar(50) not null,
	student_major varchar(3) not null
);

insert into student (student_fname, student_lname, student_major) values
	('David', 'Whynot', 'CIS'),
	('Hugh', 'Mungus', 'CIS'),
	('Kappa', 'Keepo', 'XDQ'),
	('Alexander', 'Doyon', 'ENG'),
	('Guv', 'Exdee', 'PHY')
;
