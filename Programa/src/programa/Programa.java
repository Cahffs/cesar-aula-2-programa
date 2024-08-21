package programa;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
        Pessoa pessoa;
        Endereco endereco;
        Scanner scan;
        scan = new Scanner(System.in);
       
        System.out.println("Entre com o nome e cpf: ");
        pessoa = new Pessoa (scan.nextLine(), scan.nextLine());
       
        System.out.println("Entre com o endereço: ");
        endereco = new Endereco();
        endereco.rua = scan.nextLine();
        System.out.println("Entre com o número: ");
        endereco.numero = scan.nextLine();
       
        pessoa.endereco = endereco;
        System.out.println("Dados da pessoa\n\n" + pessoa.dados() + "\nEndereço: " + pessoa.endereco.enderecoCompleto());
       
}
}
