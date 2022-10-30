package com.emergentes.modelo;

public class Tarea {
    private int id;
    private String tarea;
    private String prioridad;

    public Tarea() {
    }

    public Tarea(int id, String tarea, String prioridad) {
        this.id = id;
        this.tarea = tarea;
        this.prioridad = prioridad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
}
