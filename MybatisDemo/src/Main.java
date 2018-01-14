import dao.StudentMapper;
import entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStream in = Main.class.getResourceAsStream("resource/mybatis-cfg.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setId(123);
        student.setAge(20);
        student.setName("Halen");
        student.settId(2);
        mapper.insertStudent(student);
        session.commit();
        session.close();

    }
}
