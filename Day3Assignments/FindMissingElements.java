package week1.Day3.Day3Assignments;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		
       int a[]= {1,4,3,2,8,6,7};
       
       Arrays.sort(a);
       System.out.println(Arrays.toString(a));
       //[1, 2, 3, 4, 6, 7, 8]
       for(int i=0;i<a.length;i++)
       {
    	   
    	   if(a[i]+1!=a[i+1])
    	   {
    		   System.out.println("The missing number is :"+(a[i]+1));
    		   break;
    	   }
	}

	
	
}
}