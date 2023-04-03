package controller;
import br.edu.fateczl.pilhaint.Pilha;

public class NPRController {

    public static void insereValor(Pilha p, int valor) {
        p.push(valor);
    }
    public static int npr(Pilha p, String op) throws Exception {
        int valor1, valor2, resultado;

        switch (op) {
            case "+":
                if (p.size() < 2) {
                    throw new Exception("Erro: valores insuficientes.");
                }
                valor1 = p.pop();
                valor2 = p.pop();
                resultado = valor2 + valor1;
                p.push(resultado);
                return resultado;

            case "-":
                if (p.size() < 2) {
                    throw new Exception("Erro: valores insuficientes.");
                }
                valor1 = p.pop();
                valor2 = p.pop();
                resultado = valor2 - valor1;
                p.push(resultado);
                return resultado;

            case "*":
                if (p.size() < 2) {
                    throw new Exception("Erro: valores insuficientes.");
                }
                valor1 = p.pop();
                valor2 = p.pop();
                resultado = valor2 * valor1;
                p.push(resultado);
                return resultado;

            case "/":
                if (p.size() < 2) {
                    throw new Exception("Erro: valores insuficientes.");
                }
                valor1 = p.pop();
                valor2 = p.pop();
                resultado = valor2 / valor1;
                p.push(resultado);
                return resultado;

            default:
                int valor = Integer.parseInt(op);
                p.push(valor);
                return valor;
        }
    }
}