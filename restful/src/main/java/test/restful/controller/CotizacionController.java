package test.restful.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.restful.cotizacion.Cotizador;
import test.restful.cotizacion.CotizadorDolar;
import test.restful.cotizacion.CotizadorPeso;
import test.restful.cotizacion.CotizadorReal;

@RestController
public class CotizacionController 
{
	private Cotizador cotizador;
	
	/**
	 * Devuelve la cotizacion de la MONEDA en AR$
	 * @param MONEDA 
	 * @return Cotizacion de la MONEDA en Pesos
	 */
	@RequestMapping(value="/{MONEDA}/quote", method=RequestMethod.GET)
	public double cotizar(@PathVariable String MONEDA)
	{
		if(MONEDA.equals("Dolar"))
		{
			cotizador = new CotizadorDolar();
		}
		else if(MONEDA.equals("Pesos"))
		{
			cotizador = new CotizadorPeso();
		}
		else if(MONEDA.equals("Real"))
		{
			cotizador = new CotizadorReal();
		}
		
		return cotizador.cotizar();
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test()
	{
		return "TEST";
	}
}
