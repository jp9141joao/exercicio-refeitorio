package ex2;

public class Ex2 {

    public static void main(String[] args) {
        Cliente TestaCliente1 = new Cliente(432, 654, 809.3f,"Joao Pedro");
        TestaCliente1.realizarDeposito(100);
        TestaCliente1.realizarSaque(330);
        
        Cliente TestaCliente2 = new Cliente(243, 632, 1406.7f,"Maria Julia");
        TestaCliente2.realizarDeposito(100);
        TestaCliente2.realizarSaque(330);
        
        TestaCliente1.verDados();
        TestaCliente2.verDados();

    }
}
