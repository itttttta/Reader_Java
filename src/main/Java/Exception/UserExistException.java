package Exception;

/**
 * Created by wangda on 16/5/26.
 */
public class UserExistException extends Exception{

    public UserExistException(String msg) {
        System.out.print(msg);
    }
}
