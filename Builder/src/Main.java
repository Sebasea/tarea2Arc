public class Main {

    public static void main(String[] args) {

        BuilderPago nuevoPago = new NuevoPago();
        DirectorPago directorPago = new DirectorPago();

        Pago pago = directorPago.construct(nuevoPago, "Nuevo pago de ", 100.000);
        pago.procesoDePago();

    }
}