package com.company;

public class Main{

    public static void main(String[] args) {
        // write your code here

        Course c = new Course("hindi","english");
        Student s1 = new Student("naman",21,c);

        try{
            Student s2 = (Student) s1.clone();
            s2.c.c1="yolo";

            System.out.println(s2.c.c1);
            System.out.println(s1.c.c1);


        }catch(Exception e)
        {
            e.printStackTrace();
        }


    }

}
