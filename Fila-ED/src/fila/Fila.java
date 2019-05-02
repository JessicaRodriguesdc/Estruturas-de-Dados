/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

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

public class Fila {
    
private static class FILA 
{
    public double num;
    public FILA prox;
}
    
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        
        Path path = Paths.get("insert.txt");
        
       //insert.txt
       //search.txt
       //remove.txt
        
        FILA inicio = null;
        FILA fim = null;
        FILA aux;
        int op;
        
        do
        {
            System.out.println("|==============================|");
            System.out.println("|    MENU DE OPERACAO-Fila     |");
            System.out.println("|==============================|");
            System.out.println("|1- Inserir na fila(TXT)       |");
            System.out.println("|2- Inserir na fila            |");
            System.out.println("|3- Consutar a fila            |");
            System.out.println("|4- Remover da fila            |");
            System.out.println("|5- Esvaziar fila              |");
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
               //fumcao para ler o txt
                     for (String linha : linhasArquivo) {
                  
                     System.out.println(linha);
                     double nu = Double.parseDouble(linha);
                     FILA novo = new FILA();
                     novo.num = nu;
                     novo.prox = null;
                     
                     
                     if(inicio == null){
                    inicio = novo ;
                    fim = novo ;
                }
                else{
                    fim.prox = novo ;
                    fim = novo ;
                }
                     
                     }
        
        System.out.println("\n-------TEMPO----------\n"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
        
        }
            
                if (op == 2){
                //inserir 
                
              System.out.println("-----------------------");   
              
              long tempoInicial = System.currentTimeMillis();
              //tempo inicial
              
               
                     System.out.println("inform um numero");
                     double nu = entrada.nextDouble();
                     FILA novo = new FILA();
                     novo.num = nu;
                     novo.prox = null;
                     
                     
                     if(inicio == null){
                    inicio = novo ;
                    fim = novo ;
                }
                else{
                    fim.prox = novo ;
                    fim = novo ;
                }
                     
                
        
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
                
                if (inicio == null){
                    System.out.println("Fila vazia");
                }
                else{
                    System.out.print("\n Consultando a fila\n");
                    aux = inicio;
                    while (aux != null){
                        System.out.println(aux.num+ " ");
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
                  
                if (inicio == null){
                    System.out.println("Fila vazia");
                }
                else{
                    System.out.println("Numero "+inicio.num+ " Removido");
                    inicio = inicio.prox;
                }
                
              System.out.println("\n-------TEMPO----------\n"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final            
    
            }
            if (op == 5){
                //esvaziar
                
                  long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                  
                if (inicio == null){
                    System.out.println("Fila vazia");
                }
                else{
                    inicio = null;
                    System.out.println("Fila esvaziada");
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
    

