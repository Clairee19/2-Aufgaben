package h2;

public class H2_main {

	public static void main(String[] args) {
		int i = 6;
		int j = 2; 
		int k = 9;
		int min;
		int max;
		
		if (i < j && i < k) {
			min = i; 
		}	else if (j < i && j < k) {
			min = j;
		}   else  {
			min = k;
			
		}
		
		if(i > j && i > k)  {
	    	max = i;
	    }
	    else if (j > i && j > k) {
	    	max = j;
	    } else  {
	    	max = k;
	    }
		{
		System.out.println("min=" + min);
		System.out.println("max=" + max); }
	}
}
	
		
	
		
	


