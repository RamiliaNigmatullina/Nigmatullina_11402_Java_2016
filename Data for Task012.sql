create table "posts" (
	"id" integer not null primary key,
	"head" varchar(100) not null,
	"body" varchar(8000) not null
);

insert into posts values(1, 'Lorem Ipsum', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.');
insert into posts values(2, 'Ut enim', 'Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.');
insert into posts values(3, 'Duis aute', 'Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.');