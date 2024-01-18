package src.Polymorphism;

public class Method_Overloading {



      public int gift(int a, String b){

        System.out.println("value of a " +a);

        return a;
    }



    public int gift(String b, int a){

        System.out.println("the value of a is " + a);

    return a;

    }

    public static void main(String[] args) {


          Method_Overloading web = new Method_Overloading();

          web.gift("sai", 25);


    }

}
