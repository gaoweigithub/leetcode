package 最小k数;

public class 快排递归 {

    public static void main(String[] args) {

        int[] a = new int[]{23,15,37,89,2,21,43,9,56};
        quickSort(a,0,a.length-1,4);
        for (int i : a) {
            System.out.println(i);
        }

    }

    public static void quickSort(int[] arr, int l, int r, int k) {
        if (l >= r){
            return;
        }
        int i = l;
        int j =r;
        int pivot = arr[i];
        while (i<j){
            while (i<j && arr[j] >= pivot){
                j--;
            }
            if(i<j){
                arr[i++] = arr[j];
            }
            while (i<j && arr[i] <= pivot){
                i++;
            }
            if (i<j){
                arr[j--] = arr[i];
            }
        }
        arr[i] = pivot;
        quickSort(arr,l,i-1,k);
        quickSort(arr,i+1,r,k);
    }
}
