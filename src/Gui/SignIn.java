package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Bus.UserBus;
import Model.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SignIn extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPass;
	
	private ArrayList<User> dsUser = new ArrayList<User>();
	private UserBus userBus = new UserBus();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng Nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(243, 10, 91, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(29, 74, 70, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mật khẩu");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(29, 131, 70, 22);
		contentPane.add(lblNewLabel_1_1);
		
		txtName = new JTextField();
		txtName.setBounds(125, 62, 330, 35);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(125, 127, 330, 35);
		contentPane.add(txtPass);
		
		JButton btnDN = new JButton("Đăng Nhập");
		btnDN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txtName.getText();
				String passWord = txtPass.getText();
				
				if (userBus.DangNhap(userName, passWord) == 1) {
					Main frame = new Main();
					frame.setVisible(true);
					
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Thong tin khong hop le");
				}
				
			}
		});
		btnDN.setBounds(125, 185, 107, 35);
		contentPane.add(btnDN);
		
		JButton btnDK = new JButton("Đăng Ký");
		btnDK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp frame = new SignUp();
				frame.setVisible(true);
				
				dispose();
				
			}
		});
		btnDK.setBounds(348, 192, 107, 35);
		contentPane.add(btnDK);
	}

}
