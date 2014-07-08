package SpringAOP.Service;

import SpringAOP.ORM.User;

public interface UserService {
	public void add(User user);
	
	public void delete(Long userId);
}
