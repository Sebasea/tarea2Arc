public class DirectorPago {
    public Pago construct(BuilderPago builder, String metodoDePago, double monto) {

        builder.establecerMetodoDePago(metodoDePago);
        builder.establecerMonto(monto);
        return builder.crear();

    }

}

