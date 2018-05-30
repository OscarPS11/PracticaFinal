package acciones;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import control.Logica;
import control.Puente;

public class RegistrarCliente implements ActionListener{
	private Puente puente;
	
	public RegistrarCliente(Puente puente) {
		super();
		this.puente = puente;
	}

	public void actionPerformed(ActionEvent e) {
		puente.getPanelCliente().remove(puente.getPanelCliente().getLblClientes());
		puente.getPanelCliente().remove(puente.getPanelCliente().getPanel());
		puente.getPanelCliente().setLayout(new GridLayout(2, 1, 0, 0));
		puente.getPanelCliente().add(puente.getVistaAccederAltaCliente());
		puente.getPanelCliente().add(puente.getVistaAccederBuscarCliente());
		puente.repaint();
		puente.revalidate();
	}
}