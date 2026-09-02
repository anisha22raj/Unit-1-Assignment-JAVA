class ArrayList{
    public static void main(String[] args){ 
        int [] arr ={10,20,50,40,30,60};
        for (int i = 0; i<arr.length-1;i++)
        {
            for (int j = i+1; j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array is :");
        for ( int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}