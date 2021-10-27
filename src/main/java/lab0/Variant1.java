package lab0;


import java.util.Arrays;

public class Variant1 {


    /**
     *
     *
     */

    /**
     * @param a - 2-digits integer
     * @return swap digits
     *
     */

    public int integerNumbersTask(int a) {
        assert a > 10 && a < 100:"Error";
        int b = a / 10 + a % 10 * 10;
        return b;
    }

    /**
     * @param a - integer
     * @return true, if a and b are uneven
     */
    public boolean booleanTask(int a, int b){
       if(a % 2 == 1 && b % 2 == 1)
           return true;
       return false;
    }



    /**
     *
     * @param x1 - integer
     * @param x2 - integer
     * @return bigger then smaller one
     */
    public int[] ifTask(int x1, int x2) {
        int[] rez = new int[2];
        if (x1 > x2) {
            rez[0] = x1;
            rez[1] = x2;
        }

        else{
            rez[0] = x2;
            rez[1] = x1;
        }
        return rez;
    }


    /**
     * @param d - day of month
     * @param m - month
     * @return d and m for previous day
     */
    public int[] switchTask(int d, int m) {
        assert d > 0 && d < 32: "Input valid day";
        assert m > 0 && m < 13: "Input valid month";
        int[] date = new int[2];
        if(d > 1) {
            d= d - 1;
        }
        else {
                m = m -1;
            switch(m){
                case 1, 3, 5, 7, 8, 10, 12: d = 31; break;
                case 2: d = 28; break;
                default: d = 30;
            }

        }
        date[0] = d;
        date[1] = m;
        return date;
    }



    /**
     *
     * @param a - integer
     * @param b - integer
     *
     * @return product of all integers from A to B inclusive
     */

    public int forTask(int a , int b) {
        assert a < b: "A must be less than B";
        int sum = 1;
        for(int i = a; i <= b; i++) sum *= i;
        return sum;
    }


    /**
     * @param n - integers
     * @return max integer k^2 <= n

     */
    public int whileTask(int n) {
        assert n > 0 : "Argument should be more than zero";

        int k = 1;
        while (k*k <= n){
                k++;
        }
        k -= 1;
        return k;
    }


    /**
     * @param n - length of array
     * @param array - array of integers
     * @return where are found first and last minimums
     */
    public int[] minMaxTask(int n, int[] array) {
        assert n > 1: "A is the size of array, it can't be less than 1";
        int[] res = new int[2];
        int min = array[0];
        res[0] = 0;
        res[1] = 0;

        for(int i = 0; i < n; i++){
            if (array[i] < min) {
                min = array[i];
                res[0] = i;
                res[1] = i;
            }
            else if(array[i] == min) res[1] = i;
        }
        res[0]=res[0] + 1;
        res[1] = res[1] + 1;

        return res;
    }

    /**
     * @param n - length of array
     * @param array - array of integers
     * @return array of all uneven numbers and their count in array
     *
     */

    public int[] arrayTask(int n, int[] array){
        int[] res = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++){
            if(array[i] % 2 == 1){
                res[k] = array[i];
                k++;
            }
        }

        int[] ret = new int[k+1];
        for(int i = 0; i < k; i++) ret[i] = res[i];
        ret[k] = k;

        return ret;
    }

    /**
     * @param k - number
     * @param m - matrix height
     * @param n - matrix length
     * @param matrix - matrix of integers
     * @return all elements in k-column
     */
    public int[]  twoDimensionArrayTask(int k, int m, int n, int[][] matrix) {
        assert k >= 1 && k <= n: "Not a column";
        int[] array = new int[m];
        k--;

        for(int i = 0; i < m; i++){
            array[i] = matrix[i][k];
        }

        return array;
    }


    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}