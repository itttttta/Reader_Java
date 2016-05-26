package Service;

import Dao.IUserDao;
import Dao.UserDaoImpl;
import Enity.User;
import Exception.UserExistException;
/**
 * Created by wangda on 16/5/26.
 */
public class UserServiceImpl implements IUserService {

    private IUserDao userDao = new UserDaoImpl();

    public void registerUser(User user) throws UserExistException {

        if(userDao.find(user.getName()) !=null)
        {
            throw new UserExistException("注册的用户名已存在");
        }
        userDao.add(user);
    }

    public User loginUser(String userName, String userPwd) {
        return null;
    }
}
