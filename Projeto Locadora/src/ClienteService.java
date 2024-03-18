import java.util.HashMap;
import java.util.Map;

public class ClienteService {
    private Map<String, Cliente> clientes;

    public ClienteService() {
        this.clientes = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente) throws ClienteServiceException {
        String identificador = cliente instanceof PessoaFisica ? ((PessoaFisica) cliente).getCpf() : ((PessoaJuridica) cliente).getCnpj();
        if (clientes.containsKey(identificador)) {
            throw new ClienteServiceException("Cliente já cadastrado.");
        }
        clientes.put(identificador, cliente);
    }

    public Cliente buscarCliente(String identificador) {
        return clientes.get(identificador);
    }

    public void atualizarCliente(String identificador, Cliente clienteAtualizado) throws Exception {
        if (!clientes.containsKey(identificador)) {
            throw new Exception("Cliente não encontrado.");
        }
        clientes.put(identificador, clienteAtualizado);
    }
}
