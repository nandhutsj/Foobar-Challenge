public class Solution
{
 public static String solution(int m)
 {			
			String primeNumbers ="";
			String op="";
            if(m >= 0 && m <= 10000)
			{				
			for (int i = 1; i <= 22000; i++)         
			 { 		  	  
				int counter=0; 	  
				for(int num =i; num>=1; num--)
				{
					if(i%num==0)
					{
					counter = counter + 1;
					}
				}
				if (counter ==2)
				{
					primeNumbers = primeNumbers + i ;
				}	
			 }	
			 int n = m+5;
			 op= primeNumbers.substring(m,n);
			}			
		
			 return (op);
  }
}