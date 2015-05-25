/*****************************************************************************************************************************************/
/*********                       C L A S S E    M E R E    L I S T                                         *********/	     
/**************************************************************************************************************************************/





public class List implements Container 
{
    /*notre element est un entier*/
    int elt;    
    /*recursivement suiv pointe vers l'element suivant*/
    List suiv;
 
    

    /****** Contructeur vide ********/
    public List () {                           
    }
    

    /******* Constructeur avec un seul element ******/
    public List (int i, List l){                  
	elt =i;
	suiv = l;
    }


   
    /** Renvoie une liste vide
     */
    static List emptyList (){                       
	
	List l = new List ();
	return l=null;
    }
    

    /** Renvoie true si l'element est dans la liste, false sinon
     *@param x
     *	element qu'on recherche 
     **/
    public boolean contains (int x){              
	/*l est l'appelant de la methode*/
	List l = this.suiv;
	/*tant que l n'est pas vide on test si l'element dans l est bien l'element qu'on recherche*/
	while (l != null){
	    if (l.elt == x)
		return true;
	    l = l.suiv;
	}
	return false;
    }
    
    
    

    /** Teste si l'ensemble est vide ou pas
     *@param l 
     *Liste  
     */

    static boolean isEmpty (List l){              
	return (l==null);
    }
    

    /**Ajoute un element dans une liste
     *@param x
     *element a ajouter 
     **/
    
    public void add(int x) {                  

	/*tmp est reference vers notre liste appelante à la methode*/
	List tmp=this;
	/*On ajoute x dans une nouvelle liste n*/
	List n= new List(x,null);

	/*On va jusqu'au dernier element et on ajoute le nouvel element à n et on boucle sur ça*/
	while(tmp.suiv!= null){
	    tmp=tmp.suiv;
	}
	/*c'est ici qu'on l'ajoute*/
	tmp.suiv=n;
    }
    
    
    /**Supprime une seule occurence de x dans une liste
     *@param x
     *element a supprimer
     **/
    
    public void remove (int x) throws ListException{              
	
	/*On a une reference pour le premier element de la liste tmp*/
	List tmp = this.suiv;
	
	/*et une reference pour la tete de la liste (ici h pour header)*/
	List h = this;
	
	
	if (h.isEmpty(tmp)) throw new ListException();  /*On ne peut biensur pas supprimer dans une liste vide*/
	if (!h.contains(x)) throw new ListException(x);  /*Ni supprimer un element qui n'existe même pas dans notre liste*/
	
	/*Pour ne pas supprimer la tete soit qui contient la reference de la liste*/
	if(h.elt == x)return;
	
	/*tant que notre liste n'est pas vide*/
	while(tmp != null){
	    /*Si on trouve l'element qu'on veut supprimer, l'element d'avant vas pointer d'apres, et comme ça l'element courant (qu'on veut supprimer est ignoré)*/
	    if(tmp.elt == x){
		h.suiv = tmp.suiv; 
		return;
	    }
	    /*si on trouve pas l'element on va à l'element suivant*/
	    tmp = tmp.suiv;
	    h = h.suiv;
	}
    }
    
    /**Supprime toutes les occurences de x dans une liste
     *@param x
     *elements a supprimer
     **/
     public void removeAll (int x) throws ListException{                  
	List me = this;
	if (me.isEmpty(this.suiv)) throw new ListException();
	if (!me.contains(x)) throw new ListException(x);
	while ((me.contains(x))){
	    me.remove(x);
	}
    }
    

    /**Affiche les elements de la liste
     */
 
    public void display() {                               
	List l = this.suiv;
	
	try {
	    do {
		
		System.out.print(l.elt+" ");
		l=l.suiv;
	    }while (l!=null);
	}catch (Exception e) {System.out.println(e.getMessage());}
	
    }
  
    /**Renvoie le nombre d'elements d'une liste
     **/

    public int size () {                                  
	/*On déclare un entier ici cpt (pour compteur) qu'on incrementera à chaque fois qu'on lit un entier, soit tant que (l.suiv !null) */
	int cpt =0;
	List l = this;
 	while (l.suiv!=null){
	    l=l.suiv;
	    /*ici l'incrementation, on a lu un entier*/
	    cpt++;
	}
	/*On a juste a retourner cpt*/
	return cpt;
    }
    
    

