package MinhasBagassera;

import java.util.Scanner;

public class NenTyper {
	
	public static void main (String[] args) {
		
	int op;
	int persona;
	int element;
	int power;
	boolean cor;
	String name;
				
	Scanner leia = new Scanner (System.in);
		
	System.out.println("""
			   
		
		      \t\t welcome to [Nen念Type] identifier                                                                              
            ==========================================================
           |                                                          |
           |       Nen (Força Mental) é uma técnica que permite       |
           |      um ser vivo usar e manipular seu próprio fluxo      |
           |  de energia vital. Também conhecido como fluxo de aura,  |
           |  usa-se o Nen para criar  técnicas que são únicas para   |
           |   o indivíduo. Dependendo do usuário, suas habilidades   |
           |    podem ser incrivelmente poderosas e até perigosas.    |
           |   É por isso que sua existência é mantida em segredo.    |
           |                                                          |
           |      O Nen pode ser usada de diversas formas, desde o    |
           |      realçamento da força física, de objetos e até a     |
           |        manipulação de forças naturais e mentais,         |
           |     o que torna a técnica mais perigosa que qualquer     |
           |          outra arma já conhecida anteriormente.          |  
           |                            *                             |
           |           Descubra abaixo qual seu tipo de Nen.          |
            ==========================================================   				
								  """);
		
		
	System.out.println("Hunter, insert your name: ");
        name = leia.nextLine();
        
        System.out.println("\ntrue para Branco, false para Preto: ");
        cor = leia.nextBoolean();

        System.out.println("\n\nYou identify more like:  \n\n1 - Otimista \n2 - Realista \n3 - Negativista");
        persona = leia.nextInt();

        System.out.println("\nChoose an natural element: \n\n1 - Água  \n2 - Fogo  \n3 - Terra  \n4 - Vento");
        element = leia.nextInt();

        System.out.println("\nMagic invoke: \n\n1 - Voar \n2 - Invisibilidade \n3 - Força \n4 - Imortalidade\n");
        power = leia.nextInt();
		
		
        if (cor == true && persona == 1) {
            if ((element == 1 || element == 4) && (power == 1 || power == 3))
                System.out.println(name + ", your Nen Type is (強) INTENSIFICAÇÃO.");
           else 
            	System.out.println(name + ", your Nen Type is (具) CONJURAÇÃO.");
        }
        
        if (cor == true && persona == 2) {
            if ((element == 2 || element == 3) && (power == 1 || power == 4))
                System.out.println(name + ", your Nen Type is (操作) MANIPULAÇÃO.");
           else  
                System.out.println(name + ", your Nen Type is (放) EMISSÃO.");
        }
        
        if (cor == true && persona == 3) {
            if ((element == 1 || element == 4) && (power == 1 || power == 3))
                System.out.println(name + ", your Nen Type is (操作) ESPECIALIZAÇÃO.");
           else
                System.out.println(name + ", your Nen Type is (放) TRANSMUTAÇÃO.");
        } 
         
        
        if (cor == false && persona == 1) {
        	if ((element == 1 || element == 2) && (power == 4 || power == 3)) 
        		System.out.println(name + ", your Nen Type is (特) EMISSÃO.");
           else
        		System.out.println(name + ", your Nen Type is (操作) INTENSIFICAÇÃO.");
        }
   
        	
        if (cor == false && persona == 2) {
        	if ((element == 1 || element == 4) && (power == 1 || power == 3)) 
        		 System.out.println(name + ", your Nen Type is (具) CONJURAÇÃO.");
        	else 
        		 System.out.println(name + ", your Nen Type is (変) TRANSMUTAÇÃO.");
        }
        	
        	
        if (cor == false && persona == 3) {
        	if ((element == 1 || element == 2) && (power == 1 || power == 4)) 
        		System.out.println(name + ", your Nen Type is (具) MANIPULAÇÃO.");
        	else
        		System.out.println(name + ", your Nen Type is (変) ESPECIALIZAÇÃO.");
        }
        else {
            System.out.println("\n\nSorry hunter, invalid nen-type.");
        
		
		
		
		
		
		
        
        // そんなに弱くなりたくない.
        	
        }       
        
        System.out.println("\n\n2023© Nen-typer by Gyo");
        	
	}	
}
