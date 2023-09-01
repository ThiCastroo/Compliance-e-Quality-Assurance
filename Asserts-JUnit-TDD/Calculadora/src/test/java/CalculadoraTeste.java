import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

public class CalculadoraTeste {
	
	private Calculadora calc;

	@BeforeEach
	public void inicializar() {
		this.calc = new Calculadora();
	}
	
	@Test
	void testeSomar() {
		
		int a = 3;
		int b = 2;
		int resultado = calc.somar(a, b);
		
		assertEquals(a+b, resultado);
	}

	@Test
	void testeSubtrair() {
		
		int a = 3;
		int b = 2;
		int resultado = calc.subtrair(a, b);
		
		assertEquals(a-b, resultado);
	}
	
	@Test
	void testeMultiplicar() {
		
		int a = 3;
		int b = 2;
		int resultado = calc.multiplicar(a, b);
		
		assertEquals(a*b, resultado);
	}
	
	@Test
	void testeDividir() {
		
		int a = 3;
		int b = 2;
		int resultado = calc.dividir(a, b);
		
		assertEquals(a/b, resultado);
	}
	
	@Test
	void testeDeveRetornarExceptionQuandoDividePorZero() {
		
		int a = 5;
		int b = 0;
		
		try {
			calc.dividir(a, b);
			fail("Teste Falhou: Não retornou a Exception!");
		} catch (Exception e) {
			assertEquals(ArithmeticException.class, e.getClass());
		}	
	}
	
	@Test
	void testeDeveRetornarExceptionUsandoLambda() {
		
		int a = 5;
		int b = 0;
		
		assertThrows(ArithmeticException.class, () -> calc.dividir(a, b));
	}
	
	
	@Test 
	void testeMediaEntreDoisNumeros() {
		
		int a = 10;
		int b = 2;
		
		float resultado = calc.mediaComDoisNumeros(a, b);
		
		assertEquals((a+b)/2, resultado);
	}
	
	@Test
	void testeMedia() {
		
		int[] numeros = {10, 5, 6, 6, 3};
		
		float resultado = calc.media(numeros);
		
		assertEquals(30f/5f, resultado);
	}
}
