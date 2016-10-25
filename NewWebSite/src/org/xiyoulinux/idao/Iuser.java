package org.xiyoulinux.IDAO;

import org.xiyoulinux.model.User;
/**
 * Created by zhoupan on 10/25/16.
 */
public interface Iuser {
    public boolean insert(User user);
    public boolean delete(int user_id);
    public boolean update(User user);
    public User findUserByName(String user_name);
    public User findUserByID(String user_id);
}
