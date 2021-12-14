package lesson18C;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(findNumber("11")));
        System.out.println(Arrays.toString(findNumber("125")));

        System.out.println(Arrays.toString(findNumber(null)));
        System.out.println(Arrays.toString(findNumber("11a")));
        System.out.println(Arrays.toString(findNumber("aaaaa")));
        System.out.println(Arrays.toString(findNumber("aaaaa  adfadfaf")));
    }

    public static int[] findNumber(String text) {
        int res;
        try {
            res=Integer.parseInt(text);
        } catch (Exception e) {
            System.out.print(text + " not a number");
            return null;
        }

        int [] result=new int[res+1];
        for(int i=0;i<result.length;i++){
            result[i]=i;
        }
    return result;}
}
