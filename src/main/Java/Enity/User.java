package Enity;

/**
 * Created by wangda on 16/5/26.
 */
public class User {
    private int id;
    private String name;
    private String password;
    private String nickname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString(){
        return "User [id=" + getId() + ", name=" + getName() + ", nickname=" + getNickname() + "]";

    }
}
