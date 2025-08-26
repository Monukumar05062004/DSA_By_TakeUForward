package oop;
//Pair with given sum (Two sum)
public class TwoSumProblem {
    static boolean check() {
        int[] array = new int[]{1, -1, -2, 3, 5};
        int x = 2;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
        public static void main (String[]args){
            System.out.println(check());
        }

}

