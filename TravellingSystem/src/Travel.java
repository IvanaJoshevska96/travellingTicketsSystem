import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Travel {

	protected static final String String = null;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travel window = new Travel();
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
	public Travel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(0, 0, 1000,630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(223, 29, 510, 58);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Travelling Ticket System");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(142, 120, 143, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard Class");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(25, 171, 164, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnEconomyClass = new JRadioButton("Economy Class");
		rdbtnEconomyClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnEconomyClass.setBounds(25, 218, 143, 23);
		frame.getContentPane().add(rdbtnEconomyClass);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnFirstClass.setBounds(25, 265, 109, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Single Ticket");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(223, 171, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Return Ticket");
		rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1_1.setBounds(223, 228, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Adult");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(394, 171, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Child\r\n\r\n");
		rdbtnNewRadioButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1_2.setBounds(394, 228, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 99, 1284, 10);
		frame.getContentPane().add(separator);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Skopje", "Ohrid", "Belgrade", "Sofia", "Ljubljana"}));
		comboBox.setBounds(233, 277, 136, 22);
		frame.getContentPane().add(comboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 154, 503, 10);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 336, 503, 10);
		frame.getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tax\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(62, 385, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("SubTotal");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(66, 428, 68, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Total");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(62, 469, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setBounds(144, 376, 100, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			double tax=20.50;
			double milesK8=25.79;
			double milesK12=25.10;
			double milesK20=45.78;
			double milesK30=56.89;
			double totalCost,eco=3.86, first=6.78;
//ona way standard class Skopje
		if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
	
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK12);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
	//child
		if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
//economy class
		if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
	//child
		if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
//first class
if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK30);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
	//child
		if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK20);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
		//return skopje

				if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
			
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK12*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("One");
					textField_6.setText("No");	
				}
			//child
				if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK8*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("No");
					textField_6.setText("One");	
				}
		//economy class
				if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK8*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("One");
					textField_6.setText("No");	
				}
			//child
				if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK8*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("No");
					textField_6.setText("One");	
				}
		//first class
		if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK30*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("One");
					textField_6.setText("No");	
				}
			//child
				if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Skopje"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK20*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("No");
					textField_6.setText("One");	
				}
				
//return standard

		if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK12*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
		//child
if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
//economy class
if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK8*1.5);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("One");
	textField_6.setText("No");	
}
		//child
if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK8*1.5);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("No");
	textField_6.setText("One");	
}
//first class
if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK30*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
		//child
		if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK20*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
		
		//one way ohrid
		//standard
				if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK12);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("One");
					textField_6.setText("No");	
				}
				//child
		if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK8);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("No");
					textField_6.setText("One");	
				}
		//economy class
		if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
				//child
		if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
		//first class
		if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK30);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("One");
					textField_6.setText("No");	
				}
				//child
				if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ohrid"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK20);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("No");
					textField_6.setText("One");	
				}
//one way
//standard		
if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK12);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
			//child
if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK8);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("No");
	textField_6.setText("One");	
}

//economy class
if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK8);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("One");
	textField_6.setText("No");	
}
			//child
if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){

totalCost=(tax * milesK8)/100;
String sTax=String.format("€%.2f", totalCost);
textField.setText(sTax);
String subTotal=String.format("€%.2f", milesK8);
textField_1.setText(subTotal);
String total=String.format("€%.2f",milesK8+totalCost);
textField_2.setText(total);
textField_12.setText(total);
textField_3.setText("Standard");
textField_4.setText("One Way");
textField_5.setText("No");
textField_6.setText("One");	
}
//first class
if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK30);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
			//child
		if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK20);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
		//return way belgrade
		//standard		
		if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK12*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("One");
					textField_6.setText("No");	
				}
					//child
		if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}

		//economy class
		if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
					//child
		if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){

		totalCost=(tax * milesK8)/100;
		String sTax=String.format("€%.2f", totalCost);
		textField.setText(sTax);
		String subTotal=String.format("€%.2f", milesK8*1.5);
		textField_1.setText(subTotal);
		String total=String.format("€%.2f",milesK8+totalCost);
		textField_2.setText(total);
		textField_12.setText(total);
		textField_3.setText("Standard");
		textField_4.setText("One Way");
		textField_5.setText("No");
		textField_6.setText("One");	
		}
		//first class
		if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK30*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("One");
					textField_6.setText("No");	
				}
					//child
				if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Belgrade"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK20*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("No");
					textField_6.setText("One");	
				}

		
		
