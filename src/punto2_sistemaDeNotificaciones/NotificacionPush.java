package punto2_sistemaDeNotificaciones;

class NotificacionPush implements INotificacion {
    private String aplicacion;
    private String mensaje;

    public NotificacionPush(String aplicacion, String mensaje) {
        this.aplicacion = aplicacion;
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificación push a la aplicación " + aplicacion + ": " + mensaje);
    }
}
