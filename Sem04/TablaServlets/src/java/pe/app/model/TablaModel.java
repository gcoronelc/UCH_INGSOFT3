/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.app.model;

import pe.app.dto.TablaDto;

/**
 *
 * @author mud
 */
public class TablaModel {
    
    public void procesar(TablaDto tablaDto)        
    {
    
        //Variables
        String resultado;
        //Proceso
        resultado = "";
        
        for(int i=0;i<=12;i++)
        {
            resultado+= "<li>" + tablaDto.getNumero() + " x " + i + " = " + (tablaDto.getNumero()*i) + "</li>" ;
        }
        
        //Salida
        tablaDto.setResultado(resultado);
    }
    
    
}
