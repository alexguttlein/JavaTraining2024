import com.student.BookNum;
import com.junit.Test;

public class TestBookNumber {

	BookNum bookNum = new BookNum();
	
	@Test
	public void test_sumador () {
		assertEquals(5, bookNum.pageDigits(5));
	}
	
}
