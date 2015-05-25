import java.util.*;
abstract class AbstractTab implements Container{
    int tab [];
    int taille = 0;
    int indice = 0;
    int compt = 0;

    /** ajoute un élément dans un tableau et chaque ajout incrémente la variable compt 
     *@param element 
     * element à ajouter 
     ***/
    public void add(int element){
        tab[compt] = element;
	
	
	compt++;
    }

    /** recherche l'element x dans la structure de donnée 
     * @param x
     * element recherché
     **/
    public boolean contains(int x){
	for(int i = 0; i < compt; i++){
	    if(tab[i] == x)
		return true;
	}
	return false;
    }

    /** supprime l'élément dans la structure de données *
     * @param element
     * element à supprimer
     **/
    public void remove(int element){
	int i,j=0, k;	
	int f = 0;
	for(i = 0; i<taille;i++){
	    if(tab[i] == element){
		j = i;
	    }	    
	    f = j;
	}
 	for( k = j; k < taille-1;k++){
	    tab[k] = tab[k+1]; 
      	}
	taille--; 
	compt--;
    }

    /** Affiche les éléments de la structure * 
     **/
    public String toString(){
	
    	String s = "";
    	for(int i = 0; i < compt ; i++)
    	    s += "|"+tab[i];
    	return s;
    }
    

}

