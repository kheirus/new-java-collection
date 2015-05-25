/*****************************************************************************************************************************************/
/*********                       L E S     E X C E P T I O N S                                         *********/	     
/**************************************************************************************************************************************/





class ListException extends Exception {

    public ListException () {
	System.out.println("EXCEPTION : \n Pas possible liste vide !! \n");
    }
    public ListException (int elt){
	System.out.println("EXCEPTION : \n L'element "+elt+" n'existe pas dans cette liste \n" );
    }
    public ListException (String s){
	System.out.println(s);
    }
}