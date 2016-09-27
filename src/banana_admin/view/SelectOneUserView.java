package banana_admin.view;
import java.util.Scanner;

import banana_admin.controller.Controllers;
import banana_admin.domain.User;

public class SelectOneUserView {

	private Scanner keyboard;

	public SelectOneUserView(){
		keyboard=new Scanner(System.in);
	}
	
	public void selectOneView(){

		int selectUserNumber;
		System.out.print("유저 번호 입력해주세요: ");
		selectUserNumber = keyboard.nextInt();
		
		Controllers.getUserController().responseSelectReturnNumber(selectUserNumber);
	}
	
	public void selectOneUserView(User user){
		
		System.out.println("회원id: "+user.getUserId());
		System.out.println("회원이름: "+user.getUserName());
		System.out.println("성별: "+user.getUserGender());
		System.out.println("전화번호: "+user.getUserPhoneNumber());

	}

}
