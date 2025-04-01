package ex1;

public class Ex1 {

    public static void main(String[] args) {
        Cliente Fulano1 = new Cliente("12345-58", "123-76", "Joao Pedro Rosa de Paula", 789.4f);
        //Fulano.realizarDeposito(150.3f);
        //Fulano.realizarSaque(32.9f);
        Fulano1.verDados();
    }
    // Programa não deixa acessar os atributos sem os set e get pois estão privadas
}
