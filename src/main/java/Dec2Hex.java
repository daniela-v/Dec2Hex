// import java.util.Scanner; 

public class Dec2Hex{

    private static int arg;

    public static void main(String args[]) throws Exception {
        if (args.length > 0) {
            try{
                arg = Integer.parseInt(args[0]);
            } 
            catch (NumberFormatException e){
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        else if (args.length == 0) {

        	System.err.println("No input provided. You must enter an integer argument!");
        	System.exit(0);      
        }
        
        convertDec2Hex(arg);
    }

    //Method that converts decimal to hexadecimal    
    public static String convertDec2Hex(int decimal){
    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem; 
        int num;
	num = decimal;
	String hexadecimal=""; 
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        while(num != 0){
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        
        System.out.println("Hexadecimal representation is : " + hexadecimal);
        return hexadecimal;
       }
}