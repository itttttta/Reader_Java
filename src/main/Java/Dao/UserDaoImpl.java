package Dao;

import Enity.User;
import Util.MyBatisUtil;
//import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by wangda on 16/5/26.
 */
public class UserDaoImpl implements IUserDao {


    public int add(User user) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        java.lang.String statement = "Enity.User.addUser";
        int retResult = sqlSession.insert(statement,user);
        sqlSession.close();
        System.out.println("新增用户"+user.getNickname()+"!!!");
        return  retResult;
    }

    public User find(String userName) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        java.lang.String statement = "Enity.User.getUserByName";
        User  user = sqlSession.selectOne(statement,userName);
        sqlSession.close();
        System.out.println("已找到用户"+user.getNickname()+"!!!");
        return user;
    }

    public User find(String userName, String userPwd) {



        return null;
    }

//    public User find(String userName) {
//
//        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
//        java.lang.String statement = "Enity.User.getUser";
//        User  user = sqlSession.selectOne(statement,userName);
//        sqlSession.close();
//        System.out.println("已找到用户"+user.getNickname()+"!!!");
//        return user;
//    }
}
