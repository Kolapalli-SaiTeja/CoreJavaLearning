package src.Access_Modifiers;

public class Access_1 {


  private int a = 10;


    public int b = 20;



    public Access_1(){



        System.out.println("In constructor");
        System.out.println("the value of b is " + b);


    }


    public void method(){

        System.out.println(" In method");

        System.out.println("the value of b is " + b);


    }


    public static void main(String[] args) {


        Access_1 wel = new Access_1();

        System.out.println(  wel.b );
        wel.method();
    }

}
