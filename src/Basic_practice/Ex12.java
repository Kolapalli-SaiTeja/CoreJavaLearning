package src.Basic_practice;

public class Ex12 {


    public static void count(String name) {

        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int others = 0;


        char[] ch = name.toCharArray();

        for (int i = 0; i < ch.length; i++) {


            if (Character.isLetter(ch[i])) {

                letters++;
            } else if (Character.isDigit(ch[i])) {

                numbers++;

            } else if (Character.isSpaceChar(ch[i])) {

                spaces++;

            } else {
                others++;

            }
        }

        System.out.println("no of letters are " + letters);
        System.out.println("no of digits are " +numbers);
        System.out.println("no of spaces are " +spaces);
        System.out.println("no of others are " +others);


    }


    public static void main(String[] args) {

           String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        count(test);
    }
}
