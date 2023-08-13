public class Pago {

    public void establecerMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public void establecerMonto(double monto) {
        this.monto = monto;
    }

    public void procesoDePago() {
        System.out.println("Procesando pago de " + monto + " usando " + metodoDePago);
    }
    private String metodoDePago;
    private double monto;

}