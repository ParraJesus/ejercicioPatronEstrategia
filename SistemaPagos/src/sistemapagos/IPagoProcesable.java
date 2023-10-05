package sistemapagos;

/**
 *
 * @author Jesus Parra
 */
public interface IPagoProcesable 
{
    public void procesarPago(double monto);
    public boolean verificarInformacion();
}
