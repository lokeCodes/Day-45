// https://www.codechef.com/problems/PRB01
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
        while(t-- > 0){
            int count=0;
            int n = s.nextInt();
            for(int i=1;i<=n/2;i++){
                if(n%i==0){
                    count++;
                }
            }
            
            if(count==2){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
	}
}
