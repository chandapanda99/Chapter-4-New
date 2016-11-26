package Rational;

public class RationalNumbers
{
   //-----------------------------------------------------------------
   //  Creates some rational number objects and performs various
   //  operations on them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
	   //create Rational numbers
      RationalClass r1 = new RationalClass (6, 8);
      RationalClass r2 = new RationalClass (1, 3);
      RationalClass r3, r4, r5, r6, r7;

		//use toString to print
      System.out.println ("First rational number: " + r1);
      System.out.println ("Second rational number: " + r2);

		//are the rational numbers equal?
      if (r1.equals(r2))
         System.out.println ("r1 and r2 are equal.");
      else
         System.out.println ("r1 and r2 are NOT equal.");

      r3 = r1.reciprocal();//reciprocal of r1
      System.out.println ("The reciprocal of r1 is: " + r3);

      r4 = r1.add(r2);
      r5 = r1.subtract(r2);
      r6 = r1.multiply(r2);
      r7 = r1.divide(r2);
	  
      System.out.println (r1 + " + " + r2 + " = " + r4);
      System.out.println (r1 + " - " + r2 + " = " + r5);
      System.out.println (r1 + " * " + r2 + " = " + r6);
      System.out.println (r1 + " / " + r2 + " = " + r7);
   }
}
