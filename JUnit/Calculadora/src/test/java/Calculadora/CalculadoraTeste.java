package Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	
	private Calculadora calc;
	
	@BeforeEach
	public void setUp() {
		this.calc = new Calculadora();
	}
	
	@Test
	public void testeSomaDoisInteiros() {
		
//		Calculadora calculadora = new Calculadora();
		
		int a = 5;
		int b = 2;
		int resultado = calc.somar(a, b);
		
		assertEquals(a+b, resultado);
	}
	
	@Test
	public void testeSubtraiDoisInteiros() {
	
//		Calculadora calculadora = new Calculadora();
		
		int a = 5;
		int b = 2;
		int resultado = calc.subtrair(a, b);
		
		assertEquals(a-b, resultado);
	}
	
	@Test
	public void testeMultiplicaDoisInteiros() {
		
//		Calculadora calculadora = new Calculadora();
		int a = 5;
		int b = 2;
		int resultado = calc.multiplicar(a, b);
		
		assertEquals(a*b, resultado);
	}
	
	@Test
	public void testeDivideDoisInteiros() {
		
//		Calculadora calculadora = new Calculadora();
		
		int a = 6;
		int b = 2;
		int resultado = calc.dividir(a, b);
		
		assertEquals(a/b, resultado);
	}
}
