package com.example.vmovie.util;

/**
 * Created by 毛琦 on 2017/3/12.
 */

public class Utils {
    public static String formatVideoDuration(String duration) {
        String str = "";
        long l = Long.parseLong(duration);
        int m = (int) (l / 1000 / 60);
        int s = (int) ((l - m * 60 * 1000) / 1000);

        return str + m + "'" + "''";
    }
}
