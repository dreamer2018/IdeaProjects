package org.xiyoulinux.idao;

import org.xiyoulinux.model.Community;

/**
 * Created by zhoupan on 10/31/16.
 */
public interface ICommunity {
    public boolean inster(Community community);

    public boolean delete(int community_id);

    public boolean update(Community community);

    public Community findAboutByID(int community_id);

    public IAbout findAboutByName(String title);
}
