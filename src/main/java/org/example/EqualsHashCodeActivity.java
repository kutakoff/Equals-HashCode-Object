package org.example;

import java.util.HashMap;

public class EqualsHashCodeActivity {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Вася Петькин Александрович");
        student1.setGender("Мужской");

        Student student2 = new Student();
        student2.setFullName("Петя Архипов Васильевич");
        student2.setGender("Мужской");

        Student student3 = new Student();
        student3.setFullName("Даша Клюквина Максимовна ");
        student3.setGender("Женский");

        Student student4 = new Student();
        student4.setFullName("Вася Петькин Александрович");
        student4.setGender("Мужской");

        Student student5 = new Student();
        student5.setFullName("Петя Архипов Васильевич");
        student5.setGender("Мужской");

        HashMap<Student, String> hashMap = new HashMap<>();
        hashMap.put(student1, "Троечник");
        hashMap.put(student2, "Хорошист");
        hashMap.put(student3, "Отличница");
        hashMap.put(student4, "Вася - Троечник"); //поменяли значение
        hashMap.put(student5, "Хорошист");
    }
}