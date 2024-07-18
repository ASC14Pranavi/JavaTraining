package Practice;

public class Copyarr {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,22,65};
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }
        System.out.println("elements of old array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
        System.out.println("elements of new ARRAY:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+"");
        }
    }
}
