package org.xiyoulinux.idao;

import org.xiyoulinux.model.Events;

/**
 * Created by zhoupan on 10/31/16.
 */
public interface IEvents {
    public boolean insert(Events events);
    public boolean delete(int event_id);
    public boolean update(Events events);
    public Events findEventsByID(int event_id);
    public Events findEventsByTitle(String title);
}
