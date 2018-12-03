package com.database;
import com.models.User;

public class DataAccessUser {
    public boolean userValidate(String username, String password) {        
        UserList listUser = new UserList();
        boolean isValid = false;
        
        for(User user : listUser.getLstUsers()) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                isValid = true;
            }
        }
        
        return isValid;
    }
}
