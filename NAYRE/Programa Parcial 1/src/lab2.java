

import javax.swing.JOptionPane;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class lab2 extends javax.swing.JFrame {
    Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

    public lab2() {
        initComponents();
           conn=BaseDedatos.java_db();
 Toolkit toolkit = getToolkit();
  Dimension size = toolkit.getScreenSize();
  setLocation(size.width/2 - getWidth()/2, 
   size.height/2 - getHeight()/2);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        CmdAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBonif = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIsr = new javax.swing.JTextField();
        TxtHEx = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIgss = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSuelExtra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_search = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setLayout(null);

        CmdAceptar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        CmdAceptar.setText("Ingresar Informacion:");
        CmdAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdAceptarActionPerformed(evt);
            }
        });
        jPanel3.add(CmdAceptar);
        CmdAceptar.setBounds(820, 80, 290, 130);

        tblDatos.setBackground(new java.awt.Color(102, 102, 102));
        tblDatos.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        tblDatos.setForeground(new java.awt.Color(255, 255, 255));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Puesto", "Sueldo Ordinario", "Sueldo Extra", "Bonificación", "Otros", "Total Ingreso", "IGSS", "ISR", "Otros", "Total Descuentosl", "Sueldo Líquido"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 340, 1160, 340);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Persona"));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sueldos"));

        jLabel4.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel4.setText("Salario:");

        txtSalario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel5.setText("Bonificacion:");

        txtBonif.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel6.setText("ISR:");

        txtIsr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TxtHEx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel7.setText("Horas Extras:");

        jLabel8.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel8.setText("Igss:");

        txtIgss.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel3.setText("Sueldo Extraordinario: ");

        txtSuelExtra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtBonif, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(txtSalario))
                    .addComponent(txtIsr, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSuelExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(TxtHEx, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(txtIgss))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuelExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBonif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7))
                    .addComponent(TxtHEx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtIsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtIgss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel9.setText("IDentificacion:");

        jLabel10.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel10.setText("Buscar Empleado");

        jLabel2.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel2.setText("Puesto:");

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        txtPuesto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 320);

        jLabel11.setText("jLabel11");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(-2, 0, 1160, 740);

        jButton1.setText("jButton1");
        jPanel3.add(jButton1);
        jButton1.setBounds(870, 240, 93, 29);

        jMenu5.setForeground(new java.awt.Color(0, 204, 0));
        jMenu5.setText("Base De Datos");
        jMenu5.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Elephant", 2, 14)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 153, 0));
        jMenuItem5.setText("Añadir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem1.setText("Actualizar Datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuBar1.add(jMenu5);

        jMenu11.setForeground(new java.awt.Color(0, 204, 0));
        jMenu11.setText("Tabla");
        jMenu11.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Elephant", 3, 14)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(153, 153, 0));
        jMenuItem4.setText("Imprimir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem4);

        jMenuBar1.add(jMenu11);

        jMenu12.setForeground(new java.awt.Color(0, 204, 0));
        jMenu12.setText("Limpiar");
        jMenu12.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem8.setText("Eliminar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem8);

        jMenuBar1.add(jMenu12);

        jMenu8.setForeground(new java.awt.Color(0, 204, 0));
        jMenu8.setText("Repositorio");
        jMenu8.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N

        jMenuItem19.setFont(new java.awt.Font("Elephant", 2, 14)); // NOI18N
        jMenuItem19.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem19.setText("GITHUB");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem19);

        jMenuBar1.add(jMenu8);

        jMenu6.setForeground(new java.awt.Color(0, 204, 0));
        jMenu6.setText("Multimedia");
        jMenu6.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Elephant", 2, 14)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(255, 0, 51));
        jMenuItem10.setText("CANAL DE YOUTUBE");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem2.setText("Canal de Youtube2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem3.setText("Canal de youtube4");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // VARIABLE CÓDIGO //
    int ICod=0;
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void CmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdAceptarActionPerformed
        
       // VARIABLE CÓDIGO DE EMPLEADO EN LA TABLA //
   
/////////// SE AGREGA EL DECIMAL FORMAT PARA DECIMALES 
         DecimalFormat SueldoLiquid = new DecimalFormat("0.0");
         /////////// DECLARACION DE VARIABLES STRING FLOAT INT 
            float Sueldos;
            int HoraEx; float HEx;
            float BonifLeg = 250;
            String NombreEmp;
            String PuestoE;
            NombreEmp=txtNombre.getText();
            PuestoE=txtPuesto.getText();
            Sueldos=Integer.parseInt(txtSalario.getText());
            HoraEx=Integer.parseInt(TxtHEx.getText());
           //// HEx VARIABLE QUE SE UTILIZA POR LA HORAS TRABAJADAS EXTRAS DEL EMPLEADO
            HEx=(float) (1.5*HoraEx);
            //////**** SE UTILIZA RANDOM PARA EL SUELDO SEA MAYOR O IGUAL AL MINIMO 2825.10
            Sueldos=(int)(Math.random()*2825.10+2826.10);
            ////**** COMANDO MATH Y RANDOM PARA OTROS INGRESOS QUE TENGA EL EMPLEADO EN NOMINA
            int OtrosIng = (int)(Math.random()*3500+1);
          ////**** COMANDO MATH Y RANDOM PARA OTROS GASTOS QUE TENGA EL EMPLEADO EN NOMINA
            int OtrosGastos = (int)(Math.random()*1000+1);
            ////////////**** AQUI EMPIEZA LOS CICLOS DE IF Y ELSE IF PARA EL SALARIO BRUTO PARA NOMINA EMPLEADO
            float SalarioBruto;
            SalarioBruto = (float) (Sueldos+HEx+BonifLeg+OtrosIng);
            //////***** Se declara lo siguiente para descuentos de sueldo bruto al empleado ISR IGSS 
            
            /////***** ISR TIENE DIFERENTES DESCUENTOS SEGUN EL SUELDO BRUTO DE CADA EMPLEADO
            float IsrE=0;
            if(SalarioBruto>6000&&SalarioBruto<8000){
                IsrE=(float) (SalarioBruto*0.05);
            }
            else if(SalarioBruto>8000&&SalarioBruto<9500){
                IsrE=(float) (SalarioBruto*0.06);
            }
            else if(SalarioBruto>9500){
                IsrE=(float) (SalarioBruto*0.08);
            }
            ///**** IGSS SE LE DESCUENTA A TODOS LOS EMPLEADOS SU CUOTA 
            float IgssE;
            IgssE=(float) (SalarioBruto*0.0483);
            /////***** TOTAL QUE RECIBE EL EMPLEADO AL FINAL DE DEBITARLE LOS DESCUENTOS DE LEY
            float TotDesc;
            TotDesc = IsrE+IgssE+OtrosGastos;
            
            float TSuelLiquido=0;
            TSuelLiquido=SalarioBruto-TotDesc;
            ///////***** DECLARACION DE LA TABLA DE EMPLEADO EN LA PLANILLA 
            Object[] fila = new Object[13];
            DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
            ICod++;
            fila [0]=String.valueOf(ICod);
            fila [1]=NombreEmp;
            fila [2]=PuestoE;
            fila [3]=String.valueOf(Sueldos);
            fila [4]=String.valueOf(SueldoLiquid.format(HEx));
            fila [5]=String.valueOf(SueldoLiquid.format(BonifLeg));
            fila [6]=String.valueOf(SueldoLiquid.format(OtrosIng));
            fila [7]=String.valueOf(SueldoLiquid.format(SalarioBruto));
            fila [8]=String.valueOf(SueldoLiquid.format(IgssE));
            fila [9]=String.valueOf(SueldoLiquid.format(IsrE));
            fila [10]=String.valueOf(SueldoLiquid.format(OtrosGastos));
            fila [11]=String.valueOf(SueldoLiquid.format(TotDesc));
            fila [12]=String.valueOf(SueldoLiquid.format(TSuelLiquido));
            modelo.addRow(fila);
            tblDatos.setModel(modelo);
        
        {
      
        
            JOptionPane.showMessageDialog(null, "VERIFIQUE LA INFORMACIÓN DEL EMPLEADO SEA CORRECTA ");
        }
    }//GEN-LAST:event_CmdAceptarActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:

        try{

            String sql ="select * from Empleados where id=? ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs=pst.executeQuery();

            String add1 =rs.getString("id");
            txt_id.setText(add1);

            String add2 =rs.getString("Nombre");
            txtNombre.setText(add2);

            String add3 =rs.getString("Puesto");
            txtPuesto.setText(add3);

            String add4 =rs.getString("SueldoExtraordinario");
            txtSuelExtra.setText(add4);

            String add5 =rs.getString("Salario");
            txtSalario.setText(add5);

            String add6 =rs.getString("Bonificacion");
            txtBonif.setText(add6);

            String add7 =rs.getString("ISR");
            txtIsr.setText(add7);

            String add8 =rs.getString("HorasExtras");
            TxtHEx.setText(add8);
            
              String add9 =rs.getString("Igss");
            txtIgss.setText(add8);

            byte[] image = rs.getBytes("Image");
            //ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH));
            //img.setIcon(imageIcon);

        }catch(Exception e){

        }
        finally {

            try{

                rs.close();
                pst.close();

            }
            catch(Exception e){

            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
            Desktop browser = Desktop.getDesktop();
  try{
    try {
        browser.browse(new URI("https://github.com/TagoSMD/Programa1."));
    } catch (URISyntaxException ex) {
      
    }
  }
  catch(IOException err){
      
  }
    

        
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
           Desktop browser = Desktop.getDesktop();
  try{
    try {
        browser.browse(new URI("https://www.youtube.com/watch?v=3vauM7axnRs"));
    } catch (URISyntaxException ex) {
       
    }
  }
  catch(IOException err){
      
  }
       
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // Guardar en formato Excel
     
        try {     //String sql ="insert into Staff_information "
            //         + "(first_name,surname,Dob,Email,"
            //      + "Telephone,Address,Department,"
            //   + "Image,Salary,Gender,Address2,"
            //+ "Post_code, Designation,Status,job_title,Apartment,Date_hired) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            String sql ="insert into Empleados "
            + "(Nombre,Puesto,Salario,SueldoExtraordinario,"
            + "Bonificacion,ISR,HorasEXtras,Igss)values (?,?,?,?,?,?,?,?) ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,txtNombre.getText());
            pst.setString(2,txtPuesto.getText());
            pst.setString(3,txtSalario.getText());
            pst.setString(4,txtSuelExtra.getText());
            pst.setString(5,txtBonif.getText());
            pst.setString(6,txtIsr.getText());
            pst.setString(7,TxtHEx.getText());
            pst.setString(8,txtIgss.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null,"Se Ha Guardado Correctamente");

        }
        catch (Exception e)

        {
            JOptionPane.showMessageDialog(null,e);
        }

        finally {

            try{
                rs.close();
                pst.close();

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }

        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
         MessageFormat header = new MessageFormat("Nomina");
         MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try{
            tblDatos.print(JTable.PrintMode.NORMAL, header, footer);
            
        }catch(java.awt.print.PrinterException e){
            System.err.format("Error de impresion",  e.getMessage());
            
        }
  
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtPuesto.setText("");
        txtSalario.setText("");
        txtSuelExtra.setText("");
        txtBonif.setText("");
        txtIsr.setText("");
        TxtHEx.setText("");
           txtIgss.setText("");
        txt_search.setText("");
        DefaultTableModel model=(DefaultTableModel) tblDatos.getModel();
        int a = tblDatos.getSelectedRow();
        if (a<0){
            JOptionPane.showMessageDialog(null,
                "Debe Seleccionar a un Empleado");
        }
        else
        {
            int Confirmar=JOptionPane.showConfirmDialog(null,
                "Esta seguro que desea Eliminar el Registro de Empleado");
            if (JOptionPane.OK_OPTION==Confirmar){
                model.removeRow(a);
                JOptionPane.showMessageDialog(null,
                    "Registro de Empleado Eliminado de la planilla");
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        try{

                String value1 = txtNombre.getText();
                String value2 = txtPuesto.getText();
                String value3 = txtSalario.getText();
                String value4=txt_id.getText();
                String value5 = txtSuelExtra.getText();
                String value6 = txtBonif.getText();
                String value7 = txtIsr.getText();
                String value8 = TxtHEx.getText();
                 String value9 = txtIgss.getText();
                        
                        
                        //+ "Apartment = '"+value10+"', Post_code ='"+value11+"', "
                        //+ "Designation ='"+value12+"', Status ='"+value13+"', Salary ='"+value14+"', job_title ='"+value15+"', Date_Hired ='"+value16+"'   "
                 
               
                

                        
           
               // pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Datos Actualizados");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){

                }
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
                   Desktop browser = Desktop.getDesktop();
  try{
    try {
        browser.browse(new URI("https://www.youtube.com/watch?v=3vauM7axnRs1111"));
    } catch (URISyntaxException ex) {
       
    }
  }
  catch(IOException err){
      
  }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
     
                   Desktop browser = Desktop.getDesktop();
  try{
    try {
        browser.browse(new URI("https://www.youtube.com/watch?v=3va32312uM7axnRs1111"));
    } catch (URISyntaxException ex) {
       
    }
  }
  catch(IOException err){
      
  }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdAceptar;
    private javax.swing.JTextField TxtHEx;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtBonif;
    private javax.swing.JTextField txtIgss;
    private javax.swing.JTextField txtIsr;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSuelExtra;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
