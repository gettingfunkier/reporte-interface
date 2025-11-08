public class Main {
    public static void main(String[] args) {
        ReporteObrigatorio reporte1 = new ReporteObrigatorio(1, "zf4ke");
        ReporteOpcional reporte2 = new ReporteOpcional(1, "zf4ke");
        ReporteOpcional reporte3 = new ReporteOpcional(3, "zf4ke");

        System.out.println(submeter(reporte1));
        System.out.println(submeter(reporte2));
        System.out.println(submeter(reporte3));
    }

    public static String submeter(Reporte reporte) {
        return reporte.processar();
    }
}
