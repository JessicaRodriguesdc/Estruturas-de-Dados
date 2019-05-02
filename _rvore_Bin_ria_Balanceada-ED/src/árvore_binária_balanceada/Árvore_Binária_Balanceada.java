/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package árvore_binária_balanceada;

/**
 *
 * @author jessi
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class Árvore_Binária_Balanceada {
     public static class ARVORE{
        public double num,altd,alte;
        public ARVORE dir, esq;
    }
   
    public static void main(String[] args) throws IOException {
        
     Scanner entrada = new Scanner(System.in);
     Path path = Paths.get("dad.txt");
     
       //insert.txt
       //search.txt
       //remove.txt
     
          ARVORE raiz= null;
          ARVORE aux;
         
          int op;
          double achou,numero;
          
          do{
              
            System.out.println("|==============================================|");   
            System.out.println("|              MENU DE OPERACAO-AVL            |");
            System.out.println("|==============================================|"); 
            System.out.println("|1- Inserir na Arvore(TXT)                     |");
            System.out.println("|2- Inserir na Arvore                          |");
            System.out.println("|3- Consultar um no da Arvore                  |");
            System.out.println("|4- Consultar toda a arvore em ordem           |");
            System.out.println("|5- Consultar toda a arvore em pre-ordem       |");
            System.out.println("|6- Consultar toda a arvore em pos-ordem       |");
            System.out.println("|7- Remover um no da Arvore                    |");
            System.out.println("|8- Esvaziar Arvore                            |");
            System.out.println("|9- Sair                                       |");
            System.out.println("|==============================================|"); 
            System.out.println(" Escolha a opcao: ");
            op = entrada.nextInt();
            
            if (op <1 || op >9){
                System.out.println("opcao invalida");
            }
            if (op == 1){
                
                //inserir em txt
                
                System.out.println("---------------------------------");
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                 List<String> linhasArquivo = Files.readAllLines(path);
                 //funcao para ler txt
                     for (String linha : linhasArquivo) {
                  
                     System.out.println(linha);
                     double nu = Double.parseDouble(linha);
                     raiz = inserir(raiz,nu);
        }
         
                 System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
               
            }
            
            if (op == 2){
                
                //inserir 
                
                System.out.println("---------------------------------");
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                   
                     System.out.println("Informar um numero");
                     double nu = entrada.nextDouble();
                     raiz = inserir(raiz,nu);
        
         
                 System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
               
            }
            
            if(op==3){
                
                //buscar
                
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                if (raiz==null){
                    System.out.println("arvore vazia");
                }
                else{
                   System.out.println("Digite o numero a ser consultado");
                   numero = entrada.nextInt();
                   achou = 0;
                   achou = consultar (raiz,numero,achou);
                   if (achou == 0)
                       System.out.println("numero nao encontrado");
                   else 
                       System.out.println("numero encontrado");
                }
                
                
                System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
            }
            
            if(op==4){
                
                //em ordem
                
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                if(raiz==null){
                    System.out.println("arvore vazia");
                }
                else{
                    System.out.println("Listando todos os valores");
                    mostraremordem(raiz);
                }
                
                System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
            }
            
            if (op==5){
                
                //em pre-órdem
                
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                if (raiz == null){
                    System.out.println("arvore vazia");
                }
                else{
                    System.out.println("listando em pre-ordem");
                    mostrarpreordem(raiz);
                }
                
                System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
                
            }
            
            if (op == 6){
                
                //em pos-ordem
                
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                 if (raiz == null){
                    System.out.println("arvore vazia");
                }
                 else {
                    System.out.println("listando em pos-ordem");
                    aux = raiz;
                    mostrarposordem(raiz);
                   
                } 

                 System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
    
            }
            
            if(op==7){
                
                //remover
                
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                if (raiz == null){
                    System.out.println("arvore vazia");
                }
                else {
                    
                    System.out.println("informe o numero que quer excluir: ");
                    numero = entrada.nextInt();
                    achou=0;
                    achou = consultar (raiz,numero, achou);
                    
                    if(achou ==0)
                        System.out.println("numero nao encontrado");
                    else
                    {
                        
                        raiz=remover(raiz,numero);
                        raiz = atualiza(raiz);
                        System.out.println("numero excluido");
                    }
                    
                }
            
            System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
    
          }
            
            if(op==8){
                
                //esvaziar
                
                long tempoInicial = System.currentTimeMillis();
                //tempo inicial
                
                 if (raiz == null){
                    System.out.println("arvore vazia");
                }
                else {
                     raiz=null;
                     System.out.println("Arvore esvaziada");
                 }
                 
                 System.out.println("-------TEMPO----------"); 
     long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f ms%n \n", (tempoFinal - tempoInicial) / 1000d);
    System.out.printf("%.6f s%n \n", ((tempoFinal - tempoInicial) / 1000d)/ 1000d);
    System.out.printf("%.12f m%n \n", (((tempoFinal - tempoInicial) / 1000d)/ 1000d)/60);
    //tempo final
    
            }
    
    }
          while (op!=9);
    }
   
    public static ARVORE inserir (ARVORE aux,double num)
    {
        ARVORE novo;
       if (aux ==null)
       {
           novo = new ARVORE();
           novo.num = num;
           novo.altd=0;
           novo.alte=0;
           novo.esq = null;
           novo.dir = null;
           aux =novo;
           
       }
       else if (num < aux.num)
       {
           aux.esq=inserir(aux.esq,num);
           if(aux.esq.altd > aux.esq.alte)
               aux.alte=aux.esq.altd +1;
           else
               aux.alte=aux.esq.alte +1;
           aux=balanceamento(aux);
       }
            else
                 {
                    aux.dir=inserir(aux.dir,num);
                    if(aux.dir.altd > aux.dir.alte)
                        aux.altd=aux.dir.altd +1;
                    else
                        aux.altd=aux.dir.alte +1;
                    aux=balanceamento(aux);
                  }
    return aux;
    }
    
    public static ARVORE balanceamento (ARVORE aux)
    {
        double df;
        double d;
        d =aux.altd - aux.alte;
        if (d==2)
        {
            df = aux.dir.altd - aux.dir.alte;
            if(df >=0)
            {
                aux=rotacao_esquerda(aux);
            }
            else 
            {
                aux.dir = rotacao_direita(aux.dir);
                aux=rotacao_esquerda(aux);
            }
        }
        else if (d == -2)
        {
            df = aux.esq.altd - aux.esq.alte;
            if (df <= 0)
            {
                aux = rotacao_direita(aux);
            }
            else 
            {
                aux.esq = rotacao_esquerda(aux.esq);
                aux=rotacao_direita(aux);
            }
    }
    return aux;
}
    
    public static ARVORE rotacao_esquerda(ARVORE aux){
        ARVORE aux1,aux2;
        aux1=aux.dir;
        aux2 =aux1.esq;
        aux.dir = aux2;
        aux1.esq = aux;
        
        if (aux.dir == null)
            aux.altd = 0;
        else if (aux.dir.alte >aux.dir.altd)
            aux.altd = aux.dir.alte +1;
        else 
            aux.altd = aux.dir.altd +1;
        
        if (aux1.esq.alte > aux1.esq.altd)
            aux1.alte = aux1.esq.alte +1;
        else 
            aux1.alte = aux1.esq.altd +1;
return aux1;
        
    }
    
     public static ARVORE rotacao_direita(ARVORE aux){
        ARVORE aux1,aux2;
        aux1=aux.esq;
        aux2 =aux1.dir;
        aux.esq = aux2;
        aux1.dir = aux;
        
        if (aux.esq == null)
            aux.alte = 0;
        else if (aux.esq.alte >aux.esq.altd)
                aux.alte = aux.esq.alte+1;
            else 
                aux.alte = aux.esq.altd+1;
        
        if (aux1.dir.alte > aux1.dir.altd)
            aux1.altd = aux1.dir.alte+1;
        else 
            aux1.altd = aux1.dir.altd+1;
return aux1;
        
    }
    
     
    public static double consultar (ARVORE aux,double num, double achou){
        if (aux != null && achou ==0)
        {
            if (aux.num == num)
            {
                achou= 1;
            }
            else if (num < aux.num)
                achou = consultar(aux.esq, num,achou);
            else 
                achou = consultar(aux.dir, num,achou);
        }
        return achou;
    } 
    
    public  static void mostraremordem (ARVORE aux)
    {
        if (aux!=null)
        {
            mostraremordem(aux.esq);
            System.out.println(aux.num+" ");
            mostraremordem(aux.dir);
        }
    }
     
    public  static void mostrarpreordem (ARVORE aux)
    {
        if (aux!=null)
        {
            System.out.println(aux.num+" ");
            mostrarpreordem(aux.esq);
            mostrarpreordem(aux.dir);
        }
    }
    
    public  static void mostrarposordem (ARVORE aux)
    {
        if (aux!=null)
        {
            mostrarposordem(aux.esq);
            mostrarposordem(aux.dir);
            System.out.println(aux.num+" ");

        }
    }
    
    public static ARVORE remover (ARVORE aux,double num)
    {
        ARVORE p,p2;
        if (aux.num == num)
        {
            if(aux.esq == aux.dir)
            {
                return null;
            }
            else if (aux.esq == null)
            {
                return aux.dir;
            }
            else if (aux.dir == null)
            {
                return aux.esq;
            }
            else 
            {
                p2 =aux.dir;
                p=aux.dir;
                while (p.esq != null)
                {
                    p=p.esq;
                }
                p.esq = aux.esq;
                return p2;
            }
        }
        else if (aux.num <num)
            aux.dir = remover (aux.dir, num);
        else
            aux.esq = remover (aux.esq, num);
        return aux;
    }
    
    public static ARVORE atualiza (ARVORE aux)
    {
        if (aux!=null)
        {
            aux.esq = atualiza(aux.esq);
            if(aux.esq == null)
                aux.alte = 0;
            else if (aux.esq.alte > aux.esq.altd)
                aux.alte = aux.esq.alte + 1;
                else 
                    aux.alte = aux.esq.altd + 1; 
            
            aux.dir = atualiza(aux.dir);
            
            if(aux.dir == null)
                aux.altd = 0;
            else if (aux.dir.alte >aux.dir.altd)
                aux.altd = aux.dir.alte + 1;
                else 
                    aux.altd = aux.dir.altd + 1; 
            aux = balanceamento(aux);
        }
        return aux;
    }
  
}
