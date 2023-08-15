package punto2_sistemaDeNotificaciones;

class CorreoElectronico extends NotificacionEmail {
    public CorreoElectronico(String mensaje, String direccionCorreo) {
        super(mensaje, direccionCorreo);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo electrónico a " + getDireccionCorreo() + ": " + getMensaje());
    }
}
