import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Awt {

    public Awt() {
        Frame frame = new Frame("Hi Sharad");

        TextField textField= new TextField("Sapport sir");
        textField.setBackground(Color.BLUE);
        textField.setBounds(50,90,300,30);

        Label label = new Label("hi sir");
        label.setBackground(Color.cyan);
        label.setBounds(20,90,150,30);

        Button button= new Button("Click me");
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.setBounds(20,40,80,30);

        Checkbox checkbox= new Checkbox("python");
        checkbox.setBounds(20,120,50,30);

        frame.add(button);
        frame.add(label);
        frame.add(textField);
        frame.add(checkbox);



        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){



            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
    }
    public static void main(String[] args) {

        new Awt();
//        Awt obj= new Awt();
    }
}
