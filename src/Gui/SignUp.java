package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

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

public class SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Name;
	private JTextField Email;
	private JTextField Password;
	
	private ArrayList<User> dsUser = new ArrayList<User>();
	private UserBus userBus = new UserBus();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng Ký");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(239, 10, 77, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(37, 61, 43, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(37, 117, 43, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mật khẩu");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(37, 175, 77, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		Name = new JTextField();
		Name.setBounds(138, 58, 319, 29);
		contentPane.add(Name);
		Name.setColumns(10);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(138, 119, 319, 29);
		contentPane.add(Email);
		
		Password = new JTextField();
		Password.setColumns(10);
		Password.setBounds(138, 177, 319, 29);
		contentPane.add(Password);
		
		JButton btnDangKy = new JButton("Đăng Ký");
		btnDangKy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = Name.getText();
				String email = Email.getText();
				String passWord = Password.getText();
				
				int result = userBus.DangKy(userName, email, passWord);
				if(result == 1) {
	            	JOptionPane.showMessageDialog(null, "Đăng ký thành công");
	            	SignIn frame = new SignIn();
					frame.setVisible(true);
					
					dispose();
	            }else {
	            	JOptionPane.showMessageDialog(null, "Đăng ký thất bại");
	            }
			}
		});
		btnDangKy.setBounds(138, 225, 110, 37);
		contentPane.add(btnDangKy);
		
		JButton btnDangNhap = new JButton("Đăng Nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn frame = new SignIn();
				frame.setVisible(true);
				
				dispose();
			}
		});
		btnDangNhap.setBounds(347, 229, 110, 37);
		contentPane.add(btnDangNhap);
	}
}
