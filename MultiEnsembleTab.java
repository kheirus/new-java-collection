import java.util.*;

public class MultiEnsembleTab extends AbstractTab {
    
    class Iterator{
	int i;
	int alea;

	public Iterator() {
	    i = 0;
	}

	public Iterator(int alea){
	    this.alea = alea;
	    i = alea;

	}
	/**
	 * Retourne vrai si l'iteration a encore des élements.
	 **/
	public boolean hasNext(){
	    if(i == compt)
		return false ;
	    else
		return true;
	}
	/**
	 * Retourne l'element suivant dans l'iteration.
	 **/
	public int next(){
	    return tab[i++];
	}

    }


    public MultiEnsembleTab(){
	
    }
    
    
    public MultiEnsembleTab(int t){
	this.taille = t;
	this.tab = new int[taille];
    }	
    
    /**
     * Supprime tout les elements x
     * @param x
     * element à supprimer
     **/
    public void removeAll(int x){
	while(super.contains(x)){
	    super.remove(x);
	}
    }
    /**
     * Retourne la taille de l'ensemble
     **/
    public int size(){
        return taille;
    }
    /**
     * Retourne les élements de la structure
     **/
    public String enumerateur(){
        String s="";
	Iterator i = new Iterator();
	while(i.hasNext())
	    s += "|"+i.next();
        return s;
    }
    /**
     * Retourne les élements de la structure aléatoirement
     **/
    public String enumerateurAleatoire(){
        String s="";
        Random r = new Random();
	int alea = r.nextInt(compt)+ 0;
	Iterator i = new Iterator(alea);
	while(i.hasNext())
	    s +="|"+ i.next();
        return s;
    }
    /**
     * Applique l'union de 2 ensembles
     * @param e
     * ensemble avec lequel on veut faire l'union
     *
     **/
    public void union(MultiEnsembleTab e){
	int [] temp = new int[this.compt + e.compt];
	
	for(int i = 0; i < this.compt; i++)
	    temp[i] = this.tab[i];
	
	for(int j = this.compt; j < temp.length; j++)
	    temp[j] = e.tab[j-this.compt];

	compt = this.compt + e.compt;
	this.tab = temp;
    }
    /**
     * Union de 2 ensembles
     * @param e
     * Ensemble numero 1 
     * @param e1
     * Ensemble numero 2
     **/
    public static MultiEnsembleTab union(MultiEnsembleTab e, MultiEnsembleTab e1){
	MultiEnsembleTab union = new MultiEnsembleTab(e.compt+e1.compt);
 	for(int i = 0; i < e.taille;i++)
	    union.add(e.tab[i]);

	for(int j = e.taille; j < union.taille; j++)
	    union.add(e1.tab[j-e.taille]);

	return union;
    }
    /**
     * Applique l'intersetion de 2 ensembles
     * @param e
     * ensemble avec lequel on veut faire l'intersection
     *
     **/
    public void inter(MultiEnsembleTab e){
	int k = 0;
	int [] temp = new int[this.compt + e.compt];
	for(int i = 0; i < this.compt; i++){
	    for(int j = 0; j < e.compt; j++) {
		if(this.tab[i] == e.tab[j]){
		    System.out.println("tab[i]"+tab[i]);
		    System.out.println("tab[j]"+tab[j]);
		    temp[k]= e.tab[j];
		    k++;
		    	    
		}
	    }
	}
	compt = k;
	this.tab = temp;
    }

    /**
     * Intersection de 2 ensembles
     * @param e
     * Intersection numero 1 
     * @param e1
     * Intersection numero 2
     **/
    public static MultiEnsembleTab inter(MultiEnsembleTab e, MultiEnsembleTab e1){
	int k=0;
	MultiEnsembleTab inter = new MultiEnsembleTab(e.compt + e1.compt);
	for(int i = 0; i < e.compt; i++){
	    for(int j = 0; j < e1.compt; j++) {
		if(e.tab[i] == e1.tab[j]){
		    inter.add(e.tab[i]);
		    k++;	   
		}
	    }
	}
	return inter;		
    }


}
