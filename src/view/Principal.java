package view;
import java.util.Scanner;
import br.edu.fateczl.pilhaint.Pilha;
import controller.NPRController;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha p = new Pilha();

        while (true) {
            System.out.print("Digite um número ou operação (+,-,*,/): ");
            String entrada = scanner.nextLine();

            if (entrada.equals("sair")) {
                break;
            }

            try {
                int valor = NPRController.npr(p, entrada);
                NPRController.insereValor(p, valor);
                System.out.println("Pilha: " + p.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

