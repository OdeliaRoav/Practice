package j6p40;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextFieldTest {

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(400, 75);
		f.setLayout(new FlowLayout());
		
		
		Label lid = new Label ("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		System.out.println();
		Button btn = new Button("확인");
		btn.setSize(200,50);
		
		pwd.setEchoChar('*');
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btn,"확인");
		f.setVisible(true);
	}

}
