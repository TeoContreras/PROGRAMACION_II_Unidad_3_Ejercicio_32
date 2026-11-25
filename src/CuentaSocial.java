public class CuentaSocial {
    protected String username, email;
    protected int seguidores;
    public CuentaSocial(String username, String email, int seguidores) {
        this.username = username; this.email = email; this.seguidores = seguidores;
    }
    public void publicarContenido() { System.out.println(username + " publico contenido."); }
    public void seguirUsuario() { seguidores++; }
    public double calcularImpacto() { return seguidores; }
    public void mostrarEstado() {
        System.out.println("Usuario: " + username + " - Seguidores: " + seguidores + " - Impacto: " + calcularImpacto());
    }
}