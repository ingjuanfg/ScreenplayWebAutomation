package co.com.ingjuanfg.exceptions;

public class NoExisteElVideoBuscadoException extends AssertionError {
    public static final String EXCEPCION_MENSAJE_BUSQUEDA_SIN_RESULTADOS = "No hay resultados de busqueda del video";

    public NoExisteElVideoBuscadoException(String mensaje, Throwable causa){
        super(mensaje,causa);
    }
}