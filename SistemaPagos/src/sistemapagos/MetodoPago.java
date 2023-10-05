package sistemapagos;

/**
 *
 * @author Jesus
 */
public class MetodoPago 
{
    private IPagoProcesable formaPago;
    
    public MetodoPago(IPagoProcesable formaPago)
    {
        this.formaPago = formaPago;
    }
    
    public void realizarPago(double monto)
    {
        formaPago.procesarPago(monto);
    }
}
