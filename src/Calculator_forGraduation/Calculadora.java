package Calculator_forGraduation;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//Entrada
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a operação (1-Adicao, 2 - subtracao,3- multiplicacao,4-divisao,5-Exponeniacao,6-fatorial):");
         int tipo = teclado.nextInt();
         System.out.println("Digite o valor 1");
         int valor1= teclado.nextInt();
         int valor2=0;
         if(tipo !=6) {
        System.out.println("Digite o valor 2");
        valor2=teclado.nextInt();
        	 
        	 
         }
         teclado.close();
         //Processamento sem orientacao objetos - Nivel 1
         
         switch (tipo) {
         case 1 : System.out.println("Adicao"+(valor1+valor2));
         case 2 : System.out.println("subtracao"+(valor1 - valor2));
         case 3 : System.out.println("multiplicacao"+(valor1*valor2));
         case 4 : System.out.println("divisao"+(valor1/valor2));
         default : System.out.println("Operacao invalida!");
         
              }
         //Processamento com orientacao a objeto - nivel 2 - usando set Numero 1 e set numero 2 para  a operacao sem parametro funcionar !!!
         Operacao operacaoNivel2;
         switch (tipo) { 
         
         case 1 : operacaoNivel2 = new Adicao();
                operacaoNivel2.setNumero1(valor1);
                operacaoNivel2.setNumero1(valor2);
                System.out.println("Adicao="+operacaoNivel2.calcula());
                break;
                
         case 2 : operacaoNivel2= new Subtracao();
         break;
         
        default: operacaoNivel2 = null;
        System.out.println("Nao foi possivel idetificar a operacao desejada");
         
         }
        //Operacao nivel 3
         
         Operacao operacaoNivel3;
         switch(tipo) {
         case 1 :  operacaoNivel3= new Adicao();
                  System.out.println("Adicao"+ operacaoNivel3.calcula());
              break;    
                 
         
         
         }
         
        	 
         }
     
        	 
         	 
        	 
        	 
        	 
        	 
         

	
		
	}
         
         
	

	
		
	


		
	


