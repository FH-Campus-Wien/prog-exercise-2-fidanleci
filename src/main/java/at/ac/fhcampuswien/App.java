package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner n = new Scanner(System.in);
        double number;
        double largest = 0;

        for (int count = 1; count > 0; count++) {
            System.out.print("Number " + count + ": ");
            number = n.nextDouble();

            if (number <= 0 && count == 1) {
                System.out.println("No number entered.");
                break;
            } else if (number <= 0) {
                System.out.println("The largest number is " + String.format(Locale.US, "%.2f", largest));
                break;
            }
            if (largest < number) {
                largest = number;
            }
        }
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        int input;
        int wert = 1;

        Scanner n = new Scanner(System.in);
        System.out.print("n: ");
        input = n.nextInt();

        if (input <= 0) {
            System.out.println("Invalid number!");
        }
        for (int zeile = 1; zeile <= input; zeile++) {

            for (int spalte = 1; spalte <= zeile; spalte++) {
                System.out.print(wert + " ");
                wert++;
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        int konstante = 6;

        for (int zeile = 1; zeile <= konstante; zeile++) {

            for (int spalte = zeile; spalte < konstante; spalte++)
                System.out.print(" ");

            for (int stern = 1; stern < (zeile * 2); stern++)
                System.out.print("*");

            System.out.println("");
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        char c = 'H';
        System.out.println();
        System.out.println((int)c);
    }

    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner n = new Scanner(System.in);
        int mark;
        double average = 0;
        double sum = 0;
        int negativecount = 0;


        for (int count = 1; count > 0; count++) {
            System.out.print("Mark " + count + ": ");
            mark = n.nextInt();
            sum = sum + mark;
            if (mark == 5) {
                negativecount++;
            }

            if (mark > 5 || mark < 0) {
                System.out.println("Invalid mark!");
                count--;
                sum = sum - mark;
            }

            if (mark == 0 && count == 1) {
                average = (sum / count);
                System.out.println("Average: " + new DecimalFormat("0.00").format(average));
                System.out.println("Negative marks: " + negativecount);
                break;

            } else if(mark == 0) {
                count = count - 1;
                average = (sum / count);
                System.out.println("Average: " + new DecimalFormat("0.00").format(average));
                System.out.println("Negative marks: " + negativecount);
                break;
            }

        }
    }


    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        int number, store, rem, sum = 0;
        Scanner n = new Scanner(System.in);
        System.out.print("n: ");
        number = n.nextInt();

        store=number;
        while (sum != 1 && sum != 4){
            sum = 0;
            while (store != 0){
                rem=store%10;
                sum=sum+rem*rem;
                store=store/10;
            }
            store=sum;
        }

        if (sum==1){
            System.out.println("Happy number!");
        }
        else {
            System.out.println("Sad number!");
        }

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}