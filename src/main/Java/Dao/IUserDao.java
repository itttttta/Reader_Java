/**
 * Created by wangda on 16/5/26.
 */
package Dao;

import Enity.User;
//import com.sun.org.apache.xpath.internal.operations.String;

public interface IUserDao {


    //添加用户
    int add(User user);


    //用户名密码
    User find(String userName , String userPwd);


    //根据用户名查找用户
    User find(String userName);


//    Object find(String name);
}
