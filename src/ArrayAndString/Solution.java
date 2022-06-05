package ArrayAndString;

import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        int d=b*b-4*a*c;
        ArrayList<Integer> l=new ArrayList<>();
        if(d==0)
        {
            l.add((int)Math.floor(-b/(2*a)));
            l.add((int)Math.floor(-b/(2*a)));
            
        }
        else if(d>0)
        {
            l.add((-b+(int)(Math.floor(Math.sqrt(d))))/(2*a));
            l.add((-b-(int)(Math.floor(Math.sqrt(d))))/(2*a));
            
        }
        else
        {
            l.add(-1);
        }
        return l;
    }
    public static void main(String[] args) {
    	;
    	System.out.println(quadraticRoots(752, 904, 164));
    	double res=0;
    	for(int i=2;i<=5;i++)
    	{
    		res=res+Math.log10(i);
    	}
    	System.out.println(res);
	}
}