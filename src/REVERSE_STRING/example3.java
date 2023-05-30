package REVERSE_STRING;

public class example3 {

	public static void main(String[] args) {
		
		String name= "shahrukh";
		String rname= "";
		
		for(int i=name.length()-1; i>=0; i--) 
		{
			rname= rname+name.charAt(i);
		}
		System.out.println("original name = "+name);
		System.out.println("reverse name = "+rname);
		
	}
	
	
}
