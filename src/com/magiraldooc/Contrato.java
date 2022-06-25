package com.magiraldooc;

import java.util.ArrayList;
import java.util.Scanner;

public class Contrato{

    private final ArrayList<Empleado> empleados;

    public Contrato() {
        this.empleados = new ArrayList<>();
    }

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        Scanner scComando = new Scanner(System.in);
        while (scComando.hasNextLine()){
            String comando = scComando.nextLine();
            contrato.procesarComandos(comando);
        }
    }

    public void listado(){


    }

    public void agregarEmpleado(String comando){

        String[] datosComando = comando.split("&");
        if(datosComando[1].equalsIgnoreCase("local")){
            Local local = new Local(Integer.parseInt(datosComando[3]),
                    Integer.parseInt(datosComando[2]),
                    datosComando[4], datosComando[1], datosComando[5]);
            //System.out.println(local);
            this.empleados.add(local);
        }else if(datosComando[1].equalsIgnoreCase("bodega")){
            Bodega bodega = new Bodega(Integer.parseInt(datosComando[3]),
                    Integer.parseInt(datosComando[2]),
                    datosComando[4], datosComando[1], datosComando[5]);
            //System.out.println(bodega);
            this.empleados.add(bodega);
        }

        //System.out.println("---Empleado agregado---");
    }

    public void listarEmpleados(){
        System.out.print("***Contrato de Empleados***");
        for (Object empleado : empleados){
            System.out.println(empleado.toString());
        }
    }

    public void procesarComandos(String comando){

        if(comando.charAt(0) == '1'){
            this.agregarEmpleado(comando);
        }else if(comando.charAt(0) == '2'){
            this.listarEmpleados();
        }else if(comando.charAt(0) == '3'){
            System.exit(0);
            //System.out.print("Saliendo de la aplicación ..........");
        }
    }
}
