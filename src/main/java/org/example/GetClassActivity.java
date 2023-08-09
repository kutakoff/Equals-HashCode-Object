package org.example;

public class GetClassActivity {

    public static void main(String[] args) {
        Object a = 1;
        Object b = "а";
        Object c = true;
        Object d = 5.6;
        Object e = 'a';
        Object f = 1999999999L;

        System.out.println(a + " - это " + a.getClass());
        System.out.println(b + " - это " + b.getClass());
        System.out.println(c + " - это " + c.getClass());
        System.out.println(d + " - это " + d.getClass());
        System.out.println(e + " - это " + e.getClass());
        System.out.println(f + " - это " + f.getClass());
    }
}