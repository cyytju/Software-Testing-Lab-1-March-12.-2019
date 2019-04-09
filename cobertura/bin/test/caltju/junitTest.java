package caltju;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

@RunWith(Parameterized.class) //这是一个参数化的测试类
public class junitTest {
	
	private junit rmb;
	private int x,expected;

	public junitTest(int x,int expected){
	    this.x = x;
	    this.expected = expected;
	}

	@Before   //在运行之前先运行这个函数
	public void setUp(){
		rmb = new junit();
	}

	 @Parameters  //给构造函数参数初始化
	 public static Collection<Object[]> getData(){
	     return Arrays.asList(new Object[][]{//0不能, 1能
	            {84,1},
	            {84,0},
	            {0,1},
	            {0,0},
	            {15,0},
	            {26,1},
	            {56,1}
	     });
	 }
	 
	@Test     //测试Train函数
	public void testTrian(){
	    assertEquals(this.expected,rmb.judge(x));
	}
}
