package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 15, 100);
        compra1.adicionarItem("Notebook", 1897.88, 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem("Impressora", 1000, 1);

        Cliente cliente = new Cliente("MAria Júlia");
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());

    }
}
