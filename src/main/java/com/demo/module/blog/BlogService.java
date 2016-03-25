package com.demo.module.blog;

import org.kungfu.core.Service;

import com.demo.blog.Blog;
import com.demo.blog.BlogAPI;
import com.jfinal.plugin.activerecord.Page;

public class BlogService extends Service implements BlogAPI {
	
	@Override
	public Page<Blog> paginate(int pageNumber, int pageSize) {
		return Blog.dao.paginate(pageNumber, pageSize, "select *", "from blog order by id asc");
	}

	@Override
	public Blog findById(int id) {
		 Blog blog = Blog.dao.findById(id);
		 return blog;
	}

	@Override
	public boolean deleteById(int id) {
		 return Blog.dao.deleteById(id);
	}
}
