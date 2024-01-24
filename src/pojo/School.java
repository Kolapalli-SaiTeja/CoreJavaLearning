package src.pojo;

import java.util.Arrays;



public class School {


    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(69004);
        e1.setName("sai teja");
        e1.setSalary(78000);

        Employee e2 = new Employee();
        e2.setId(1212);
        e2.setName("teja");
        e2.setSalary(1312321);

        Employee e3 = new Employee();
        e3.setId(6923);
        e3.setName("Sri RAMA");
        e3.setSalary(45540);


//        System.out.println(e1.getId());
//        System.out.println( e1.getName());
//        System.out.println(e1.getSalary());
//
//
//        System.out.println("      ");
//
//        System.out.println(e2.getId());
//        System.out.println( e2.getName());
//        System.out.println(e2.getSalary());
//
//        System.out.println("  ");
//
//        System.out.println(e3.getId());
//        System.out.println( e3.getName());
//        System.out.println(e3.getSalary());


         Employee[] employee = new Employee[] {e1, e2, e3};

        // int[] c = new int [employee.length];


        for(int i=0; i<employee.length; i++){


            System.out.println( employee[i].getSalary());

        }

    }
}
