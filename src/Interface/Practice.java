package src.Interface;

public class Practice {

    public static void main(String[] args) {





//A C = new A();
//
//C.hello();
//C.


II B = new A(); ////    webdriver driver = new chromedriver(); ///
 B.hello();
        System.out.println(B.a);




    }




}

interface II{


    int a = 100;

void say();


default void hello(){

    System.out.println("Default hello");
}


}

class A implements II{


    @Override
    public void say() {
        System.out.println("noWWob");
    }
public void hello (){

    System.out.println("original hello");
}

}
