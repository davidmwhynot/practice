create table if not exists major (
	major_code varchar(3) not null primary key,
	major_description text not null
);

insert into major (major_code, major_description) values
	('CIS', 'Computer Information Systems'),
	('XDQ', 'Extraterrestrial Design Quotas'),
	('ENG', 'English'),
	('PHY', 'Physics')
;
