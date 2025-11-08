public class ReporteOpcional implements Reporte {

    private int dia;
    private String destinatario;

    public ReporteOpcional(int dia, String destinatario) {
        this.dia = dia;
        this.destinatario = destinatario;
    }

    public String processar() {
        if (this.dia == 3 || this.dia == 5) {
            return "Reporte Opcional destinado a " + this.destinatario + " foi aceite!";
        }
        else {
            return "Reporte Opcional destinado a " + this.destinatario + " não foi aceite! (fora dos dias permitidos)";
        }
    }
}
