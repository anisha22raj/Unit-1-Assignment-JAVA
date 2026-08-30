import java.util.*;

class FindDuplicate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array elements:");

            int[] arr = new int[5];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int slow = arr[0];
            int fast = arr[0];

            do {
                slow = arr[slow];
                fast = arr[arr[fast]];
            } while (slow != fast);

            slow = arr[0];

            while (slow != fast) {
                slow = arr[slow];
                fast = arr[fast];
            }

            System.out.println("Duplicate = " + slow);
        }
    }
}