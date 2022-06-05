package model;

import java.util.List;

import cao.UserPasswordCao;

public class LoginLogic {
	public boolean execute(User user) {
		UserPasswordCao userPasswordCao = new UserPasswordCao();
		List<User> userList = userPasswordCao.readUserPassword();
//		Map<String,String> userMap = userPasswordCao.readUserPassword();
		System.out.println(user.getPass());
		System.out.println(user.getName());
//		System.out.println(userMap);
		//int name = Integer.parseInt(user.getName());
		String name = user.getName();
		
//		if(userMap.containsKey(user.getName())) {
//			System.out.println("kaichi");
//			return true;
//		}
		
		for (User u : userList) {
			System.out.println(u.getName());
			System.out.println(u.getName().getClass().getSimpleName());
			//int u_name = Integer.parseInt(u.getName());
			String u_name = u.getName();
			if(u_name.equals(name)) {
				return true;
			}
		}
		
		return false;
	}
}
