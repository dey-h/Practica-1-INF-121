public class Jefe extends Persona {
    private String sucursal;
    private String tipo;

    public Jefe(String nombre, String apellido, String ci, String sucursal, String tipo) {
        super(nombre, apellido, ci);
        this.sucursal = sucursal;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Tipo de jefe: " + tipo);
    }
}
