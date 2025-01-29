 public class LargestNumber {

    public static void main(String[] args) {
        // Define three numbers (you can change these values to test different numbers)
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        // Nested if statements to find the largest number
        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("The largest number is: " + num1);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        } else {
            if (num2 >= num3) {
                System.out.println("The largest number is: " + num2);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        }
    }
}
 
    

