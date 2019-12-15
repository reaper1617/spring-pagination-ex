drop table if exists marking_events;
drop table if exists pipe_events;


create table pipe_events(
  id int primary key auto_increment,
  pipeName varchar,
  created timestamp default current_timestamp
);


create table marking_events(
  id int primary key auto_increment,
  status varchar,
  fkey int
);

alter table marking_events
add foreign key (fkey)
references pipe_events(id)

-- insert into pipe_events (id, pipeName) values
-- (1, 'pipe1'),
-- (2, 'pipe2'),
-- (3, 'pipe3'),
-- (4, 'pipe4' ),
-- (5, 'pipe5' ),
-- (6, 'pipe6' ),
-- (7, 'pipe7' ),
-- (8, 'pipe8' ),
-- (9, 'pipe9'),
-- (10, 'pipe10' ),
-- (11, 'pipe11' ),
-- (12, 'pipe12' ),
-- (13, 'pipe13' ),
-- (14, 'pipe14' ),
-- (15, 'pipe15' ),
-- (16, 'pipe16' ),
-- (17, 'pipe17' ),
-- (18, 'pipe18' ),
-- (19, 'pipe19' ),
-- (20, 'pipe20' ),
-- (21, 'pipe21' ),
-- (22, 'pipe22' ),
-- (23, 'pipe23'),
-- (24, 'pipe24'),
-- (25, 'pipe25' );

-- insert into marking_events (id, status, fkey) values
-- (1, 'APPROVED', 1),
-- (2, 'NOT_APPROVED', 2),
-- (3, 'APPROVED', 3),
-- (4, 'WAITING', 3),
-- (5, 'APPROVED', 3),
-- (6, 'APPROVED', 4),
-- (7, 'WAITING', 4),
-- (8, 'NOT_APPROVED', 5),
-- (9, 'APPROVED',6),
-- (10, 'WAITING',7),
-- (11, 'APPROVED',8),
-- (12, 'NOT_APPROVED',8),
-- (13, 'APPROVED',9),
-- (14, 'WAITING',9),
-- (15, 'APPROVED', 10),
-- (16, 'NOT_APPROVED', 11),
-- (17, 'APPROVED', 12);
-- (17, 'APPROVED', 13);
-- (17, 'APPROVED', 14);
-- (17, 'APPROVED', 16);
-- (17, 'APPROVED', 17);
-- (17, 'APPROVED', 18);
-- (17, 'APPROVED', 19);
-- (17, 'APPROVED', 19);
-- (17, 'APPROVED', 20);
-- -- --
