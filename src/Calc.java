import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calc {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 331, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBackground(new Color(255, 255, 255));
		textField.setEditable(false);
		textField.setBounds(10, 11, 295, 75);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bt_7 = new JButton("7");
		bt_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + bt_7.getText();
				textField.setText(number);
			}
		});
		bt_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_7.setBounds(10, 97, 65, 54);
		frame.getContentPane().add(bt_7);
		
		JButton bt_8 = new JButton("8");
		bt_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + bt_8.getText();
				textField.setText(number);
			}
		});
		bt_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_8.setBounds(85, 97, 65, 54);
		frame.getContentPane().add(bt_8);
		
		JButton bt_9 = new JButton("9");
		bt_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + bt_9.getText();
				textField.setText(number);
			}
		});
		bt_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_9.setBounds(160, 97, 65, 54);
		frame.getContentPane().add(bt_9);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(240, 97, 65, 54);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton bt_4 = new JButton("4");
		bt_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + bt_4.getText();
				textField.setText(number);
			}
		});
		bt_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_4.setBounds(10, 162, 65, 54);
		frame.getContentPane().add(bt_4);
		
		JButton bt_5 = new JButton("5");
		bt_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + bt_5.getText();
				textField.setText(number);
			}
		});
		bt_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_5.setBounds(85, 162, 65, 54);
		frame.getContentPane().add(bt_5);
		
		JButton bt_6 = new JButton("6");
		bt_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + bt_6.getText();
				textField.setText(number);
			}
		});
		bt_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_6.setBounds(160, 162, 65, 54);
		frame.getContentPane().add(bt_6);
		
		JButton bt_2 = new JButton("2");
		bt_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + bt_2.getText();
				textField.setText(number);
			}
		});
		bt_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_2.setBounds(85, 227, 65, 54);
		frame.getContentPane().add(bt_2);
		
		JButton bt_1 = new JButton("1");
		bt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + bt_1.getText();
				textField.setText(number);
			}
		});
		bt_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_1.setBounds(10, 227, 65, 54);
		frame.getContentPane().add(bt_1);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnX.setBounds(240, 162, 65, 54);
		frame.getContentPane().add(btnX);
		
		JButton bt_3 = new JButton("3");
		bt_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + bt_3.getText();
				textField.setText(number);
			}
		});
		bt_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_3.setBounds(160, 227, 65, 54);
		frame.getContentPane().add(bt_3);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_11.setBounds(240, 227, 65, 54);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton bt_0 = new JButton("0");
		bt_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + bt_0.getText();
				textField.setText(number);
			}
		});
		bt_0.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_0.setBounds(10, 292, 215, 54);
		frame.getContentPane().add(bt_0);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_15.setBounds(240, 292, 65, 54);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton bt_Clear = new JButton("C");
		bt_Clear.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_Clear.setBounds(10, 357, 65, 54);
		frame.getContentPane().add(bt_Clear);
		
		JButton bt_result = new JButton("=");
		bt_result.setFont(new Font("Tahoma", Font.BOLD, 18));
		bt_result.setBounds(85, 357, 220, 54);
		frame.getContentPane().add(bt_result);
	}
}
