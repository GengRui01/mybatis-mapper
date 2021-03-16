import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

/**
 * @ClassName UserTest
 * @Description User模块测试类
 * @Author GengRui
 * @Date 2021/3/13 16:19
 */
@SuppressWarnings({"Duplicates"})
public class UserTest {
    public static void main(String[] args) throws IOException, SQLException {
        // 读取配置文件
        InputStream configuration = Resources.getResourceAsStream("mybatis-config.xml");
        // 得到 SqlSessionFactory 核心类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        // 开始一个 sql 会话
        SqlSession session = sqlSessionFactory.openSession();
        // 得到 mapper
        UserMapper mapper = session.getMapper(UserMapper.class);
        // 调用注解的SQL
        String username = mapper.selectUsernameById(1);
        System.out.println("username: " + username);
        // 关闭会话
        session.close();
    }
}
