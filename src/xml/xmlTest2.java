package xml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class xmlTest2 {
    public static void main(String[] args) {
        // 1.使用StringBuilder对象来拼接XML格式的数据
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        sb.append("<book>\r\n");
        sb.append("\t<author>").append("从入门到跑路").append("</author>\r\n");
        sb.append("\t<price>").append("99.9").append("</price>\r\n");
        sb.append("</book>");

        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/xml/test2.xml"));
                ){
            bufferedWriter.write(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
