package onl.ma.onlinebackend.dao;

import java.util.List;

import onl.ma.onlinebackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);
	

}
