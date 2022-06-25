package com.magiraldooc;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        String S1 = "abccbd";
        int[] C1 = {0,1,2,3,4,5};

        String S2 = "aabbcc";
        int[] C2 = {1, 2, 1, 2, 1, 2};

        String S3 = "aaaa";
        int[] C3 = {3, 4, 5, 6};

        String S4 = "ababa";
        int[] C4 = {10, 5, 10, 5, 10};

        Program main = new Program();

        /*main.solution(S1, C1);
        main.solution(S2, C2);
        main.solution(S3, C3);
        main.solution(S4, C4);*/

        for (int i = 0; i < 100; i ++) {
            System.out.println(i);
        }

        var sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        var nombre = sc.nextLine();
        System.out.println("Hola " + nombre + " !");
    }

    public int solution(String S, int[] C) {
        System.out.println("--------------------------------------------------");
        // write your code in Java SE 8
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int num : C) {
            numbers.add(num);
        }

        System.out.println(numbers);
        char[] charS = S.toCharArray();

        ArrayList<Character> string = new ArrayList<Character>();
        for (char ch : charS) {
            string.add(ch);
        }

        /*string.indexOf('a');
        System.out.println(string.indexOf('a'));
        result.remove(2);*/
        System.out.println(string);

        /*for (char letter: S.toCharArray()) {
            //System.out.println(letter);
        }*/

        ArrayList<ArrayList<Integer>> index = new ArrayList<ArrayList<Integer>>();
        /*for (int i = 0; i < S.length() - 1; i ++){
            if (string.get(i) == string.get(i + 1)) {
                index.add(i);
            }
        }*/

        int i = 0;
        while (i < S.length() - 1){
            int j = i + 1;
            //System.out.println(i);
            ArrayList<Integer> index2 = new ArrayList<Integer>();
            index2.add(i);
            while (j < S.length() && string.get(i) == string.get(j)){
                //System.out.println(j);
                index2.add(j);
                j ++;
            }
            index.add(index2);
            i = j;
            //System.out.println("-----------------");
        }

        if (index.size() == 0){
            return 0;
        }

        /*for (int k = 0; k < S.length() - 1; k ++){
            if (string.get(k) == string.get(k + 1)) {
                index.add(k);
            }
        }*/
        int sumDelete = 0;
        for (ArrayList<Integer> indexRepeat : index){
            if(indexRepeat.size() > 1){
                /*System.out.println("-----------------");
                System.out.println(indexRepeat);*/
                ArrayList<Integer> values = new ArrayList<Integer>();
                for (int k = 0; k < indexRepeat.size(); k ++){
                    values.add(numbers.get(k));
                }

                //System.out.println(values);

                Collections.sort(values);

                for (int k = 0; k < values.size() - 1; k ++){
                    sumDelete += values.get(k);
                }

            }
        }

        System.out.println(sumDelete);
        return 1;
    }
}
