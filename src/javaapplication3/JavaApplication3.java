package javaapplication3;



public class JavaApplication3 {
public static void countchars(String s) {
		int numL=0;
		int numD=0;
		int rest=0;
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(Character.isLetter(c)) {
				numL++;
			}
			else if(Character.isDigit(c)) {
				numD++;
			}else rest++;
		}
		String p=String.format("Letters num is: %d, Digits num is: %d, rest is: %d", numL,numD,rest);
		System.out.println(p);
	}

    public static void main(String[] args) {
       countchars("Hello world 123");
        
        

        
    }
    
}
