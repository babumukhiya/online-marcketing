package onl.ma.onlinebackend.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import onl.ma.onlinebackend.dao.CategoryDAO;
import onl.ma.onlinebackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Category get(int id) {

		//return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
         return null;
	}

}
