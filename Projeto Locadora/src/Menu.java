import java.util.Scanner;
public class Menu {
    private VeiculoService veiculoService;
    private ClienteService clienteService;
    private Scanner scanner;

    public Menu() {
        this.veiculoService = new VeiculoService();
        this.clienteService = new ClienteService();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("Menu ADA LocateCar");
            System.out.println("1. Cadastrar Veículo");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Buscar Cliente");
            System.out.println("4. Atualizar Cliente");
            // Outras opções...
            System.out.println("X. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarVeiculo();
                    break;
                case "2":
                    cadastrarCliente();
                    break;
                case "3":
                    buscarCliente();
                    break;
                case "4":
                    atualizarCliente();
                    break;
                case "X":
                case "x":
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private void cadastrarVeiculo() {
    }

    private void cadastrarCliente() {
        System.out.println("Cadastrar Cliente:");
        System.out.print("Tipo de cliente (1 - Pessoa Física, 2 - Pessoa Jurídica): ");
        int tipoCliente = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Contato: ");
        String contato = scanner.nextLine();

        try {
            if (tipoCliente == 1) {
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                PessoaFisica pf = new PessoaFisica(nome, contato, cpf);
                clienteService.adicionarCliente(pf);
            } else if (tipoCliente == 2) {
                System.out.print("CNPJ: ");
                String cnpj = scanner.nextLine();
                PessoaJuridica pj = new PessoaJuridica(nome, contato, cnpj);
                clienteService.adicionarCliente(pj);
            }
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }

    private void buscarCliente() {
        // Implementar lógica para buscar cliente
    }

    private void atualizarCliente() {
        // Implementar lógica para atualizar cliente
    }

    // Outros métodos...
}
