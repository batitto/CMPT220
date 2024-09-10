package misc;

public class ifelse {
    public static void main(String[] args) {

       int number = 2;
       if (number > 1){
        System.out.println("the number is greater than 1!");
       } else{
        System.out.println("the number isn't greater than one");
       }

       String name1 = "Cyn";

       if (name1 == "cyn"){
        System.out.println("yes?");
       } else if (name1 == "Cyn"){
       System.out.println("yes");
       } else{
        System.out.println("uwah");
       }

       int num1 = 5;
       int num2 = 6;

       if (num1 == num2){
        System.out.println("equal");
       } else {
        System.out.println("not equal");
       }


    }
}
