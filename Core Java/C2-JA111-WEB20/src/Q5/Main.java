package Q5;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            ans[i] = 2*arr[i];
            System.out.print(ans[i] + " ");
        }

    }
}
