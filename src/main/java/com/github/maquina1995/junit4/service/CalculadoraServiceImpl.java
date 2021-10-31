package com.github.maquina1995.junit4.service;

public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public double sumar(double num1, double num2) {
		return num1 + num2;
	}

	@Override
	public double restar(double num1, double num2) {
		return num1 - num2;
	}

	@Override
	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	@Override
	public Double dividir(Double dividendo, Double cociente) {

		boolean parametrosIncorrectos = this.comprobarNulos(dividendo, cociente) || dividendo == 0d || cociente == 0d;
		if (parametrosIncorrectos) {
			throw new ArithmeticException("Ninguno de los 2 parametros puede ser cero");
		}
		return dividendo / cociente;
	}

	private boolean comprobarNulos(Double num1, Double num2) {
		return (num1 == null || num2 == null);
	}
}
