import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRed = new javax.swing.JButton();
        jButtonGreen = new javax.swing.JButton();
        jButtonBlue = new javax.swing.JButton();
        jButtonNegativo = new javax.swing.JButton();
        jButtonBrilho = new javax.swing.JButton();
        jLabelImgOrig = new javax.swing.JLabel();
        jLabelImgEfeitos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonMedia = new javax.swing.JButton();
        jButtonMediana = new javax.swing.JButton();
        jButtonMisturaImg = new javax.swing.JButton();
        jButtonLImiar = new javax.swing.JButton();
        jButtonRGB_YIQ_RGB = new javax.swing.JButton();
        jButtonOriginal = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAbrirImagem = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRed.setText("      Red   ");
        jButtonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedActionPerformed(evt);
            }
        });

        jButtonGreen.setText("Green");
        jButtonGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGreenActionPerformed(evt);
            }
        });

        jButtonBlue.setText("Blue");
        jButtonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlueActionPerformed(evt);
            }
        });

        jButtonNegativo.setText("Negativo");
        jButtonNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegativoActionPerformed(evt);
            }
        });

        jButtonBrilho.setText("Brilho");
        jButtonBrilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrilhoActionPerformed(evt);
            }
        });

        jLabelImgOrig.setBackground(new java.awt.Color(193, 174, 156));
        jLabelImgOrig.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelImgOrig.setPreferredSize(new java.awt.Dimension(450, 450));

        jLabelImgEfeitos.setBackground(new java.awt.Color(193, 174, 156));
        jLabelImgEfeitos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Imagem Original");

        jLabel2.setText("Imagem Alterada");

        jButtonMedia.setText("Media");
        jButtonMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMediaActionPerformed(evt);
            }
        });

        jButtonMediana.setText("Mediana");
        jButtonMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedianaActionPerformed(evt);
            }
        });

        jButtonMisturaImg.setText("Mistura img");
        jButtonMisturaImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMisturaImgActionPerformed(evt);
            }
        });

        jButtonLImiar.setText("Limiar");
        jButtonLImiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLImiarActionPerformed(evt);
            }
        });

        jButtonRGB_YIQ_RGB.setText("RGB-YIQ-RGB");
        jButtonRGB_YIQ_RGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRGB_YIQ_RGBActionPerformed(evt);
            }
        });

        jButtonOriginal.setText("Original");
        jButtonOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOriginalActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(68, 82, 149));

        jMenu1.setText("Menu");

        jMenuItemAbrirImagem.setText("Abrir Imagem");
        jMenuItemAbrirImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirImagemActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAbrirImagem);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelImgOrig, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImgEfeitos, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMisturaImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBrilho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMediana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLImiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRGB_YIQ_RGB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonOriginal)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonRGB_YIQ_RGB)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonRed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBlue)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonNegativo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBrilho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMedia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMediana)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonMisturaImg)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonLImiar)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelImgOrig, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelImgEfeitos, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(85, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAbrirImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirImagemActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser escolhe_imagem = new JFileChooser();
            escolhe_imagem.setVisible(true);
            escolhe_imagem.showOpenDialog(null);
            arquivoImg = escolhe_imagem.getSelectedFile();
            imagemOrig = ImageIO.read(arquivoImg);
            //ImageIcon icon = new ImageIcon(imagemOrig);
            //jLabelImgOrig.setIcon(icon);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgOrig.setIcon(new ImageIcon(imagemOrig.getScaledInstance(jLabelImgOrig.getWidth(),jLabelImgOrig.getHeight(), imagemOrig.SCALE_DEFAULT)));
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemOrig.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemOrig.SCALE_DEFAULT)));

            //jLabelImgEfeitos
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jMenuItemAbrirImagemActionPerformed

    private void jButtonRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedActionPerformed
        try {
            BufferedImage imagemAlterada = ImageIO.read(arquivoImg);
            String[] choices = {"Red", "Monocromatico Red"};
            //monocromatico
            int op = JOptionPane.showOptionDialog(this,
                    "Opcoes:",
                    "Red",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    choices,
                    "Quit");
            switch (op) {
                case 0:
                    imagemEfeitos = Efeitos.red(imagemAlterada);
                    break;
                case 1:
                    imagemEfeitos = Efeitos.monocromaticoRed(imagemAlterada);
                    break;
            }
            //ImageIcon icon = new ImageIcon(imagemEfeitos);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonRedActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGreenActionPerformed
        try {
            BufferedImage imagemAlterada = ImageIO.read(arquivoImg);
            String[] choices = {"Green", "Monocromatico Green"};
            //monocromatico
            int op = JOptionPane.showOptionDialog(this,
                    "Opcoes:",
                    "Green",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    choices,
                    "Quit");
            switch (op) {
                case 0:
                    imagemEfeitos = Efeitos.green(imagemAlterada);
                    break;
                case 1:
                    imagemEfeitos = Efeitos.monocromaticoGreen(imagemAlterada);
                    break;
            }
            //ImageIcon icon = new ImageIcon(imagemEfeitos);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonGreenActionPerformed

    private void jButtonBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlueActionPerformed
        try {
            BufferedImage imagemAlterada = ImageIO.read(arquivoImg);
            String[] choices = {"Blue", "Monocromatico Blue"};
            //monocromatico
            int op = JOptionPane.showOptionDialog(this,
                    "Opcoes:",
                    "Blue",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    choices,
                    "Quit");
            switch (op) {
                case 0:
                    imagemEfeitos = Efeitos.blue(imagemAlterada);
                    break;
                case 1:
                    imagemEfeitos = Efeitos.monocromaticoBlue(imagemAlterada);
                    break;
            }
            //ImageIcon icon = new ImageIcon(imagemEfeitos);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonBlueActionPerformed

    private void jButtonNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegativoActionPerformed
        try {
            BufferedImage imagemAlterada = ImageIO.read(arquivoImg);
            String[] choices = {"Y", "RGB", "Red", "Green", "Blue"};
            //monocromatico
            int op = JOptionPane.showOptionDialog(this,
                    "Opcoes:",
                    "Negativo",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    choices,
                    "Quit");
            switch (op) {
                case 0:
                    imagemEfeitos = Efeitos.negativoY(imagemAlterada);
                    break;
                case 1:
                    imagemEfeitos = Efeitos.negativoRGB(imagemAlterada);
                    break;
                case 2:
                    imagemEfeitos = Efeitos.negativoR(imagemAlterada);
                    break;
                case 3:
                    imagemEfeitos = Efeitos.negativoG(imagemAlterada);
                    break;
                case 4:
                    imagemEfeitos = Efeitos.negativoB(imagemAlterada);
                    break;
            }
            //ImageIcon icon = new ImageIcon(imagemEfeitos);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonNegativoActionPerformed

    private void jButtonBrilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrilhoActionPerformed
        try {
            String c = JOptionPane.showInputDialog("digite o valor de c:");
            BufferedImage imagemAlterada = ImageIO.read(arquivoImg);
            String[] choices = {"Brilho ADD RGB", "Brilho ADD Y", "Brilho MUL RGB", "Brilho MUL Y"};
            //monocromatico
            int op = JOptionPane.showOptionDialog(this,
                    "Opcoes:",
                    "Brilho",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    choices,
                    "Quit");
            switch (op) {
                case 0:
                    imagemEfeitos = Efeitos.brilhoAdd(imagemAlterada, Integer.parseInt(c));
                    break;
                case 1:
                    imagemEfeitos = Efeitos.brilhoAddEmY(imagemAlterada, Integer.parseInt(c));
                    break;
                case 2:
                    imagemEfeitos = Efeitos.brilhoMult(imagemAlterada, Float.parseFloat(c));
                    break;
                case 3:
                    imagemEfeitos = Efeitos.brilhoMultEmY(imagemAlterada, Float.parseFloat(c));
                    break;
            }
            //ImageIcon icon = new ImageIcon(imagemEfeitos);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonBrilhoActionPerformed

    private void jButtonMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMediaActionPerformed
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de n para a mascara:"));
            BufferedImage imagemAlterada = ImageIO.read(arquivoImg);
            imagemEfeitos = Efeitos.media(imagemAlterada, n);
            //ImageIcon icon = new ImageIcon(imagemEfeitos);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonMediaActionPerformed

    private void jButtonMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedianaActionPerformed
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de n para a mascara:"));
            BufferedImage imagemAlterada = ImageIO.read(arquivoImg);
            imagemEfeitos = Efeitos.mediana(imagemAlterada, n);
            //ImageIcon icon = new ImageIcon(imagemEfeitos);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonMedianaActionPerformed

    private void jButtonMisturaImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMisturaImgActionPerformed
        try {
            JFileChooser escolhe_imagem = new JFileChooser();
            escolhe_imagem.setVisible(true);
            escolhe_imagem.showOpenDialog(null);
            File img2 = escolhe_imagem.getSelectedFile();
            BufferedImage image = ImageIO.read(img2);
            imagemEfeitos = Efeitos.misturaImg(imagemOrig, image);
            //ImageIcon icon = new ImageIcon(imagemEfeitos);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonMisturaImgActionPerformed

    private void jButtonLImiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLImiarActionPerformed
        try {
            BufferedImage imagemAlterada = ImageIO.read(arquivoImg);
            String[] choices = {"R", "G", "B"};
            //ImageIcon icon = null;
            String limiar = "";
            //monocromatico
            int op = JOptionPane.showOptionDialog(this,
                    "Limiar:",
                    "opcoes nas bandas monocromaticas:",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    choices,
                    "Quit");
            switch (op) {
                case 0:
                    imagemEfeitos = Efeitos.monocromaticoRed(imagemAlterada);
                    //icon = new ImageIcon(imagemEfeitos);
                    //jLabelImgEfeitos.setIcon(icon);
                    jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
                    limiar = JOptionPane.showInputDialog("digite o limiar:");
                    if (limiar.isEmpty()) {
                        imagemEfeitos = Efeitos.limiarMedia(imagemEfeitos);
                    } else {
                        imagemEfeitos = Efeitos.limiar(imagemEfeitos, Integer.parseInt(limiar));
                    }
                    break;
                case 1:
                    imagemEfeitos = Efeitos.monocromaticoGreen(imagemAlterada);
                    //icon = new ImageIcon(imagemEfeitos);
                    //jLabelImgEfeitos.setIcon(icon);
                    jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
                    limiar = JOptionPane.showInputDialog("digite o limiar:");
                    if (limiar.isEmpty()) {
                        imagemEfeitos = Efeitos.limiarMedia(imagemEfeitos);
                    } else {
                        imagemEfeitos = Efeitos.limiar(imagemEfeitos, Integer.parseInt(limiar));
                    }
                    break;
                case 2:
                    imagemEfeitos = Efeitos.monocromaticoBlue(imagemAlterada);
                    //icon = new ImageIcon(imagemEfeitos);
                    //jLabelImgEfeitos.setIcon(icon);
                    jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
                    limiar = JOptionPane.showInputDialog("digite o limiar:");
                    if (limiar.isEmpty()) {
                        imagemEfeitos = Efeitos.limiarMedia(imagemEfeitos);
                    } else {
                        imagemEfeitos = Efeitos.limiar(imagemEfeitos, Integer.parseInt(limiar));
                    }
                    break;
            }
            //icon = new ImageIcon(imagemEfeitos);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonLImiarActionPerformed

    private void jButtonRGB_YIQ_RGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRGB_YIQ_RGBActionPerformed
        try {
            BufferedImage imagemAlterada = ImageIO.read(arquivoImg);
            imagemEfeitos = Efeitos.rgbToyiq(imagemAlterada);
            //ImageIcon icon = new ImageIcon(imagemEfeitos);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemEfeitos.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemEfeitos.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonRGB_YIQ_RGBActionPerformed

    private void jButtonOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOriginalActionPerformed
        try {
            imagemOrig = ImageIO.read(arquivoImg);
            //ImageIcon icon = new ImageIcon(imagemOrig);
            //jLabelImgOrig.setIcon(icon);
            //jLabelImgEfeitos.setIcon(icon);
            jLabelImgOrig.setIcon(new ImageIcon(imagemOrig.getScaledInstance(jLabelImgOrig.getWidth(),jLabelImgOrig.getHeight(), imagemOrig.SCALE_DEFAULT)));
            jLabelImgEfeitos.setIcon(new ImageIcon(imagemOrig.getScaledInstance(jLabelImgEfeitos.getWidth(),jLabelImgEfeitos.getHeight(), imagemOrig.SCALE_DEFAULT)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "falha na leitura da imagem");
        }
    }//GEN-LAST:event_jButtonOriginalActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBlue;
    private javax.swing.JButton jButtonBrilho;
    private javax.swing.JButton jButtonGreen;
    private javax.swing.JButton jButtonLImiar;
    private javax.swing.JButton jButtonMedia;
    private javax.swing.JButton jButtonMediana;
    private javax.swing.JButton jButtonMisturaImg;
    private javax.swing.JButton jButtonNegativo;
    private javax.swing.JButton jButtonOriginal;
    private javax.swing.JButton jButtonRGB_YIQ_RGB;
    private javax.swing.JButton jButtonRed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelImgEfeitos;
    private javax.swing.JLabel jLabelImgOrig;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAbrirImagem;
    private javax.swing.JMenuItem jMenuItemSair;
    // End of variables declaration//GEN-END:variables
    private BufferedImage imagemOrig = null;
    private BufferedImage imagemEfeitos = null;
    private File arquivoImg = null;
}
