public class ReporteObrigatorio implements Reporte {

    private int dia;
    private String destinatario;

    public ReporteObrigatorio(int dia, String destinatario) {
        this.dia = dia;
        this.destinatario = destinatario;
    }

    public String processar() {
        return "Reporte Obrigatório destinado a " + this.destinatario + " foi aceite!";
    }
}
