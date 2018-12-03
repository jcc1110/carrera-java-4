package com.database;
import com.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> lstUsers;

    public UserList() {
        this.lstUsers = new ArrayList();
        this.lstUsers.add(new User("anhurtado", "123456"));
        this.lstUsers.add(new User("mipico", "123456"));
    }

    public List<User> getLstUsers() {
        return lstUsers;
    }

    public void setLstUsers(List<User> lstUsers) {
        this.lstUsers = lstUsers;
    }
}
