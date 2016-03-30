package pe.uch.pagoapp.model;

import pe.uch.pagoapp.dto.PagoDto;

public class PagoModel {

  public void procesar(PagoDto pagoDto) {
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = pagoDto.getHorasDia()
            * pagoDto.getDias() * pagoDto.getPagoHora();
    renta = (ingresos > 1500.0) ? (ingresos * 0.08) : 0;
    neto = ingresos - renta;
    // Salida
    pagoDto.setIngresos(ingresos);
    pagoDto.setRenta(renta);
    pagoDto.setNeto(neto);
  }

}
