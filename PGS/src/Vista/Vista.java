package Vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import Controlador.Controlador;
import java.awt.Font;
import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {

    public Vista(Controlador c) {
        this.control = c;
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/Imagen/icon.png")).getImage();
        setIconImage(icon);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);        
        //this.setSize(screenSize);
        this.setResizable(false);
        
        grupo_sexo.add(rb_masculino);
        grupo_sexo.add(rb_femenino1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_sexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_inicio = new javax.swing.JPanel();
        jl_bienvenido = new javax.swing.JLabel();
        jl_imagen_bienvenido = new javax.swing.JLabel();
        jl_PGS = new javax.swing.JLabel();
        panel_registro_cliente = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        jbRegistrarCliente = new javax.swing.JButton();
        jbDesactivarCliente = new javax.swing.JButton();
        jbEditarCliente = new javax.swing.JButton();
        panel_datos = new javax.swing.JScrollPane();
        jLApellidos = new javax.swing.JPanel();
        panel_padecimientos = new javax.swing.JPanel();
        jCheckPMareoVomito = new javax.swing.JCheckBox();
        jCheckRecMedica = new javax.swing.JCheckBox();
        jCheckPostEmb = new javax.swing.JCheckBox();
        jCheckPEspalda = new javax.swing.JCheckBox();
        jCheckMusArtNer = new javax.swing.JCheckBox();
        jTFTiempoPEmb = new javax.swing.JTextField();
        jTFLesion = new javax.swing.JTextField();
        jCheckBox8 = new javax.swing.JCheckBox();
        jTFHernia = new javax.swing.JTextField();
        jCheckPVista = new javax.swing.JCheckBox();
        jCheckMCaracter = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jCheckPRespiratorio = new javax.swing.JCheckBox();
        jCheckObeso = new javax.swing.JCheckBox();
        jCheckPAudio = new javax.swing.JCheckBox();
        jCheckPColitis = new javax.swing.JCheckBox();
        jCheckPresion = new javax.swing.JCheckBox();
        jTFQuebradura = new javax.swing.JTextField();
        jCheckGastritis = new javax.swing.JCheckBox();
        jCheckEmbarazo = new javax.swing.JCheckBox();
        jTFDiscapacidad = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jCheckActFisica = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jTFEnfCronica = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAOtro = new javax.swing.JTextArea();
        jCheckFuma = new javax.swing.JCheckBox();
        jCheckRehab = new javax.swing.JCheckBox();
        jCheckDiabetes = new javax.swing.JCheckBox();
        jCheckColesterol = new javax.swing.JCheckBox();
        jTFPresion = new javax.swing.JTextField();
        jCheckCirujia = new javax.swing.JCheckBox();
        jTFTiempoEmb = new javax.swing.JTextField();
        jCheckPEmo = new javax.swing.JCheckBox();
        jCheckHistFam = new javax.swing.JCheckBox();
        jTFPMuscOtro = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLPadecimientos = new javax.swing.JLabel();
        jCheckDiscapacidad = new javax.swing.JCheckBox();
        panel_datos_personales = new javax.swing.JPanel();
        jLTelCelular = new javax.swing.JLabel();
        jLTelTrabajo = new javax.swing.JLabel();
        jLMail = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jTFTelHabitacion = new javax.swing.JTextField();
        jTFTelCelular = new javax.swing.JTextField();
        jTFTelTrabajo = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jLFechaNac = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLOcupacion = new javax.swing.JLabel();
        jLTel = new javax.swing.JLabel();
        jLTelHabitacion = new javax.swing.JLabel();
        jLDatosPersonales = new javax.swing.JLabel();
        jDFecha_Nacimiento = new datechooser.beans.DateChooserCombo();
        jTFMail = new javax.swing.JTextField();
        panel_estado = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jCheckSExc = new javax.swing.JCheckBox();
        jCheckSMBueno = new javax.swing.JCheckBox();
        jCheckSRegular = new javax.swing.JCheckBox();
        jCheckSMalo = new javax.swing.JCheckBox();
        jCheckSPesimo = new javax.swing.JCheckBox();
        jCheckSBueno = new javax.swing.JCheckBox();
        jCheckSMMalo = new javax.swing.JCheckBox();
        jCheckCExc = new javax.swing.JCheckBox();
        jCheckCMBueno = new javax.swing.JCheckBox();
        jCheckCBueno = new javax.swing.JCheckBox();
        jCheckCRegular = new javax.swing.JCheckBox();
        jCheckCMalo = new javax.swing.JCheckBox();
        jCheckCMMalo = new javax.swing.JCheckBox();
        jCheckCPesimo = new javax.swing.JCheckBox();
        panel_medico = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jRBYes = new javax.swing.JRadioButton();
        jRBNo = new javax.swing.JRadioButton();
        jTFTelEmergencia = new javax.swing.JTextField();
        jTFTipoSangre = new javax.swing.JTextField();
        jTFInfoMedico = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jBAddCliente = new javax.swing.JButton();
        desactivar_Cliente = new javax.swing.JPanel();
        cedCliente = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        panel_registro_rutinas = new javax.swing.JPanel();
        panel_menu1 = new javax.swing.JPanel();
        jB_editar_rutina = new javax.swing.JButton();
        jB_asignar_rutina = new javax.swing.JButton();
        jB_crear_rutina = new javax.swing.JButton();
        panel_datos1 = new javax.swing.JScrollPane();
        panel_crear_rutina = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        panel_registro_nutricional = new javax.swing.JPanel();
        panel_menu2 = new javax.swing.JPanel();
        btn_crear_perfil_Nutricional = new javax.swing.JButton();
        btn_asignar_pNutricional = new javax.swing.JButton();
        panel_datos4 = new javax.swing.JScrollPane();
        panel_crear_perfil_nutricional = new javax.swing.JPanel();
        jTFNombre2 = new javax.swing.JTextField();
        jLNombre2 = new javax.swing.JLabel();
        jLDatosPersonales2 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        rb_masculino = new javax.swing.JRadioButton();
        rb_femenino1 = new javax.swing.JRadioButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        panel_control_pagos = new javax.swing.JPanel();
        panel_menu3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        panel_seguimientos = new javax.swing.JPanel();
        label_cliente_seguimiento = new javax.swing.JLabel();
        combo_nombre_cliente_seguimiento = new javax.swing.JComboBox();
        label_fecha_seguimiento = new javax.swing.JLabel();
        panel_datos_seg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jb_actualizar_seguimiento = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        pane_reportes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Power Gym System");

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(783, 399));

        jl_bienvenido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jl_bienvenido.setText("Bienvenido ");

        jl_imagen_bienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo_pesa.png"))); // NOI18N

        jl_PGS.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jl_PGS.setText("Power Gym System");

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_PGS)
                    .addComponent(jl_imagen_bienvenido)
                    .addComponent(jl_bienvenido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_PGS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_bienvenido)
                .addGap(39, 39, 39)
                .addComponent(jl_imagen_bienvenido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", panel_inicio);

        panel_menu.setBackground(new java.awt.Color(0, 0, 0));

        jbRegistrarCliente.setText("Registro Personal del Cliente");
        jbRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarClienteActionPerformed(evt);
            }
        });

        jbDesactivarCliente.setText("Desactivar Cliente");
        jbDesactivarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesactivarClienteActionPerformed(evt);
            }
        });

        jbEditarCliente.setText("Editar Datos Cliente");
        jbEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jbRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jbEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jbDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        panel_datos.setBorder(null);

        jLApellidos.setVisible(false);

        jCheckPMareoVomito.setText("Mareos o Vomito");

        jCheckRecMedica.setText("Realiza deporte por recomendación médica");

        jCheckPostEmb.setText("Post-Embarazo (Tiempo)");

        jCheckPEspalda.setText("Problemas de espalda");

        jCheckMusArtNer.setText("Problemas musculares, articulares o nerviosos");

        jTFTiempoPEmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTiempoPEmbActionPerformed(evt);
            }
        });

        jCheckBox8.setText("Enfermedad Crónica");

        jCheckPVista.setText("Problema de vista");

        jCheckMCaracter.setText("Mal Carácter");

        jLabel30.setText("Lesiones. Cual Zona");

        jLabel31.setText("Otro");

        jCheckPRespiratorio.setText("Problemas Respiratorios");

        jCheckObeso.setText("Obesidad");

        jCheckPAudio.setText("Problema de audio");

        jCheckPColitis.setText("Problemas de Colitis");

        jCheckPresion.setText("Presión");

        jCheckGastritis.setText("Problema de Gastritis o Úlceras");

        jCheckEmbarazo.setText("Embarazo (Tiempo)");

        jLabel32.setText("Hernias. Donde");

        jCheckActFisica.setText("Dificultad con actividad física");

        jLabel33.setText("Otro");

        jTAOtro.setColumns(20);
        jTAOtro.setRows(5);
        jScrollPane2.setViewportView(jTAOtro);

        jCheckFuma.setText("Habitos de fumado");

        jCheckRehab.setText("Ingreso al gimnasio por rehabilitación");
        jCheckRehab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckRehabActionPerformed(evt);
            }
        });

        jCheckDiabetes.setText("Diabetes");

        jCheckColesterol.setText("Colesterol");

        jCheckCirujia.setText("Cirujía");

        jCheckPEmo.setText("Padecimiento Emocional o nervioso");

        jCheckHistFam.setText("Historial de problemas cardiacos en la familia");
        jCheckHistFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckHistFamActionPerformed(evt);
            }
        });

        jLabel34.setText("Quebraduras. Localización");

        jLPadecimientos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLPadecimientos.setText("Padecimientos");

        jCheckDiscapacidad.setText("Discapacidad");

        javax.swing.GroupLayout panel_padecimientosLayout = new javax.swing.GroupLayout(panel_padecimientos);
        panel_padecimientos.setLayout(panel_padecimientosLayout);
        panel_padecimientosLayout.setHorizontalGroup(
            panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_padecimientosLayout.createSequentialGroup()
                .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_padecimientosLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckPEspalda)
                            .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jCheckHistFam)
                                        .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                            .addComponent(jCheckPresion)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFPresion))
                                        .addComponent(jCheckActFisica)
                                        .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                            .addComponent(jCheckDiscapacidad)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFDiscapacidad))
                                        .addComponent(jCheckRehab)
                                        .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                            .addComponent(jCheckBox8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFEnfCronica))
                                        .addComponent(jCheckRecMedica)
                                        .addComponent(jCheckMusArtNer)
                                        .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                                    .addComponent(jLabel31)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTFPMuscOtro))
                                                .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                                    .addComponent(jLabel32)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTFHernia))
                                                .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                                    .addComponent(jLabel34)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTFQuebradura))
                                                .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                                    .addComponent(jLabel30)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTFLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jCheckPVista)
                                            .addComponent(jCheckPAudio))))
                                .addGap(48, 48, 48)
                                .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckPRespiratorio)
                                    .addComponent(jCheckCirujia)
                                    .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                        .addComponent(jCheckEmbarazo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFTiempoEmb, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                        .addComponent(jCheckPostEmb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFTiempoPEmb))
                                    .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckPEmo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckDiabetes)
                                        .addComponent(jCheckObeso)
                                        .addComponent(jCheckFuma)
                                        .addComponent(jCheckMCaracter)
                                        .addComponent(jCheckColesterol)
                                        .addComponent(jCheckGastritis))
                                    .addComponent(jCheckPColitis)
                                    .addComponent(jCheckPMareoVomito)
                                    .addGroup(panel_padecimientosLayout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panel_padecimientosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLPadecimientos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_padecimientosLayout.setVerticalGroup(
            panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_padecimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPadecimientos)
                .addGap(18, 18, 18)
                .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_padecimientosLayout.createSequentialGroup()
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckPresion)
                            .addComponent(jTFPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckHistFam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckActFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckDiscapacidad)
                            .addComponent(jTFDiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckPVista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckPAudio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckRehab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox8)
                            .addComponent(jTFEnfCronica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckRecMedica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckMusArtNer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jTFLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jTFQuebradura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jTFHernia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jTFPMuscOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckPEspalda))
                    .addGroup(panel_padecimientosLayout.createSequentialGroup()
                        .addComponent(jCheckCirujia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckEmbarazo)
                            .addComponent(jTFTiempoEmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckPostEmb)
                            .addComponent(jTFTiempoPEmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckPRespiratorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckDiabetes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckFuma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckObeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckPEmo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckMCaracter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckColesterol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckGastritis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckPColitis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckPMareoVomito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_padecimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLTelCelular.setText("Celular");

        jLTelTrabajo.setText("Trabajo");

        jLMail.setText("E-Mail");

        jTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActionPerformed(evt);
            }
        });

        jTFApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFApellidosActionPerformed(evt);
            }
        });

        jTFTelHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelHabitacionActionPerformed(evt);
            }
        });

        jLNombre.setText("Nombre");

        jLFechaNac.setText("Fecha de Nacimiento");

        jLDireccion.setText("Dirección");

        jLOcupacion.setText("Apellidos");

        jLTel.setText("Teléfonos");

        jLTelHabitacion.setText("Habitación");

        jLDatosPersonales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLDatosPersonales.setText("Datos Personales");

        try {
            jDFecha_Nacimiento.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }

        javax.swing.GroupLayout panel_datos_personalesLayout = new javax.swing.GroupLayout(panel_datos_personales);
        panel_datos_personales.setLayout(panel_datos_personalesLayout);
        panel_datos_personalesLayout.setHorizontalGroup(
            panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                        .addComponent(jLDatosPersonales)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_personalesLayout.createSequentialGroup()
                        .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                                .addComponent(jLFechaNac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDFecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_datos_personalesLayout.createSequentialGroup()
                                .addComponent(jLNombre)
                                .addGap(23, 23, 23)
                                .addComponent(jTFNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_datos_personalesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_datos_personalesLayout.createSequentialGroup()
                                .addComponent(jLOcupacion)
                                .addGap(18, 18, 18)
                                .addComponent(jTFApellidos)))
                        .addGap(27, 27, 27)
                        .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                                .addComponent(jLTel)
                                .addGap(18, 18, 18)
                                .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTelHabitacion)
                                    .addComponent(jLTelCelular)
                                    .addComponent(jLTelTrabajo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFTelHabitacion)
                                    .addComponent(jTFTelCelular)
                                    .addComponent(jTFTelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                                .addComponent(jLMail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        panel_datos_personalesLayout.setVerticalGroup(
            panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLDatosPersonales)
                .addGap(18, 18, 18)
                .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                        .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTel)
                            .addComponent(jLTelHabitacion)
                            .addComponent(jTFTelHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelCelular)
                            .addComponent(jTFTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelTrabajo)
                            .addComponent(jTFTelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                        .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLOcupacion)
                            .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                        .addComponent(jLFechaNac)
                        .addGap(33, 33, 33)
                        .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDireccion)
                            .addComponent(jLMail)
                            .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDFecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jLDatosPersonales.setFont(new Font("Serif", Font.PLAIN, 18));

        jLabel35.setText("Estado de Salud Actual");

        jLabel36.setText("Condición Física Actual");

        jCheckSExc.setText("Excelente");

        jCheckSMBueno.setText("Muy Bueno");

        jCheckSRegular.setText("Regular");

        jCheckSMalo.setText("Malo");

        jCheckSPesimo.setText("Pesimo");

        jCheckSBueno.setText("Bueno");

        jCheckSMMalo.setText("Muy Malo");

        jCheckCExc.setText("Excelente");

        jCheckCMBueno.setText("Muy Bueno");

        jCheckCBueno.setText("Bueno");

        jCheckCRegular.setText("Regular");

        jCheckCMalo.setText("Malo");

        jCheckCMMalo.setText("Muy Malo");

        jCheckCPesimo.setText("Pesimo");

        javax.swing.GroupLayout panel_estadoLayout = new javax.swing.GroupLayout(panel_estado);
        panel_estado.setLayout(panel_estadoLayout);
        panel_estadoLayout.setHorizontalGroup(
            panel_estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_estadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_estadoLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckSExc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckSMBueno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckSBueno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckSRegular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckSMalo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckSMMalo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckSPesimo))
                    .addGroup(panel_estadoLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckCExc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckCMBueno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckCBueno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckCRegular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckCMalo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckCMMalo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckCPesimo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_estadoLayout.setVerticalGroup(
            panel_estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_estadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jCheckSExc)
                    .addComponent(jCheckSMBueno)
                    .addComponent(jCheckSRegular)
                    .addComponent(jCheckSMalo)
                    .addComponent(jCheckSPesimo)
                    .addComponent(jCheckSMMalo)
                    .addComponent(jCheckSBueno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckCExc)
                        .addComponent(jCheckCMBueno)
                        .addComponent(jCheckCRegular)
                        .addComponent(jCheckCMalo)
                        .addComponent(jCheckCPesimo)
                        .addComponent(jCheckCMMalo)
                        .addComponent(jCheckCBueno))
                    .addComponent(jLabel36))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel37.setText("Tipo de sangre");

        jLabel38.setText("Teléfono en caso de emergencia");

        jLabel39.setText("Sabe su médico si esta realizando alguna actividad aeróbica o anaeróbica");

        jLabel40.setText("Información de su médico");

        jRBYes.setText("Si");
        jRBYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYesActionPerformed(evt);
            }
        });

        jRBNo.setText("No");

        jLabel41.setText("Al dar click en agregar se da por entendido que el cliente exime al al gimnasio Power Time de responsabilidad alguna. ");

        jBAddCliente.setText("Agregar Cliente");
        jBAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_medicoLayout = new javax.swing.GroupLayout(panel_medico);
        panel_medico.setLayout(panel_medicoLayout);
        panel_medicoLayout.setHorizontalGroup(
            panel_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_medicoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panel_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_medicoLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_medicoLayout.createSequentialGroup()
                        .addGroup(panel_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_medicoLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRBYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBNo))
                            .addGroup(panel_medicoLayout.createSequentialGroup()
                                .addGroup(panel_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panel_medicoLayout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFTipoSangre))
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel_medicoLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFInfoMedico)))
                        .addGap(94, 94, 94))))
            .addGroup(panel_medicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAddCliente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_medicoLayout.setVerticalGroup(
            panel_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_medicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTFTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTFTelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jRBYes)
                    .addComponent(jRBNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTFInfoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jBAddCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLApellidosLayout = new javax.swing.GroupLayout(jLApellidos);
        jLApellidos.setLayout(jLApellidosLayout);
        jLApellidosLayout.setHorizontalGroup(
            jLApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLApellidosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_datos_personales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_padecimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_medico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jLApellidosLayout.setVerticalGroup(
            jLApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLApellidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_datos_personales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(panel_padecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(panel_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_datos.setViewportView(jLApellidos);

        desactivar_Cliente.setVisible(false);

        cedCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedClienteActionPerformed(evt);
            }
        });

        jButton10.setText("Desactivar Cliente");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel51.setText("Cedula del Cliente:");

        javax.swing.GroupLayout desactivar_ClienteLayout = new javax.swing.GroupLayout(desactivar_Cliente);
        desactivar_Cliente.setLayout(desactivar_ClienteLayout);
        desactivar_ClienteLayout.setHorizontalGroup(
            desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(18, 18, 18)
                        .addComponent(cedCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton10))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        desactivar_ClienteLayout.setVerticalGroup(
            desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desactivar_ClienteLayout.createSequentialGroup()
                        .addComponent(cedCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jButton10)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_registro_clienteLayout = new javax.swing.GroupLayout(panel_registro_cliente);
        panel_registro_cliente.setLayout(panel_registro_clienteLayout);
        panel_registro_clienteLayout.setHorizontalGroup(
            panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registro_clienteLayout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registro_clienteLayout.createSequentialGroup()
                    .addGap(415, 415, 415)
                    .addComponent(desactivar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panel_registro_clienteLayout.setVerticalGroup(
            panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
            .addGroup(panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registro_clienteLayout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(desactivar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(216, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Registro del Cliente", panel_registro_cliente);

        panel_menu1.setBackground(new java.awt.Color(0, 0, 0));

        jB_editar_rutina.setText("Editar Rutina");
        jB_editar_rutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_editar_rutinaActionPerformed(evt);
            }
        });

        jB_asignar_rutina.setText("Asignar Rutina");
        jB_asignar_rutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_asignar_rutinaActionPerformed(evt);
            }
        });

        jB_crear_rutina.setText("Crear Rutina");
        jB_crear_rutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_crear_rutinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menu1Layout = new javax.swing.GroupLayout(panel_menu1);
        panel_menu1.setLayout(panel_menu1Layout);
        panel_menu1Layout.setHorizontalGroup(
            panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu1Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_crear_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_asignar_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_editar_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        panel_menu1Layout.setVerticalGroup(
            panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jB_crear_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jB_asignar_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jB_editar_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        panel_datos1.setBorder(null);

        panel_crear_rutina.setVisible(false);

        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Elevacion de Talones", null, null, null},
                {"Pantorillas de Sentado", null, null, null},
                {"Pantorillas en Maquina Press", null, null, null},
                {"Pantorilla con Mancuerna", null, null, null}
            },
            new String [] {
                "Ejercicio", "Serie", "Repeticion", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(jTable1);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Piernas");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Pantorillas");

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Extension de piernas", null, null, null},
                {"Sentadillas", null, null, null},
                {"Hat Squat", null, null, null},
                {"Flexion de Piernas", null, null, null},
                {"Buenos dias barra", null, null, null},
                {"Sentadillas por delante", null, null, null},
                {"Desplante", null, null, null},
                {"Abductores", null, null, null}
            },
            new String [] {
                "Ejercicio", "Serie", "Repeticion", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setText("Biceps");

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Curl de Muñeca con Barra", null, null, null},
                {"Curl Dorsal con Barra", null, null, null},
                {"Curl de Muñecas por detras con barra", null, null, null},
                {"Rollos", null, null, null}
            },
            new String [] {
                "Ejercicio", "Serie", "Repeticion", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Triceps");

        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Curl con barra", null, null, null},
                {"Curl con Mancuerna", null, null, null},
                {"Curl Scott", null, null, null},
                {"Curl Scott Mancuerna", null, null, null},
                {"Curl Concentrado", null, null, null},
                {"Curl Estilo 21", null, null, null},
                {"Curl con Cable", null, null, null}
            },
            new String [] {
                "Ejercicio", "Serie", "Repeticion", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable4);

        jLabel44.setText("Nombre de la Rutina:");

        jLabel45.setText("Codigo de la Rutina:");

        jScrollPane6.setViewportView(jTextPane1);

        jScrollPane7.setViewportView(jTextPane2);

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setText("Antebrazo");

        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Flexion con Barra", null, null, null},
                {"Flexion con Mancuerna", null, null, null},
                {"Flexion estilo Copa", null, null, null},
                {"Press francés con barra", null, null, null},
                {"Patada Tricep", null, null, null},
                {"Polea Tricep", null, null, null}
            },
            new String [] {
                "Ejercicio", "Serie", "Repeticion", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable5);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("Hombros");

        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Press militar por delante", null, null, null},
                {"Press militar por detras", null, null, null},
                {"Press militar barra", null, null, null},
                {"Press militar estilo Arnold", null, null, null},
                {"Laterales con mancuernas", null, null, null},
                {"Lateral inclinados", null, null, null},
                {"Lateral a una mano con mancuerna", null, null, null},
                {"Mancuernas al frente", null, null, null},
                {"Barra al frente", null, null, null},
                {"Mancuernas atras", null, null, null}
            },
            new String [] {
                "Ejercicio", "Serie", "Repeticion", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable6);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48.setText("Pecho");

        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Press de banca", null, null, null},
                {"Press inclinado con barra", null, null, null},
                {"Press declinado con barra", null, null, null},
                {"Press declinado con mancuernas", null, null, null},
                {"Voladoras", null, null, null},
                {"Voladoras Inclinadas", null, null, null},
                {"Pull Over con Barra", null, null, null},
                {"Pull Over con mancuernas", null, null, null},
                {"Fondos Disco", null, null, null}
            },
            new String [] {
                "Ejercicio", "Serie", "Repeticion", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jTable7);

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setText("Espalda");

        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Polea por detrás", null, null, null},
                {"Polea por delante", null, null, null},
                {"Remo sentado con cable", null, null, null},
                {"Remo Fijo", null, null, null},
                {"Remo con barra fija", null, null, null},
                {"Buenos dias con barra", null, null, null},
                {"Remo con mancuernas", null, null, null},
                {"Barra fija", null, null, null},
                {"Rotaciones Olimpicas", null, null, null}
            },
            new String [] {
                "Ejercicio", "Serie", "Repeticion", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable8);

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setText("Trapecios");

        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Robin", null, null, null},
                {"Encogimientos barra por delante", null, null, null},
                {"Encogimientos con mancuernas", null, null, null},
                {"Encogimientos barra por detrás", null, null, null}
            },
            new String [] {
                "Ejercicio", "Serie", "Repeticion", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable9);

        jButton8.setText("Crear Rutina");

        javax.swing.GroupLayout panel_crear_rutinaLayout = new javax.swing.GroupLayout(panel_crear_rutina);
        panel_crear_rutina.setLayout(panel_crear_rutinaLayout);
        panel_crear_rutinaLayout.setHorizontalGroup(
            panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crear_rutinaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_crear_rutinaLayout.createSequentialGroup()
                            .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel44)
                                .addComponent(jLabel45))
                            .addGap(18, 18, 18)
                            .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(jScrollPane7)))
                        .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel46)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)))
                    .addComponent(jButton8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_crear_rutinaLayout.setVerticalGroup(
            panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crear_rutinaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(35, 35, 35)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_datos1.setViewportView(panel_crear_rutina);

        javax.swing.GroupLayout panel_registro_rutinasLayout = new javax.swing.GroupLayout(panel_registro_rutinas);
        panel_registro_rutinas.setLayout(panel_registro_rutinasLayout);
        panel_registro_rutinasLayout.setHorizontalGroup(
            panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registro_rutinasLayout.createSequentialGroup()
                .addComponent(panel_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panel_registro_rutinasLayout.setVerticalGroup(
            panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registro de Rutinas", panel_registro_rutinas);

        panel_menu2.setBackground(new java.awt.Color(0, 0, 0));

        btn_crear_perfil_Nutricional.setText("Crear Perfil Nutricional");
        btn_crear_perfil_Nutricional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_perfil_NutricionalActionPerformed(evt);
            }
        });

        btn_asignar_pNutricional.setText("Asignar Perfil Nutricional");
        btn_asignar_pNutricional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignar_pNutricionalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menu2Layout = new javax.swing.GroupLayout(panel_menu2);
        panel_menu2.setLayout(panel_menu2Layout);
        panel_menu2Layout.setHorizontalGroup(
            panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_asignar_pNutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear_perfil_Nutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_menu2Layout.setVerticalGroup(
            panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btn_crear_perfil_Nutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btn_asignar_pNutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_datos4.setBorder(null);

        panel_crear_perfil_nutricional.setVisible(true);

        jTFNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombre2ActionPerformed(evt);
            }
        });

        jLNombre2.setText("Nombre del Perfil");

        jLDatosPersonales2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLDatosPersonales2.setText("Perfil Nutricional");

        jLabel52.setText("Sexo");

        rb_masculino.setText("Masculino");
        rb_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_masculinoActionPerformed(evt);
            }
        });

        rb_femenino1.setText("Femenino");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Datos del Cliente");

        jLabel54.setText("Peso");

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jLabel55.setText("Kgs.");

        jLabel56.setText("Altura");

        jLabel57.setText("mts.");

        jLabel58.setText("% de Cal de Carbohidratos.");

        jLabel59.setText("%");

        jLabel60.setText("% de Cal de Proteinas.");

        jLabel64.setText("%");

        jLabel65.setText("% de Cal de Grasas.");

        jLabel66.setText("%");

        jButton11.setText("Crear Perfil Nutricional");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_crear_perfil_nutricionalLayout = new javax.swing.GroupLayout(panel_crear_perfil_nutricional);
        panel_crear_perfil_nutricional.setLayout(panel_crear_perfil_nutricionalLayout);
        panel_crear_perfil_nutricionalLayout.setHorizontalGroup(
            panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                        .addComponent(jLNombre2)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel53)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(43, 43, 43)
                        .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_femenino1)
                            .addComponent(rb_masculino))
                        .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel57))
                            .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel54)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel55))))
                    .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                        .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel64)
                            .addComponent(jLabel66)))
                    .addComponent(jButton11))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLDatosPersonales2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_crear_perfil_nutricionalLayout.setVerticalGroup(
            panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLDatosPersonales2)
                .addGap(38, 38, 38)
                .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre2)
                    .addComponent(jTFNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel53)
                .addGap(27, 27, 27)
                .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(rb_masculino)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel54))
                .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_femenino1))
                    .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57))))
                .addGap(30, 30, 30)
                .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(49, 49, 49)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLDatosPersonales.setFont(new Font("Serif", Font.PLAIN, 18));

        panel_datos4.setViewportView(panel_crear_perfil_nutricional);

        javax.swing.GroupLayout panel_registro_nutricionalLayout = new javax.swing.GroupLayout(panel_registro_nutricional);
        panel_registro_nutricional.setLayout(panel_registro_nutricionalLayout);
        panel_registro_nutricionalLayout.setHorizontalGroup(
            panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                .addComponent(panel_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_datos4)
                .addGap(0, 0, 0))
        );
        panel_registro_nutricionalLayout.setVerticalGroup(
            panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_datos4, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registro Nutricional", panel_registro_nutricional);

        panel_menu3.setBackground(new java.awt.Color(0, 0, 0));

        jButton6.setText("Ver Clientes Pedientes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menu3Layout = new javax.swing.GroupLayout(panel_menu3);
        panel_menu3.setLayout(panel_menu3Layout);
        panel_menu3Layout.setHorizontalGroup(
            panel_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );
        panel_menu3Layout.setVerticalGroup(
            panel_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Meses Pendientes", "Monto"
            }
        ));
        jScrollPane1.setViewportView(jTable10);

        jButton4.setText("Cencelar Monto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Lista de Clientes Pendientes de Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton4)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_control_pagosLayout = new javax.swing.GroupLayout(panel_control_pagos);
        panel_control_pagos.setLayout(panel_control_pagosLayout);
        panel_control_pagosLayout.setHorizontalGroup(
            panel_control_pagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_control_pagosLayout.createSequentialGroup()
                .addComponent(panel_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_control_pagosLayout.setVerticalGroup(
            panel_control_pagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_control_pagosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Control de Pagos", panel_control_pagos);

        label_cliente_seguimiento.setText("Nombre del cliente");

        combo_nombre_cliente_seguimiento.setModel(
            new DefaultComboBoxModel(new String[]{"cliente1", "cliente2"}/*control.getDAO().getClientes()*/)
        );

        label_fecha_seguimiento.setText("Fecha");

        panel_datos_seg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(5, 100, 152), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));

        jLabel1.setText("Brazo derecho");

        jLabel2.setText("Brazo Izquierdo");

        jLabel3.setText("Antebrazo Derecho");

        jLabel4.setText("Antebrazo Izquierdo");

        jLabel5.setText("Pecho");

        jLabel6.setText("Espalda");

        jLabel7.setText("Cadera");

        jLabel8.setText("Cintura");

        jLabel9.setText("Glúteos");

        jLabel10.setText("Pierna Derecha");

        jLabel11.setText("Pierna Izquierda");

        jLabel12.setText("Pantorrilla Izquierda");

        jLabel13.setText("Pantorrilla derecha");

        jLabel14.setText("Peso");

        jLabel15.setText("Grasa");

        jLabel16.setText("IMC");

        javax.swing.GroupLayout panel_datos_segLayout = new javax.swing.GroupLayout(panel_datos_seg);
        panel_datos_seg.setLayout(panel_datos_segLayout);
        panel_datos_segLayout.setHorizontalGroup(
            panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_segLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)))
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5)))
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(28, 28, 28)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(jTextField12)))
                            .addComponent(jLabel1)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        panel_datos_segLayout.setVerticalGroup(
            panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_segLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createSequentialGroup()
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel10)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_datos_segLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel13))
                        .addGroup(panel_datos_segLayout.createSequentialGroup()
                            .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jb_actualizar_seguimiento.setText("Actualizar Estado");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Seguimiento de Clientes");

        javax.swing.GroupLayout panel_seguimientosLayout = new javax.swing.GroupLayout(panel_seguimientos);
        panel_seguimientos.setLayout(panel_seguimientosLayout);
        panel_seguimientosLayout.setHorizontalGroup(
            panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_seguimientosLayout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addComponent(panel_datos_seg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
            .addGroup(panel_seguimientosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_seguimientosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_actualizar_seguimiento)
                    .addGroup(panel_seguimientosLayout.createSequentialGroup()
                        .addComponent(label_cliente_seguimiento)
                        .addGap(18, 18, 18)
                        .addComponent(combo_nombre_cliente_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(label_fecha_seguimiento)
                        .addGap(18, 18, 18)
                        .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_seguimientosLayout.setVerticalGroup(
            panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_seguimientosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel20)
                .addGap(34, 34, 34)
                .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_nombre_cliente_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_cliente_seguimiento)
                        .addComponent(label_fecha_seguimiento)))
                .addGap(38, 38, 38)
                .addComponent(panel_datos_seg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_actualizar_seguimiento)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Seguimientos", panel_seguimientos);

        javax.swing.GroupLayout pane_reportesLayout = new javax.swing.GroupLayout(pane_reportes);
        pane_reportes.setLayout(pane_reportesLayout);
        pane_reportesLayout.setHorizontalGroup(
            pane_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pane_reportesLayout.setVerticalGroup(
            pane_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reportes", pane_reportes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarClienteActionPerformed
        //desactivar_Cliente.setVisible(false);
        jLApellidos.setVisible(true);
        jLApellidos.paintComponents(jLApellidos.getGraphics());
    }//GEN-LAST:event_jbRegistrarClienteActionPerformed

    private void jbEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarClienteActionPerformed
        //desactivar_Cliente.setVisible(false);
        jLApellidos.setVisible(true);
        jLApellidos.paintComponents(jLApellidos.getGraphics());
        //cargar datos de registro del cliente
    }//GEN-LAST:event_jbEditarClienteActionPerformed

    private void btn_crear_perfil_NutricionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_perfil_NutricionalActionPerformed
        panel_crear_perfil_nutricional.setVisible(true);
        panel_crear_perfil_nutricional.paintComponents(panel_crear_perfil_nutricional.getGraphics());
    }//GEN-LAST:event_btn_crear_perfil_NutricionalActionPerformed

    private void btn_asignar_pNutricionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignar_pNutricionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_asignar_pNutricionalActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jB_crear_rutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_crear_rutinaActionPerformed
        panel_crear_rutina.setVisible(true);
        panel_crear_rutina.paintComponents(panel_crear_rutina.getGraphics());
    }//GEN-LAST:event_jB_crear_rutinaActionPerformed

    private void jB_editar_rutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_editar_rutinaActionPerformed
        panel_crear_rutina.setVisible(true);
        panel_crear_rutina.paintComponents(panel_crear_rutina.getGraphics());
    }//GEN-LAST:event_jB_editar_rutinaActionPerformed

    private void jbDesactivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesactivarClienteActionPerformed
       jLApellidos.setVisible(false);       
       desactivar_Cliente.setVisible(true);
       desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
    }//GEN-LAST:event_jbDesactivarClienteActionPerformed

    private void jTFTiempoPEmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTiempoPEmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTiempoPEmbActionPerformed

    private void jCheckRehabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckRehabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckRehabActionPerformed

    private void jCheckHistFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckHistFamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckHistFamActionPerformed

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jTFTelHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelHabitacionActionPerformed

    private void jRBYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYesActionPerformed

    private void jBAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddClienteActionPerformed

    }//GEN-LAST:event_jBAddClienteActionPerformed

    private void jB_asignar_rutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_asignar_rutinaActionPerformed
       //Pane para buscar numero de cedula...
    }//GEN-LAST:event_jB_asignar_rutinaActionPerformed

    private void cedClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedClienteActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTFNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombre2ActionPerformed

    private void rb_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_masculinoActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTFApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFApellidosActionPerformed

    public static void look() {
        try {//com.jtattoo.plaf.aluminium.AluminiumLookAndFeel
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
    }

    private Controlador control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asignar_pNutricional;
    private javax.swing.JButton btn_crear_perfil_Nutricional;
    private javax.swing.JTextField cedCliente;
    private javax.swing.JComboBox combo_nombre_cliente_seguimiento;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JPanel desactivar_Cliente;
    private javax.swing.ButtonGroup grupo_sexo;
    private javax.swing.JButton jBAddCliente;
    private javax.swing.JButton jB_asignar_rutina;
    private javax.swing.JButton jB_crear_rutina;
    private javax.swing.JButton jB_editar_rutina;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckActFisica;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckCBueno;
    private javax.swing.JCheckBox jCheckCExc;
    private javax.swing.JCheckBox jCheckCMBueno;
    private javax.swing.JCheckBox jCheckCMMalo;
    private javax.swing.JCheckBox jCheckCMalo;
    private javax.swing.JCheckBox jCheckCPesimo;
    private javax.swing.JCheckBox jCheckCRegular;
    private javax.swing.JCheckBox jCheckCirujia;
    private javax.swing.JCheckBox jCheckColesterol;
    private javax.swing.JCheckBox jCheckDiabetes;
    private javax.swing.JCheckBox jCheckDiscapacidad;
    private javax.swing.JCheckBox jCheckEmbarazo;
    private javax.swing.JCheckBox jCheckFuma;
    private javax.swing.JCheckBox jCheckGastritis;
    private javax.swing.JCheckBox jCheckHistFam;
    private javax.swing.JCheckBox jCheckMCaracter;
    private javax.swing.JCheckBox jCheckMusArtNer;
    private javax.swing.JCheckBox jCheckObeso;
    private javax.swing.JCheckBox jCheckPAudio;
    private javax.swing.JCheckBox jCheckPColitis;
    private javax.swing.JCheckBox jCheckPEmo;
    private javax.swing.JCheckBox jCheckPEspalda;
    private javax.swing.JCheckBox jCheckPMareoVomito;
    private javax.swing.JCheckBox jCheckPRespiratorio;
    private javax.swing.JCheckBox jCheckPVista;
    private javax.swing.JCheckBox jCheckPostEmb;
    private javax.swing.JCheckBox jCheckPresion;
    private javax.swing.JCheckBox jCheckRecMedica;
    private javax.swing.JCheckBox jCheckRehab;
    private javax.swing.JCheckBox jCheckSBueno;
    private javax.swing.JCheckBox jCheckSExc;
    private javax.swing.JCheckBox jCheckSMBueno;
    private javax.swing.JCheckBox jCheckSMMalo;
    private javax.swing.JCheckBox jCheckSMalo;
    private javax.swing.JCheckBox jCheckSPesimo;
    private javax.swing.JCheckBox jCheckSRegular;
    private datechooser.beans.DateChooserCombo jDFecha_Nacimiento;
    private javax.swing.JPanel jLApellidos;
    private javax.swing.JLabel jLDatosPersonales;
    private javax.swing.JLabel jLDatosPersonales2;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLFechaNac;
    private javax.swing.JLabel jLMail;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre2;
    private javax.swing.JLabel jLOcupacion;
    private javax.swing.JLabel jLPadecimientos;
    private javax.swing.JLabel jLTel;
    private javax.swing.JLabel jLTelCelular;
    private javax.swing.JLabel jLTelHabitacion;
    private javax.swing.JLabel jLTelTrabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBNo;
    private javax.swing.JRadioButton jRBYes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTAOtro;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFDiscapacidad;
    private javax.swing.JTextField jTFEnfCronica;
    private javax.swing.JTextField jTFHernia;
    private javax.swing.JTextField jTFInfoMedico;
    private javax.swing.JTextField jTFLesion;
    private javax.swing.JTextField jTFMail;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre2;
    private javax.swing.JTextField jTFPMuscOtro;
    private javax.swing.JTextField jTFPresion;
    private javax.swing.JTextField jTFQuebradura;
    private javax.swing.JTextField jTFTelCelular;
    private javax.swing.JTextField jTFTelEmergencia;
    private javax.swing.JTextField jTFTelHabitacion;
    private javax.swing.JTextField jTFTelTrabajo;
    private javax.swing.JTextField jTFTiempoEmb;
    private javax.swing.JTextField jTFTiempoPEmb;
    private javax.swing.JTextField jTFTipoSangre;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JButton jbDesactivarCliente;
    private javax.swing.JButton jbEditarCliente;
    private javax.swing.JButton jbRegistrarCliente;
    private javax.swing.JButton jb_actualizar_seguimiento;
    private javax.swing.JLabel jl_PGS;
    private javax.swing.JLabel jl_bienvenido;
    private javax.swing.JLabel jl_imagen_bienvenido;
    private javax.swing.JLabel label_cliente_seguimiento;
    private javax.swing.JLabel label_fecha_seguimiento;
    private javax.swing.JPanel pane_reportes;
    private javax.swing.JPanel panel_control_pagos;
    private javax.swing.JPanel panel_crear_perfil_nutricional;
    private javax.swing.JPanel panel_crear_rutina;
    private javax.swing.JScrollPane panel_datos;
    private javax.swing.JScrollPane panel_datos1;
    private javax.swing.JScrollPane panel_datos4;
    private javax.swing.JPanel panel_datos_personales;
    private javax.swing.JPanel panel_datos_seg;
    private javax.swing.JPanel panel_estado;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_medico;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_menu1;
    private javax.swing.JPanel panel_menu2;
    private javax.swing.JPanel panel_menu3;
    private javax.swing.JPanel panel_padecimientos;
    private javax.swing.JPanel panel_registro_cliente;
    private javax.swing.JPanel panel_registro_nutricional;
    private javax.swing.JPanel panel_registro_rutinas;
    private javax.swing.JPanel panel_seguimientos;
    private javax.swing.JRadioButton rb_femenino1;
    private javax.swing.JRadioButton rb_masculino;
    // End of variables declaration//GEN-END:variables
}