//one way ljubljana		
//standard class
if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK12);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("One");
	textField_6.setText("No");	
}	
			//child
if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK8);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("No");
	textField_6.setText("One");	
}

//economy class
if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK8);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("One");
	textField_6.setText("No");	
}	
			//child
if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK8);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("No");
	textField_6.setText("One");	
}
//first class
if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK30);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
			//child
		if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK20);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
		
		
		//return way ljubljana	
		//standard class
		if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK12*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}	
					//child
		if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}

		//economy class
		if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}	
					//child
		if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
		//first class
		if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK30*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("One");
					textField_6.setText("No");	
				}
					//child
				if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Ljubljana"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK20*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("No");
					textField_6.setText("One");	
				}
		
		
		
		
	//one way	
//standard class
if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK12);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("One");
	textField_6.setText("No");	
}
			//child
if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK8);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("No");
	textField_6.setText("One");	
}
//economy class
if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK8);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("One");
	textField_6.setText("No");	
}
			//child
if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
	
	totalCost=(tax * milesK8)/100;
	String sTax=String.format("€%.2f", totalCost);
	textField.setText(sTax);
	String subTotal=String.format("€%.2f", milesK8);
	textField_1.setText(subTotal);
	String total=String.format("€%.2f",milesK8+totalCost);
	textField_2.setText(total);
	textField_12.setText(total);
	textField_3.setText("Standard");
	textField_4.setText("One Way");
	textField_5.setText("No");
	textField_6.setText("One");	
}
				
