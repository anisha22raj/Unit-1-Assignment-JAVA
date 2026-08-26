
class UnionIntersection {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6, 7};

        int i = 0;
        int j = 0;

        System.out.println("Union:");

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        while (j < arr2.length) {
            System.out.print(arr2[j] + " ");
            j++;
        }

        // Intersection
        i = 0;
        j = 0;

        System.out.println("\nIntersection:");

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}