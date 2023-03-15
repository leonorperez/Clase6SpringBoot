package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Avion {
	private String codigoA;
	private String modelo;
	private int cantPasaje;
	private String color;
	private Boolean exito;
	private List<Pasajero> pasajeros;


	public Avion(String codigoA, String modelo, int cantPasaje, String color, Boolean exito) {
		this.codigoA = codigoA;
		this.modelo = modelo;
		this.cantPasaje = cantPasaje;
		this.color = color;
		this.exito = exito;
		this.pasajeros = new ArrayList<>();
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Boolean getExito() {
		return exito;
	}

	public void setExito(Boolean exito) {
		this.exito = exito;
	}

	public void setCodigoA(String codigoA) {
		this.codigoA = codigoA;
	}

	public String getCodigoA() {
		return codigoA;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCantPasaje() {
		return cantPasaje;
	}

	public String getColor() {
		return color;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCantPasaje(int cantPasaje) {
		this.cantPasaje = cantPasaje;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void volar(){
		String mensaje = (exito==true) ? "vuelo exitoso":"error catastrófico";
		System.out.println(mensaje);
		System.out.println(this.codigoA + " " +this.modelo +" "+this.color +" "+this.cantPasaje);
	}

	public void aterrizar(){
		String mensaje = (exito == true)? "aterrizaje exitoso": "vuelo fatal";
		System.out.println(mensaje);
	}

	public void despegar(){
		String mensaje = (exito == true)? "despegue exitoso": "despegue fatal";
		System.out.println(mensaje);
	}
	public void cargarPasajero(Pasajero pasajero){
		this.pasajeros.add(pasajero);
	}
	public  void mostrarPasajeros(){
		System.out.println("Aca lista de pasajeros ");
		for (Pasajero pj : pasajeros) {
			System.out.println(pj);
		}
	}

	public static void main(String[] args) {

		/*Avion avioncito =  new Avion("3", "comercial", 12, "celeste", true);
		avioncito.volar();
		avioncito.aterrizar();
		avioncito.despegar();
		Avion flyBondy = new Avion("6", "comercial", 20, "rojo", false);
		flyBondy.volar();
		flyBondy.aterrizar();
		flyBondy.despegar();*/
		Avion grande = new Avion("3", "comercial", 50, "negro", true);
		grande.volar();
		grande.aterrizar();
		grande.despegar();
		/*grande.cantVuelo(20);
		grande.cantVuelo(1.2);
		grande.cantVuelo(1.5, 7);

		 */


		List<String> lista = new ArrayList<>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");

		Pasajero pasajero1 = new Pasajero("Juan", "Lopez",27942333,"22A");
		Pasajero pasajero2 = new Pasajero("Pedro", "Perez",27942334,"22B");
		Pasajero pasajero3 = new Pasajero("Juana", "Lopez",27942335,"12C");
		grande.cargarPasajero(pasajero1);
		grande.cargarPasajero(pasajero2);
		grande.cargarPasajero(pasajero3);

		grande.mostrarPasajeros();



		/*for (int i = 0; i < lista.size(); i++) {

			System.out.println(lista.get(i));
		}

		 */
		for (String cadena : lista) {
			System.out.println(cadena);
		}
	}
}
