package src;

public class Operators {
    public static void main(String[] args) {

        int i = 23;
        int j = 23;

     //   System.out.println(--i); //22
//        System.out.println(i); //22
//        System.out.println(i--);//22
//        System.out.println(i); //21


      //  System.out.println(i < j && i == j);

//        System.out.println(i==j); //False
//        System.out.println(i!=j); //True
//        System.out.println(i>j); //False
//        System.out.println(i<j); // True
//        System.out.println(i>=j); // False
//        System.out.println(i<=j); // True
//
//        System.out.println("................");
//        //OR Table
//        System.out.println(i < j || i != j); //true
//        System.out.println(i < j || i == j); //true
//        System.out.println(i > j || i != j); //true
//        System.out.println(i < j && i <= j); //false

        System.out.println("........");
        System.out.println(i>j);
        System.out.println(i<j);

        System.out.println(i>=j && i<=j); //false
        System.out.println(i>j && i!=j); //false
        System.out.println(i<j && i==j); //false
        System.out.println(i<=j && i==j);//true
        System.out.println("xxxxxxxxxxxxxxxx");
        int x=4;
        x = x&3;
        System.out.println(x);
        }

    }

