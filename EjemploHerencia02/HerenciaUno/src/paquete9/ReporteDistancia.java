/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDistancia extends Reporte{
    
    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;
    
    
    public ReporteDistancia(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudianteDistancia> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasDistancia(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia + 
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }
    
    public ArrayList<EstudianteDistancia> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaDistancia;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Carrera: %s \n"
                + "Ciclo: %s\n",
                carrera,
                ciclo);
        
                for(int i=0;i < obtenerLista().size(); i++){
                cadena = String.format("%s\nNombre: %s\n"
                        +"Apellido: %s\n"
                        +"Identificacion: %s\n"+
                        "Edad: %d\n"+
                        "Costo Asignatura %.2f\n"+
                        "Numero de asignaturas %d\n"+
                        "Total Matricula: %s\n",cadena, obtenerLista().get(i).obtenerNombresEstudiante(),
                        obtenerLista().get(i).obtenerApellidoEstudiante(),
                        obtenerLista().get(i).obtenerIdentificacionEstudiante(),
                        obtenerLista().get(i).obtenerEdadEstudiante(),
                        obtenerLista().get(i).obtenerCostoAsignatura(),
                        obtenerLista().get(i).obtenerNumeroAsignaturas(),
                        obtenerLista().get(i).obtenerMatriculaDistancia());
                }
                cadena = String.format("%s\nEl total de matricula es : %.2f\n",cadena,
                        obtenerTotalMatriculasDistancia());
        return cadena;
    }
    
}
