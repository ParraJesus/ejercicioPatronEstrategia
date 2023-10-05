package sistemapagos;

/**
 *
 * @author Jesus Gabriel Parra Dugarte
 * @author Elkin Ariel Morillo Quenguan
 * 
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
