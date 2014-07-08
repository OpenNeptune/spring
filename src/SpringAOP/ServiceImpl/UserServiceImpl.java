package SpringAOP.ServiceImpl;

import org.springframework.stereotype.Service;

import SpringAOP.ORM.User;
import SpringAOP.Service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Override
	public void add(User user) {
		System.out.println("UserServiceImpl::add is called....");
	}

	@Override
	public void delete(Long userId) {
		System.out.println("UserServiceImpl::delete is called...");
	}

}
