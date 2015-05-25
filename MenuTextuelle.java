
/*****************************************************************************************************************************************/
/*********                       M E N U   E N   L I G N E   D E   C O M M A N D E                                          *********/	     
/**************************************************************************************************************************************/




import java.util.*;
class MenuTextuelle{
   
     public static void print(String str){
	System.out.println(str);
    }
    public static void main(String [] args) {
	
	
	System.out.println("\033c");//pour vider l'écran
	
	print("\t\t\t\tWelcome to the Java project 2012/2013.");
	print("\t\tCreated by Kheireddine OUELLA and Ceulain BANSIMBBA on 08/01/13.");
	print("\t\tCopyright© 2012 O&B Compagny. All rights reserved.\n");
	print("|--------------------------------------------- M E N U --------------------------------------------|\n\n");
	
	Scanner sc = new Scanner(System.in);
	print("Choisissez la structure que vous désirez :\n");
	
	
	print("1. Ensemble");
	print("2. Multi-ensemble");
	print("3. Listes triées\n");
	
	print("Faites votre choix : ");
	int choix= sc.nextInt();
	
	switch(choix){
	    
	    case 1 :
		print("Entrez le nombre d'élements du PREMIER ensemble e1 :");
		int taille1 = sc.nextInt();
		print("Ajouter "+taille1+ " elements :\n");
		
		EnsembleList e1 = new EnsembleList();
		Scanner sc1 = new Scanner (System.in); // pour l'elment a ajouter
		//Scanner sc2= new Scanner (System.in);
		//String str= sc2.nextLine();
		int n=0;
		
		/*tant qu'on a pas atteint la taille de l'ensemble on ajoute*/
		for (int i =0; i<= taille1 -1; i++) {
		    
		    n = sc1.nextInt();
		    e1.add(n);
		}

		print ("ENSEMBLE À "+e1.size()+ " ÉLÉMENTS CRÉÉ : \n");
		e1.display();
		print ("\n");
		
		
		
		print("Entrez le nombre d'élements du DEUXIÈME ensemble e2 :");
		
		int taille2 = sc.nextInt();
		print("Ajouter "+taille2+ " elements :\n");
		
		EnsembleList e2 = new EnsembleList();
		
		/*tant qu'on a pas atteint la taille de l'ensemble on ajoute*/
		for (int i =0; i<= taille2 -1; i++) {
		    
		    n = sc1.nextInt();
		    e2.add(n);
		}

		System.out.print("ENSEMBLE À "+e2.size()+ " ÉLÉMENTS CRÉÉ : "); e2.display();print("\n");
		System.out.println("\033c");
		print("********************************* R E S U L T A T S ********************************************");
		print ("******************************************************************************************\n");
		
		System.out.print("e1 =  { "); e1.display(); print ("}\n");
		System.out.print("e2 = { "); e2.display();print ("}\n");
		print ("AVERTISSEMENT : les doublons ont été automatiquement enlevés.\n");
		print ("******************************************************************************************\n");
		
		/*e3,e4 servent pour l'union et l'intersection,ils sont de type list car ces methodes retournent une liste*/
		List e3 = new EnsembleList();
		List e4 = new EnsembleList();
		print ("******************************************************************************************\n");
		e3= e3.union (e1,e2);
		System.out.print("\t\tVersion statique e3 = e1 UNION e2 = { ");e3.display();print("}\n");
		e1.union(e2);
		System.out.print("\t\tVersion dynamique e1 = e1 UNION e2 = { ");e1.display();print("}\n");
		print("REMARQUE : l'union de deux ensembles est un multi-ensemble\n");
		
		print ("******************************************************************************************\n");
		e4=e4.inter(e1,e2);
		System.out.print("\t\tVersion statique e4 = e1 INTER e2 = { ");e4.display();print("}\n");
		e1.inter(e2);
		System.out.print("\t\tVersion dynamique e1 = e1 INTER e2 = { ");e4.display();print("}\n");
		print ("******************************************************************************************\n\n");
		print ("\n\n");
		
		print("Vous n'êtes peut être pas satisfait(e) du résultat ? \n");
		print("Voulez-vous supprimer un élément ?\n");
		print("Y / N");
		Scanner sc2 = new Scanner (System.in);
		String str = sc2.nextLine();
		char c =str.charAt(0);
		
		if (c=='Y') {
		    print ("Dans quel ensemble e3 ou e4 ?\n");
		    print ("pour e3 tapez 1, pour e4 tapez 2\n");
		    //sc2.nextLine();
		    int rep = sc2.nextInt();
		    
		    if (rep==1){
			
			sc2.nextLine();
			print("entrer l'élément que vous voulez supprimer (suppression d'une seule occcurence) :");
			
			
			int sup = sc2.nextInt();
			try{
			e3.remove(sup);
			}catch (ListException ex){}
			
			print ("e3 après suppression de "+ sup);
			System.out.print("e3 = { "); e3.display();print("}");
			
		    }
		    else if (rep==2){
			sc2.nextLine();
			print("entrer l'élément que vous voulez supprimer (suppression d'une seule occcurénce) :");
			
			
			int sup2 = sc2.nextInt();
			try{
			e4.remove(sup2);
			}catch (ListException ex){}
			
			print ("e4 après suppression de "+ sup2);
			System.out.print("e4 = { "); e4.display();print("}");
		    }
		    else print("Désolé cet ensemble n'éxiste pas.\n");
		}
		else {
		    print(" Ok tant pis.");
		}
	    
		break;

	case 2 : 
	    print("Entrez le nombre d'élements du PREMIER multi-ensemble me1 :");
	    int tailleMe1 = sc.nextInt();
		print("Ajouter "+tailleMe1+ " elements :\n");
		
		MultiEnsembleList me1 = new MultiEnsembleList();
		Scanner sc3 = new Scanner (System.in); // pour l'elment a ajouter
		//Scanner sc2= new Scanner (System.in);
		//String str= sc2.nextLine();
		int k=0;
		
		/*tant qu'on a pas atteint la taille de l'ensemble on ajoute*/
		for (int i =0; i<= tailleMe1 -1; i++) {
		    
		    k = sc3.nextInt();
		    me1.add(k);
		}

		print ("ENSEMBLE À "+me1.size()+ " ÉLÉMENTS CRÉÉ : \n");
		me1.display();
		print ("\n");
		
		
		
		print("Entrez le nombre d'élements du DEUXIÈME ensemble me2 :");
		
		int tailleMe2 = sc.nextInt();
		print("Ajouter "+tailleMe2+ " elements :\n");
		
		MultiEnsembleList me2 = new MultiEnsembleList();
		
		/*tant qu'on a pas atteint la taille de l'ensemble on ajoute*/
		for (int i =0; i<= tailleMe2 -1; i++) {
		    
		    k = sc3.nextInt();
		    me2.add(k);
		}

		System.out.print("ENSEMBLE À "+me2.size()+ " ÉLÉMENTS CRÉÉ : "); me2.display();print("\n");
		System.out.println("\033c");
		
		print ("******************************************************************************************\n");
		System.out.print("me1 =  { "); me1.display(); print ("}\n");
		System.out.print("me2 = { "); me2.display();print ("}\n");
		print ("******************************************************************************************\n");
		
		/*me3,me4 servent pour l'union et l'intersection,ils sont de type list car ces methodes retournent une liste*/
		List me3 = new MultiEnsembleList();
		List me4 = new MultiEnsembleList();
		
		
		print ("******************************************************************************************\n");
		
		me3= me3.union (me1,me2);
		System.out.print("\t\tVersion statique me3 = me1 UNION me2 = { ");me3.display();print("}\n");
		me1.union(me2);
		System.out.print("\t\tVersion dynamique me1 = me1 UNION me2 = { ");me3.display();print("}\n");
		print ("******************************************************************************************\n");
		
		me4=me4.inter(me1,me2);
		System.out.print("\t\tVersion statique me4 = me1 INTER me2 = { ");me4.display();print("}\n");
		me1.inter(me2);
		System.out.print("\t\tVersion dynamique me4 = me1 INTER me2 = { ");me4.display();print("}\n");
		print ("******************************************************************************************\n\n");
		print ("\n\n");
		
		 print("Vous n'êtes peut être pas satisfait(e) du résultat ? \n");
		 print("Voulez-vous supprimer un élément ?\n");
		 print("Y / N");
		Scanner sc4 = new Scanner (System.in);
		String str2 = sc4.nextLine();
		char c1 =str2.charAt(0);
		
		if (c1=='Y') {
		    print ("Dans quel  multi-ensemble me3 ou me4 ?\n");
		    print ("pour me3 tapez 1, pour me4 tapez 2\n");
		   
		    int rep2 = sc4.nextInt();
		    
		    if (rep2==1){
			
			sc4.nextLine();
			print("Entrez l'élément que vous voulez supprimer (toute les occurences) :");
			
			/* le downcasting ne marche pas */
			/*MultiEnsembleList me6 = (MultiEnsembleList) me3;*/
			
			int sup3 = sc4.nextInt();
			
			try{
			   me3.removeAll(sup3);
			}catch (ListException ex){}
			
			print ("me3 après suppression de "+ sup3);
			System.out.print("e3 = { "); me3.display();print("}");
			
		    }
		    else if (rep2==2){
			sc4.nextLine();
			print("Entrez l'élément que vous voulez supprimer (toute les occurences) :");
			
			// MultiEnsembleList me5 = (MultiEnsembleList) me4;
			int sup4 = sc4.nextInt();
			try{
			me4.removeAll(sup4);
			}catch (ListException ex){}
			
			print ("me4 après suppression de "+ sup4);
			System.out.print("e4 = { "); me4.display();print("}");
		    }
		    else print("Désolé ce mutli-ensemble n'éxiste pas.\n");
		}
		else {
		    print(" Ok tant pis.");
		}
	    
		break;

		
	case 3 :
	    print("DÉSOLÉ PAS LE TEMPS DE FINIR");
	
	}
	
    }
}
