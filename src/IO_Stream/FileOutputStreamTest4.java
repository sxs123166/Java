package IO_Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest4 {
    public static void main(String[] args) throws IOException {
        // 1.创建一个字节输出流管道余源文件相同
        // 追加数据后面加 true
        FileOutputStream os = new FileOutputStream("src/test3.txt",true);

        // 2、开始写字节数据
        os.write(97); //97就是一个字节，代表a
        os.write('b'); // 'b'也是一个字节

        byte[] bytes = "我爱你中国".getBytes();
        os.write(bytes);

        // 换行符
        os.write("\r\n".getBytes());

        os.close();

    }
}
