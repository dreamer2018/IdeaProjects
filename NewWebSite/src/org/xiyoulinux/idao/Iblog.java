package org.xiyoulinux.idao;

import org.xiyoulinux.model.Blog;

/**
 * Created by zhoupan on 10/31/16.
 */
public interface IBlog {
    public boolean insert(Blog blog);

    public boolean delete(int blog_id);

    public boolean update(Blog blog);

    public Blog findBlogByID(int blog_id);

    public Blog findBlogByTitle(String title);
}
