package day52_Map_FunctionalInterface;

//lambda : () -> {}

public class Test {
    public static void main(String[] args) {

        //function1:create a function than can display a number is odd
        MyFirstFunctionalInterface oddOrEvenNumber= (n)->{
            if (n%2==0)
                System.out.println(n+" is even number");
            else
                System.out.println(n+" is odd number");
        };

        oddOrEvenNumber.apply(21);

        //function2:create function that can check is a person is eligible to buy alcohol

        MyFirstFunctionalInterface isEligibleAlcohol= (age)->{
            if (age>=18)
                System.out.println("Eligible");
            else
                System.out.println("Not eligible");
        };

        isEligibleAlcohol.apply(18);


        //function3:create a function that can display the cube of number

        MyFirstFunctionalInterface cubeOfNumber=(number)->{
            System.out.println(number*number*number);
        };

        cubeOfNumber.apply(5);

        //function4:create a function that can check if a number is evenly divisible 3 and 5

        MyFirstFunctionalInterface divisibleBy3and5= number -> {
          if (number%3==0 & number%5==0)
              System.out.println("Divisible");
          else
              System.out.println("Not divisible");
        };

        divisibleBy3and5.apply(16);



    }
}

