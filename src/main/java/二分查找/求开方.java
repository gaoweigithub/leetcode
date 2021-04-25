package 二分查找;

public class 求开方 {

    public static void main(String[] args) {
        求开方 dd = new 求开方();
        System.out.println(dd.mySqrt(9));
    }

    public int mySqrt(int x) {
        int l=1;
        int r=x;
        int mid ,sqrt;
        while (l<=r){
            mid = (l+r) / 2;
            sqrt = x / mid;
            if (sqrt == mid){
                return mid;
            }else if (sqrt > mid){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return r;
    }
}
