public class Canguro extends Animal {
    
    public Canguro(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void desplazarse() {
        System.out.println(nombre + " se desplaza saltando.");
    }
}
