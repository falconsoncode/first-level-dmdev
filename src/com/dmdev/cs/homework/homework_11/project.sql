CREATE TABLE Student (
  Student_ID INT PRIMARY KEY,
  First_Name VARCHAR(50),
  Last_Name VARCHAR(50),
  Email VARCHAR(100),
  Phone_Number VARCHAR(20)
);

CREATE TABLE Teacher (
  Teacher_ID INT PRIMARY KEY,
  First_Name VARCHAR(50),
  Last_Name VARCHAR(50),
  Email VARCHAR(100),
  Phone_Number VARCHAR(20),
  Qualification VARCHAR(50)
);

CREATE TABLE Course (
  Course_ID INT PRIMARY KEY,
  Course_Name VARCHAR(100),
  Teacher_ID INT,
  Course_Description TEXT,
  FOREIGN KEY (Teacher_ID) REFERENCES Teacher(Teacher_ID)
);

CREATE TABLE Groups (
  Group_ID INT PRIMARY KEY,
  Group_Name VARCHAR(100),
  Course_ID INT,
  FOREIGN KEY (Course_ID) REFERENCES Course(Course_ID)
);

CREATE TABLE Lesson (
  Lesson_ID INT PRIMARY KEY,
  Date DATE,
  Start_Time TIME,
  End_Time TIME,
  Course_ID INT,
  Teacher_ID INT,
  FOREIGN KEY (Course_ID) REFERENCES Course(Course_ID),
  FOREIGN KEY (Teacher_ID) REFERENCES Teacher(Teacher_ID)
);

CREATE TABLE Grades (
  Grade_ID INT PRIMARY KEY,
  Student_ID INT,
  Lesson_ID INT,
  Grade INT,
  FOREIGN KEY (Student_ID) REFERENCES Student(Student_ID),
  FOREIGN KEY (Lesson_ID) REFERENCES Lesson(Lesson_ID)
);

CREATE TABLE Payment (
  Payment_ID INT PRIMARY KEY,
  Student_ID INT,
  Course_ID INT,
  Amount DECIMAL(10, 2),
  Payment_Date DATE,
  FOREIGN KEY (Student_ID) REFERENCES Student(Student_ID),
  FOREIGN KEY (Course_ID) REFERENCES Course(Course_ID)
);
