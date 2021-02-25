CREATE TABLE students(
    id              BIGSERIAL PRIMARY KEY,
    first_name      VARCHAR(30) NOT NULL,
    last_name       VARCHAR(30) NOT NULL,
    age             INT NOT NULL
);

INSERT INTO students (first_name, last_name, age) VALUES
('Василий', 'Пупкин', 21),
('Петр', 'Васечкин', 22),
('Евгений', 'Золотов', 19);