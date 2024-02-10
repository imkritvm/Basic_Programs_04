import java.util.Scanner;

class CalculatorinJava {
    public static float calAdd(int[] numbers, int length) {
        float result = 0;
        for (int i = 0; i < length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static float calSub(int[] numbers, int length) {
        float result = numbers[0];
        for (int i = 1; i < length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public static float calMul(int[] numbers, int length) {
        float result = 1;
        for (int i = 0; i < length; i++) {
            result *= numbers[i];
        }
        return result;
    }

    public static float calDiv(int[] numbers, int length) {
        float result = numbers[0];
        for (int i = 1; i < length; i++) {
            if (numbers[i] == 0) {
                System.out.println("Error! Division by zero is not allowed.");
                return 0;
            }
            result /= numbers[i];
        }
        return result;
    }

    public static float remainder_(float dividend, float divisor) {
        return dividend % divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length, choice;
        do {
            System.out.println(" 0 for Exit\n 1 for Addition\n 2 for Subtraction\n 3 for Multiplication\n 4 for Division\nEnter Your Choice : ");
            choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Exiting the Program.");
                break;
            }
            System.out.print("Enter the length of the array: ");
            length = scanner.nextInt();
            if (length <= 0) {
                System.out.println("Error 404! Invalid length.");
                continue;
            }

            int[] numbers = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.printf("Result of Addition : %.2f\n", calAdd(numbers, length));
                    break;

                case 2:
                    System.out.printf("Result of Subtraction : %.2f\n", calSub(numbers, length));
                    break;

                case 3:
                    System.out.printf("Result of Multiplication : %.2f\n", calMul(numbers, length));
                    break;

                case 4:
                    char user;
                    System.out.printf("Result of Division : %.2f\n", calDiv(numbers, length));
                    System.out.print("Do you want to see the remainder too with dividend...? (Y/N) : ");
                    user = scanner.next().charAt(0);
                    if (user == 'Y' || user == 'y') {
                        System.out.printf("Remainder : %.2f\n", remainder_(calDiv(numbers, length), numbers[length - 1]));
                    }
                    break;

                default:
                    System.out.println("You chose the wrong option. Please try again.");
                    break;
            }
        } while (true);

        scanner.close();
    }
}
