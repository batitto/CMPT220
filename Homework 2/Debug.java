
public class Debug {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        } else if(var1 == 4){
            System.out.println("Var1 is equal to 4");
        }else{
            System.out.println("Var1 is less than 4");
        }
        //i added an else if case to cover if var1 is equal to 4

        int var2 = 6;
        if (var2 == 5){
            System.out.println("Var2 is 5");
        } else if (var2 == 6){
            System.out.println("Var2 is 6");
        } else if (var2 < 5){
            System.out.println("Var2 is less than 5");
        } else{
            System.out.println("Var2 is greater than 5");
        }
        //i swapped around the first else if with one that checks if var2 equals 6 since the else statement cant check that 

        int var3 = 5;
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        } else {
            System.out.println("Var3 is less than 10");
        }
        //if we are just checking if var3 is greater than or less than 10 then it is giving the best answer 



        //for this section: why are we not entering the if statement?

        //the if statement does not check if a variable equals "marist"
        String Marist = "marist";
        if (Marist == "marist"){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }
        //i added a varible called Marist and set it equal to "marist" and made the if statement check the variable 

    }
}
