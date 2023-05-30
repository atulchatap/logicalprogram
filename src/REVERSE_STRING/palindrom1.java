package REVERSE_STRING;

public class palindrom1 {

public static void main(String[] args) {
		
    	int num= 162122;
    	int rev= 0;
    	int rem;
    	
    	while(num!=0)
    	{             
    		rem= num%10;     //161%10= 1 //16%10=6 //1%10=1
    		rev= rev*10+rem;   //0*10+1= 1 //1*10+6=16// 16*10+1=161
    		num= num/10;                  //161/10=16 //16/10=1 //
    	}
    	System.out.println(rev);
    	
}
}