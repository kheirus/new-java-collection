/*****************************************************************************************************************************************/
/*********                       E N S E M B L E     E N      L I S T E     C H A I N E E                                        *********/	     
/**************************************************************************************************************************************/





public class EnsembleList extends MultiEnsembleList {
	
    public EnsembleList () {
	super ();
    }
    
    public EnsembleList(int x, EnsembleList e){
	super (x,e);
    }
    
    
    public void add(int x)  {                   
    	while (!this.contains (x)) {
	    super.add(x);
	}
    }
    
    
    /**Donne des informations sur l'ensemble
     **/
    public String toString(){                        
    	super.toString();
    	return "EST UN ENSEMBLE DE "+this.size()+" ELEMENTS \n ";
    }
    

}