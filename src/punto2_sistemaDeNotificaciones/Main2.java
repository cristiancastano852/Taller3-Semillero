package punto2_sistemaDeNotificaciones;

public class Main2 {
    public static void main(String[] args) {
        INotificacion correo = new CorreoElectronico("Hola, este es un correo", "ejemplo@example.com");
        INotificacion mensajeTexto = new MensajeTexto("+1234567890", "Hola desde un mensaje de texto");
        INotificacion notificacionPush = new NotificacionPush("MiApp", "Nueva actualización disponible");

        correo.enviar();
        mensajeTexto.enviar();
        notificacionPush.enviar();
    }
}
