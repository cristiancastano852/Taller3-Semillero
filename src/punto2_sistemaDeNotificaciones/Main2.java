package punto2_sistemaDeNotificaciones;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        // Creo las notificaciones para cada tipo de notificación
        INotificacion correo = new CorreoElectronico("Hola, este es un correo electronico", "ejemplo@example.com");
        INotificacion mensajeTexto = new MensajeTexto("+3158978036", "Hola este es un mensaje de texto");
        INotificacion notificacionPush = new NotificacionPush("MiApp", "Nueva actualización disponible (NOTIFICACION PUSH))");

        ArrayList <INotificacion> notificaciones = new ArrayList<>();
        notificaciones.add(correo);
        notificaciones.add(mensajeTexto);
        notificaciones.add(notificacionPush);

        for (INotificacion notificacion : notificaciones) {
            notificacion.enviar();
        }
    }
}
