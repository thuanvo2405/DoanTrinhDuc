package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Bus.*;
import Model.*;
import Gui.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private ArrayList<User> dsUser = new ArrayList<User>();
	private UserBus userBus = new UserBus();
	private ArrayList<Transactions> dsTransaction = new ArrayList<Transactions>();
	private TransactionsBus transactionBus = new TransactionsBus();
	private ArrayList<Notifications> dsNotification = new ArrayList<Notifications>();
	private NotificationsBus notificationBus = new NotificationsBus();
	private ArrayList<Budgets> dsBudget = new ArrayList<Budgets>();
	private BudgetsBus budgetBus = new BudgetsBus();
	private ArrayList<Categories> dsCategories = new ArrayList<Categories>();
	private CategoriesBus categoriesBus = new CategoriesBus();
	private JTextField txtUserName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private static User s = SignIn.getAllInfoUser();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main(s);
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
	public Main(User s) {
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
		
		JLabel lblNewLabel_2 = new JLabel("So Du");
		lblNewLabel_2.setBounds(10, 44, 45, 13);
		panel_3.add(lblNewLabel_2);
		
		JPanel pnMain = new JPanel();
		pnMain.setBackground(Color.GRAY);
		pnMain.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnMain.setBounds(257, 10, 544, 444);
		contentPane.add(pnMain);
		pnMain.setLayout(new CardLayout(0, 0));
		
		
		JPanel Main1 = new JPanel();
		pnMain.add(Main1, "name_8383096916900");
		Main1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Số dư hiện tại");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 10, 110, 25);
		Main1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tổng thu nhập");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 45, 110, 25);
		Main1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tổng chi tiêu");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(10, 80, 110, 25);
		Main1.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(130, 11, 259, 25);
		Main1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 49, 259, 25);
		Main1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 84, 259, 25);
		Main1.add(textField_2);
		
		JPanel Main2 = new JPanel();
		Main2.setBackground(Color.CYAN);
		pnMain.add(Main2, "name_8383126257700");
		Main2.setLayout(new CardLayout(0, 0));
		
		JPanel Main3 = new JPanel();
		Main3.setBackground(Color.GREEN);
		pnMain.add(Main3, "name_8383153282300");
		
		JPanel Main4 = new JPanel();
		Main4.setBackground(Color.RED);
		pnMain.add(Main4, "name_8383180548300");
		
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
		
		txtUserName = new JTextField();
		txtUserName.setText(s.getUsername().toUpperCase());
		txtUserName.setBackground(Color.BLACK);
		txtUserName.setEnabled(false);
		txtUserName.setBounds(10, 10, 197, 19);
		panel_3.add(txtUserName);
		txtUserName.setColumns(10);
		
		JButton btnNewButton = new JButton("Tổng Quan Tài Chính");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnMain.removeAll();
				pnMain.add(Main1);
				pnMain.repaint();
				pnMain.revalidate();
			}
		});
		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 89, 217, 36);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Chi Tiêu/ Thu Nhập");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnMain.removeAll();
				pnMain.add(Main2);
				pnMain.repaint();
				pnMain.revalidate();
			}
		});
		
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1.setBounds(10, 135, 217, 36);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Quản Lý Danh Mục");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnMain.removeAll();
				pnMain.add(Main3);
				pnMain.repaint();
				pnMain.revalidate();
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1_1.setBounds(10, 181, 217, 36);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Báo Cáo Phân Tích\r\n");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnMain.removeAll();
				pnMain.add(Main4);
				pnMain.repaint();
				pnMain.revalidate();
			}
		});
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1_1_1.setBounds(10, 227, 217, 36);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Thiết lập ngân sách\r\n");
		btnNewButton_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1_1_1_1.setBounds(10, 273, 217, 36);
		panel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Thoát");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn frame = new SignIn();
				frame.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_1_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1_1_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1_1_1_1_1.setBounds(10, 319, 217, 36);
		panel.add(btnNewButton_1_1_1_1_1);
		
	}
}
