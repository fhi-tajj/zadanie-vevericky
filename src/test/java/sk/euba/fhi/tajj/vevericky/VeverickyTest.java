package sk.euba.fhi.tajj.vevericky;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor Banduric.
 */
public class VeverickyTest {

	private Vevericky vevericky; //FIXME

	@Test
	public void testDveTri() {
		assertEquals( true, this.vevericky.veverickySaHraju( 20, false ) );
		assertEquals( false, this.vevericky.veverickySaHraju( 30, false ) );
		assertEquals( true, this.vevericky.veverickySaHraju( 35, true ) );
		assertEquals( true, this.vevericky.veverickySaHraju( 30, true ) );
		assertEquals( false, this.vevericky.veverickySaHraju( 10, false ) );
		assertEquals( false, this.vevericky.veverickySaHraju( 10, true ) );
		assertEquals( false, this.vevericky.veverickySaHraju( 40, true ) );	}
}
