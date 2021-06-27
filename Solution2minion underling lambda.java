lambda
input 10
output 1
public class Solution2
{
 public static int solution(int m)
 {			
		int  t1 = 1, t2 = 1,ad = 1,as = 0,count1 = 0,count2 = 0,td1 = 0,td2 = 0,res=0;
        for (int i = 1; i <= m; ++i)
        {
			td1 = td1 + t1;
			if(td1 > m)	
			{	
				break;
			}
            as = t1 + t2;
            t1 = t2;
            t2 = as;
			count1 = count1 + 1;
        }
		for (int i = 1; i <= m; ++i)
        {    
	        td2 = td2 + ad;
			if(td2 > m)	
			{	
				break;
			}
			
            ad = ad * 2;
			count2 = count2 + 1;
        }
				res = count1 - count2;
			 return (res);
  }
}