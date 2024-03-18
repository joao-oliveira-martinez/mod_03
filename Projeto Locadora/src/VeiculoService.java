
import java.util.HashMap;
import java.util.Map;

public class VeiculoService {
    private Map<String, Veiculo> veiculos;

    public VeiculoService() {
        this.veiculos = new HashMap<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) throws VeiculoServiceException {
        if (veiculos.containsKey(veiculo.getPlaca())) {
            throw new VeiculoServiceException("Veículo com esta placa já cadastrado.");
        }
        veiculos.put(veiculo.getPlaca(), veiculo);
    }

    public Veiculo buscarVeiculoPorPlaca(String placa) {
        return veiculos.get(placa);
    }

    public void atualizarStatusVeiculo(String placa, boolean isAlugado) throws Exception {
        Veiculo veiculo = veiculos.get(placa);
        if (veiculo == null) {
            throw new Exception("Veículo não encontrado.");
        }
        veiculo.setAlugado(isAlugado);
    }
}
