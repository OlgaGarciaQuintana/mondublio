package net.ausiasmarch.servlet;

public abstract class VehiculoAbstractClass {
    String matricula;
    boolean arrancado = false;
    //Metodo para verificar si el vehiculo está arrancado
    public abstract Boolean isArrancado();
    //Metodo para arrancar el vehiculo
    public void arrancar(){
        this.arrancado = true;
    }
    // set y get matricula
    
}
