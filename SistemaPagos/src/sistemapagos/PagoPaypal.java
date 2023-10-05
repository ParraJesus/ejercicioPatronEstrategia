package sistemapagos;

/**
 *
 * @author Jesus Gabriel Parra Dugarte
 * @author Elkin Ariel Morillo Quenguan
 * 
 */
public class PagoPaypal implements IPagoProcesable{

    private String correo;
    private String contrasenia;
    
    public PagoPaypal(String correo, String contrasenia)
    {
        this.correo = correo;
        this.contrasenia = contrasenia;
    }
    
    @Override
    public void procesarPago(double monto) 
    {
        if(verificarInformacion())
        {
            System.out.println("¡Pago realizado con éxito desde Paypal!");
        }else System.out.println("No se ha podido realizar el pago con Paypal...");
    }

    @Override
    public boolean verificarInformacion() 
    {
        if(contrasenia.equals("") && correo.equals(""))
        {
            System.out.println("No se ha podido autentificar la información de la cuenta de Paypal");
            return false;
        }
        else 
        {
            System.out.println("Autenticación de la cuenta de Paypal exitosa");
            return true;
        }
    }
    
}
