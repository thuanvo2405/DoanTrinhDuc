package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 62, 237, 392);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 10, 217, 69);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ten Nguoi dung");
		lblNewLabel_1.setBounds(10, 10, 197, 24);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("So Du");
		lblNewLabel_2.setBounds(10, 44, 45, 13);
		panel_3.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Tổng Quan Tài Chính");
		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 89, 217, 36);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tổng Quan Tài Chính");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1.setBounds(10, 135, 217, 36);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Tổng Quan Tài Chính");
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1_1.setBounds(10, 181, 217, 36);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Tổng Quan Tài Chính");
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1_1_1.setBounds(10, 227, 217, 36);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Tổng Quan Tài Chính");
		btnNewButton_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1_1_1_1.setBounds(10, 273, 217, 36);
		panel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Tổng Quan Tài Chính");
		btnNewButton_1_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1_1_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1_1_1_1_1.setBounds(10, 319, 217, 36);
		panel.add(btnNewButton_1_1_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(257, 10, 544, 444);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(10, 10, 237, 52);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Phần mềm quản lý chi tiêu");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 10, 217, 32);
		panel_2.add(lblNewLabel);
	}
}
