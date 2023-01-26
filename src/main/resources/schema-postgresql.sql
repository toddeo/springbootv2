create sequence family_seq;
create table family
(
    idFamily   bigint default nextval('family_seq'),
    nameFamily varchar(255),
    primary key (idFamily)
);
create sequence user_seq;
create table user
(
    idUser        bigint default nextval('user_seq'),
    firstNameUser varchar(255),
    lastNameUser  varchar(255),
    typeUser      varchar(255),
    idFamily      bigint,
    primary key (idUser),
    CONSTRAINT fk_family
        FOREIGN KEY (idFamily)
            REFERENCES family (idFamily)
);