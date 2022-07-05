package aula18;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class Aula18 {
    
    public static void createGridLayoutWindow(JFrame frame){
        GridLayout layout = new GridLayout(0, 1);
        
        JButton button1 = new JButton("Botão 1");
        JButton button2 = new JButton("Botão 2");
        JButton button3 = new JButton("Botão 3");
        JButton button4 = new JButton("Botão 4");
        JButton button5 = new JButton("Botão 5");
        
        button1.addActionListener(env -> { 
            String msg = JOptionPane.showInputDialog("Escreva algo:");
            JOptionPane.showMessageDialog(null, msg);
        });
        
        frame.getContentPane().setLayout(layout);
        
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);
        frame.getContentPane().add(button5);
        
    }
    
    public static void createFlowLayoutWindow(JFrame frame){
        FlowLayout layout = new FlowLayout();
        
        JButton button1 = new JButton("Botão 1");
        JButton button2 = new JButton("Botão 2");
        JButton button3 = new JButton("Botão 3");
        JButton button4 = new JButton("Botão 4");
        JButton button5 = new JButton("Botão 5");
        
        
        frame.setLayout(layout);
        
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);
        frame.getContentPane().add(button5);
        
    }

    
    
    public static void createBorderLayoutWindow(JFrame frame){
        JButton button1 = new JButton("Botão 1");
        JButton button2 = new JButton("Botão 2");
        JButton button3 = new JButton("Botão 3");
        JButton button4 = new JButton("Botão 4");
        JButton button5 = new JButton("Botão 5");
        
        frame.getContentPane().add(button1, BorderLayout.PAGE_START);
        frame.getContentPane().add(button2, BorderLayout.CENTER);
        frame.getContentPane().add(button3, BorderLayout.LINE_START);
        frame.getContentPane().add(button4, BorderLayout.LINE_END);
        frame.getContentPane().add(button5, BorderLayout.PAGE_END);
        
    }
    
    public static void createDefaultWindow(JFrame frame){
        JButton button1 = new JButton("Botão 1");
        JButton button2 = new JButton("Botão 2");
        
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        
        button1.addActionListener(evt -> JOptionPane.showMessageDialog(frame, "Clicou no botão!"));
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela de exemplo");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        //createDefaultWindow(frame);
        //createBorderLayoutWindow(frame);
        //createFlowLayoutWindow(frame);
        createGridLayoutWindow(frame);
        
        frame.setVisible(true);
        
        
        
    }
    
}
