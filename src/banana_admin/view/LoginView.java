package banana_admin.view;
import java.util.Scanner;
import banana_admin.controller.Controllers;
import banana_admin.domain.Login;

public class LoginView {

	private Scanner keyboard;

	public LoginView() {

		keyboard = new Scanner(System.in);
		
	}

	public void loginView() {

		System.out.print("\nid를 입력하세요 : ");
		String loginId = keyboard.next();

		System.out.print("password를 입력하세요 : ");
		String loginPassword = keyboard.next();

		Login login = new Login(loginId,loginPassword);		
		Controllers.getLoginController().responseLogin(login);				

	}

}