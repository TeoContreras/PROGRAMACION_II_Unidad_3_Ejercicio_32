public class main {
    public static void main(String[] args) {
        CuentaSocial[] cuentas = new CuentaSocial[2];
        cuentas[0] = new CuentaCreador("creador", "creador@mail.com", 12000, 85000, 500000);
        cuentas[1] = new CuentaCorporativa("empresa", "info@empresa.com", 8000, 5, "www.empresa.com");
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i].publicarContenido(); cuentas[i].mostrarEstado();
        }
        ((CuentaCreador) cuentas[0]).mostrarIngresos();
        ((CuentaCorporativa) cuentas[1]).mostrarDatosCorporativos();
    }
}