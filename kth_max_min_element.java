import java.util.*;

class KthMaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
          System.out.println("Enter k:");
          int k = sc.nextInt();
          Arrays.sort(arr);

        int min = arr[k - 1];
        int max = arr[arr.length - k];

        System.out.println("Kth Minimum = " + min);
        System.out.println("Kth Maximum = " + max);

        sc.close();
    }
}
