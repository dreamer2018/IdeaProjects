package org.xiyoulinux;

import org.xiyoulinux.dao.UserDAO;
import org.xiyoulinux.model.User;

/**
 * Created by zhoupan on 10/25/16.
 */
public class Login {

    public boolean LoginCheck(String name, String passwd) {
        if (name == null || name.equals("") || passwd == null || passwd.equals("")) {
            return false;
        }
        UserDAO userDAO = new UserDAO();
        User user = userDAO.findUserByName(name);
        if (user == null) {
            return false;
        } else if (user.getPasswd().equals(passwd)) {
            return true;
        } else {
            return false;
        }
    }
}
