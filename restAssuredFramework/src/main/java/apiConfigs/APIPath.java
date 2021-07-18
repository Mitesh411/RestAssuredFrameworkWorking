package apiConfigs;

public class APIPath {
	public static final class apiPath{
		//Get List of User Detail
		public static final String GET_LIST_OF_USERS = "api/users?page=2";
		//Get List of Details for Single User
		public static final String GET_SINGLE_USERS = "api/users/2"; 

		
		//Post Request to Create a User
		public static final String CREATE_USERS = "api/users";
		
		//Delete Request to Create a User
		public static final String DELETE_USERS = "api/users";
				
	}
	
//	public static void main(String[] args) {
//		System.out.println(APIPath.apiPath.CREATE_USERS);
//	}
}
