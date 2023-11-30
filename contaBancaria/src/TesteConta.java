public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.nome = "Sylas";
        conta.saldo = 132.55;
        conta.txRendimento = 0.015;
        System.out.println(conta.nome);
        System.out.println(conta.saldo);
        System.out.println(conta.txRendimento);

        Double valorRendimento = conta.rende();
        System.out.println(conta.dataCriacao);
        System.out.println(valorRendimento);
        Conta conta1 = new Conta("Sylas",325.99,0.02);
        System.out.println(conta.nome);
        System.out.println(conta.saldo);
        System.out.println(conta.txRendimento);
    }
}
