package tpf1sistbancario.dominio;

public class CajaAhorro extends Cuenta{

    private Double interes;

    public CajaAhorro(){ }

    public CajaAhorro(Long id, Cliente titular, Double saldo, Double interes) {
        super(id, titular, saldo);
        this.interes = interes;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }





}
