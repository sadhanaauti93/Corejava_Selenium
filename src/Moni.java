import java.util.*; 
public class Moni {
/*	public static void main(String[] args) {
		String x= "abc";
		String y ="abc";
		x.concat(y);
		System.out.println(x);
	}
}

*/
 public static void main(String[] args) 
   {  
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number: ");  
       String reverse = ""; 
       String num = sc.nextLine(); 
       int length = num.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + num.charAt(i);  
      if (num.equals(reverse))  
         System.out.println("The entered string " +num +" is a palindrome.");  
      else  
         System.out.println("The entered string " +num +"  isn't a palindrome.");     
  }
} 