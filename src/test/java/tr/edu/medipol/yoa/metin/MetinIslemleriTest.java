package tr.edu.medipol.yoa.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBosluklariTemizle() {
			
		//GIVEN * On Hazirliklar
		String orjinalMetin ="Uc tas hos ho    saf . . .";
		
		
		//WHEN	* Asil Testi gerceklestir
		
		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);
		
		//THEN * Kontroller
		
		assertEquals("Uctashoshosaf...",sonuc);
	}
	public void testBosluklariTemizle2() {
		
		//GIVEN * On Hazirliklar
		String orjinalMetin ="Merhaba Arkadaslar";
		
		
		//WHEN	* Asil Testi gerceklestir
		
		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);
		
		//THEN * Kontroller
		
		assertEquals("MerhabaArkadaslar",sonuc);
	}

}
