import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //Main.firstTask();
        //Main.secondTask();
        //Main.thirdAndFourthTask();
        //Main.fifthTask();
        Main.sixthTask();
    }

    public static void firstTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Number first = null;
        Number second = null;
        while (true) {
            try {
                System.out.println("Please input first number.");
                first = new Number(reader.readLine());
                System.out.println("Please input second number.");
                second = new Number(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                System.out.println("Please input valid numbers.");
                continue;
            }
            break;
        }

        System.out.print("is " + first.getNumber() + " equal to " + second.getNumber() + "? - ");
        System.out.println(first.isEqual(second));
        System.out.print("is " + first.getNumber() + " less than " + second.getNumber() + "? - ");
        System.out.println(first.isLess(second));
        System.out.print("is " + first.getNumber() + " less or equal to " + second.getNumber() + "? - ");
        System.out.println(first.isLessOrEqual(second));
        System.out.print("is " + first.getNumber() + " greater than " + second.getNumber() + "? - ");
        System.out.println(first.isGreater(second));
        System.out.print("is " + first.getNumber() + " greater or equal to " + second.getNumber() + "? - ");
        System.out.println(first.isGreaterOrEqual(second));
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void secondTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Boolean first = false;
        Boolean second = false;
        String firstString = "";
        String secondString = "";
        while (true) {
            firstString = "";
            secondString = "";
            try {
                System.out.println("Input first boolean value.");
                firstString = reader.readLine();
                if(!firstString.equalsIgnoreCase("True"))
                {
                    throw new Exception();
                }
                first = Boolean.parseBoolean(firstString);

                System.out.println("Input second boolean value.");
                secondString = reader.readLine();
                if(!secondString.equalsIgnoreCase("False"))
                {
                    throw new Exception();
                }
                second = Boolean.parseBoolean(secondString);
            } catch(Exception e){
                System.out.println("Please input valid boolean values.");
                continue;
            }
            break;
        }
        System.out.print("Is boolean1 and boolean2 equal? - ");
        System.out.println(first == second);
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void thirdAndFourthTask(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input a whole number.");
        int number = 0;

        while(true){
            try {
                number = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException numberFormatException){
                System.out.println("Please input a whole number.");
                continue;
            }
            break;
        }
        System.out.println(number % 2 == 0);
        System.out.println(!(number % 2 == 0));
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fifthTask(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Boolean first = false;
        String firstString = "";
        while (true) {
            firstString = "";
            try {
                System.out.println("Input first boolean value.");
                firstString = reader.readLine();
                if(!firstString.equalsIgnoreCase("True") && !firstString.equalsIgnoreCase("False"))
                {
                    throw new Exception();
                }
                first = Boolean.parseBoolean(firstString);
            } catch(Exception e){
                System.out.println("Please input valid boolean values.");
                continue;
            }
            break;
        }
        System.out.println(!first);
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sixthTask(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = 0;
        int second = 0;

        while(true){
            try {
                System.out.println("Please input the first whole number.");
                first = Integer.parseInt(reader.readLine());
                System.out.println("Please input the second whole number.");
                second = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException numberFormatException){
                System.out.println("Please input only whole numbers.");
                continue;
            }
            break;
        }

        if(first == second || (first < 0 && second > 0) || (first > 100 && second > 100)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }

        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
