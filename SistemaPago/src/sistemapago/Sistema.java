package sistemapago;

public class Sistema {

    // Hecho por Jesus Parra
    public static void main(String[] args) 
    {
        IPagoProcesable tarjeta = new PagoTarjetaCredito("1122334455667788", 1000.0);
        IPagoProcesable paypal = new PagoPaypal("millonariosFan123@gmail.com", "supercontrasenia");
        IPagoProcesable transferencia = new PagoTransferencia("12345", "Bancolombia");
        
        SistemaPago sistema;
        
        //Realizar el pago con tarjeta de crédito
        sistema = new SistemaPago (tarjeta);
        sistema.realizarPago(800.0);
        
        //Realizar el pago con paypal
        sistema = new SistemaPago (paypal);
        sistema.realizarPago(0);
        
        //Realizar el pago con transferencia bancaria
        sistema = new SistemaPago (transferencia);
        sistema.realizarPago(0);
    }
    
}
