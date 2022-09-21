public class Main {
    public static void main(String[] args) {

        class Persona{
            private int edad;
            private String  nombre;
            private int telefono;

            public void setEdad(int edad){
                this.edad = edad;
            }
            public void setNombre(String nombre){
                this.nombre = nombre;
            }
            public void setTelefono(int telefono){
                this.telefono = telefono;
            }
            public int getEdad(){
                return this.edad;
            }
            public String getNombre(){
                return this.nombre;
            }
            public int getTelefono(){
                return this.telefono;
            }


        }

        class Cliente extends Persona{
            private float credito;

            public void setCredito(float credito) {
                this.credito = credito;
            }
            public float getCredito(){
                return this.credito;
            }
        }

        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setEdad(27);
        cliente.setTelefono(666123456);
        cliente.setCredito(4000);

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());


        class Trabajador extends Persona{
            private float salario;

            public void setSalario(float salario){
                this.salario = salario;
            }
            public float getSalario(){
                return this.salario;
            }
        }

        Trabajador currito = new Trabajador();

        currito.setNombre("Luis");
        currito.setEdad(46);
        currito.setTelefono(937171717);
        currito.setSalario(1300);

        System.out.println(currito.getNombre());
        System.out.println(currito.getEdad());
        System.out.println(currito.getTelefono());
        System.out.println(currito.getSalario());

    }
}