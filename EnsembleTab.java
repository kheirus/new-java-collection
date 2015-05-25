public class EnsembleTab extends MultiEnsembleTab{
    
     
    public EnsembleTab(){
	super();

    }
    public EnsembleTab(int t){
	super(t);
    }
    /**
     * Ajoute element à un ensemble
     *@param elemen
     *element à ajouter
     */
    public void add(int element){
	if(!this.contains(element))
	   super.add(element);
	
    }
    
    /* FIX ME 
       UNION NOT GOOD FOR MOMENT */


}
