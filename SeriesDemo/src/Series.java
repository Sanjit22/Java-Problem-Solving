
import java.util.*;
import java.io.*;

class Series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            terms(a,b,n);
            System.out.printf("\n");
        }
     
        in.close();
        
    }
    
    public static void terms(int a,int b,int n) {
    	int s=0;
        double p;
        for(int j=0;j<n;j++){
        	p=Math.pow(2,j);
        	if(j==0) {
        		s=(int) (s+a+(p*b));
        	}
        	else {
        		s=(int) (s+(p*b));
        	}
            System.out.printf(s+" ");
        }
    }
}
