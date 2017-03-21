package com.example.vmovie.util;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

/**
 * Created by 毛琦 on 2017/3/12.
 */

public class Utils {
    public static String formatVideoDuration(String duration) {
        String str = "";
        long l = Long.parseLong(duration);
        int m = (int) (l / 60);
        int s = (int) (l - m * 60);

        return str + m + "'" + s+"''";
    }

    /**
     * 调整图片对比度
     * @param imageView
     * @param x 整数越大越亮，负数越大越暗
     */
    public static void adjustContrast(ImageView imageView,int x) {
        int brightness = x; //RGB偏移量，变暗为负数
        ColorMatrix matrix = new ColorMatrix();
        matrix.set(new float[]{1, 0, 0, 0, brightness, 0, 1, 0, 0, brightness, 0, 0, 1, 0, brightness, 0, 0, 0, 1, 0});
        ColorMatrixColorFilter cmcf = new ColorMatrixColorFilter(matrix);
        imageView.setColorFilter(cmcf);
    }
}
