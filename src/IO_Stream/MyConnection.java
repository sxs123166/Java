package IO_Stream;

public class MyConnection implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("释放了某个资源");
    }
}
