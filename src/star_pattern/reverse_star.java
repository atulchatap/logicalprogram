package star_pattern;

public class reverse_star {

	public static void main(String[] args) {
	
	int star=4;
	int space=0;
	for(int i=1; i<=4; i++)
	{
		for(int k=1; k<=space; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		
	
		
		space++;
		star--;
	}	
	}
	
	
	}
	
