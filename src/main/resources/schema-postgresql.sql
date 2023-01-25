create sequence adult_seq;
create table adult (id bigint default nextval('adult_seq'), firstName varchar(255), lastName varchar(255), image varchar(255), emotion varchar(255), primary key (id));
