package Team4_Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

public class Sugang extends JFrame {
	JButton f1, f2, f3, f4, f5;
	JTextArea jt;
	
	public Sugang() {
		setTitle("������û");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color = new Color(140,252,100,100);
		
		Container c2 = getContentPane();
		c2.setBackground(Color.BLUE);
		c2.setLayout(new FlowLayout());
		
		Container c = getContentPane();
		c.setBackground(color);
		c.setLayout(new FlowLayout());
		
	    jt = new JTextArea(40,65);
		c2.add(jt);
		
		JMenuBar m = new JMenuBar();
		
		f1 = new JButton("����� ���� ����������");
		f1.setFont(new Font("�޸հ��ü", Font.BOLD, 17));
		m.add(f1);
		
		f2 = new JButton("�����Է�");
		f2.setFont(new Font("�޸հ��ü", Font.BOLD, 17));
		m.add(f2);
		
		f3 = new JButton("��������");
		f3.setFont(new Font("�޸հ��ü", Font.BOLD, 17));
		m.add(f3);
		
		f4 = new JButton("����� ��û �������");
		f4.setFont(new Font("�޸հ��ü", Font.BOLD, 17));
		m.add(f4);
		
		f5 = new JButton("�ð�ǥ");
		f5.setFont(new Font("�޸հ��ü", Font.BOLD, 17));
		m.add(f5);
		
		c.add(m);
		
		setSize(730, 800);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Sugang frame = new Sugang();
	}
}