package QuickSort;
//import java.util.Scanner;
//public class QuickSort{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] a=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        quickSort(a, 0, n- 1);
//        for (int num : a) {
//            System.out.print(num + " ");
//        }
//    }
//    public static void quickSort(int[] a,int l,int h){
//        if(l<h){
//            int partI=partition(a,l,h);
//            quickSort(a,l,partI-1);
//            quickSort(a,partI+1,h);
//        }
//    }
//    public static int partition(int[] a,int l,int h){
//        int pivot=a[h];
//        int i=l-1;
//        for(int j=l;j<h;j++){
//            if(a[j]<pivot){
//                i++;
//                int temp=a[i];
//                a[i]=a[j];
//                a[j]=temp;
//            }
//        }
//        int temp=a[i+1];
//        a[i+1]=a[h];
//        a[h]=temp;
//        return i+1;
//    }
//}





import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
//Java program for Quick Sort Algorithm
class QuickSort1 {
    static int intArray[] = {4, 6, 3, 2, 1, 9, 7};
    int MAX;
    QuickSort1(int MAX) {
        this.MAX = MAX;
    }
    public void printline(int count) {
        for (int i = 0; i < count - 1; i++) {
            System.out.print("*");
        }
        System.out.println("*");
    }
    public void display() {
        System.out.print("[");
        //navigate through all items
        for (int i = 0; i < this.MAX; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("]");
    }
    public void swap(int num1, int num2) {
        int temp = intArray[num1];
        intArray[num1] = intArray[num2];
        intArray[num2] = temp;
    }
    public int partition(int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;
        while (true) {
            while (intArray[++leftPointer] < pivot) {
                // do nothing
            }
            while (rightPointer > 0 && intArray[--rightPointer] > pivot) {
                // do nothing
            }
            if (leftPointer >= rightPointer) {
                break;
            } else {
                System.out.println("item swapped: " + intArray[leftPointer] + ", " + intArray[rightPointer]);
                swap(leftPointer, rightPointer);
            }
        }
        System.out.println("pivot swapped: " + intArray[leftPointer] + ", " + intArray[right]);
        swap(leftPointer, right);
        System.out.print("Updated Array: ");
        display();
        return leftPointer;
    }

    public void quickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = intArray[right];
            int partitionPoint = partition(left, right, pivot);
            quickSort(left, partitionPoint - 1);
            quickSort(partitionPoint + 1, right);
        }
    }
}
public class QuickSort{
    public static void main(String[] args) {
        int MAX = 7;
        //create an object of the QuickSort class
        QuickSort1 qs = new QuickSort1(MAX);
        System.out.print("Array elements before quick sort are: ");
        qs.display();
        qs.printline(50);
        qs.quickSort(0, MAX - 1);
        System.out.print("Array elements after quick sort are: ");
        qs.display();
        qs.printline(50);
    }
}