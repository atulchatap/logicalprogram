package REVERSE_STRING;

public class palindromnum {

    public static void main(String[] args) {
		
    	int num= 162;
    	int temp= num;
    	int rev= 0;
    	int rem;
    	
    	while(temp!=0)
    	{             
    		rem= temp%10;     //161%10= 1 //16%10=6 //1%10=1
    		rev= rev*10+rem;   //0*10+1= 1 //1*10+6=16// 16*10+1=161
    		temp= temp/10;     //161/10=16 //16/10=1 //
    	}
    	if(num==rev)
    	{
    		System.out.println("number is palindrom");
    	}
    	else
    	{
    		System.out.println("number is not palindrom");
    	}
    	
    	
	}
	
	
	
	
}
