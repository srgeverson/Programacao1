package br.estacio.pri.exerciciosPOO;

public class Conta {
    // atributos - ESTADO

    int numeroConta;
    String nomeCliente;
    double saldo;
    String[] historico;
    int contador = 0;

    // m�todos - COMPORTAMENTO
    void movimentar(double valor, char tipo) {
        if (tipo == 'C' || tipo == 'c') {
            creditar(valor);
        } else if (tipo == 'D' || tipo == 'd') {
            debitar(valor);
        }
    }

    void creditar(double valor) {
        if (valor > 0) {
            saldo += valor;
            if (contador < 1000) {
                historico[contador++] = "Creditou R$ " + valor;
            }
        }
    }

    void debitar(double valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor;
            if (contador < 1000) {
                historico[contador++] = "Debitou R$ " + valor;
            }
        }
    }

    double consultarSaldo() {
        return saldo;
    }

    void criarConta(int conta, String cliente) {
        numeroConta = conta;
        nomeCliente = cliente;
        saldo = 0;
        historico = new String[1000];
    }

    void alterarNome(String nome) {
        nomeCliente = nome;
    }

    void mostrarHistorico() {
        for (int i = 0; i < contador; i++) {
            System.out.println(historico[i]);
        }
    }

}
