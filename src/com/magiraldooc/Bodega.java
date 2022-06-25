package com.magiraldooc;

public class Bodega extends Empleado{

    private String ubicacion;

    public Bodega(Integer antiguedad, Integer edad, String dni, String nombre, String ubicacion) {
        super(antiguedad, edad, dni, nombre);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {

        return "\tEmpleado Bodega - DNI: " + super.getDni() + '\n' +
                "\tAntiguedad : " + super.getAntiguedad() + " años\n" +
                "\tEdad: " + super.getEdad() + '\n' +
                "\tUbicacion: " + this.ubicacion;
    }
}
