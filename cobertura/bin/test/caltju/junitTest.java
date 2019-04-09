package caltju;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

@RunWith(Parameterized.class) //����һ���������Ĳ�����
public class junitTest {
	
	private junit rmb;
	private int x,expected;

	public junitTest(int x,int expected){
	    this.x = x;
	    this.expected = expected;
	}

	@Before   //������֮ǰ�������������
	public void setUp(){
		rmb = new junit();
	}

	 @Parameters  //�����캯��������ʼ��
	 public static Collection<Object[]> getData(){
	     return Arrays.asList(new Object[][]{//0����, 1��
	            {84,1},
	            {84,0},
	            {0,1},
	            {0,0},
	            {15,0},
	            {26,1},
	            {56,1}
	     });
	 }
	 
	@Test     //����Train����
	public void testTrian(){
	    assertEquals(this.expected,rmb.judge(x));
	}
}
