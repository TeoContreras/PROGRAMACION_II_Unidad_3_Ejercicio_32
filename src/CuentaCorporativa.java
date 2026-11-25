public class CuentaCorporativa extends CuentaSocial {
    private int limiteAdministradores;
    private String sitioWeb;
    public CuentaCorporativa(String username, String email, int seguidores, int limite, String sitioWeb) {
        super(username, email, seguidores); limiteAdministradores = limite; this.sitioWeb = sitioWeb;
    }
    @Override
    public double calcularImpacto() { return seguidores * 1.2; }
    public void mostrarDatosCorporativos() {
        System.out.println("Administradores maximos: " + limiteAdministradores + " - Web: " + sitioWeb);
    }
}