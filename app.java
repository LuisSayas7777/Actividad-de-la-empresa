public class app.java{
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Luis" 1000000);
        System.out.println(empleado.getSalario());
        System.out.println(emplado.calcularSalario());
    }
}


class Empleado{
    public String nombre;
    private int salario;

    Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
   }

  public int getSalario(){
    return this.salario;
   }
   
   public int CalcularSalario(){
    int salarioAnual = this.salario * 12;
    return salarioAnual;
   }

}



