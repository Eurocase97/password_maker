package password_maker;

public class Password_maker {

	public static void main(String[] args) {
		random_password example= new random_password();
		System.out.println(example.creat_password(10));
	}
}