public class Usuario {

    // Propiedades del objeto
     private String nombre;
     private String apellidos;
     private int edad;
     private int fechaNacimiento;

    // Metodo constructor
    public Usuario(String nombre, String apellidos, int edad, int fechaNacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Metodos gets
    public String getNombre(){
        return this.getNombre();
    }
    public String getApellidos(){
        return this.getApellidos();
    }
    public int getEdad (){
        return this.edad;
    }
    public int getFechaN(){
        return this.getFechaN();
    }

    // Metodos sets
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Metodos
    public void mostrarDatos (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento);
    }
}