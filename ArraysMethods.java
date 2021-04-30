import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class ArraysMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random val = new Random();
        //Single Dimensional Array
        int[] arr = {1,5,6,9};
        //Multidimensional Array
        int[][] Arr ={{1,2,3},{2,5,6}};
        //Traversing in Array
        for (int i = 0; i < Arr.length ; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
        String name = scan.nextLine();
        char[] words = new char[name.length()];
        words=name.toCharArray();
        //Traversing using For-each loop
        for (char c: words) {
            System.out.print(c+" ");
        }
        //Printing Char Array
        System.out.println("\n"+Arrays.toString(words));
        //Taking Array Element input by User
        System.out.println("Enter the Size of Array:");
        int size = scan.nextInt();
        int[] Numbers = new int[size];
        for (int i = 0; i < Numbers.length ; i++) {
            Numbers[i] = scan.nextInt();
        }
        //Multidimensional Array Using Random
        System.out.print("Enter the Size Of Row:");
        int row = scan.nextInt();
        System.out.print("Enter the Size of column:");
        int col = scan.nextInt();
        int[][] Matrices = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Matrices[i][j]= val.nextInt(50);
            }
        }
        System.out.println("----------MatriX----------");
        for (int[] ar:Matrices) {
            System.out.println(Arrays.toString(ar));
        }

    }

}

