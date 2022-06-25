package com.magiraldooc;

public class Empleado {

    private Integer antiguedad;

    private Integer edad;

    private String dni;

    private String nombre;

    public Empleado(Integer antiguedad, Integer edad, String dni, String nombre) {
        this.antiguedad = antiguedad;
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "antiguedad=" + antiguedad +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
