package ru.zvezdilin.taskOfInterviews.task27_список_студентов;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String studentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return this.studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return name + " , " + group + " , " + studentId;
    }
}
