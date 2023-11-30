import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class Conta {
    String nome;
    Double saldo;
    Double txRendimento;
    LocalDateTime dataCriacao;

    public Conta(String nome, Double saldo, Double txRendimento) {
        this.nome = nome;
        this.saldo = saldo;
        this.txRendimento = txRendimento;
        System.out.println("Criando uma nova instância de Conta");
    }

    Conta(){
        dataCriacao = now();
        }
       Double rende(){
        return saldo * txRendimento;

    }
}
