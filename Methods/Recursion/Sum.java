/*Q3 — Sum of Numbers

Write a recursive method sum(int n) that returns the sum of numbers from 1 to n.

For example:

sum(5) → 15

Don't use a loop.
    
*/
public class Sum {
    // Recursive method to calculate the sum of numbers from 1 to n
    public static int sum(int n) {
        // Base case: if n is 1 or less, return n
        if (n <= 1) {
            return n;
        }
        // Recursive case: n + sum of numbers up to (n - 1)
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println("sum(5) -> " + result); // Output: 15
    }
}
