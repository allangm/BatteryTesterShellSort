package com.example.aquiros.shellsort;

/**
 * Created by aquiros on 29/04/2015.
 */
public class ShellSort {

    public static void shell(int[] a) {
        int increment = a.length / 2;
        while (increment > 0) {
            for (int i = increment; i < a.length; i++) {
                int j = i;
                int temp = a[i];
                while (j >= increment && a[j - increment] > temp) {
                    a[j] = a[j - increment];
                    j = j - increment;
                }
                a[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }

    public String arrayToString(int [] pArray){
        String cadena="[";
        for(int i=0; i< pArray.length;i++){
            cadena+=pArray[i];
            if(i<pArray.length-1){
                cadena+=",";
            }
        }
        return cadena+"]";
    }
}
