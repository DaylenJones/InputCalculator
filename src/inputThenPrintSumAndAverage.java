import java.util.Scanner;

public class inputThenPrintSumAndAverage {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter a number: ");
                int num = Integer.parseInt(input.nextLine());
                sum += num;
                count++;
            } catch (NumberFormatException e) {

                break;
            }
        }


        long average = (count == 0) ? 0 : Math.round((double) sum / count);


        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}

