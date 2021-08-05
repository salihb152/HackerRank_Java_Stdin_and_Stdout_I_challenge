import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] input= new int[3];
        for(int i =0; i<3; i++){
            input[i]=sc.nextInt();
        }
        sc.close();
        for(int i : input){
            System.out.println(i);
        }
    }
}
