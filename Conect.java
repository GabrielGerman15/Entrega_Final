package trabajo_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.io.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conect {

	private JFrame conect;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDni;
	private JTextField textCuit;
	private JTextField textTelefono;
	private JTextField textEmail;
	private JTextField textDireccion;
	private JTextField textAltura;
	private JTextField textCodigo_Postal;
	Intermediario uri = new Intermediario();
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conect window = new Conect();
					window.conect.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Conect() {
		initialize();
	}

	private void initialize() {
		conect = new JFrame();
		conect.setTitle("INCOME");
		conect.setBounds(100, 100, 872, 532);
		conect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("236px"), ColumnSpec.decode("49px:grow"),
						FormSpecs.LABEL_COMPONENT_GAP_COLSPEC, ColumnSpec.decode("46px"),
						FormSpecs.LABEL_COMPONENT_GAP_COLSPEC, ColumnSpec.decode("46px"),
						FormSpecs.LABEL_COMPONENT_GAP_COLSPEC, ColumnSpec.decode("46px"), },
				new RowSpec[] { FormSpecs.UNRELATED_GAP_ROWSPEC, RowSpec.decode("20px"), FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, }));

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(lblNewLabel, "2, 2, left, top");

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(lblNewLabel_1, "1, 6, right, center");

		textNombre = new JTextField();
		contentPane.add(textNombre, "2, 6, fill, default");
		textNombre.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Apellido");
		contentPane.add(lblNewLabel_2, "1, 8, right, center");

		textApellido = new JTextField();
		contentPane.add(textApellido, "2, 8, fill, default");
		textApellido.setColumns(10);

		JLabel lblNewLabel_2_1 = new JLabel("DNI");
		contentPane.add(lblNewLabel_2_1, "1, 10, right, default");

		textDni = new JTextField();
		contentPane.add(textDni, "2, 10, fill, default");
		textDni.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("CUIT");
		contentPane.add(lblNewLabel_1_1, "1, 12, right, default");

		textCuit = new JTextField();
		contentPane.add(textCuit, "2, 12, fill, default");
		textCuit.setColumns(10);

		JLabel lblNewLabel_1_2 = new JLabel("Telefono");
		contentPane.add(lblNewLabel_1_2, "1, 14, right, default");

		textTelefono = new JTextField();
		contentPane.add(textTelefono, "2, 14, fill, default");
		textTelefono.setColumns(10);

		JLabel lblNewLabel_1_3 = new JLabel("Email");
		contentPane.add(lblNewLabel_1_3, "1, 16, right, center");

		textEmail = new JTextField();
		contentPane.add(textEmail, "2, 16, fill, default");
		textEmail.setColumns(10);

		JLabel lblNewLabel_1_4 = new JLabel("Direcciom");
		contentPane.add(lblNewLabel_1_4, "1, 18, right, default");

		textDireccion = new JTextField();
		contentPane.add(textDireccion, "2, 18, fill, default");
		textDireccion.setColumns(10);

		JLabel lblNewLabel_1_5 = new JLabel("Altura");
		contentPane.add(lblNewLabel_1_5, "1, 20, right, default");

		textAltura = new JTextField();
		contentPane.add(textAltura, "2, 20, fill, default");
		textAltura.setColumns(10);

		JLabel lblNewLabel_1_6 = new JLabel("Codigo Postal");
		contentPane.add(lblNewLabel_1_6, "1, 22, right, default");

		textCodigo_Postal = new JTextField();
		contentPane.add(textCodigo_Postal, "2, 22, fill, default");
		textCodigo_Postal.setColumns(10);

		JButton btnNewButton = new JButton("AGREGAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					uri.setNombre(textNombre.getText());
					uri.setApellido(textApellido.getText());
					uri.setDni(Integer.parseInt(textDni.getText()));
					uri.setCuit(Integer.parseInt(textCuit.getText()));
					uri.setTelefono(Integer.parseInt(textTelefono.getText()));
					uri.setEmail(textEmail.getText());
					uri.setDireccion(textDireccion.getText());
					uri.setAltura(Integer.parseInt(textAltura.getText()));
					uri.setCodigo_postal(textCodigo_Postal.getText());

					if (uri.Agregar()) {
						JOptionPane.showInternalMessageDialog(null, "Se agregó correctamente");

					} else {
						JOptionPane.showInternalMessageDialog(null, "Se agregó correctamente");
					}

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton, "1, 26");

		JButton btnNewButton_1 = new JButton("EDITAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que desea Eliminar"));
					uri.setId_usuario(id);

					uri.setNombre(textNombre.getText());
					uri.setApellido(textApellido.getText());
					uri.setDni(Integer.parseInt(textDni.getText()));
					uri.setCuit(Integer.parseInt(textCuit.getText()));
					uri.setTelefono(Integer.parseInt(textTelefono.getText()));
					uri.setEmail(textEmail.getText());
					uri.setDireccion(textDireccion.getText());
					uri.setAltura(Integer.parseInt(textAltura.getText()));
					uri.setCodigo_postal(textCodigo_Postal.getText());

					if (uri.Editar()) {
						JOptionPane.showInternalMessageDialog(null, "Se editó correctamente");

					} else {
						JOptionPane.showInternalMessageDialog(null, "Se editó correctamente");
					}

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton_1, "1, 28");

		JButton btnNewButton_2 = new JButton("BUSCAR");
		btnNewButton_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del dato que desea Buscar: "));

					uri.setId_usuario(id);

					if (uri.Buscar()) {
						textNombre.setText(uri.getNombre());
						textApellido.setText(uri.getNombre());
						textDni.setText("" + uri.getDni());
						textCuit.setText("" + uri.getCuit());
						textTelefono.setText("" + uri.getTelefono());
						textEmail.setText(uri.getEmail());
						textDireccion.setText(uri.getDireccion());
						textAltura.setText("" + uri.getAltura());
						textCodigo_Postal.setText(uri.getCodigo_postal());

						JOptionPane.showInternalMessageDialog(null, "Se buscó correctamente");

					} else {
						JOptionPane.showInternalMessageDialog(null, "Se buscó correctamente");
					}

				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton_2, "1, 30");

		JButton btnNewButton_3 = new JButton("ELIMINAR");
		btnNewButton_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que desea Eliminar"));
					uri.setId_usuario(id);

					if (uri.Agregar()) {
						JOptionPane.showInternalMessageDialog(null, "Se eliminó correctamente");

					} else {
						JOptionPane.showInternalMessageDialog(null, "Se eliminó correctamente");
					}

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton_3, "1, 32");

		JButton btnNewButton_4 = new JButton("LIMPIAR");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				limpiar();

			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton_4, "1, 34");

		JButton btnNewButton_5 = new JButton("SALIR");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		contentPane.add(btnNewButton_5, "1, 36");
	}

	private void setContentPane(JPanel contentPane2) {

	}

	public void limpiar() {

		textNombre.setText(null);
		textApellido.setText(null);
		textDni.setText(null);
		textCuit.setText(null);
		textTelefono.setText(null);
		textEmail.setText(null);
		textDireccion.setText(null);
		textAltura.setText(null);
		textCodigo_Postal.setText(null);

	}

}