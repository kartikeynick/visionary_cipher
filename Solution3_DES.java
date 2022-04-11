import java.util.ArrayList;
import java.util.Arrays;

public class DES {

    public static void main(String args[]) {
        dec();
    }

    public static void dec() {
        //int ark[] = {57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4};
        //Arrays.sort(ark);
        int ark[] = new int[56];//array to store the 56 numbers in array key
        for (int x = 0; x < 56; x++) //storing 1-56 numbers in ark
        {
            ark[x] = x + 1;
        }
        int l[] = new int[28];//to store left side
        int r[] = new int[28];//to store right side
        //to circular left shift the left and right array and storing them in a temp array
        int l2[] = new int[28];
        int r2[] = new int[28];
        for (int x = 0; x < 28; x++) // storeing left side
        {
            l[x] = ark[x];
        }
        for (int x = 28; x < 56; x++) //storeing right side
        {
            r[x - 28] = ark[x];
        }

        for (int x = 1; x <= 16; x++) // circular left shifting left and right keys in 16 rounds
        {
            System.out.println("\nRound " + x);//print the round number
            /*
             * indexes 1,2,9,16 have 1 left circular shift
             * the rest has 2 left circular shifts
             *  */
            if (x == 1 || x == 2 || x == 9 || x == 16) {
                for (int y = 0; y < 28; y++) {

                    l2[y] = y < 27 ? l[y + 1] : l[y - 27];
                    r2[y] = y < 27 ? r[y + 1] : r[y - 27];

                }
            } else {
                for (int y = 0; y < 28; y++) {
                    l2[y] = y < 26 ? l[y + 2] : l[y - 26];
                    r2[y] = y < 26 ? r[y + 2] : r[y - 26];
                }
            }

            for (int i = 0; i < 28; i++) {
                l[i] = l2[i];//storing back from temp array to original
            }
            for (int i = 0; i < 28; i++) {
                r[i] = r2[i];//storing back from temp array to original
            }
            //threat model, keep in mind

            int c = 0;//print the number of dropped bits
            for (int i = 0; i < 56; i++) {

                /*
                 * which keys are not used
                 * */
                if (i == 9 - 1 || i == 18 - 1 || i == 22 - 1 || i == 25 - 1 || i == 35 - 1 || i == 38 - 1 || i == 43 - 1 || i == 54-1)//check if they lie in these indexes  (-1 because of the index)
                {
                    if (i < 28 && l[i] > 0) {
                        c++;//to count the skipped components
                        //Arrays.sort(ark);
                        System.out.print(l[i] + "  ");
                    } else if (i >= 28 && r[i - 28] > 0) {
                        c++;//to count the skipped components
                        System.out.print(r[i - 28] + "  ");
                    }
                }/*
                if (i < 28 && l[i] > 0) {
                    c++;
                    System.out.print(l[i] + "  ");
                } else if (i >= 28 && r[i - 28] > 0) {
                    c++;
                    System.out.print(r[i - 28] + "  ");
                }*/
            }


            //System.out.println("count  = " + c);//printing how many were dropped

        }
    }
}




