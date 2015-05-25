import java.util.*;
import java.lang.*;

 public class Test {
   
     public static void main(String[] args) {
	 List a = new SortedEnsembleList ();
	 List b = new SortedEnsembleList ();
	 //List c = new EnsembleList ();
	 //MultiEnsemble a = new MultiEnsemble ();
	 
	 a.add(1);a.add(2);a.add(8);a.add(5);
	 b.add(5);b.add(23);b.add(6);b.add(2);b.add(5);b.add(7);b.add(8);
	 //	 copie = copie.copier(b);
	      
	System.out.println("\nAvant: \n ");
	
	
	System.out.println("a =");
	a.display();  
	System.out.println("\n");
	System.out.println(a.toString()+"\n");
	
	System.out.println("b =");
	b.display();   System.out.println("\n");
	
	// System.out.println("copie de b = ");
	// copie.display();   System.out.println("\n");
	//c=c.union (a,b);
	
	
	     /************************************************************************/
	     /************   AFFICHAGE *******************/	     
	    /************************************************************************/
	 

	      // System.out.println("Apres :\n");
	      
	      // //c.display();
	      // System.out.println(c);
	      // // c.toString();
	      // 
	
     
   
    }

}