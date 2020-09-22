package password_maker;

public class random_password {
	private String password;
	
	public random_password() {
		password= new String();
	}
	
	private void set_password(String new_password) { //have to be private because if don't were anybody could used this method
		password= new_password;
	}
	
	public String get_password() {
		return password;
	}
	
	public String creat_password(int length) {
		String set_char= "abcdefghijklmoprstxyz1234567890#!@$";
		char new_password[] = new char[length];
		int random_number;
		for (int i=0; i<length; i++) {
			random_number= (int)(Math.random()*set_char.length());
			new_password[i]= set_char.charAt(random_number);
		}
		set_password(new_password.toString());//set method 
		return get_password();
	}
}