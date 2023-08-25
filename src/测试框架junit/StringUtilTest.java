package 测试框架junit;

import org.junit.*;

import java.io.IOException;
import java.net.Socket;

public class StringUtilTest {

    private static Socket socket;

    @Before
    public void test1() {
        System.out.println("test1 before");
    }

    @After
    public void test2() {
        System.out.println("---> test2 After执行了");
    }

    @BeforeClass
    public static void test11() {
        System.out.println("test1 classBefore");
        socket = new Socket();
    }

    @AfterClass
    public static void test21() throws IOException {
        System.out.println("test2 classAfter");
        socket.close();
    }

    @Test
    public void testPrintNumber() {
        StringUtil.printNumber("admin");
    }

    @Test
    public void testGetMaxIndex() {
        int index1 = StringUtil.getMaxIndex(null);
        System.out.println(index1);
        
        int index2 = StringUtil.getMaxIndex("admin");
        System.out.println(index2);

        // 断言机制：程序员可以通过预测业务方法的结果
        Assert.assertEquals("方法内部有bug！", 4, index2);
    }
}
