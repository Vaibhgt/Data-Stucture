class Snippet{
	static int akshay(int x)
	{
		int result;
		
		if (x==2){
		
		return 0;
		
		
		}
		result=akshay(x-1);
		return result;
		
		
		
	}
	
		public static void main(String args[]){
			int a=5;
			
			System.out.println(akshay(a));
			
		}	
		
}