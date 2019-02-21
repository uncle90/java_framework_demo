import com.finstone.bean.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

public class TestMybatis {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    public static void main(String[] args) throws IOException {
        /*reader = Resources.getResourceAsReader("conf/mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();*/

        InputStream inputStream = Resources.getResourceAsStream("conf/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();

        List<Category> cs = session.selectList("listCategory");
        for(Category c: cs){
            System.out.println(c.toString());
        }

    }

}