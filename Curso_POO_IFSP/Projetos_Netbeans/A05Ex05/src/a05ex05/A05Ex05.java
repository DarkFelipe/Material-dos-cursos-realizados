/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author frfis
 */
public class A05Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> dados = new ArrayList <>();
        dados.add("Borracha");
        dados.add("Caneta");
        dados.add("Lápis");
        dados.add("Caderno");
        dados.add("Agenda");
        dados.add("Papel A4");
        dados.add("Mochila");
        dados.add("Estojo");
        dados.add("Lapiseira");
        dados.add("Corretivo");
        
        
        List<Float> valor = new ArrayList<>();
        valor.add(85f);
        valor.add(2f);
        valor.add(120f);
        valor.add(1850f);
        valor.add(2500f);
        valor.add(25f);
        valor.add(8799f);
        valor.add(1645f);
        valor.add(080f);
        valor.add(320f);
        
        Scanner s = new Scanner(System.in);
        List<Integer> pedidos = new ArrayList <>();
        List<Integer> quantifier = new ArrayList <>();
        String encerrar;
        do{
            System.out.println("Digite o código do produto: ");
            int cod = s.nextInt();
            System.out.println("Digite a quantidade do produto: ");
            int quant = s.nextInt();
            
            pedidos.add(cod);
            quantifier.add(quant);
            
            System.out.println("Deseja encerrar o pedido? [s/n]");
            encerrar = s.next();
        }while(!encerrar.equals("s"));
        
        float totalPedido = 0f;
        int totalItens = 0;
        for (int i = 0; i < pedidos.size(); i++) {
            
            int quantidade = quantifier.get(i);
            int cod = pedidos.get(i);
            float preco = valor.get(cod);
            float total = preco * quantidade;
            String produto = dados.get(cod);
            System.out.println("Código do produto: "+produto+". Quantidade do produto: "+quantidade+". Preço unitário: "+preco+". Preço total: "+total);
            totalPedido += total;
            totalItens += quantidade;
        }
        
        System.out.println("Itens: "+totalItens);
        System.out.println("Total do pedido: R$ "+totalPedido);
       
               
        
    }
    
}
