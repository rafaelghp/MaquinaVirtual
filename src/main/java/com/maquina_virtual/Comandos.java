package com.maquina_virtual;

import java.util.Collection;
import java.util.ArrayList;

public class Comandos {
    private String comando;
    private Object value1;
    private Object value2;
    private Collection<Comandos> ListComando = new ArrayList<Comandos>();

    public Comandos(){

    }
    public Comandos(String comando, String value1, String value2){
        this.comando = comando;
        this.value1 = value1;
        this.value2 = value2;
    }

    public Collection<Comandos> getListComando() {
        return ListComando;
    }

    public void setListComando(Comandos comando) {
        if(comando != null){
            ListComando.add(comando);
        }        
    }

    public String getComando() {
        return comando;
    }

    public Object getValue1() {
        return value1;
    }
    
    public Object getValue2() {
        return value2;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Comando: " + comando +
                " - Value1: " + value1 +
                " - Value2: " + value2;
    }
}
