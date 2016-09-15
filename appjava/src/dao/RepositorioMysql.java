/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author juan
 */
public class RepositorioMysql {

    private ArrayList<Persona> personas;

    public RepositorioMysql() {
        this.personas = new ArrayList<>();
    }

    public boolean adicionarPersona(Persona p) {
        boolean estado = this.personas.add(p);
        return estado;
    }

    public int obtenerCantidadPersonas() {
        return this.personas.size();
    }

}
