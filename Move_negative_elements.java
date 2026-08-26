import java.util.*;

class Move_Negative_elements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {

                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                j++;
            }
        }

        System.out.println("Array after moving negative elements to the left:");

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}