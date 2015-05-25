

public class SortedMultiEnsembleList extends MultiEnsembleList{

 
    
    public SortedMultiEnsembleList (){
	super();
    }

    public SortedMultiEnsembleList (int x, SortedMultiEnsembleList sl){
	super(x,sl);
    }
    
    
       public void add(int x)  {     
	List precedent = new SortedEnsembleList();
	precedent=this;
	List p = new SortedEnsembleList();
	p=this;
	//List tmp = l.suiv;
	
	while (p.getElt() <= x && p.getSuiv() !=null ) {
	    precedent = p;
	    p=p.getSuiv();
	    
	}
	List n = new SortedEnsembleList (x,(SortedEnsembleList)p.getSuiv());
	    
	if (p.getElt()>=x) {
	    precedent.setSuiv((SortedEnsembleList)n);
	    
	}
	
	else {
	    n.setSuiv(null);
	    p.setSuiv(n);
		
	}
	
    }
 
    
}
