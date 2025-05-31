/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray ma) {
        int l = 0;
        int r = ma.length() - 1;
        int peak = 0;

        while (l < r) {
            int mid = (l + r) / 2;
            if (ma.get(mid) < ma.get(mid + 1)) {
                peak = mid + 1;
                l = peak;
            } else {
                r = mid;
            }
        }

        l = 0;
        r = peak;
        while (l <= r) {
            int mid = (l + r) / 2;
            int val = ma.get(mid);
            if (val < target) {
                l = mid + 1;
            } else if (val > target) {
                r = mid - 1;
            } else {
                return mid;
            }
        }

        l = peak + 1;
        r = ma.length() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int val = ma.get(mid);
            if (val < target) {
                r = mid - 1;
            } else if (val > target) {
                l = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
