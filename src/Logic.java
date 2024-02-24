import java.util.Scanner;



public class Logic {

    float[] numbers = new float[20];
    String[] actions = new String[20];
    static int numberAmount = 0;
    static int actionAmount = 0;
    private void calculate() {
        float result = 0;
        for(int i = 0; i < actionAmount; i++) {
            int times = 0;
            switch (actions[times]) {
                case "+":
                    result += numbers[i] + numbers[i+1];
                    times++;
                    break;

                case "-":
                    result += numbers[i] - numbers[i+1];
                    times++;
                    break;

                case "*":
                    result += numbers[i] * numbers[i+1];
                    times++;
                    break;

                case "/":
                    result += numbers[i] / numbers[i+1];
                    times++;
                    break;
            }
        }
        System.out.println("Result: " + result);
    }
    protected void firstMethod() {

    }

    protected void secondMethod() {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;
        upperLoop:
        do {
            System.out.println("Enter the number: ");
            String number_str = scan.nextLine();
            if(number_str.contains(".")) {
                float number = Float.parseFloat(number_str);
                numbers[numberAmount] = number;
                numberAmount++;
            }
            else {
                int number = Integer.parseInt(number_str);
                numbers[numberAmount] = number;
                numberAmount++;
            }

            boolean isRight = false;
            do {
                System.out.println("Enter the action: ");
                String action = scan.nextLine();
                if(action.equals("/") || action.equals("*") || action.equals("+") || action.equals("-")) {
                    isRight = true;
                    actions[actionAmount] = action;
                    actionAmount++;
                }
                else if(action.equals("=")) {
                    isRight = true;
                    calculate();
                    break upperLoop;
                }
                else {
                    System.out.println("You picked the wrong action, try again.");
                }
            } while (!isRight);



        } while (isRunning);
    }
}
