package org.xiyoulinux.idao;

/**
 * Created by zhoupan on 10/31/16.
 */
public interface IAddress {
    public boolean inster(IAddress address);

    public boolean delete(int address_id);

    public boolean update(IAddress address);

    public IAddress findAboutByID(int address_id);
}