    /**Union entre a et b en renvoyant le resultat dans une nouvelle liste
     *@param a
     *premiere liste
     *@param b
     *deuxieme liste 
     **/
    
    public static  List union (List a, List b) {          
	
	/*Si a est vide on retourne b*/
	if (a.isEmpty(a)) 
	    return b.suiv;
	
	/*Si non on ajoute l'element qu'on a lu et on appelle recursivement la methode sur (a.suiv et b)*/
	return new List (a.elt,union(a.suiv,b));
    }
    
    
    /**Union entre l'appelant de la methode et l'argument en renvoyant le resultat a l'appelant *
     *@param b
     *union avec la quelle on va effectuer l'union (avec la liste appelante)  
     **/
    
    public void union (List b){                          
	
    	List a = this;
    	/*On ajoute les element à la fin de a (a.suiv==null)*/
	while (a.suiv!=null)
    	    a=a.suiv;
    	a.suiv =b.suiv;
    }
    

    /**Intersection entre a et b en renvoyant le resultat dans une nouvelle liste
     *@param a
     *premiere liste
     *@param b
     *deuxieme liste 
     **/
   
    public static List inter (List a, List b) {                     
	List res = new List ();
	
	/*si a ou b est vide on retourne une liste vide*/
	if (a.isEmpty(a) || b.isEmpty(b))
	    return null;
	
	while (b!=null){
	    while (a!=null) {
		/*si un element est dans a ainsi que dans b on l'ajoute à res*/
		if (a.contains(a.elt) && b.contains(a.elt)){
		    res.add(a.elt);
		}    
		
		a = a.suiv;
		
	    }
	    b =b.suiv;
	    
	}
	return res.suiv;	
    }
    
     /**Instersection entre l'appelant de la methode et l'argument en renvoyant le resultat à l'appelant 
      *@param b
      *liste avec la quelle on va effectuer l'intersection (avec la liste appelante)
      **/
    public void inter (List b){  
    	List a = this;
    	a = a.inter(a,b);
    	
    }
    

    /**Teste si la liste appelante est egale à la liste dans l'argument
     *@param b
     *la liste avec la quelle on teste l'egalite
     **/
   
    public boolean equals (List b){
	List a = this;
	do{
	    if (a.size()==b.size()){
	    if ((a.contains(a.elt) && b.contains(a.elt)) && (b.contains(b.elt) && a.contains(b.elt)))
		return true;
	    else return false;
	    }
	    return false;
	}

	while (b.suiv!=null);
	
    }
	
    /**Donne des informations sur la liste
    **/
    
    public String toString(){                                      
	String s = new String ();
	s = String.valueOf(this.size());
	this.display();

	return "EST UNE LISTE DE "+s+" ELEMENTS \n ";
    }

    /**Guetteur qui retourne le suivant de la liste appelante
    **/
    public List getSuiv(){
	return this.suiv;
    }
    
    /**Guetteur qui retourne l'element de la liste appelante
    **/
    public int getElt(){
	return this.elt;
    }
    
    /**Setteur qui modifie le suivant avec l'argument
    *@param l
    *l'element qu'on veut inserer
    **/
    public void setSuiv(List l){
	this.suiv=l;
	
    }

    /**Setteur qui modifie l'element 
    *@param e
    *l'element qu'on veut inserer*/
    public void setElt(int e){
	this.elt=e;
    }
    /********************* METHODES OPTIONNELLES *********************/
    
    /**Ajoute un element dans une liste
     *@param x
     *l'element a ajouter
     *@param a
     *la liste dans la quelle on veut ajouter l'element  **/
    static List addList(int x, List a)
    {
	return new List(x, a);
    }
    
    /**Retourne la tete d'une liste  *****/
    static int tete(List a){
	return a.elt;
    }
    /**Retourne le dernier element d'une liste ********/
    static List queue (List a){
	
	return a.suiv;
    }
    
    /**Fait une copie de la liste passe en argument ********/
    static List copier(List a){
	if (a == null)
	    return a;
	return addList(tete(a),
		       copier(queue(a)));
    }
    /*********************FIN METHODES OPTIONNELLES *********************/
   


}