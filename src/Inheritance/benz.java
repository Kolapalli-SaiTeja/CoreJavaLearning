package src.Inheritance;


 public class benz extends  Audi {


  void startCar() {

   System.out.println("this is a new start car");

  }


  int newBrakeSize;

  void newFeature() {


   super.startCar();
   boolean newFeature = true;

   if (newFeature) {

    System.out.println("shutdown the care");

   }

  }

  void AdditionCost() {
   boolean newFeature1 = true;

   int a = 20;
   int b = 23;

   if (a > b) {

    System.out.println("Max cost is" + a);

   } else {

    System.out.println("Max cost is " + b);

   }

  }



  }


