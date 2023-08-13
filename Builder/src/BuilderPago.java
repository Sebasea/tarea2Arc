public interface BuilderPago {

    void establecerMetodoDePago(String metodoDePago);

    void establecerMonto(double monto);

    Pago crear();

}
