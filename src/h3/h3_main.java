package h3;

public class h3_main {

	public static void main(String[] args) {
		int i = 200;
		int j = 110;
		int k = -10;
		
		if (i > j) {
			if (i > 200)
				if (j > 100) {
					k = 3;
				} else {
					k = 2;
				}
		}  else {
			if (!(j > 100)) {
				k = 1;
			} else 
				k = -10;
			
		}   if (!(i > j) && !(i > 200) && !(j > 100))  {
		 k = 4;
	} else {
		k = -10;
		
	}
	System.out.println("i =" + i + "j =" + j + "k =" + k);
		}
	}






