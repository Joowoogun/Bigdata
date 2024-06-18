-- Create Department table
CREATE TABLE department (
department_code INT PRIMARY KEY AUTO_INCREMENT,
department_name VARCHAR(50)
);
-- Create Student table
CREATE TABLE student (
student_id INT PRIMARY KEY AUTO_INCREMENT,
student_name VARCHAR(50),
student_height DECIMAL(5,2),
department_code INT
);
-- Create Professor table 교수
CREATE TABLE professor (
professor_code INT PRIMARY KEY AUTO_INCREMENT,
professor_name VARCHAR(50),
department_code INT
);
-- Create Course table 코스
CREATE TABLE course (
course_code INT PRIMARY KEY AUTO_INCREMENT,
course_name VARCHAR(50),
professor_code INT,
start_date DATE,
end_date DATE
);
-- Create Student_Course table 학생
CREATE TABLE student_course (
id INT not null unique,
student_id INT,
course_code INT,
primary key(student_id , course_code)
);
-- Add foreign key constraints using ALTER TABLE
ALTER TABLE student
ADD CONSTRAINT FK_Student_Department
FOREIGN KEY (department_code) REFERENCES department(department_code);
ALTER TABLE professor
ADD CONSTRAINT FK_Professor_Department
FOREIGN KEY (department_code) REFERENCES department(department_code);
ALTER TABLE course
ADD CONSTRAINT FK_Course_Professor
FOREIGN KEY (professor_code) REFERENCES professor(professor_code);
ALTER TABLE student_course
ADD CONSTRAINT FK_Student_Course_Student
FOREIGN KEY (student_id) REFERENCES student(student_id);
ALTER TABLE student_course
ADD CONSTRAINT FK_Student_Course_Course
FOREIGN KEY (course_code) REFERENCES course(course_code);

-- 학과
INSERT INTO department (department_name) VALUES
('수학'),
('국문과'),
('정보통신과'),
('모바일공학');
-- 학생
INSERT INTO Student (student_name, student_height, 
department_code) VALUES
('가길동', 170.5, 1),
('나길동', 165.2, 1),
('다길동', 180.0, 2),
('라길동', 175.8, 3),
('마길동', 160.7, 4),
('바길동', 168.3, 1),
('사길동', 172.1, 2),
('아길동', 175.0, 1);
-- 교수
INSERT INTO Professor (professor_name, department_code) VALUES
('가 교수', 1),
('나 교수', 1),
('다 교수', 2),
('빌 게이츠', 3),
('스티브 잡스', 4);
-- 개설과목
INSERT INTO Course (course_name, professor_code, start_date, 
end_date) VALUES
('교양 영어', 1, '2023-07-01', '2023-08-15'),
('데이터베이스 입문', 2, '2023-07-01', '2023-08-31'),
('회로이론', 3, '2023-07-15', '2023-09-15'),
('공학수학', 4, '2023-07-15', '2023-09-30'),
('객체지향 프로그래밍', 5, '2023-07-01', '2023-08-31');
-- 수강
INSERT INTO Student_Course (id, student_id, course_code) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 2),
(4, 4, 3),
(5, 5, 4),
(6, 6, 5),
(7, 7, 5);
