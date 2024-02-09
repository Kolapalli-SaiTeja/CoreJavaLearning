package src.Collections.compare_comparable;


import java.util.Comparator;

//class Asc implements Comparator<Laptop> {
//
//
//    public int compare(Laptop o1, Laptop o2) {
//        return Integer.compare(o1.price, o2.price);
//    }
//
//}
//
//class Dsc implements Comparator<Laptop> {
//
//
//    public int compare(Laptop o1, Laptop o2) {
//        return Integer.compare(o2.getPrice(), o1.getPrice());
//    }
//}
//
//
//class sortByName implements Comparator<Laptop> {
//
//    public int compare(Laptop o1, Laptop o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//
//}


public class Laptop implements Comparable<Laptop> {

    int price;
    String name;

//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }




    public Laptop(int price, String name) {

        this.price = price;
        this.name = name;


    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Laptop that) {
        return CharSequence.compare(this.name, that.name);
    }


}


