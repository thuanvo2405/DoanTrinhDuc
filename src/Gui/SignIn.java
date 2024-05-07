package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Bus.UserBus;
import Model.User;
import Utils.Utils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class SignIn extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField txtName;
	private static JTextField txtPass;
	
	private ArrayList<User> dsUser = new ArrayList<User>();
	private UserBus userBus = new UserBus();
	private static User s;
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
					s = getAllInfoUser();
					Main frame = new Main(s);
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
	public static User getAllInfoUser() {
		String email = txtName.getText().toString();
		String passWord = txtPass.getText().toString();
		User temp = null;
		
        String query = "SELECT * FROM users where email = '" + email + "' and password_hash = '" + passWord + "'";

        try (Connection conn =  DriverManager.getConnection(Utils.DB_URL, Utils.USER, Utils.PASS);
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs =  pstmt.executeQuery()) {
            
            if (rs.next()) {
                int usrs_id = rs.getInt("user_id");
                String username = (rs.getString("username"));
                String emailsub = (rs.getString("email"));
                String password = (rs.getString("password_hash"));
                Date created_at = (rs.getDate("created_at"));
                Date last_login = (rs.getDate("last_login"));
                temp = new User(usrs_id, password, username, emailsub, created_at, last_login);
            }
        }catch(Exception e) {
        	e.printStackTrace();
        }
		return temp;
	}
}
