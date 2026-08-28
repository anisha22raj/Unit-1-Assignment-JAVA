import java.util.*;

class LargestSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            sum = Math.max(arr[i], sum + arr[i]);

            max = Math.max(max, sum);
        }

        System.out.println("Largest sum = " + max);

        sc.close();
    }
}