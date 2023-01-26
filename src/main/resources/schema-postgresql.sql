create sequence family_seq;
create table family (idFamily bigint default nextval('family_seq'), nameFamily varchar(255),  primary key (idFamily));
