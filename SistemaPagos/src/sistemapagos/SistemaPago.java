package sistemapagos;

public class SistemaPago {

    // Hecho por Jesus Parra
    public static void main(String[] args) 
    {
        IPagoProcesable tarjeta = new PagoTarjetaCredito("1122334455667788", 1000.0);
        IPagoProcesable paypal = new PagoPaypal("millonariosFan123@gmail.com", "supercontrasenia");
        IPagoProcesable transferencia = new PagoTransferencia("12345", "Bancolombia");
        
        MetodoPago metodoPago;
        
        //Realizar el pago con tarjeta de crédito
        metodoPago = new MetodoPago (tarjeta);
        metodoPago.realizarPago(800.0);
        
        //Realizar el pago con paypal
        metodoPago = new MetodoPago (paypal);
        metodoPago.realizarPago(0);
        
        //Realizar el pago con transferencia bancaria
        metodoPago = new MetodoPago (transferencia);
        metodoPago.realizarPago(0);
    }
    
}
