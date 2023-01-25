create sequence family_seq;
create table family (id bigint default nextval('family_seq'), nameFamily varchar(255),  primary key (id));
