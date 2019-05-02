/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap_max.min;

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

public class Heap_MaxMin {
    
 static double vet[]= new double[10000000];
 static int tam;
 

    public static void main(String[] args) throws IOException {
       
    Scanner entrada = new Scanner(System.in);
    Path path = Paths.get("insert.txt");
    
       //insert.txt
       //search.txt
       //remove.txt
    
       int op, mp;
       int num = 0;
        tam=0;
         do
        {
            
            System.out.println("|==========================================================|");
            System.out.println("|              MENU DE OPERACAO-HEAP_MAX-MIN               |");
            System.out.println("|==========================================================|");
            System.out.println("|1- Inserir um elemento na Heap(TXT)                       |");
            System.out.println("|2- Inserir um elemento na Heap                            |");
            System.out.println("|3- Consutar o elemento de menor prioridade na Heap        |");
            System.out.println("|4- Consutar o elemento de maior prioridade na Heap        |");
            System.out.println("|5- Remover o elemento de menor prioridade na Heap         |");
            System.out.println("|6- Remover o elemento de maior prioridade na Heap         |");
            System.out.println("|7- Consultar a Heap                                       |");
            System.out.println("|8- Sair                                                   |");
            System.out.println("|==========================================================|");
            System.out.println(" Escolha a opcao: ");
            op = entrada.nextInt();
            
            if (op <1 || op >8){
                System.out.println("opcao invalida");
            }
            else if (op == 1){
                
                //inserir em txt
                
                System.out.println("---------------------------------");
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                if (tam< vet.length-1){ 
                     
                     List<String> linhasArquivo = Files.readAllLines(path);
                     for (String linha : linhasArquivo) {
                  
                     System.out.println(linha);
                     double nu = Double.parseDouble(linha);
                     tam ++;
                     inserir_mm(nu,tam);
    
                     }
             
                }
                else
                    System.out.println("Lista lotada");
                
                
                System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
        //tempo final
                }
            
            else if (op == 2){
                
                //inserir 
                
                System.out.println("---------------------------------");
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                if (tam< vet.length-1){ 
      
                  
                     System.out.println("Informe um numero ");
                     int nu  = entrada.nextInt(); ;
                     tam ++;
                     inserir_mm(nu,tam);

             
                }
                else
                    System.out.println("Lista lotada");
                
                
                System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
        //tempo final
                }
    
            else if (op == 3){
                
                //Elemeno de menor pri
                
            long tempoInicial = System.currentTimeMillis();
            //tempo inicial    
            
                if(tam==0)
                    System.out.println("Lista vazia");
                
                else
                    System.out.println("Elemento de menor prioridade: "+vet[1]);
                
                System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
        //tempo final
    
            }
            else if (op == 4){
                
                //elemento de maior pri
                
            long tempoInicial = System.currentTimeMillis();
                //tempo inicial
            
                if(tam==0)
                    System.out.println("Lista vazia");
                
                else{
                    mp = maior_prior();
                    System.out.println("Elemento de maior prioridade: "+vet[mp]);
                }
                
                System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
        //tempo final
            }
            
            else if (op == 5){
                
                //remover menor pri
                
              long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                if (tam == 0){
                    System.out.println("Lista vazia");
                }
                else{
                    System.out.println("O elemento de menor prioridade removido: "+vet[1]);
                    vet [1]= vet[tam];
                    tam --;
                    descer(1);
                }
                
                System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
    
            }
            
            else if (op == 6){
                
                //remover maior pri
                
             long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                if (tam == 0)
                    System.out.println("Lista vazia");
                
                else if(tam==2)
                    tam=1;
                
                else{
                    int max=2;
                    if (tam >=3){
                        if(vet[3]>vet[2])
                           max= 3; 
                       
                    }
                    System.out.println("O elemento de maior prioridade removido: "+vet[max]);
                    vet [max]= vet[tam];
                    tam --;
                    descer (max);
                }
                
                System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
                
            }
            
            else if(op==7)
            {
              long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                impressao();
                
             System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60); 
        //tempo final
             
            }
        }
            
            while (op!=8);
        }
          static void inserir_mm (double num,int i)
         {
            vet[i]=num;
            subir(i);
         }
         
          static void subir (int i){
              int pai = i/2;
              if(minimo(i)){
                  if (pai>=1){
                      if (vet[i]> vet[pai]){
                          trocar(i, pai);
                          subir_max(pai);
                          
                      }
                      else{
                          subir_min(i);
                      }
                  }
              }
              else {
                  if(pai>=1){
                      if (vet[i] < vet[pai]){
                          trocar(i,pai);
                          subir_min(pai);
                          
                      }
                      else{
                          subir_max(i);
                      }
                  }
              }
              
          }
         
         static void subir_min(int i){
             int avo = i/4;
             
             if (avo >= 1&& vet[i] < vet[avo]){
                 trocar(i,avo);
                 subir_min(avo);
             }
         }
         
         static void subir_max(int i){
             int avo = i/4;
             
             if (avo >= 1&& vet[i] > vet[avo]){
                 trocar(i,avo);
                 subir_max(avo);
             }
         }
         
         static int maior_prior(){
             if (tam==1){
                 return 1;
                 
             }
             else if(tam > 2 && vet [3]> vet[2]){
                 return 3;
             }
             else{
                 return 2;
             }
         }
         
         static void descer(int i){
             if(minimo(i))
                 descer_min(i);
             
             else
                 descer_max(i);
             
         }
         
         static boolean minimo(int i){
             int nivel = ((int)(Math.log(i)/Math.log(2)))+1;
             if (nivel %2==0){
                 return false;
             }
             else {
                 return true;
                 
             }
             
         }
         
         static void descer_min(int i)
         {
             if (2*i<=tam )
             {
                 int m = min_descendente(i);
                 if(vet [i]>= vet[m])
                 {
                     trocar(i, m);
                     if (m>=4*i)
                     {
                         
                         int p= m/2;
                         if (vet[p] <vet [m])
                             trocar(p,m);
                         
                         descer_min(m);
                     }
                 }
             }
         }
         
         static int min_descendente(int i){
             int m=0;
             if(2*i <= tam)
             {
                 m= 2*i;
                 if(vet[m+1]<vet[m])
                 m= m+1;
                 
                 for(int k=4*i;(k<= 4*i+3)&& k<= tam; k++)
                     if (vet [k]<vet[m])
                         m=k;
                 }
                 
             return m;
         }
         
            static void descer_max(int i){
             if (2*i<=tam ){
                 int m = max_descendente(i);
                 if(vet [i] < vet[m]){
                     trocar(i, m);
                     if (m >=4*i){
                         
                         int p= m/2;
                         if (vet[p]>vet[m]){
                             trocar(p,m);
                         }
                         descer_max(m);
                     }
                 }
             }
         }
            
         static int max_descendente(int i){
             int m=0;
             if(2*i <= tam)
             {
                 m= 2*i;
                 if(vet[m+1]>vet[m])
                 m= m+1;
                 
                 for(int k=4*i;(k<= 4*i+3)&& k<= tam; k++)
                     if (vet [k]>vet[m])
                         m=k;
                 }
                 
             return m;
         }  
         
         static void impressao(){
             if (tam==0)
                 System.out.println("Lista de prioridades vazia");
             else{
                 System.out.println("\nTodos os elementos da lista \n");
                 int i = 0;
                 for(int j=i;j<=tam;j++)
                     System.out.println(vet[j]+" ");
                 System.out.println();
             }
         }
         
         static void trocar(int x, int y){
             double temp;
             temp=vet[x];
             vet[x]=vet[y];
             vet[y]=temp;
         }
         
         
}
