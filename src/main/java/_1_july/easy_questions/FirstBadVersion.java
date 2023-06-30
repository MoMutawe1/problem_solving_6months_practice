package _1_july.easy_questions;

// question description: https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }

    /* time complexity: O(n)
    public static int firstBadVersion(int n) {
        for (int i=1; i<=n; i++) {
            if(isBadVersion(i)) return i;
        }
        return -1;
    }*/

    // time complexity: O(log n)
    public static int firstBadVersion(int n) {

        int min = 1;
        int max = n;

        while(min<max){
            int mid = min + (max-min)/2;
            if(isBadVersion(mid)) {
                max = mid;
            }
            else min = mid+1;
        }
        return max;
    }

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public static boolean isBadVersion(int versionNumber){
        return true ? versionNumber >= 6 : false;
    }

}
