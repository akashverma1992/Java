package demo_nested_classes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuterClass {
    
    static class StaticNestedClass {
        private Frame f;
        private Panel p;
        private Button btn;

        public StaticNestedClass() {
            this.p = new Panel();
            this.f = new Frame();
            this.btn = new Button();
            this.createGUI();
        }

        private void createGUI() {
            p.add(f);
            p.setSize(300, 300);
            p.setVisible(true);
            f.add(btn);
            btn.addActionListener( new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getActionCommand().equals("Click"))
                        System.out.println("Button Clicked!");
                }
            });
        }
    }
    
    public class InnerClass {}

    public static void main(String...a){
        OuterClass.StaticNestedClass inner;
        inner = new OuterClass.StaticNestedClass();
    }
}
