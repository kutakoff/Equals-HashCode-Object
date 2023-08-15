package org.example;

public class Student {

    private String fullName;

    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int hashCode() {
        int result;
        if (this.getGender() == "Мужской") {
            result = 31;
        } else {
            result = 21;
        }
        result = result * (this.getFullName().length());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return fullName == student.fullName & gender == student.gender;
    }
}