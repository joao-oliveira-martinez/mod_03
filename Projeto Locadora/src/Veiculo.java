
public class Veiculo {
    private String placa;
    private TipoVeiculo tipo;
    private boolean isAlugado;

    public Veiculo(String placa, TipoVeiculo tipo) {
        this.placa = placa;
        this.tipo = tipo;
        this.isAlugado = false;
    }

    // Getters e setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }

    public boolean isAlugado() {
        return isAlugado;
    }

    public void setAlugado(boolean alugado) {
        isAlugado = alugado;
    }
}
