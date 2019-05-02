/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela_hash;

/**
 *
 * @author jessi
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
public class Tabela_Hash {

    public static class hash {
        int chave;
        hash prox;
       // private hash aux;
    };
        static int tam =100000000;
        static hash tabela[]= new hash[tam];
        
        
        static Scanner entrada= new Scanner(System.in);  
        Scanner ler = new Scanner(System.in);
        
        
        public static void inserir (int pos,int n){
            hash novo;
            novo = new hash ();
            novo.chave = n;
            novo.prox = tabela[pos];
            tabela[pos]=novo;
        }
        
        static int funcao_hashing(int num){
            return num%tam;
        }
        
        static void mostrar_hash(){
            hash aux;
            for (int i=0; i< tam;i++){
                aux = tabela[i];
                while(aux != null){
                    System.out.println("Entrada "+i+": "+aux.chave);
                    aux=aux.prox;
                   
                }
            }
        
        }
        
        static void busca_hash (int num){
            int pos = funcao_hashing(num);
            hash aux;
            if(tabela[pos] != null && tabela[pos].chave ==num){
                    tabela[pos]= tabela[pos];
             
                    aux=tabela[pos];
                    while(aux != null && aux.chave != num){
                        //ant = aux;
                        aux = aux.prox;
                        System.out.println("Numero encontrado");
                    }
                    if (aux != null){
                        aux.prox= aux.prox;
                        System.out.println("Numero encontrado");
                    }
                    else 
                        System.out.println("Numero nao encontrado");
                
            }
            else
                System.out.println("Numero nao encontrado");
        }
        
        static void excluir_hash (int num){
            int pos = funcao_hashing(num);
            hash aux;
            if(tabela[pos] != null){
                if (tabela[pos].chave==num){
                    tabela[pos]= tabela[pos].prox;
                     System.out.println("Numero removido");
                }
                else{
                    aux=tabela[pos].prox;
                    hash ant=tabela[pos];
                    while(aux != null && aux.chave != num){
                        ant = aux;
                        aux = aux.prox;
                         System.out.println("Numero removido");
                    }
                    if (aux != null){
                        ant.prox= aux.prox;
                        System.out.println("Numero removido");
                    }
                    else 
                        System.out.println("Numero nao encontrado");
                }
            }
            else
                System.out.println("Numero nao encontrado");
        }
        
      
    public static void main(String[] args) throws IOException {
        
        Path path = Paths.get("search.txt");
        
       //insert.txt
       //search.txt
       //remove.txt
        
        int op, pos;
        int num;
        
        do
        {
            
            System.out.println("|===========================================|");
            System.out.println("|       MENU DE OPERACAO-Tabela hash        |");
            System.out.println("|===========================================|");
            System.out.println("|1- Inserir elemento(TXT)                   |");
            System.out.println("|2- Inserir elemento                        |");
            System.out.println("|3- Mostrar tabela hash                     |");
            System.out.println("|4- Remover elemento                        |");
            System.out.println("|5- Pesquisar elemento                      |");
            System.out.println("|6- Sair                                    |");
            System.out.println("|===========================================|");
            System.out.println(" Escolha a opcao: ");
            op= entrada.nextInt();
            
          
            if (op <1 || op >6){
                System.out.println("opcao invalida");
            }
            else {
                if(op==1){
                    //inserir em txt
                    
                    System.out.println("---------------------------------");
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                List<String> linhasArquivo = Files.readAllLines(path);
                //funcao pra ler o txt
                for (String linha : linhasArquivo) {
                     System.out.println(linha);
                    double n = Double.parseDouble(linha);
                    int nu ;
                    nu = (int) Math.round(n);
                    
                      pos = funcao_hashing(nu);
                      inserir(pos,nu);
    
                     }
                      
                         System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
                }
                
                 if(op==2){
                    //inserir 
                    
                    System.out.println("---------------------------------");
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                    System.out.println("Informe um numero");
                    int nu ;
                    nu = entrada.nextInt();
                      pos = funcao_hashing(nu);
                      inserir(pos,nu);
    
                      System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
                }
                
                   if(op==3){
                       
                       //mostrar
                       
                       long tempoInicial = System.currentTimeMillis();
                       //tempo inicial
                       
                        mostrar_hash();

                         System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
                   }
                   
                   if(op==4){
                       
                       //remover
                       
                       long tempoInicial = System.currentTimeMillis();
                       //tempo inicial
                       
                        System.out.println("Informe o numero para excluir: ");
                        num = entrada.nextInt();
                        excluir_hash(num);
                        
                         System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
                 
                }
                   
                   if(op==5){
                       
                       //pesquisar
                       
                       long tempoInicial = System.currentTimeMillis();
                       //tempo inicial
                       
                        System.out.println("Informe o numero: ");
                        num = entrada.nextInt();
                        busca_hash(num);
                        
                         System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
                 
                }
            }
    }
        while (op!=6);
    }
    
}
