package org.xiyoulinux.idao;

/**
 * Created by zhoupan on 10/31/16.
 */
public interface IAbout {
    public boolean inster(IAbout about);

    public boolean delete(int about_id);

    public boolean update(IAbout about);

    public IAbout findAboutByID(int about_id);

    public IAbout findAboutByTitle(String title);
}
