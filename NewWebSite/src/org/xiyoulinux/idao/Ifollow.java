package org.xiyoulinux.idao;

import org.xiyoulinux.model.Follow;

/**
 * Created by zhoupan on 10/31/16.
 */
public interface IFollow {
    public boolean inster(Follow follow);

    public boolean delete(int about_id);

    public boolean update(Follow follow);

    public Follow findAboutByID(int follow_id);
}
