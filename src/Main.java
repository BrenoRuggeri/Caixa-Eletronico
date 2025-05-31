import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner caixa = new Scanner(System.in);

        // Variáveis do código
        String nomeCliente = null, cpfCliente = null, dataNascimento = null;
        int senha = 0, opcao = 0;
        double saldo = 0.0;

        do {
            String menu = """
                +========================================+
                |                                        |
                |         BEM-VINDO AO CAIXA 24H         |
                |                                        |
                +========================================+
                |                                        |
                |  [1] Registro                          |
                |  [2] Ver Saldo                         |
                |  [3] Sacar                             |
                |  [4] Depositar                         |
                |  [5] Transferir                        |
                |  [6] Extrato                           |
                |  [7] Sair                              |
                |                                        |
                +========================================+
                | Por favor, selecione uma opção:        |
                | >>                                     |
                """;

            System.out.print(menu);
            opcao = caixa.nextInt();
            caixa.nextLine();

            switch (opcao) {
                case 1:
                    String telaRegistro = """
                        +========================================+
                        |       REGISTRO DE NOVO CLIENTE         |
                        +========================================+
                        |                                        |
                        |  Por favor, preencha as informações:   |
                        |                                        |
                        +========================================+
                        """;
                    System.out.println(telaRegistro);

                    System.out.print("Nome completo: ");
                    nomeCliente = caixa.nextLine();

                    System.out.print("CPF: ");
                    cpfCliente = caixa.nextLine();

                    System.out.print("Data de nascimento (dd/mm/aaaa): ");
                    dataNascimento = caixa.nextLine();

                    System.out.print("Crie uma senha de 4 dígitos: ");
                    senha = caixa.nextInt();
                    caixa.nextLine(); // limpa a quebra de linha

                    System.out.print("Deposite o valor inicial da sua conta: ");
                    saldo = caixa.nextDouble();
                    caixa.nextLine(); // limpa a quebra de linha

                    System.out.print("[1] Confirmar ou [2] Cancelar: ");
                    int opcaoRegistro = caixa.nextInt();

                    if (opcaoRegistro == 1) {
                        System.out.println("Cliente registrado com sucesso!");
                    } else {
                        System.out.println("Registro cancelado.");
                    }
                    break;

                case 2:
                    String telaSenha = """
                        +========================================+
                        |         CONSULTA DE SALDO              |
                        +========================================+
                        |                                        |
                        |   Digite sua senha para continuar:     |
                        |                                        |
                        +========================================+
                        | >>                                     |
                        """;
                    System.out.print(telaSenha);

                    int senhaDigitada = caixa.nextInt();
                    caixa.nextLine(); // limpa o buffer

                    if (senhaDigitada != senha) {
                        String erroSenha = """
                            +========================================+
                            |           SENHA INCORRETA!             |
                            +========================================+
                            | Por favor, selecione a opção [2]       | 
                            | novamente no Menu !                    |                          
                            +========================================+
                            """;
                        System.out.println(erroSenha);
                    } else {
                        String telaSaldo = String.format("""
                            +========================================+
                            |           SALDO DISPONÍVEL             |
                            +========================================+
                            |                                        |
                            |  O saldo da sua conta é: R$ %.2f       |
                            |                                        |
                            +========================================+
                            """, saldo);
                        System.out.println(telaSaldo);
                    }
                    break;

                case 3:
                    String telaSaque = """
                        +========================================+
                        |             SAQUE BANCÁRIO             |
                        +========================================+
                        |                                        |
                        |  Digite o valor que deseja sacar:      |
                        |                                        |
                        +========================================+
                        | >>                                     |
                        """;
                    System.out.print(telaSaque);

                    double saque = caixa.nextDouble();
                    caixa.nextLine();

                    if (saque > saldo) {
                        String erroSaque = """
                            +========================================+
                            |            ERRO NO SAQUE!              |
                            +========================================+
                            |  Saldo insuficiente para esta operação.|
                            |  Por favor, tente outro valor.         |
                            +========================================+
                            """;
                        System.out.println(erroSaque);
                    } else {
                        saldo -= saque;

                        String confirmacaoSaque = String.format("""
                            +========================================+
                            |        SAQUE REALIZADO COM SUCESSO     |
                            +========================================+
                            |                                        |
                            |  Valor sacado: R$ %.2f                 |
                            |  Novo saldo:  R$ %.2f                  |
                            |                                        |
                            +========================================+
                            """, saque, saldo);
                        System.out.println(confirmacaoSaque);
                    }
                    break;
            }

        } while (opcao != 7);
    }
}
