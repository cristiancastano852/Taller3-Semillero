package punto2_sistemaDeNotificaciones;

abstract class NotificacionEmail extends NotificacionBase {
    private String direccionCorreo;

    public NotificacionEmail(String mensaje, String direccionCorreo) {
        super(mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }
}
