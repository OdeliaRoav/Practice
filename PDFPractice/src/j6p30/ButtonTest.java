package j6p30;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);
        f.setLayout(null);

        Button b = new Button("확인");
        b.setSize(100, 50);
        b.setLocation(100, 75);

        f.add(b);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                b.setLabel("취소");
            }
        });

       
    }
}
