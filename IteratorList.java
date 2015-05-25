public class Iterator{
    	int i;
       	public Iterator (){
    	    i=0;
    	}
    	public static boolean hasNext(){
	    List l =this;
    	    if ( l!=null)
    		return true;
    	    else return false;
    	}
	
    	public static int next(){
	    
    	    while (List.suiv!=null){
    		List tmp= List.suiv;
    		return  tmp.elt;
    	    }
	
    }
    }
