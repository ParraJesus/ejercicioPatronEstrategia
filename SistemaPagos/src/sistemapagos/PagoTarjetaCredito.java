package sistemapagos;

/**
 *
 * @author Jesus Gabriel Parra Dugarte
 * @author Elkin Ariel Morillo Quenguan
 * 
 */
public class PagoTarjetaCredito implements IPagoProcesable{

    private String numeroTarjeta;
    private double limiteTarjeta;
    
    public PagoTarjetaCredito(String numeroTarjeta, double limiteTarjeta) 
    {
        this.numeroTarjeta = numeroTarjeta;
        this.limiteTarjeta = limiteTarjeta;
    }
    
    @Override
    public void procesarPago(double monto) 
    {
        if(verificarInformacion() && monto <= limiteTarjeta)
        {
            System.out.println("¡Pago realizado con éxito con tarjeta de crédito!");
        }else System.out.println("No se ha podido realizar el pago con tarjeta de crédito...");
    }

    @Override
    public boolean verificarInformacion() 
    {
        if(numeroTarjeta.equals("") && limiteTarjeta > 0)
        {
            System.out.println("No se ha podido verificar la información de la tarjeta de crédito");
            return false;
        }
        else 
        {
            System.out.println("verificación de la información de la tarjeta de crédito exitosa");
            return true;
        }
    }
    
}
