package com.example.lab2.entity;

public class CasillasPatitos {
    private int filas;
    private int columnas;
    private String posiciones_ini;
    private int num_fotos;

    public CasillasPatitos (Integer filas, Integer columnas, String posiciones_ini, Integer num_fotos){
        this.filas = filas;
        this.columnas = columnas;
        this.posiciones_ini = posiciones_ini;
        this.num_fotos = num_fotos;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public String getPosiciones_ini() {
        return posiciones_ini;
    }

    public void setPosiciones_ini(String posiciones_ini) {
        this.posiciones_ini = posiciones_ini;
    }

    public int getNum_fotos() {
        return num_fotos;
    }

    public void setNum_fotos(int num_fotos) {
        this.num_fotos = num_fotos;
    }
}
