public class CuentaCreador extends CuentaSocial {
    private double ingresosPublicidad;
    private int visualizaciones;
    public CuentaCreador(String username, String email, int seguidores, double ingresos, int visualizaciones) {
        super(username, email, seguidores); ingresosPublicidad = ingresos; this.visualizaciones = visualizaciones;
    }
    @Override
    public double calcularImpacto() { return visualizaciones * 0.7 + seguidores * 0.3; }
    public void mostrarIngresos() { System.out.println("Ingresos por publicidad: $" + ingresosPublicidad); }
}