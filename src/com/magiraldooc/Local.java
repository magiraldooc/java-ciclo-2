package com.magiraldooc;

public class Local extends Empleado{

    private String cargo;

    public Local(Integer antiguedad, Integer edad, String dni, String nombre, String cargo) {
        super(antiguedad, edad, dni, nombre);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {

        return "\tEmpleado Local - DNI: " + super.getDni() + '\n' +
                "\tAntiguedad : " + super.getAntiguedad() + " años\n" +
                "\tEdad: " + super.getEdad() + '\n' +
                "\tCargo: " + this.cargo;
    }
}
