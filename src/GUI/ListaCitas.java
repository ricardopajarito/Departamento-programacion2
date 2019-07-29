package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import Dep.Cita;

import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaCitas extends JFrame {

	private DefaultTableModel modelo;
	int cont=0;
    public ListaCitas() {
        initComponents();
        DisenoTabla();
        imprimirDatos();
    }
    public void DisenoTabla(){
    	String data[][]={};
    	String col[]={"Codigo Médico","Servicio","Fecha","DNI","Nombre","Apellidos","Numero Historia","Sexo"};
    	modelo=new DefaultTableModel(data,col);
    	datosPa.setModel(modelo);
    }
    public void imprimirDatos(){
    	Cita cita;
    	for(int i=0;i<regCita.contenedorCita.size();i++){
    		cita=(Cita) regCita.contenedorCita.get(i);
    		modelo.insertRow(cont, new Object[]{});
    		modelo.setValueAt(cita.getCodOctor(), cont, 0);
       		modelo.setValueAt(cita.getTipoServicio(), cont, 1);
       		modelo.setValueAt(cita.getFecha(), cont, 2);
    		modelo.setValueAt(cita.getDNI(), cont, 3);
    		modelo.setValueAt(cita.getNombre(), cont, 4);
    		modelo.setValueAt(cita.getApellidos(), cont, 5);
    		modelo.setValueAt(cita.getNumeroHistoria(), cont, 6);
    		modelo.setValueAt(cita.getSexo(), cont, 7);
 
 

    	}
    }
    
    private void initComponents() {

        tablaPaciente = new JScrollPane();
        datosPa = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        datosPa.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        	}
        ));
        tablaPaciente.setViewportView(datosPa);
        
        JButton botonRegresar = new JButton("Regresar al men\u00FA principal");
        botonRegresar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		Primera regresar=new Primera();
        		regresar.setVisible(true);
        		dispose();
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(botonRegresar)
        					.addGap(556))
        				.addComponent(tablaPaciente, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 799, GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(tablaPaciente, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(botonRegresar))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListasMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListasMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListasMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListasMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListasMedicos().setVisible(true);
            }
        });
    }

    private javax.swing.JScrollPane tablaPaciente;
    private javax.swing.JTable datosPa;

}