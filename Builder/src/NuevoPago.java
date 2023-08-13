public class NuevoPago implements BuilderPago {
    private Pago pago = new Pago();

    @Override
    public void establecerMetodoDePago(String metodoDePago) {

    }

    @Override
    public void establecerMonto(double monto) {

    }

    @Override
    public Pago crear() {
        return pago;
    }
}
