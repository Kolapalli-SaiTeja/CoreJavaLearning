package src.Constructors;

public class Constructors_practice {


    String name ;
    int age;

    float height;

    boolean lifeStatus;

    public  void methodCalling(){


        System.out.println("The name of the student is "+name);
        System.out.println("The age of the student is "+age);
        System.out.println("The height of the student is "+height);
        System.out.println("Life status of the student true or false??? " +lifeStatus);

    }

    public static void main(String[] args) {

        Constructors_practice calling = new Constructors_practice();

        calling.name ="SAI TEJA";
        calling.age = 27;
        calling.height = 5.7f;
        calling.lifeStatus= true;

        calling.methodCalling();

        System.out.println("       ");


        Constructors_practice karthikStudent = new Constructors_practice();

        calling.name = "Karthik";
        calling.age =32;
        calling.height = 5.5f;
        calling.lifeStatus = false;

        calling.methodCalling();




    }
}
