public class SortedEnsembleList extends EnsembleList{

    public SortedEnsembleList (){
	super();
    }

    public SortedEnsembleList (int x, SortedEnsembleList sl){
	super(x,sl);
    }
    
    
    public static SortedEnsembleList tri(SortedEnsembleList a){
        SortedEnsembleList res=new SortedEnsembleList(); //tête du résultat
        List t,u,x;
        while(a.suiv!=null){
            t=a.suiv; // élément à insérer
            u=t.suiv;
            a.suiv=u;// supprimer cet élément de la liste a
            // chercher la place de t.elt dans la liste res
            for(x=res;x.suiv!=null;x=x.suiv)
                if (x.suiv.elt > t.elt)break;
            // insérer t après x
            t.suiv=x.suiv;
            x.suiv=t;
        }
        return(res);
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
