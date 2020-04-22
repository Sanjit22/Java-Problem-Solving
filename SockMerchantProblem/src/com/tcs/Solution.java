package com.tcs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int countU=0;
    	int countD=0;
    	int steps;
        for(int i=0;i<n;i++) {
        	//char c = s.charAt(i);
        	if(s.charAt(i)=='U') {
        		countU++;
        	}
        	else {
        		countD++;
        	}
        }
       // System.out.println(countU+" "+countD);
       
        if(countU>countD) {
        	steps= countU-countD;
        	return steps;
        }
        else if(countU<countD) {
        	steps =countD-countU;
        	return steps;
        }
        else {
        	steps=1;
        	return steps;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);
       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
