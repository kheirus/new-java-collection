
/*****************************************************************************************************************************************/
/*********                M U L T I _ E N S E M B L E    E N    L I S T E    C H A I N E E                                        *********/	     
/**************************************************************************************************************************************/





public class MultiEnsembleList extends List{
    
    public MultiEnsembleList (){
	super ();
    }
    
    
    public MultiEnsembleList (int x, MultiEnsembleList me){
	super (x,me);
    }
    
    /**Supprime toutes les occurences de x dans une liste
     *@param x
     *element a supprimer
     **/
   
   

    /*** String toString() : donne des information sur le multi-ensemble *****/
    
    public String toString(){
	super.toString();
	return "EST UN MULTI_ENSEMBLE DE "+this.size()+" ELEMENTS \n ";
    }
}