			public static int solution(int n) 
				{   
						 static int[][] arr1 = new int[201][201];
						 arr1[1][1] = 1; 
		                 arr1[2][2] = 1;  
		for (int i = 3; i < 201 ; i++) 
			{   
				for (int j = 1; j <= i; j++) 
				{    
					if (i-j == 0) 
					{     
						arr1[i][j] = 1 + arr1[i][j-1];    
					}
					else if (i-j < j) 
					{ 
						arr1[i][j] = arr1[i-j][i-j] + arr1[i][j-1];    
					}
					else if (i-j == j) 	 
					{
						arr1[i][j] = arr1[i][j-1] + arr1[i][j-1];
					} 
					else if (i-j >j)
					{     
						arr1[i][j] = arr1[i-j][j-1] + arr1[i][j-1];
					}   
				} 
			}
					return arr1[n][n] - 1;  
				}