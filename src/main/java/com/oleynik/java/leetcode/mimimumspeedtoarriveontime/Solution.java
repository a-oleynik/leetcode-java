package com.oleynik.java.leetcode.mimimumspeedtoarriveontime;

public class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        //Edge case if there are too many intervals
        if (dist.length - 1 > hour) {
            return -1;
        }
        int speed = -1;
        int low = getLowerBound(dist, hour);
        int high = 10000000;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            double total = getTime(dist, mid);
            if (total <= hour) {
                speed = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return speed;
    }

    public static double getTime(int[] dist, double speed) {
        int n = dist.length;
        double realTime = 0;
        for (int i = 0; i < n - 1; i++) {
            realTime += Math.ceil(dist[i] / speed);
        }
        return realTime + dist[n - 1] / speed;
    }

    public static int getLowerBound(int[] dist, double hour) {
        int sumDist = 0;
        for (int i : dist) {
            sumDist += i;
        }
        return (int)(sumDist / hour);
    }

    public static int getUpperBound(int[] dist, double hour) {
        return (int) Math.ceil((dist[dist.length - 1] / (Math.round((hour - (int) Math.floor(hour)) * 100.0) / 100.0)));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: dist = [1,3,2], hour = 6, Output: 1
        int[] dist1 = {1, 3, 2};
        double hour1 = 6.0;
        System.out.println("Example 1 - Input: dist = [1,3,2], hour = 6");
        System.out.println("Output: " + solution.minSpeedOnTime(dist1, hour1));
        System.out.println("Expected: 1\n");

        // Example 2: dist = [1,3,2], hour = 2.7, Output: 3
        int[] dist2 = {1, 3, 2};
        double hour2 = 2.7;
        System.out.println("Example 2 - Input: dist = [1,3,2], hour = 2.7");
        System.out.println("Output: " + solution.minSpeedOnTime(dist2, hour2));
        System.out.println("Expected: 3\n");

        // Example 3: dist = [1,3,2], hour = 1.9, Output: -1
        int[] dist3 = {1, 3, 2};
        double hour3 = 1.9;
        System.out.println("Example 3 - Input: dist = [1,3,2], hour = 1.9");
        System.out.println("Output: " + solution.minSpeedOnTime(dist3, hour3));
        System.out.println("Expected: -1\n");

        // Example 4: dist = [1,1,100000], hour = 2.01, Output: 10000000
        int[] dist4 = {1, 1, 100000};
        double hour4 = 2.01;
        System.out.println("Example 4 - Input: dist = [1,1,100000], hour = 2.01");
        System.out.println("Output: " + solution.minSpeedOnTime(dist4, hour4));
        System.out.println("Expected: 10000000\n");

        // Example 5: dist = [1,1,100000], hour = 2.12, Output: 833334
        int[] dist5 = {1, 1, 100000};
        double hour5 = 2.12;
        System.out.println("Example 5 - Input: dist = [1,1,100000], hour = 2.12");
        System.out.println("Output: " + solution.minSpeedOnTime(dist5, hour5));
        System.out.println("Expected: 833334\n");

        // Example 6: dist = [5,3,4,6,2,2,7], hour = 10.92, Output: 4
        int[] dist6 = {5, 3, 4, 6, 2, 2, 7};
        double hour6 = 10.92;
        System.out.println("Example 6 - Input: dist = [5,3,4,6,2,2,7], hour = 10.92");
        System.out.println("Output: " + solution.minSpeedOnTime(dist6, hour6));
        System.out.println("Expected: 4\n");

        // Example 7: dist = [69], hour = 4.6, Output: 15
        int[] dist7 = {69};
        double hour7 = 4.6;
        System.out.println("Example 7 - Input: dist = [69], hour = 4.6");
        System.out.println("Output: " + solution.minSpeedOnTime(dist7, hour7));
        System.out.println("Expected: 15\n");

    }
}

