package sistemapago;

/**
 *
 * @author Jesus
 */
public class SistemaPago 
{
    private IPagoProcesable formaPago;
    
    public SistemaPago(IPagoProcesable formaPago)
    {
        this.formaPago = formaPago;
    }
    
    public void realizarPago(double monto)
    {
        formaPago.procesarPago(monto);
    }
}
