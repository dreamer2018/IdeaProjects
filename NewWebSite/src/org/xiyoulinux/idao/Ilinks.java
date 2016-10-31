package org.xiyoulinux.idao;

import org.xiyoulinux.model.Links;

/**
 * Created by zhoupan on 10/31/16.
 */
public interface ILinks {
    public boolean inster(Links links);

    public boolean delete(int link_id);

    public boolean update(Links links);

    public Links findAboutByID(int link_id);

    public Links findAboutByName(String name);
}
