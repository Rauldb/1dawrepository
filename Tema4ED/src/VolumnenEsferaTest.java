import static org.junit.Assert.*;

import org.junit.Test;


public class VolumnenEsferaTest {

	@Test
	public void testVolumen() {
		VolumnenEsfera esfera=new VolumnenEsfera();
		assertEquals(113.04,esfera.Volumen(3));
		
	}

	@Test
	public void testLongitudRadio() {
		VolumnenEsfera esfera2=new VolumnenEsfera();
		assertEquals(18.84,esfera2.LongitudRadio(3));
	}

}
