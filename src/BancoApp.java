public class BancoApp {
    public static void main(String[] args) {

        System.out.println("1. Exceção checada (SaldoInsuficienteException):");

        ContaBancaria conta1 = new ContaBancaria("João", 50);
        try {
            conta1.sacar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: "  + e.getMessage());
        }


        System.out.println("\n2. Exceção não-checada (NomeInvalidoException):");
        try {
            ContaBancaria contaInvalida = new ContaBancaria(" " , 100);
        } catch (NomeInvalidoException e) {
            System.out.println("Erro ao criar conta: "  + e.getMessage());
        }


        System.out.println("\n3. Try-catch-finally Sem Exception");
        try {
            System.out.println("Tentando realizar um novo depósito na conta do Sr João.");
            conta1.depositar(20);
        } catch (Exception e) {
            System.out.println("Não deve aparecer, pois não há exception");
        } finally {
            System.out.println("Finalizando operação sem exceptions");
        }


        System.out.println("\n4. Try-catch-finally Com Exception");
        try {
            System.out.println("Tentando realizar um novo saque na conta do Sr João");
            conta1.sacar(1000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: "  + e.getMessage());
        } finally {
            System.out.println("Finalizando a operação com exceptions");
        }

    }
}
