package punto2_sistemaDeNotificaciones;

abstract class NotificacionBase implements INotificacion {
    private String mensaje;

    public NotificacionBase(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
