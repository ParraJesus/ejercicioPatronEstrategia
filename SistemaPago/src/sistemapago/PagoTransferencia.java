package sistemapago;

/**
 *
 * @author Jesus Parra
 */
public class PagoTransferencia implements IPagoProcesable{

    private String numeroCuenta;
    private String nombreBanco;

    public PagoTransferencia(String numeroCuenta, String nombreBanco) 
    {
        this.numeroCuenta = numeroCuenta;
        this.nombreBanco = nombreBanco;
    }
    
    @Override
    public void procesarPago(double monto) 
    {
        if(verificarInformacion())
        {
            System.out.println("¡Pago realizado con éxito con transferencia bancaria!");
        }else System.out.println("No se ha podido realizar el pago con transferencia bancaria...");
    }

    @Override
    public boolean verificarInformacion() 
    {
        if(numeroCuenta.equals("") && nombreBanco.equals(""))
        {
            System.out.println("No se ha podido verificar la información de la cuenta de banco");
            return false;
        }
        else 
        {
            System.out.println("Verificación de la cuenta de banco exitosa");
            return true;
        }
    }
    
}
