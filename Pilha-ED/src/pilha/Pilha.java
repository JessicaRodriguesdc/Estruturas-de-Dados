/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author jessi
 */

import java.util.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Pilha {
    
private static class PILHA 
{
    public PILHA prox;
    public double num;
}
    

    public static void main(String[] args) throws IOException  {
              
         Scanner entrada = new Scanner(System.in);

            Path path = Paths.get("dad.txt");

       //insert.txt
       //search.txt
       //remove.txt
            
        PILHA topo = null;
        PILHA aux;
        int op;
        
        do
        {
            
            
            System.out.println("|==============================|");
            System.out.println("|    MENU DE OPERACAO-Pilha    |");
            System.out.println("|==============================|");
            System.out.println("|1- Inserir na pilha(TXT)      |");
            System.out.println("|2- Inserir na pilha           |");
            System.out.println("|3- Consutar a pilha           |");
            System.out.println("|4- Remover da pilha           |");
            System.out.println("|5- Esvaziar pilha             |");
            System.out.println("|6- Sair                       |");
            System.out.println("|==============================|");
            System.out.println(" Escolha a opcao: ");
            op= entrada.nextInt();
                       
            if (op <1 || op >6){
                System.out.println("opcao invalida");
                
            }
            if (op == 1){
                //inserir em txt
                System.out.println("-----------------------");

         long tempoInicial = System.currentTimeMillis();
         //tempo inicial
         
         List<String> linhasArquivo = Files.readAllLines(path);
         //funcao ara ler o txt
                     for (String linha : linhasArquivo) {
                  
                     System.out.println(linha);
                     double nu = Double.parseDouble(linha);
                     PILHA novo = new PILHA();
                     novo.num = nu;
                     novo.prox = topo;
                     topo = novo;
    
                     }
    
       System.out.println("\n-------TEMPO----------\n");  
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
           
    }
            
            
            if (op == 2){
                //inseir
                System.out.println("-----------------------");

         long tempoInicial = System.currentTimeMillis();
         //tempo inicial
        
                     System.out.println("Informe um numero");
                     double nu = entrada.nextDouble();;
                     PILHA novo = new PILHA();
                     novo.num = nu;
                     novo.prox = topo;
                     topo = novo;
    
                  
    
       System.out.println("\n-------TEMPO----------\n");  
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
     //tempo final
           
    }
           
            if (op == 3){
                //consultar
                
                 long tempoInicial = System.currentTimeMillis();
                 //tempo inicial
                 
                if (topo == null){
                    System.out.println("Pilha vazia");
                }
                else{
                    System.out.print("\n Consultando a Pilha\n");
                    aux = topo;
                    while (aux != null){
                        System.out.print(aux.num+ " ");
                        aux = aux.prox;
                    }
                }
                
                System.out.println("\n-------TEMPO----------\n"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
                 //tempo final
            }
            
            if (op == 4){
                
                //remover
                
                  long tempoInicial = System.currentTimeMillis();
                  //tempo inicial
                  
                if (topo == null){
                    System.out.println("Pilha vazia");
                }
                else{
                    System.out.println("Numero Removido");
                    topo = topo.prox;
                }
                
                System.out.println("\n-------TEMPO----------\n"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
     //tempo final
                
            }
            if (op == 5){
                //esvaziiar
                
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                if (topo == null){
                    System.out.println("Pilha vazia");
                }
                else{
                    topo = null;
                    System.out.println("Pilha esvaziada");
                }
                
                System.out.println("\n-------TEMPO----------\n"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
     //tempo final
     
            }
                       
        }
        while(op !=6);
        
    }
    
}
