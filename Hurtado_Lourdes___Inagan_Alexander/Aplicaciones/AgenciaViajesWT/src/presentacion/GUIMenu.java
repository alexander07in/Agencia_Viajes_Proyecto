/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import utilidades.Utilidades;
//import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica_negocio.GestorClientes;

/**
 *
 * @author libardo
 */
public class GUIMenu extends javax.swing.JFrame {

    private final String cargo;
    /**
     * Creates new form GUIMenu
     * @param cargo
     */
    public GUIMenu(String cargo) {
        initComponents();
        this.cargo = cargo;
        //Poner el icono de la aplicación
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/recursos/logo.png");
        fijarPrivilegios();
    }

    /**
     * Segun el cargo del usuario, le muestra las funciones que puede realizar
     */
    private void fijarPrivilegios() {
        
        String cargo_usuario = cargo;
        if(cargo_usuario.equals("ADMINISTRADOR"))
        {
            this.mnuOpciones.setVisible(true);
            this.mnuInformes.setVisible(true);
            this.mnuConfiguracion.setVisible(true);
            this.mnuGestionUsuarios.setVisible(true);
            this.mnuAyuda.setVisible(true);
        }
        
        if(cargo_usuario.equals("USUARIO"))
        {
            this.mnuOpciones.setVisible(true);
            this.mnuInformes.setVisible(false);
            this.mnuConfiguracion.setVisible(false);
            this.mnuGestionUsuarios.setVisible(false);
            this.mnuAyuda.setVisible(true);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskEscritorio = new javax.swing.JDesktopPane();
        jMenuBarra = new javax.swing.JMenuBar();
        mnuOpciones = new javax.swing.JMenu();
        mnuPaquetesPersonalizados = new javax.swing.JMenuItem();
        jSeparatorPperso_Ptodo = new javax.swing.JPopupMenu.Separator();
        mnuPaquetesTodoIncluido = new javax.swing.JMenuItem();
        jSeparatorPtodo_gestioCli = new javax.swing.JPopupMenu.Separator();
        jmnuGestionarClientes = new javax.swing.JMenuItem();
        jSeparatorgestioCli_Sali = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        mnuInformes = new javax.swing.JMenu();
        mnuIngresosSesiones = new javax.swing.JMenuItem();
        mnuConfiguracion = new javax.swing.JMenu();
        mnuConfiguracionTarifas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuAgentes = new javax.swing.JMenuItem();
        btnInicializar = new javax.swing.JMenuItem();
        mnuUsuariosSistema = new javax.swing.JMenuItem();
        mnuGestionUsuarios = new javax.swing.JMenu();
        jmnuGestionarUsuario = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de Parqueadero");

        jMenuBarra.setBackground(new java.awt.Color(157, 197, 244));
        jMenuBarra.setPreferredSize(new java.awt.Dimension(353, 28));

        mnuOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mnuOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/herramienta-de-trabajo-de-ajustes.png"))); // NOI18N
        mnuOpciones.setText("Opciones");
        mnuOpciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnuPaquetesPersonalizados.setText("Paquetes Personalizados");
        mnuPaquetesPersonalizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPaquetesPersonalizadosActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuPaquetesPersonalizados);
        mnuOpciones.add(jSeparatorPperso_Ptodo);

        mnuPaquetesTodoIncluido.setText("Paquetes todo incluido");
        mnuPaquetesTodoIncluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPaquetesTodoIncluidoActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuPaquetesTodoIncluido);
        mnuOpciones.add(jSeparatorPtodo_gestioCli);

        jmnuGestionarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cliente.png"))); // NOI18N
        jmnuGestionarClientes.setText("Gestionar Clientes");
        jmnuGestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuGestionarClientesActionPerformed(evt);
            }
        });
        mnuOpciones.add(jmnuGestionarClientes);
        mnuOpciones.add(jSeparatorgestioCli_Sali);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuSalir);

        jMenuBarra.add(mnuOpciones);

        mnuInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/apoyar.png"))); // NOI18N
        mnuInformes.setText("Informes");
        mnuInformes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnuIngresosSesiones.setText("Intentos de Sesiones");
        mnuIngresosSesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresosSesionesActionPerformed(evt);
            }
        });
        mnuInformes.add(mnuIngresosSesiones);

        jMenuBarra.add(mnuInformes);

        mnuConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ajustes.png"))); // NOI18N
        mnuConfiguracion.setText("Configuracion");

        mnuConfiguracionTarifas.setText("Configuración de Tarifas");
        mnuConfiguracionTarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConfiguracionTarifasActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuConfiguracionTarifas);
        mnuConfiguracion.add(jSeparator2);

        mnuAgentes.setText("Agentes de viaje");
        mnuAgentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgentesActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuAgentes);

        btnInicializar.setText("Inicializar datos");
        btnInicializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicializarActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(btnInicializar);

        mnuUsuariosSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/usuarios-multiples-en-silueta.png"))); // NOI18N
        mnuUsuariosSistema.setText("Usuarios del sistema");
        mnuConfiguracion.add(mnuUsuariosSistema);

        jMenuBarra.add(mnuConfiguracion);

        mnuGestionUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/usuario-hombre.png"))); // NOI18N
        mnuGestionUsuarios.setText("Usuarios");
        mnuGestionUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jmnuGestionarUsuario.setBackground(new java.awt.Color(63, 217, 136));
        jmnuGestionarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuGestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/usuarios-multiples-en-silueta.png"))); // NOI18N
        jmnuGestionarUsuario.setText("Gestionar Usuarios");
        jmnuGestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuGestionarUsuarioActionPerformed(evt);
            }
        });
        mnuGestionUsuarios.add(jmnuGestionarUsuario);

        jMenuBarra.add(mnuGestionUsuarios);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/boton-redondo-de-ayuda.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");

        mnuAcercaDe.setText("Acerca de");
        mnuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAcercaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAcercaDe);

        jMenuBarra.add(mnuAyuda);

        setJMenuBar(jMenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAcercaDeActionPerformed
        // TODO add your handling code here:
        String str = "Agencia de viajes demo \n"
        + "Version 0.1 - Julio 6 de 2019 \n"
        + "Universidad del Cauca";
        Utilidades.mensajeExito(str, "Acerca De");
    }//GEN-LAST:event_mnuAcercaDeActionPerformed

    private void btnInicializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicializarActionPerformed
        Utilidades.mensajeAdvertencia("En construcción....", "Atención");
    }//GEN-LAST:event_btnInicializarActionPerformed

    private void mnuAgentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgentesActionPerformed
        Utilidades.mensajeAdvertencia("En construcción....", "Atención");
    }//GEN-LAST:event_mnuAgentesActionPerformed

    private void mnuConfiguracionTarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConfiguracionTarifasActionPerformed

        Utilidades.mensajeAdvertencia("En construcción....", "Atención");
    }//GEN-LAST:event_mnuConfiguracionTarifasActionPerformed

    private void mnuIngresosSesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresosSesionesActionPerformed
       try {
            GUISesiones vistaSesiones = new GUISesiones();
            vistaSesiones.setVisible(true);
            vistaSesiones.setMaximizable(true);
            
            dskEscritorio.add(vistaSesiones);
            vistaSesiones.show();
            vistaSesiones.setMaximum(true);
  
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mnuIngresosSesionesActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void jmnuGestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuGestionarClientesActionPerformed
        try {
            GUIClientesAgencia vistaClientes = new GUIClientesAgencia();
            vistaClientes.setVisible(true);
            vistaClientes.setMaximizable(true);
            
            dskEscritorio.add(vistaClientes);
            vistaClientes.show();
            vistaClientes.setMaximum(true);
  
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jmnuGestionarClientesActionPerformed

    private void mnuPaquetesTodoIncluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPaquetesTodoIncluidoActionPerformed
        // TODO add your handling code here:
        GUIPaquetesTodoIncluido ins = new GUIPaquetesTodoIncluido();
        ins.setMaximizable(true);

        dskEscritorio.add(ins);
        ins.show();
    }//GEN-LAST:event_mnuPaquetesTodoIncluidoActionPerformed

    private void mnuPaquetesPersonalizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPaquetesPersonalizadosActionPerformed
        GUIPaquetesPersonalizados ins = new GUIPaquetesPersonalizados();
        ins.setMaximizable(true);

        dskEscritorio.add(ins);
        ins.show();
    }//GEN-LAST:event_mnuPaquetesPersonalizadosActionPerformed

    private void jmnuGestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuGestionarUsuarioActionPerformed
        try {
            GUIUsuarios vistaUsuario = new GUIUsuarios();
            vistaUsuario.setVisible(true);
            vistaUsuario.setMaximizable(true);
            
            dskEscritorio.add(vistaUsuario);
            vistaUsuario.show();
            vistaUsuario.setMaximum(true);
  
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmnuGestionarUsuarioActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                GUIMenu ins = new GUIMenu();
//                ins.setExtendedState(MAXIMIZED_BOTH);
//                ins.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnInicializar;
    private javax.swing.JDesktopPane dskEscritorio;
    private javax.swing.JMenuBar jMenuBarra;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparatorPperso_Ptodo;
    private javax.swing.JPopupMenu.Separator jSeparatorPtodo_gestioCli;
    private javax.swing.JPopupMenu.Separator jSeparatorgestioCli_Sali;
    private javax.swing.JMenuItem jmnuGestionarClientes;
    private javax.swing.JMenuItem jmnuGestionarUsuario;
    private javax.swing.JMenuItem mnuAcercaDe;
    private javax.swing.JMenuItem mnuAgentes;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuConfiguracion;
    private javax.swing.JMenuItem mnuConfiguracionTarifas;
    private javax.swing.JMenu mnuGestionUsuarios;
    private javax.swing.JMenu mnuInformes;
    private javax.swing.JMenuItem mnuIngresosSesiones;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenuItem mnuPaquetesPersonalizados;
    private javax.swing.JMenuItem mnuPaquetesTodoIncluido;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuUsuariosSistema;
    // End of variables declaration//GEN-END:variables

}