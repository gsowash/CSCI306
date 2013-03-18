import java.awt.Rectangle;

public class Firstclass {

	 public static void main(String args[])
     {
		String cis = "C is cool";
		String java = "I love Java";
		String javacut = java.substring(7);
		String combined = cis.replace("C", javacut);
        System.out.println("Original string 1 is: " + cis);
        System.out.println("Original string 2 is: " + java);
        System.out.println("Combined string is: " + combined + "\n");      
        
        Rectangle check1 = new Rectangle(2,2,2,2);
        Rectangle check2 = new Rectangle(2,2,2,2);
        System.out.println("The first rectangle is " + check1);
        System.out.println("The second rectangle is " + check2);  
        
        if (check1==check2)
        	System.out.println(check1 + " is the same as " + check2);
        else if (check1!=check2)
        	System.out.println(check1 + " is not the same as " + check2 + "\n");
         
        
        String ilovecaps = "I LoVe CaPiTaLiZaTiOn";
		String ihatecaps = "i love capitalization";
		
        System.out.println("String 1 is: " + ilovecaps);
        System.out.println("String 2 is: " + ihatecaps + "\n");
        
        System.out.println("Equals:");
        if (ilovecaps.equals(ihatecaps))
        	System.out.println(ilovecaps + " is the same as " + ihatecaps);
        else
        	System.out.println(ilovecaps + " is not the same as " + ihatecaps + "\n");
        
        System.out.println("Equals ignore caps:");
        if (ilovecaps.equalsIgnoreCase(ihatecaps))
        	System.out.println(ilovecaps + " is the same as " + ihatecaps);
        else
        	System.out.println(ilovecaps + " is not the same as " + ihatecaps);
        
     }
}
