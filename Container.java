
/*****************************************************************************************************************************************/
/*********                       I N T E R F A C E   C O N T A I N E R                                         *********/	     

/***        Cette interface contient les methodes qui doivent être implementés dans chaque structure**/
/**************************************************************************************************************************************/


public interface Container {
	
	/**Renvoie le nombre d'elements d'une liste
     **/
    public boolean contains (int x);
    
    /**Ajoute un element dans une liste
     *@param x
     *element a ajouter 
     **/
    public void add (int x);
    
    /**Supprime une seule occurence de x dans une liste
     *@param x
     *element a supprimer
     **/
    public void remove (int x) throws ListException;
    
    /**Renvoie le nombre d'elements d'une liste
     **/
    public int size ();
    
    /**Donne des informations sur la liste
     **/
    public String toString ();
    
    
    
}