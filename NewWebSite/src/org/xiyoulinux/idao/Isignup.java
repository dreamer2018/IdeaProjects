package org.xiyoulinux.idao;

import org.xiyoulinux.model.Signup;

/**
 * Created by zhoupan on 10/31/16.
 */
public interface ISignup {
    public boolean inster(Signup signup);

    public boolean delete(int signup_id);

    public boolean update(Signup signup);

    public Signup findAboutByID(int signup_id);

    public Signup findAboutByTitle(String title);
}
