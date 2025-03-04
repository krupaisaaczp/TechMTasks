class Pract{
    public static void main(String args[]){
        int arr[] = new int[5];
        arr[0] = 12;
        arr[1] = 2;
        arr[2] = 15;
        arr[3] = 212;
        arr[4] = 345;
        System.out.println("arr elements:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        
        System.out.println("after for loop:");

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }   
    }
}