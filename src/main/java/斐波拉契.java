public class 斐波拉契 {
    public static void main(String[] args) {
        int[] arr = new int[40];
        int[]arrr = new int[]{0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986,
        };

        for (int i = 0;i<40;i++){
            if (i > 1){
                arr[i] = arr[i-1] + arr[i-2];
            } else if (i == 0){
                arr[i] = 0;
            }else if (i == 1){
                arr[i] = 1;
            }
        }

        for (int i : arr) {
            System.out.print(i);
            System.out.print(",");
        }
    }
}
