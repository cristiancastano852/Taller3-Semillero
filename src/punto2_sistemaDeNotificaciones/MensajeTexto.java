package punto2_sistemaDeNotificaciones;

class MensajeTexto implements INotificacion {
    private String numeroTelefono;
    private String mensaje;

    public MensajeTexto(String numeroTelefono, String mensaje) {
        this.numeroTelefono = numeroTelefono;
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto a " + numeroTelefono + ": " + mensaje);
    }
}
