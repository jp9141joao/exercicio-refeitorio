
package projeto_java;

public class Projeto_Java {

    public static void main(String[] args) {
       Filmes Obj1 = new Filmes("Vingadores Ultimato", 180, 2019, 356.0f);
       Filmes Obj2 = new Filmes("Deadpool", 174, 2017, 130.0f);
       
       Obj1.getDados();
       Obj2.getDados();
       
       Obj1.setAno(2020);
       Obj2.setNome("Kung fu panda");
       
       Obj1.getDados();
       Obj2.getDados();
    }
    
   
    
}

/*

this -> Auto referenciamento
this.Marca == C1.marca
this vai ser substituido por C1 ao ser chamado

Instanciar == Criar um nova classe
Exemplo: Test = new Classe();

Nome de classe sempre começa com letra maiuscula
Atributos e Metodos com letra minusculsa
Exemplo: class Teste; String marca; escrever()

Constructor é usado para instanciar automaticamente algum valor por exemplo toda vez que você chamadar a classe ela vai utilizar o constructor
em outras palavras ele é executado assim que o metodo é instanciado

*/