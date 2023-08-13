package Object_Stream;

import java.io.Serializable;

// 注意：对象如果需要序列化，必须实现序列化接口
public class User implements Serializable {
    private String loginName;
    private String UserName;
    private int gae;
    // transient 这个成员变量将不参与序列化
    private transient String passWord;


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getGae() {
        return gae;
    }

    public void setGae(int gae) {
        this.gae = gae;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public User(String loginName, String userName, int gae, String passWord) {
        this.loginName = loginName;
        UserName = userName;
        this.gae = gae;
        this.passWord = passWord;
    }

    public User() {
    }


    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", UserName='" + UserName + '\'' +
                ", gae=" + gae +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
