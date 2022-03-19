package br.ulbra.classe;

import java.util.Scanner;

/**
 *
 * @author Manu Talaska
 */
public class UsaProducao extends Producao {
    public static void main(String[] args) {
        
        Producao prod = new Producao(0);
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome da peça: ");
        prod.setPeca(ler.nextLine());
        
        System.out.println("Digite o tempo produzido em segundos: ");
        prod.setSegundos(ler.nextInt());
        
        System.out.println(" segundos: "+prod.segundos);
        
        prod.calcularHMS();    
        System.out.println(" horas: "+prod.hora);
        System.out.println(" minuto: "+prod.minuto);
        System.out.println(prod.toString());
    }

    public UsaProducao(int hora) {
        super(hora);
    }
    
    }