//first class
if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK30);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
			//child
		if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK20);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}	
		
		//return way sofia
		//standard class
		if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK12*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
					//child
		if((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
		//economy class
		if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("One");
			textField_6.setText("No");	
		}
					//child
		if((rdbtnEconomyClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
			
			totalCost=(tax * milesK8)/100;
			String sTax=String.format("€%.2f", totalCost);
			textField.setText(sTax);
			String subTotal=String.format("€%.2f", milesK8*1.5);
			textField_1.setText(subTotal);
			String total=String.format("€%.2f",milesK8+totalCost);
			textField_2.setText(total);
			textField_12.setText(total);
			textField_3.setText("Standard");
			textField_4.setText("One Way");
			textField_5.setText("No");
			textField_6.setText("One");	
		}
						
		//first class
		if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK30*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("One");
					textField_6.setText("No");	
				}
					//child
				if((rdbtnFirstClass.isSelected()) && (rdbtnNewRadioButton_1_1.isSelected()) && (rdbtnNewRadioButton_1_2.isSelected()) && (comboBox.getSelectedItem().equals("Sofia"))){
					
					totalCost=(tax * milesK8)/100;
					String sTax=String.format("€%.2f", totalCost);
					textField.setText(sTax);
					String subTotal=String.format("€%.2f", milesK20*1.5);
					textField_1.setText(subTotal);
					String total=String.format("€%.2f",milesK8+totalCost);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("Standard");
					textField_4.setText("One Way");
					textField_5.setText("No");
					textField_6.setText("One");	
				}			
						
					}
				});
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//time
						Calendar timer=Calendar.getInstance();
						timer.getTime();
						SimpleDateFormat timeFormat=new SimpleDateFormat("hh:mm:ss");
						textField_10.setText(timeFormat.format(timer.getTime()));
						//date
						SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
						textField_9.setText(dateFormat.format(timer.getTime()));
						
						textField_7.setText("Skopje *");
						textField_8.setText((String) comboBox.getSelectedItem()+" *");
						
						//random number
						int num;
						String str="";
						Random rnd=new Random();
						num=rnd.nextInt()*(1000000 - 10000+1)+10000;
						str += num + 1234;
						textField_11.setText(str);
						textField_13.setText("ANY"); 
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//time
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat timeFormat=new SimpleDateFormat("hh:mm:ss");
				textField_10.setText(timeFormat.format(timer.getTime()));
				//date
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
				textField_9.setText(dateFormat.format(timer.getTime()));
				
				textField_7.setText("Skopje *");
				textField_8.setText((String) comboBox.getSelectedItem()+" *");
				
				//random number
				int num;
				String str="";
				Random rnd=new Random();
				num=rnd.nextInt()*(1000000 - 10000+1)+10000;
				str += num + 1234;
				textField_11.setText(str);
				textField_13.setText("ANY");  
				
				
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(315, 371, 109, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				rdbtnNewRadioButton.setSelected(false);
				rdbtnEconomyClass.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_1_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnNewRadioButton_1_2.setSelected(false);
				comboBox.setSelectedItem("Destination");
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setBounds(315, 434, 109, 43);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Ticketing Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
				
				
				
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExit.setBounds(335, 526, 68, 22);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(504, 98, 21, 563);
		frame.getContentPane().add(separator_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 423, 100, 36);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 468, 100, 36);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Class\r\n");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3.setBounds(552, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Ticket\r\n");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3_1.setBounds(656, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Adult\r\n");
		lblNewLabel_2_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3_2.setBounds(778, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Child");
		lblNewLabel_2_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3_2_1.setBounds(890, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(530, 154, 100, 36);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(640, 154, 100, 36);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(750, 154, 100, 36);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(860, 154, 100, 36);
		frame.getContentPane().add(textField_6);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(504, 201, 480, 10);
		frame.getContentPane().add(separator_1_2);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("From\r\n");
		lblNewLabel_2_3_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3_3.setBounds(524, 237, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3_3);
		
		JLabel lblNewLabel_2_3_3_1 = new JLabel("To");
		lblNewLabel_2_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3_3_1.setBounds(524, 301, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3_3_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(750, 201, 20, 460);
		frame.getContentPane().add(separator_3);
		
		JLabel lblNewLabel_2_3_3_2 = new JLabel("Date");
		lblNewLabel_2_3_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3_3_2.setBounds(524, 370, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3_3_2);
		
		JLabel lblNewLabel_2_3_3_3 = new JLabel("Time");
		lblNewLabel_2_3_3_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3_3_3.setBounds(524, 434, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3_3_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(602, 221, 100, 36);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(602, 280, 100, 36);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(602, 348, 100, 36);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(602, 408, 100, 36);
		frame.getContentPane().add(textField_10);
		
		JLabel lblNewLabel_2_3_3_4 = new JLabel("Ticket No\r\n");
		lblNewLabel_2_3_3_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3_3_4.setBounds(804, 239, 74, 14);
		frame.getContentPane().add(lblNewLabel_2_3_3_4);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(778, 280, 100, 36);
		frame.getContentPane().add(textField_11);
		
		JLabel lblNewLabel_2_3_3_4_1 = new JLabel("Price");
		lblNewLabel_2_3_3_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3_3_4_1.setBounds(804, 359, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3_3_4_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(778, 395, 100, 36);
		frame.getContentPane().add(textField_12);
		
		JLabel lblNewLabel_2_3_3_4_1_1 = new JLabel("Route");
		lblNewLabel_2_3_3_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3_3_4_1_1.setBounds(804, 471, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3_3_4_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(778, 521, 100, 36);
		frame.getContentPane().add(textField_13);
	}
}
