package Vista;

import Vista.RegistroFisicoCliente;
import java.awt.Font;

public class IngresarCliente extends javax.swing.JFrame {

    public IngresarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckPRespiratorio = new javax.swing.JCheckBox();
        jCheckObeso = new javax.swing.JCheckBox();
        jCheckPAudio = new javax.swing.JCheckBox();
        jCheckPColitis = new javax.swing.JCheckBox();
        jCheckPresion = new javax.swing.JCheckBox();
        jTFQuebradura = new javax.swing.JTextField();
        jCheckGastritis = new javax.swing.JCheckBox();
        jCheckEmbarazo = new javax.swing.JCheckBox();
        jTFDiscapacidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckActFisica = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        jLPadecimientos = new javax.swing.JLabel();
        jCheckDiscapacidad = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLTelCelular = new javax.swing.JLabel();
        jLTelTrabajo = new javax.swing.JLabel();
        jLMail = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFFechaNac = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jTFOcupacion = new javax.swing.JTextField();
        jTFTelHabitacion = new javax.swing.JTextField();
        jTFTelCelular = new javax.swing.JTextField();
        jTFTelTrabajo = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jLFechaNac = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLOcupacion = new javax.swing.JLabel();
        jLTel = new javax.swing.JLabel();
        jLTelHabitacion = new javax.swing.JLabel();
        jTFMail = new javax.swing.JTextField();
        jLDatosPersonales = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRBYes = new javax.swing.JRadioButton();
        jRBNo = new javax.swing.JRadioButton();
        jTFTelEmergencia = new javax.swing.JTextField();
        jTFTipoSangre = new javax.swing.JTextField();
        jTFInfoMedico = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBAddCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setText("Lesiones. Cual Zona");

        jLabel4.setText("Otro");

        jCheckPRespiratorio.setText("Problemas Respiratorios");

        jCheckObeso.setText("Obesidad");

        jCheckPAudio.setText("Problema de audio");

        jCheckPColitis.setText("Problemas de Colitis");

        jCheckPresion.setText("Presión");

        jCheckGastritis.setText("Problema de Gastritis o Úlceras");

        jCheckEmbarazo.setText("Embarazo (Tiempo)");

        jLabel3.setText("Hernias. Donde");

        jCheckActFisica.setText("Dificultad con actividad física");

        jLabel5.setText("Otro");

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

        jLabel2.setText("Quebraduras. Localización");

        jLPadecimientos.setText("Padecimientos");

