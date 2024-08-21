package programa;

public class Pessoa {
	 //toda vez que precisamos de um número que não usará operações aritméticas recebemos ele como string.
	   
    public String nome;
    public String cpf;
    public Endereco endereco;
   
    public Pessoa (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String dados() {
    return nome + " - " + cpf;
    }
}
