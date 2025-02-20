public class MethodReturnTypes.java {
  public static void (string[] args) {
    displayWelcomeMessage();

  int value1 = 20;
  int value2 = 30;
  double result = calculateAverage(value1, value2);
    system.out.printIn("The average is; " + result);
  }
  public static void displayWelcomeMessage() {
    system.out.printIn("Welcome to our program!");
  }
  public static double calculateAverage(int num1, int num2) {
    double average = (num1+ num2) / 2.0;
    return average;
  }
}
