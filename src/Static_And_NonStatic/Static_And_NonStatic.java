package src.Static_And_NonStatic;

import java.util.Random;

public class Static_And_NonStatic {




 static int i =10;
    public static void main(String[] args) {


        Static_And_NonStatic st= new Static_And_NonStatic();


        st.i=new Random().nextInt();


        Static_And_NonStatic st1= new Static_And_NonStatic();


        st.i=new Random().nextInt();

        Static_And_NonStatic st2= new Static_And_NonStatic();


        st.i=new Random().nextInt();

         System.out.println(st.i);
         System.out.println(st1.i);
         System.out.println(st2.i);

        System.out.println(Static_And_NonStatic.i);



    }
}
