DROP TABLE IF EXISTS todo;
CREATE TABLE todo
(
  id varchar(36) not null primary key,
  description varchar(255) not null,
  created timestamp,
  modified timestamp,
  completed boolean
);

insert into todo values (1, 'desc', '2020-10-20', '2020-10-20', false);
insert into todo values (2, 'desc2', '2020-10-20', '2020-10-20', true);
