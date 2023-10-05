package sistemapagos;

/**
 *
 * @author Jesus Gabriel Parra Dugarte
 * @author Elkin Ariel Morillo Quenguan
 * 
 */
public interface IPagoProcesable 
{
    public void procesarPago(double monto);
    public boolean verificarInformacion();
}
