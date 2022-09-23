create table if not EXISTS user(
    uid INT UNSIGNED AUTO_INCREMENT,
    name varchar(255),
    gender varchar(255),
    age INT ,
    primary key(uid));