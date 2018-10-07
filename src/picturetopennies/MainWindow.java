package picturetopennies;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import java.awt.image.Raster;
import java.awt.Graphics;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class MainWindow extends javax.swing.JFrame {

    public MainWindow(Main manager) {
        initComponents();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        int x = (width / 2) - (this.getWidth() / 2);
        int y = (height / 2) - (this.getHeight() / 2);
        this.setBounds(x, y, this.getWidth(), this.getHeight());
        
        pennySize = sizeSlider.getValue();
        
        this.setTitle("Picture To Pennies");
        this.setVisible(true);
        
        this.manager = manager;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        openPictureButton = new javax.swing.JButton();
        fileNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resolutionSlider = new javax.swing.JSlider();
        pixelLabel = new javax.swing.JLabel();
        incrementButton = new javax.swing.JButton();
        decrementButton = new javax.swing.JButton();
        plusFiveButton = new javax.swing.JButton();
        minusFiveButton = new javax.swing.JButton();
        numOfPennies = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rowsLabel = new javax.swing.JLabel();
        columnsLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        sizeSlider = new javax.swing.JSlider();
        jSeparator3 = new javax.swing.JSeparator();
        widthLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        createPictureButton = new javax.swing.JToggleButton();
        exportWholeImageButton = new javax.swing.JToggleButton();
        pagesWideLabel = new javax.swing.JLabel();
        pagesTallLabel = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        picturePanel = new javax.swing.JPanel();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        openPictureButton.setText("Open Picture...");
        openPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openPictureButtonActionPerformed(evt);
            }
        });

        fileNameLabel.setText("(no picture)");

        jLabel2.setText("Resolution");

        resolutionSlider.setMaximum(200);
        resolutionSlider.setMinimum(1);
        resolutionSlider.setValue(10);
        resolutionSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                resolutionSliderMouseDragged(evt);
            }
        });

        pixelLabel.setText("10 Pixels");

        incrementButton.setText("+ 1");
        incrementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incrementButtonActionPerformed(evt);
            }
        });

        decrementButton.setText("- 1");
        decrementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrementButtonActionPerformed(evt);
            }
        });

        plusFiveButton.setText("+ 5");
        plusFiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusFiveButtonActionPerformed(evt);
            }
        });

        minusFiveButton.setText("- 5");
        minusFiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusFiveButtonActionPerformed(evt);
            }
        });

        numOfPennies.setText("Number Of Pennies: 0");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        rowsLabel.setText("Rows: 0");

        columnsLabel.setText("Columns: 0");

        jLabel1.setText("Size");

        sizeSlider.setMaximum(50);
        sizeSlider.setMinimum(1);
        sizeSlider.setValue(7);
        sizeSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sizeSliderMouseDragged(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        widthLabel.setText("0 inches Wide");

        heightLabel.setText("0 inches Tall");

        createPictureButton.setText("Export Image");
        createPictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPictureButtonActionPerformed(evt);
            }
        });

        exportWholeImageButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        exportWholeImageButton.setText("Export Whole Image");
        exportWholeImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportWholeImageButtonActionPerformed(evt);
            }
        });

        pagesWideLabel.setText("0 pages wide");

        pagesTallLabel.setText("0 pages tall");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(openPictureButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sizeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(incrementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(decrementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(plusFiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minusFiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rowsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numOfPennies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(columnsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resolutionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pixelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(widthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(heightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createPictureButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exportWholeImageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pagesWideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagesTallLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fileNameLabel)
                            .addComponent(openPictureButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resolutionSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pixelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(numOfPennies)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rowsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(columnsLabel))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(incrementButton)
                                    .addComponent(decrementButton))
                                .addGap(23, 23, 23)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(plusFiveButton)
                                    .addComponent(minusFiveButton)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sizeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(widthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createPictureButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pagesWideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagesTallLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exportWholeImageButton)))
                .addContainerGap())
        );

        panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );

        picturePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout picturePanelLayout = new javax.swing.GroupLayout(picturePanel);
        picturePanel.setLayout(picturePanelLayout);
        picturePanelLayout.setHorizontalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
        picturePanelLayout.setVerticalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(picturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minusFiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusFiveButtonActionPerformed
        changeSliderValue(5);
    }//GEN-LAST:event_minusFiveButtonActionPerformed

    private void plusFiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusFiveButtonActionPerformed
        changeSliderValue(-5);
    }//GEN-LAST:event_plusFiveButtonActionPerformed

    private void decrementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrementButtonActionPerformed
        changeSliderValue(1);
    }//GEN-LAST:event_decrementButtonActionPerformed

    private void incrementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incrementButtonActionPerformed
        changeSliderValue(-1);
    }//GEN-LAST:event_incrementButtonActionPerformed

    private void resolutionSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resolutionSliderMouseDragged
        pixelLabel.setText(resolutionSlider.getValue() + " Pixels");
        paintPicture();
        
        int numX = (xPenniesWide / 27) + 1;
        int numY = (xPenniesTall / 36) + 1;
        
        if (numX > 1) pagesWideLabel.setText(numX + " pages wide");
        else pagesWideLabel.setText(numX + " page wide");
        
        if (numY > 1) pagesTallLabel.setText(numY + " pages tall");
        else pagesTallLabel.setText(numY + " page tall");
    }//GEN-LAST:event_resolutionSliderMouseDragged

    private void openPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openPictureButtonActionPerformed
        JFileChooser chooser = new JFileChooser("C:\\Users\\Calvin Cramer\\Desktop");

        int num = chooser.showDialog(this, "OK");

        if(num == chooser.APPROVE_OPTION) {
            try {
                image = ImageIO.read(chooser.getSelectedFile());
                fileNameLabel.setText(chooser.getSelectedFile().getName());

                Graphics g = picturePanel.getGraphics();
                g.drawImage(image, 5, 5, picturePanel.getWidth() - 10, picturePanel.getHeight() - 10, null);

            } catch (IOException ex) {
                System.out.println(ex.toString());
            }

        }
        paintPicture();

    }//GEN-LAST:event_openPictureButtonActionPerformed

    private void sizeSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sizeSliderMouseDragged
        pennySize = sizeSlider.getValue();
        paintPicture();
    }//GEN-LAST:event_sizeSliderMouseDragged

    private void createPictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPictureButtonActionPerformed
        //exports print ready photos
        
        if (image == null) return;
        int constant = 50;
        
        int numX = (xPenniesWide / 27) + 1;
        int numY = (xPenniesTall / 36) + 1;
        //System.out.println("x: " + xPic + " y: " + yPic + " pennies wide: " + xPenniesWide + " pennies tall: " + xPenniesTall);
        
        BufferedImage[][] images = new BufferedImage[numY][numX];
        
        for (int x = 0; x < numX; x++) {
            for (int y = 0; y < numY; y++) {
                
                images[y][x] = new BufferedImage(27 * constant, 36 * constant, BufferedImage.OPAQUE);
                Graphics2D g2 = images[y][x].createGraphics();
                g2.setColor(Color.WHITE);
                g2.drawRect(0, 0, images[y][x].getWidth(), images[y][x].getHeight());
                g2.fillRect(0, 0, images[y][x].getWidth(), images[y][x].getHeight());
                
                for (int a = 0; a < pennies[0].length && a < 27; a++) {
                    for (int b = 0; b < pennies.length && b < 36; b++) {
                        if (a + (x * 27) < pennies[0].length && b + (y * 36) < pennies.length) {
                            g2.setColor( pennies[b + (y * 36)][a + (x * 27)] );
                            g2.drawOval(a * constant, b * constant, constant, constant);
                            g2.fillOval(a * constant, b * constant, constant, constant);
                        }
                    }
                }
                //boop
                try {
                    File outputfile = new File("C:\\Users\\Calvin Cramer\\Desktop\\img " + (x + 1) + (y + 1) + ".png");
                    ImageIO.write(images[y][x], "png", outputfile);

                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
        }
    }//GEN-LAST:event_createPictureButtonActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized

    }//GEN-LAST:event_formComponentResized

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved

    }//GEN-LAST:event_formComponentRemoved

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized

        paintPicture();
    }//GEN-LAST:event_formAncestorResized

    private void exportWholeImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportWholeImageButtonActionPerformed
        if (image == null) return;
        int constant = 50;
        
        int numX = (xPenniesWide / 27) + 1;
        int numY = (xPenniesTall / 36) + 1;
        
        BufferedImage img = new BufferedImage(xPenniesWide * constant, xPenniesTall * constant, BufferedImage.TRANSLUCENT);
        Graphics2D g2 = img.createGraphics();
        
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, img.getWidth(), img.getHeight());
        
        for (int x = 0; x < xPenniesWide; x++) {
            for (int y = 0; y < xPenniesTall; y++) {
                g2.setColor(pennies[y][x]);
                g2.drawOval(x * constant, y * constant, constant, constant);
                g2.fillOval(x * constant, y * constant, constant, constant);
            }
        }
        
        
        try {
            File outputfile = new File("C:\\Users\\Calvin Cramer\\Desktop\\img.png");
            ImageIO.write(img, "png", outputfile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_exportWholeImageButtonActionPerformed

    private void changeSliderValue(int val) {
        resolutionSlider.setValue(resolutionSlider.getValue() + val);
        resolutionSliderMouseDragged(null);
    }
    
    private void setSizeLabels(int columns, int rows) {
        double width = columns * pennyDiameter;
        double height = rows * pennyDiameter;
        
        if (width >= 12) {
            int feet = (int) width / 12;
            widthLabel.setText(feet + "'" + width % 12 + "\" Wide");
        } else {
            widthLabel.setText(width + "\" Wide");
        }
        if (height >= 12) {
            int feet = (int) height / 12;
            heightLabel.setText(feet + "'" + height % 12 + "\" Tall");
        } else {
            heightLabel.setText(height + "\" Tall");
        }
        
    }
    
    private void paintPicture() {
        
        if (image == null) return;
        
        int res = resolutionSlider.getValue();
        Raster pic = image.getData();
        
        int columns = pic.getWidth() / res;
        int rows = pic.getHeight() / res;
        
        xPenniesTall = rows;
        xPenniesWide = columns;

        numOfPennies.setText("Number Of Pennies: " + (columns * rows));
        columnsLabel.setText("Columns: " + columns);
        rowsLabel.setText("Rows: " + rows);
        setSizeLabels(columns, rows);

        int[][] greyValues = new int[rows][columns];
        
        int[] integerArray = new int[3];
        
        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                
                int averageValue = 0;
                for (int j = 0; j < res; j++) {
                    for (int k = 0; k < res; k++) {
                        int[] pixel = pic.getPixel(b * res + k, a * res + j, integerArray);

                        int greyValue = (int) Math.round((0.2989 * pixel[0]) + (0.5870 * pixel[1]) + (0.1140 * pixel[2]));
                        if (res == 1) {
                            averageValue = greyValue;
                        } else {
                            averageValue = (averageValue + greyValue) / 2;
                        }
                    }
                }
                
                greyValues[a][b] = averageValue;
            }
        }
        
        
        pennies = new Color[rows][columns];
        
        for (int x = 0; x < greyValues[0].length; x++) {
            for (int y = 0; y < greyValues.length; y++) {
                int num = greyValues[y][x];

                double red =  (num / 255.0) * (lightestPenny.getRed() - darkestPenny.getRed()) + darkestPenny.getRed();
                double green = (num / 255.0) * (lightestPenny.getGreen() - darkestPenny.getGreen()) + darkestPenny.getGreen();
                double blue = (num / 255.0) * (lightestPenny.getBlue() - darkestPenny.getBlue()) + darkestPenny.getBlue();
                int redInt = (int) Math.round(red);
                int greenInt = (int) Math.round(green);
                int blueInt =  (int) Math.round(blue);

                pennies[y][x] = new Color(redInt, greenInt, blueInt);
            }
        }

        Graphics2D g2 = (Graphics2D) panel.getGraphics();
        g2.clearRect(0, 0, panel.getWidth(), panel.getHeight());
        g2.setColor(Color.WHITE);
        g2.drawRect(0, 0, panel.getWidth(), panel.getHeight());
        g2.fillRect(0, 0, panel.getWidth(), panel.getHeight());

        for (int x = 0; x < greyValues[0].length; x++) {
            for (int y = 0; y < greyValues.length; y++) {
                g2.setColor(pennies[y][x]);
                g2.drawOval(x * pennySize, y * pennySize, pennySize, pennySize);
                g2.fillOval(x * pennySize, y * pennySize, pennySize, pennySize);
            }
        }
        
        
    }

    // Variables
    private BufferedImage image;
    private final Color darkestPenny = new Color(84, 61, 33);
    private final Color lightestPenny = new Color(244, 155, 108);
    private int xPenniesWide;
    private int xPenniesTall;
    private int pennySize;
    private final double pennyDiameter = 0.75;
    private Color[][] pennies;
    
    private Main manager;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel columnsLabel;
    private javax.swing.JToggleButton createPictureButton;
    private javax.swing.JButton decrementButton;
    private javax.swing.JToggleButton exportWholeImageButton;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JButton incrementButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton minusFiveButton;
    private javax.swing.JLabel numOfPennies;
    private javax.swing.JButton openPictureButton;
    private javax.swing.JLabel pagesTallLabel;
    private javax.swing.JLabel pagesWideLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel picturePanel;
    private javax.swing.JLabel pixelLabel;
    private javax.swing.JButton plusFiveButton;
    private javax.swing.JSlider resolutionSlider;
    private javax.swing.JLabel rowsLabel;
    private javax.swing.JSlider sizeSlider;
    private javax.swing.JLabel widthLabel;
    // End of variables declaration//GEN-END:variables
}