package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class PanelPedido extends JPanel {

	private JButton botonPedido;
	private VistaAccederAltaPedido vistaAccederAltaPedido = new VistaAccederAltaPedido();
	private VistaAccederBuscarPedido vistaAccederPedido = new VistaAccederBuscarPedido();
	private JLabel lblPedidos;
	private JPanel panelPedido;

	public PanelPedido() {
		setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		botonPedido = new JButton("");
		panel.add(botonPedido);
		lblPedidos = new JLabel("PEDIDOS");
		lblPedidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblPedidos, BorderLayout.SOUTH);
	}

	public JLabel getLblPedidos() {
		return lblPedidos;
	}

	public VistaEjecutarAltaPedido getVistaEjecutarAltaPedido() {
		return vistaAccederAltaPedido.getVistaEjecutarAltaPedido();
	}

	public JPanel getPanelPedido() {
		return panelPedido;
	}

	public JButton getBtnConsultarPedidos() {
		return vistaAccederPedido.getBtnConsultarPedidos();
	}

	public JButton getBtnAccederAltaPedido() {
		return vistaAccederAltaPedido.getBtnAccederAltaPedido();
	}

	public JButton getBotonPedido() {
		return botonPedido;
	}

	public VistaAccederAltaPedido getVistaAccederAltaPedido() {
		return vistaAccederAltaPedido;
	}

	public VistaAccederBuscarPedido getVistaAccederPedido() {
		return vistaAccederPedido;
	}

	public VistaEjecutarBuscarPedido getVistaEjecutarBuscarPedido() {
		return vistaAccederPedido.getVistaEjecutarBuscarPedido();
	}

	public JTextField getTextField() {
		return vistaAccederPedido.getTextField();
	}

	public DefaultTableModel getModeloTablaPedido() {
		return vistaAccederPedido.getModeloTablaPedido();
	}
}