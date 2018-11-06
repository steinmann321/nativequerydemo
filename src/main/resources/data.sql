create table table1 (
  id int,
  name varchar(50)
);

create table table2 (
  id int,
  name varchar(50)
);

insert into table1 (id, name) values (1, 'First row from table 1');
insert into table1 (id, name) values (2, 'Second row from table 1');
insert into table1 (id, name) values (3, 'Third row from table 1');
insert into table1 (id, name) values (4, 'Fourth row from table 1');

insert into table2 (id, name) values (1, '** TABLE 2: 1st ROW UPPERCASE **');
insert into table2 (id, name) values (2, '** TABLE 2: 2nd ROW UPPERCASE **');


