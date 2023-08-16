package punto9_InstrumentosMusicales;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("\n--- Instrumentos musicales ---");
        Instrumento[] instrumentos = new Instrumento[3];
        instrumentos[0] = new Guitarra();
        instrumentos[1] = new Piano();
        instrumentos[2] = new Trompeta();

        System.out.println("Comiezan a tocar todos los instrumentos");
        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}
