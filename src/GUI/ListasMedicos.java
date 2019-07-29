package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import Dep.Medico;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListasMedicos extends JFrame {

	private DefaultTableModel modelo;
	int cont=0;
    public ListasMedicos() {
        initComponents();
        DisenoTabla();
        imprimirDatos();
    }
    public void DisenoTabla(){
    	String data[][]={};
    	String col[]={"Especialidad","Nombre","Apellidos","Consultorio"};
    	modelo=new DefaultTableModel(data,col);
    	datos.setModel(modelo);
    }
    public void imprimirDatos(){
    	Medico medi;
    	for(int i=0;i<regMedico.contenedor.size();i++){
    		medi=(Medico) regMedico.contenedor.get(i);
    		modelo.insertRow(cont, new Object[]{});
    		modelo.setValueAt(medi.getEspecialidad(), cont, 0);
    		modelo.setValueAt(medi.getNombre(), cont, 1);
    		modelo.setValueAt(medi.getApellidos(), cont, 2);
    		modelo.setValueAt(medi.getNumeroConsultorio(), cont, 3);

    	}
    }
    
    private void initComponents() {

        datosMedico = new JScrollPane();
        datos = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        datos.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        	}
        ));
        datosMedico.setViewportView(datos);
        
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
        			.addContainerGap(13, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(datosMedico, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(botonRegresar)
        					.addGap(155))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(datosMedico, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
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

    private javax.swing.JScrollPane datosMedico;
    private javax.swing.JTable datos;

}
