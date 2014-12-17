CREATE TABLE groups (
    id BIGINT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 0, INCREMENT BY 1),
    number INT UNIQUE,
    faculty VARCHAR(60) NOT NULL
);

CREATE TABLE students (
    id BIGINT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 0, INCREMENT BY 1),
    name VARCHAR(60) NOT NULL,
    surname VARCHAR(60) NOT NULL,
    patronymic VARCHAR(60) NOT NULL,
    birthday DATE NOT NULL,
    group_id BIGINT NOT NULL CONSTRAINT GROUP_FK REFERENCES groups (id)
);