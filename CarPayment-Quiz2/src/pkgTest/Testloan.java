package pkgTest;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;
import pkgMain.Loan;

class Testloan {

	@Test
	public void testIROTL() {
		Loan l = new Loan(35000, 0, 10, 60, 0);
		assertEquals("743.65", l.IROTL());
	}
	@Test

	public void testIROTL2() {
		Loan l = new Loan(37000, 0, 30, 15, 0);
		assertEquals("2988.36",l.IROTL());
		}
/*		public void testIROTL2() {
			try {
			Loan l = new Loan(35000, 0, 10, 60, 0);
			assertEquals("743.77", l.IROTL());}
			finally{
				System.out.print("not Equal");
			}
			//fail("Not Equal");
	}
*/
}
