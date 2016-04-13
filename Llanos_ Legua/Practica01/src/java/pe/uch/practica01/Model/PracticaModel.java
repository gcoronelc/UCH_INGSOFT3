package pe.uch.practica01.Model;

import pe.uch.practica01.Dto.PracticaDto;

public class PracticaModel {

  public void procesar(PracticaDto pracDto) {
    // Variables
    int consumo;
    double importe;

    // Proceso
    consumo = pracDto.getLectura2() - pracDto.getLectura1();
    
    if (consumo > 5000) {
      importe = 2000 * 0.016 + 1000 * 0.020 + 1000 * 0.025 + 1000 * 0.030 + (consumo - 5000) * 0.050;
    } else if (consumo > 4000) {
      importe = 2000 * 0.016 + 1000 * 0.020 + 1000 * 0.025 + (consumo - 4000) * 0.030;
    } else if (consumo > 3000) {
      importe = 2000 * 0.016 + 1000 * 0.020 + (consumo - 3000) * 0.025;
    } else if (consumo > 2000) {
      importe = 2000 * 0.016 + (consumo - 2000) * 0.020;
    } else {
      importe = consumo * 0.016;
    }
    // Salida
    pracDto.setConsumo(consumo);
    pracDto.setImporte(importe);
  }
}