        jCheckDiscapacidad.setText("Discapacidad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckPEspalda)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckHistFam)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckPresion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFPresion))
                                .addComponent(jLPadecimientos)
                                .addComponent(jCheckActFisica)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckDiscapacidad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFDiscapacidad))
                                .addComponent(jCheckRehab)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFEnfCronica))
                                .addComponent(jCheckRecMedica)
                                .addComponent(jCheckMusArtNer)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFPMuscOtro))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFHernia))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFQuebradura))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckPVista)
                                    .addComponent(jCheckPAudio))))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckPRespiratorio)
                            .addComponent(jCheckCirujia)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckEmbarazo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTiempoEmb, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckPostEmb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTiempoPEmb))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckPEmo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckDiabetes)
                                .addComponent(jCheckObeso)
                                .addComponent(jCheckFuma)
                                .addComponent(jCheckMCaracter)
                                .addComponent(jCheckColesterol)
                                .addComponent(jCheckGastritis))
                            .addComponent(jCheckPColitis)
                            .addComponent(jCheckPMareoVomito)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPadecimientos)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckPresion)
                            .addComponent(jTFPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckHistFam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckActFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckDiscapacidad)
                            .addComponent(jTFDiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckPVista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckPAudio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckRehab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox8)
                            .addComponent(jTFEnfCronica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckRecMedica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckMusArtNer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFQuebradura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFHernia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFPMuscOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckPEspalda))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckCirujia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckEmbarazo)
                            .addComponent(jTFTiempoEmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
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

        jTFTelHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelHabitacionActionPerformed(evt);
            }
        });

        jLNombre.setText("Nombre");

        jLFechaNac.setText("Fecha de Nacimiento");

        jLDireccion.setText("Dirección");

        jLOcupacion.setText("Ocupación");

        jLTel.setText("Teléfonos");

        jLTelHabitacion.setText("Habitación");

        jLDatosPersonales.setText("Datos Personales");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNombre))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLFechaNac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFFechaNac))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLOcupacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFOcupacion))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFDireccion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLTel)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTelHabitacion)
                                    .addComponent(jLTelCelular)
                                    .addComponent(jLTelTrabajo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFTelHabitacion)
                                    .addComponent(jTFTelCelular)
                                    .addComponent(jTFTelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLMail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLDatosPersonales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLDatosPersonales)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLFechaNac)
                            .addComponent(jTFFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDireccion)
                            .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTel)
                            .addComponent(jLTelHabitacion)
                            .addComponent(jTFTelHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelCelular)
                            .addComponent(jTFTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelTrabajo)
                            .addComponent(jTFTelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLOcupacion)
                    .addComponent(jLMail)
                    .addComponent(jTFOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLDatosPersonales.setFont(new Font("Serif", Font.PLAIN, 18));

        jLabel6.setText("Estado de Salud Actual");

        jLabel7.setText("Condición Física Actual");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
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
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckSExc)
                    .addComponent(jCheckSMBueno)
                    .addComponent(jCheckSRegular)
                    .addComponent(jCheckSMalo)
                    .addComponent(jCheckSPesimo)
                    .addComponent(jCheckSMMalo)
                    .addComponent(jCheckSBueno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckCExc)
                        .addComponent(jCheckCMBueno)
                        .addComponent(jCheckCRegular)
                        .addComponent(jCheckCMalo)
                        .addComponent(jCheckCPesimo)
                        .addComponent(jCheckCMMalo)
                        .addComponent(jCheckCBueno))
                    .addComponent(jLabel7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel8.setText("Tipo de sangre");

        jLabel9.setText("Teléfono en caso de emergencia");

        jLabel10.setText("Sabe su médico si esta realizando alguna actividad aeróbica o anaeróbica");

        jLabel11.setText("Información de su médico");

        jRBYes.setText("Si");
        jRBYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBYesActionPerformed(evt);
            }
        });

        jRBNo.setText("No");

        jLabel12.setText("Al dar click en agregar se da por entendido que el cliente exime al al gimnasio Power Time de responsabilidad alguna. ");

        jLabel13.setText("Formalizar este documento con su respectiva firma.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRBYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBNo))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFTipoSangre))
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFInfoMedico)))
                        .addGap(94, 94, 94))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFTelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jRBYes)
                    .addComponent(jRBNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTFInfoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBAddCliente.setText("Agregar Cliente");
        jBAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jBAddCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAddCliente)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFTelHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelHabitacionActionPerformed

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jCheckHistFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckHistFamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckHistFamActionPerformed

    private void jCheckRehabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckRehabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckRehabActionPerformed

    private void jTFTiempoPEmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTiempoPEmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTiempoPEmbActionPerformed

    private void jRBYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBYesActionPerformed

    private void jBAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddClienteActionPerformed
        setVisible(false);
        new RegistroFisicoCliente().setVisible(true);
    }//GEN-LAST:event_jBAddClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngresarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAddCliente;
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
    private javax.swing.JLabel jLDatosPersonales;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLFechaNac;
    private javax.swing.JLabel jLMail;
    private javax.swing.JLabel jLNombre;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRBNo;
    private javax.swing.JRadioButton jRBYes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAOtro;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFDiscapacidad;
    private javax.swing.JTextField jTFEnfCronica;
    private javax.swing.JTextField jTFFechaNac;
    private javax.swing.JTextField jTFHernia;
    private javax.swing.JTextField jTFInfoMedico;
    private javax.swing.JTextField jTFLesion;
    private javax.swing.JTextField jTFMail;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFOcupacion;
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
    // End of variables declaration//GEN-END:variables
}
