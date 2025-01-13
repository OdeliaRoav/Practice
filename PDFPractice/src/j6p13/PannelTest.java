package j6p13;

import java.awt.*;

public class PannelTest { //panel인데 pannel으로 작성 수정 귀찮음

	private Frame f;
	private Panel p;
	private Button ok, cancel;
	private TextField tf1;
	
	public PannelTest() {
		f = new Frame("panel example");
		ok = new Button("전송");
		cancel = new Button("삭제");
		tf1 = new TextField("Input...");
		p = new Panel();
	}
	public void startFrame() {
		f.add(tf1, BorderLayout.NORTH);
		p.setBackground(Color.green);
		p.add(ok);
		p.add(cancel);
		f.add(p, BorderLayout.CENTER);
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		PannelTest g = new PannelTest();
		g.startFrame();

	}
}