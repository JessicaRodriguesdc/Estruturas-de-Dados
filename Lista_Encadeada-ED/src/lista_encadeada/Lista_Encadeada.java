/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_encadeada;

/**
 *
 * @author jessi
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*; 
public class Lista_Encadeada {
    public static class LISTA {
         public double num;
         public LISTA prox;
}   
    public static void main(String[] args) throws IOException {
       Scanner entrada = new Scanner(System.in);
       
       Path path = Paths.get("dad.txt");
       
       //insert.txt
       //search.txt
       //remove.txt
               
       LISTA inicio= null;
       LISTA fim= null;
       LISTA aux;
       LISTA anterior;
       
       int op, achou;
       double numero;

       do
        {
            
            System.out.println("|===========================================|");
            System.out.println("|      MENU DE OPERACAO-Lista Encadeada     |");
            System.out.println("|===========================================|");
            System.out.println("|1- Inserir no inicio da lista(TXT)         |");
            System.out.println("|2- Inserir no inicio da lista              |");
            System.out.println("|3- Inserir no fim da lista (TXT)           |");
            System.out.println("|4- Inserir no fim da lista                 |");
            System.out.println("|5- Consutar a lista                        |");
            System.out.println("|6- Remover da lista                        |");
            System.out.println("|7- Pesquisar da lista                      |");
            System.out.println("|8- Esvaziar lista                          |");
            System.out.println("|9- Sair                                    |");
            System.out.println("|===========================================|");
            System.out.println(" Escolha a opcao: ");
            op= entrada.nextInt();
            
      
            
            if (op <1 || op >9){
                System.out.println("opcao invalida");
            }
            if (op == 1){
                
                //inserir elementos no inicio em txt  

                System.out.println("-----------------------");
               long tempoInicial = System.currentTimeMillis();
               // iniciar o tempo
         
         List<String> linhasArquivo = Files.readAllLines(path);
         //funcao para ler o txt 
                   for (String linha : linhasArquivo) {
                      
                System.out.println(linha);
                double nu = Double.parseDouble(linha);
                LISTA novo = new LISTA();
                novo.num = nu;
                
                
                 if(inicio == null){
                     // verificar se o valor inicio e nulo
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                }
                else{
                    novo.prox = inicio ;
                    inicio = novo;
                }
   
              }
                            
               System.out.println("\n-------TEMPO----------\n");  
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    // ver tempo final 
    
            }
            
            if (op == 2){
                
                 //inserir elementos no inicio 
                
                System.out.println("-----------------------");
               long tempoInicial = System.currentTimeMillis();
         // iniciar o tempo

                System.out.println("Informe o numero");      
                LISTA novo = new LISTA();
                novo.num = entrada.nextInt();
                
                
                 if(inicio == null){
                     // verificar se o valor inicio e nulo
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                }
                else{
                    novo.prox = inicio ;
                    inicio = novo;
                }
                      
               System.out.println("\n-------TEMPO----------\n");  
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    // ver  tempo final
    
            }
            
            if(op == 3){
                
                 //inserir elementos no final em txt  
                
                long tempoInicial = System.currentTimeMillis();
                 // iniciar o tempo
                
                List<String> linhasArquivo = Files.readAllLines(path);
                //funcao para ler o txt
                   for (String linha : linhasArquivo) {
                      
                System.out.println(linha);
                double nu = Double.parseDouble(linha);
                LISTA novo = new LISTA();
                novo.num = nu;

                if(inicio == null){
                    // verificar se o valor inicio e nulo
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                }
                else{
                    fim.prox = novo ;
                    fim = novo;
                    fim.prox=null;
                }
            }
                System.out.println("\n-------TEMPO----------\n");  
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    // ver  tempo final        
    
            }
            
            
            if(op == 4){
                
                //inserir elementos no final 
                
                long tempoInicial = System.currentTimeMillis();
                // iniciar o tempo
                
                System.out.println("Informe o numero");      
                LISTA novo = new LISTA();
                novo.num = entrada.nextInt();
              

                if(inicio == null){
                // verificar se o valor inicio e nulo
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                }
                else{
                    fim.prox = novo ;
                    fim = novo;
                    fim.prox=null;
                }
            
                System.out.println("\n-------TEMPO----------\n");  
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
            // ver  tempo final
            
            }
            
            if(op == 5){
                
                //consultar lista
                
                long tempoInicial = System.currentTimeMillis();
                 // iniciar o tempo
                
                if(inicio == null){
                    System.out.print("Lista vazia");
                }
                else{
                    System.out.println("\nConsultando a Lista:\n");
                    aux = inicio;
                    while(aux != null){
                        System.out.println(aux.num+ " ");
                        aux = aux.prox;
                    }
                    
                }
                
                 System.out.println("\n-------TEMPO----------\n");  
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    // ver  tempo final            
    
            }
            if(op== 6){
                
                //remover da lista

                long tempoInicial = System.currentTimeMillis();
                 // iniciar o tempo
                
                if(inicio == null){
                    System.out.println("Lista vazia");
                }
                else{
                    System.out.println("\nInforme o numero que sera removido: \n");
                    numero= entrada.nextInt();
                    aux = inicio;
                    anterior = null;
                    achou = 0;
                    
                    while(aux != null){
                        if(aux.num == numero)
                        {
                            achou = achou +1;
                        if (aux ==inicio){
                            inicio = aux.prox;
                            aux = inicio;   
                        }
                        else if(aux == fim){
                            anterior.prox = null;
                            fim = anterior;
                            aux = null;
                        }
                        else{
                            anterior.prox= aux.prox;
                            aux = aux.prox;
                        }
                }else{
                            anterior = aux;
                            aux = aux.prox;
                        }

            }
            if (achou ==0){
                System.out.println("Numero nao encontrado");
            }
            else if(achou ==1){
                System.out.println("Numero removido 1 vez");
            }
            else {
                 System.out.println("Numero removido "+achou+ " vezes");
            }
       }
                
                 System.out.println("\n-------TEMPO----------\n");  
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    // ver  tempo final
    
}
            
            
             if(op== 7){
                 
                 //pesquisar
                 
                long tempoInicial = System.currentTimeMillis();
                 // iniciar o tempo 
                
                if(inicio == null){
                    System.out.println("Lista vazia");
                }
                else{
                    System.out.println("\nInforme o numero : \n");
                    numero= entrada.nextInt();

                    aux = inicio;
                    anterior = null;
                    achou = 0;
             
                    while(aux != null){
                        if(aux.num == numero)
                        {
                            achou = achou +1;
                            System.out.println("Numero encontrado:\n" +aux.num);
                            aux=null;
                            
                        }else{
                            
                            aux = aux.prox;
                        }

                     }
            if (achou ==0){
                System.out.println("Numero nao encontrado");
            }
          
       }
                
                 System.out.println("\n-------TEMPO----------\n");  
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    // ver  tempo final
    
}
            
          
         if( op == 8){
             
             //esvaziar lista
             
             long tempoInicial = System.currentTimeMillis();
              // iniciar o tempo
             
             
             if (inicio == null){
                 System.out.println("Lista vazia");
             }
             else {
                 inicio = null;
                 System.out.println("Lista esvaziada");
             }
             
             System.out.println("\n-------TEMPO----------\n");  
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    // ver  tempo final
    
         }
       
     }
      while (op!= 9);
    }
}
