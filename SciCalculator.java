import java.util.Scanner;
public class SciCalculator
{

    public static void main(String[] args)
    {

        //Variables to be defined by scanner.
        Scanner myScanner = new Scanner(System.in);
        double firstOperand = 0;
        double secondOperand = 0;
        int operation = 0;
        double result = 0;
        boolean calcGoinOn = true;
        int calculations = 0;
        boolean menu = true;
        boolean menuOperations = true;
        //double calcSums =resultTot;
        double resultTot =0;
        double averageCalculations = 0;


        while (calcGoinOn) {

            if (menu)
            {
                System.out.println("Current Result:" + result);
                System.out.println("\n" + "Calculator Menu" + "\n---------------" + "\n0. Exit Program" + "\n1. Addition" + "\n2. Subtraction" + "\n3. Multiplication" + "\n4. Division" + "\n5. Exponentiation" + "\n6. Logarithm" + "\n7. Display Average");

            }
            System.out.println("\nEnter Menu Selection: ");
            operation = myScanner.nextInt();
            menu = true;
            result = 0;

            //operations to be determined (+-*/)
            if (operation < 0 || operation > 7)
            {

                System.out.println("Error: Invalid selection!");
                menu = false;
                menuOperations = false;
                System.out.println("Enter Menu Selection: ");
                operation = myScanner.nextInt();

            }
            //if (operation == 0){
               // menuOperations = false;
            //}

            else if (operation == 7 && calculations == 0){

                System.out.println("Error: No calculations yet to average!");
                menu = false;
                System.out.println("Enter Menu Selection: ");
                operation = myScanner.nextInt();
                menuOperations = false;
            }
            //If the operation variable falls within range then the operation will run.
            if (menuOperations == true)
            {
                if(operation != 7 && operation != 0)
                {
                    System.out.println("Enter first operand: ");
                    firstOperand = myScanner.nextDouble();

                    System.out.println("Enter second operand: ");
                    secondOperand = myScanner.nextDouble();
                }
            }



               if (operation == 1)
                {
                    result = firstOperand + secondOperand;
                    calculations ++;


                } else if (operation == 2)
                {
                    result = firstOperand - secondOperand;
                    calculations ++;

                } else if (operation == 3)
                {
                    result = firstOperand * secondOperand;
                    calculations ++;

                } else if (operation == 4)
                {
                    result = firstOperand / secondOperand;
                    calculations ++;

                } else if (operation == 5)
                {
                    result = Math.pow(firstOperand, secondOperand);
                    calculations ++;

                } else if (operation == 6)
                {
                    result = Math.log(secondOperand)/Math.log(firstOperand);
                    calculations ++;


                } else if (operation == 7)
                {
                        averageCalculations = resultTot/calculations;
                        averageCalculations = Math.round(averageCalculations*100);
                        averageCalculations = averageCalculations/100;
                        System.out.println("Sum of calculations: " + resultTot + "\nNumber of calculations: " + calculations + "\nAverage of calculations: " + averageCalculations);
                        menu = false;

                }
                else
                {
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    calcGoinOn = false;
                    menu = false;
                    menuOperations = false;
                }
            resultTot += result;
            }
        }
    }

