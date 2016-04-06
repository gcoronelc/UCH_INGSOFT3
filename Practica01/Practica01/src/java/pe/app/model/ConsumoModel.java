package pe.app.model;


import pe.app.dto.ConsumoDto;

public class ConsumoModel {
    
    public void procesar(ConsumoDto consumoDto)        
    {
    
        //Variables
       int consumo;
       double importe;
        //Proceso
       consumo=consumoDto.getLectura2()-consumoDto.getLectura1();
       if(consumo<=2000){
            importe=2000*0.016;
        }else if(consumo>=2001 && consumo<=3000){
            importe=2000*0.016+(consumo-2000)*0.020;
        }else if(consumo>=3001 && consumo<=4000){ 
            importe=2000*0.016+1000*0.020+(consumo-3000)*0.025;
        }else if(consumo>=4001 && consumo<=5000){
            importe=2000*0.016+1000*0.020+1000*0.025+(consumo-4000)*0.030;
        }else{
            importe=2000*0.016+1000*0.020+1000*0.025+1000*0.30+(consumo-5000)*0.050;
        } 
                
            
        //Salida
       
       consumoDto.setConsumo(consumo);
       consumoDto.setImporte(importe);
    }
    
    
}
