package pe.app.model;

import pe.app.dto.ItemDto;
import pe.app.dto.TablaDto;

public class TablaModel {
    
    public void procesar(TablaDto tablaDto)        
    {
    
        //Variables
        ItemDto[] tabla = new ItemDto[13];
        //Proceso
        int resultado;
        
        for(int i=0;i<=12;i++)
        {
            resultado = tablaDto.getNumero() * i;
            tabla[i] = new ItemDto(tablaDto.getNumero(), "x", i, resultado);
        }
        
        //Salida
        tablaDto.setTabla(tabla);
    }
    
    
}
