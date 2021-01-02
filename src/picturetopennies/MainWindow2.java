package picturetopennies;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;


public class MainWindow2 extends javax.swing.JFrame {


    public MainWindow2(Main manager) {
        initComponents();
        this.resolutionSliderMouseDragged(null);
        this.manager = manager;
        
        this.lastDrawTime = System.currentTimeMillis();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        middlePanel = new javax.swing.JPanel();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        numPenniesLabel = new javax.swing.JLabel();
        dimensionsLabel = new javax.swing.JLabel();
        sliderPanel = new javax.swing.JPanel();
        resolutionPanel = new javax.swing.JPanel();
        resTitleLabel = new javax.swing.JLabel();
        resolutionSlider = new javax.swing.JSlider();
        resolutionLabel = new javax.swing.JLabel();
        brightnessPanel = new javax.swing.JPanel();
        brightnessTitleLabel = new javax.swing.JLabel();
        brightnessLabel = new javax.swing.JLabel();
        brightnessSlider = new javax.swing.JSlider();
        contrastPanel = new javax.swing.JPanel();
        contrastTitleLabel = new javax.swing.JLabel();
        contrastLabel = new javax.swing.JLabel();
        contrastSlider = new javax.swing.JSlider();
        bottomPanel = new javax.swing.JPanel();
        exportImageButton = new javax.swing.JButton();
        exportPrintButton = new javax.swing.JButton();
        honeyCombButton = new javax.swing.JRadioButton();
        squareButton = new javax.swing.JRadioButton();
        topPanel = new javax.swing.JPanel();
        pictureNameLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        openPictureButton = new javax.swing.JMenu();
        redrawButton = new javax.swing.JMenu();
        exitButton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pennies");

        middlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        plusButton.setText("+");
        plusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                plusButtonMouseReleased(evt);
            }
        });

        minusButton.setText("-");
        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minusButtonMouseReleased(evt);
            }
        });

        infoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        numPenniesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numPenniesLabel.setText("num Pennies");

        dimensionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dimensionsLabel.setText("dimensions");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addComponent(numPenniesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dimensionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(numPenniesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dimensionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sliderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        resTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resTitleLabel.setText("Sampling Resolution");

        resolutionSlider.setMaximum(300);
        resolutionSlider.setMinimum(1);
        resolutionSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                resolutionSliderMouseDragged(evt);
            }
        });

        resolutionLabel.setText("YOU  SHOULDN'T SEE THIS TEXT");

        javax.swing.GroupLayout resolutionPanelLayout = new javax.swing.GroupLayout(resolutionPanel);
        resolutionPanel.setLayout(resolutionPanelLayout);
        resolutionPanelLayout.setHorizontalGroup(
            resolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resolutionPanelLayout.createSequentialGroup()
                .addComponent(resTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resolutionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resolutionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        resolutionPanelLayout.setVerticalGroup(
            resolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resolutionPanelLayout.createSequentialGroup()
                .addGroup(resolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resolutionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resolutionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        brightnessTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brightnessTitleLabel.setText("Brightness");
        brightnessTitleLabel.setToolTipText("");

        brightnessLabel.setText("YOU  SHOULDN'T SEE THIS TEXT");

        brightnessSlider.setMaximum(300);
        brightnessSlider.setMinimum(-100);
        brightnessSlider.setValue(0);
        brightnessSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                brightnessSliderMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout brightnessPanelLayout = new javax.swing.GroupLayout(brightnessPanel);
        brightnessPanel.setLayout(brightnessPanelLayout);
        brightnessPanelLayout.setHorizontalGroup(
            brightnessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brightnessPanelLayout.createSequentialGroup()
                .addComponent(brightnessTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brightnessSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brightnessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        brightnessPanelLayout.setVerticalGroup(
            brightnessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brightnessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(brightnessTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(brightnessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(brightnessSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        contrastTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contrastTitleLabel.setText("Contrast");

        contrastLabel.setText("YOU  SHOULDN'T SEE THIS TEXT");

        contrastSlider.setMaximum(10000);
        contrastSlider.setValue(0);
        contrastSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                contrastSliderMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout contrastPanelLayout = new javax.swing.GroupLayout(contrastPanel);
        contrastPanel.setLayout(contrastPanelLayout);
        contrastPanelLayout.setHorizontalGroup(
            contrastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contrastPanelLayout.createSequentialGroup()
                .addComponent(contrastTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrastSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrastLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contrastPanelLayout.setVerticalGroup(
            contrastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contrastTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(contrastLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(contrastSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout sliderPanelLayout = new javax.swing.GroupLayout(sliderPanel);
        sliderPanel.setLayout(sliderPanelLayout);
        sliderPanelLayout.setHorizontalGroup(
            sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sliderPanelLayout.createSequentialGroup()
                .addGroup(sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resolutionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contrastPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brightnessPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        sliderPanelLayout.setVerticalGroup(
            sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sliderPanelLayout.createSequentialGroup()
                .addComponent(resolutionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(brightnessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contrastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout middlePanelLayout = new javax.swing.GroupLayout(middlePanel);
        middlePanel.setLayout(middlePanelLayout);
        middlePanelLayout.setHorizontalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, middlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(sliderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        middlePanelLayout.setVerticalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(plusButton)
                        .addComponent(minusButton)))
                .addGap(5, 5, 5))
        );

        bottomPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        exportImageButton.setText("Export Image");
        exportImageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exportImageButtonMouseReleased(evt);
            }
        });

        exportPrintButton.setText("Export to Print");
        exportPrintButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exportPrintButtonMousePressed(evt);
            }
        });

        honeyCombButton.setSelected(true);
        honeyCombButton.setText("Honey comb");
        honeyCombButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                honeyCombButtonActionPerformed(evt);
            }
        });

        squareButton.setText("Square");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addComponent(exportImageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportPrintButton)
                .addGap(32, 32, 32)
                .addComponent(honeyCombButton)
                .addGap(18, 18, 18)
                .addComponent(squareButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(exportImageButton)
                .addComponent(exportPrintButton)
                .addComponent(honeyCombButton)
                .addComponent(squareButton))
        );

        topPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        topPanel.setForeground(new java.awt.Color(153, 153, 153));

        pictureNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureNameLabel.setText("no picture");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        openPictureButton.setText("Open Picture");
        openPictureButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                openPictureButtonMousePressed(evt);
            }
        });
        menuBar.add(openPictureButton);

        redrawButton.setText("Redraw Pennies");
        redrawButton.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                redrawButtonMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        menuBar.add(redrawButton);

        exitButton.setText("Exit");
        menuBar.add(exitButton);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(middlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(middlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resolutionSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resolutionSliderMouseDragged
        this.updateLabels();
        this.redrawPicture();
    }//GEN-LAST:event_resolutionSliderMouseDragged

    private void plusButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseReleased
        this.resolutionSlider.setValue(this.resolutionSlider.getValue() + 1);
        this.resolutionSliderMouseDragged(null);
    }//GEN-LAST:event_plusButtonMouseReleased

    private void minusButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseReleased
        this.resolutionSlider.setValue(this.resolutionSlider.getValue() - 1);
        this.resolutionSliderMouseDragged(null);
    }//GEN-LAST:event_minusButtonMouseReleased

    private void honeyCombButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_honeyCombButtonActionPerformed
        this.squareButton.setSelected(!this.honeyCombButton.isSelected());
        this.redrawPicture();
    }//GEN-LAST:event_honeyCombButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        this.honeyCombButton.setSelected(!this.squareButton.isSelected());
        this.redrawPicture();
    }//GEN-LAST:event_squareButtonActionPerformed

    private void exportImageButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportImageButtonMouseReleased
        
        if (image == null) return;
        
        BufferedImage filteredImage = null;
        if (this.squareButton.isSelected()) {
            filteredImage = PennyPictureFilter.squareFilter(image, this.resolutionSlider.getValue(), 
                                                            outputPennyPixelDiameterForScreen, outputImageBackgroundColor);
        } else {
            filteredImage = PennyPictureFilter.honeyCombFilter(image, this.resolutionSlider.getValue(), 
                                                            outputPennyPixelDiameterForScreen, outputImageBackgroundColor);
        }
        
        try {
            File outputfile = new File("C:\\Users\\Calvin\\Desktop\\img.png");
            ImageIO.write(filteredImage, "png", outputfile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_exportImageButtonMouseReleased

    private void exportPrintButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportPrintButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPrintButtonMousePressed
    
    private void openPictureButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openPictureButtonMousePressed
        JFileChooser chooser = new JFileChooser("C:\\Users\\Calvin Cramer\\Desktop");
        int num = chooser.showDialog(this, "OK");
        if (num == chooser.APPROVE_OPTION) {
            try {
                image = ImageIO.read(chooser.getSelectedFile());
                this.pictureNameLabel.setText(chooser.getSelectedFile().getName());
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }

        }
        this.redrawPicture();
    }//GEN-LAST:event_openPictureButtonMousePressed

    private void redrawButtonMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_redrawButtonMenuKeyPressed
        this.redrawPicture();
    }//GEN-LAST:event_redrawButtonMenuKeyPressed

    private void brightnessSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brightnessSliderMouseDragged
        this.updateLabels();
        this.redrawPicture();
    }//GEN-LAST:event_brightnessSliderMouseDragged

    private void contrastSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrastSliderMouseDragged
        this.updateLabels();
        this.redrawPicture();
    }//GEN-LAST:event_contrastSliderMouseDragged

    private void redrawPicture() {
        
        long currentTime = System.currentTimeMillis();
        
        if (currentTime - lastDrawTime >= REDRAW_WAIT_TIME) {
            this.lastDrawTime = currentTime;
            //redraw picture
            if (this.manager != null && this.manager.getImageWindow() != null) {
                
                RescaleOp rescaleOp = new RescaleOp(contrast, brightness, null);
                BufferedImage filteredSourceImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.OPAQUE);
                rescaleOp.filter(image, filteredSourceImage);
                
                BufferedImage filteredImage = null;
                if (this.squareButton.isSelected()) {
                    filteredImage = PennyPictureFilter.squareFilter(filteredSourceImage, this.resolutionSlider.getValue(), 
                                                                    outputPennyPixelDiameterForScreen, outputImageBackgroundColor);
                } else {
                    filteredImage = PennyPictureFilter.honeyCombFilter(filteredSourceImage, this.resolutionSlider.getValue(), 
                                                                    outputPennyPixelDiameterForScreen, outputImageBackgroundColor);
                }
                this.manager.getImageWindow().setPicture(filteredImage);
            }
            
        }
        
    }
    
    private void doMath() {
        if (this.image == null) return;
        
        int resScan = this.resolutionSlider.getValue();
        
        if (this.squareButton.isSelected()) {
            
            int columns = image.getWidth() / resScan;
            int rows = image.getHeight() / resScan;
            
            this.numPennies = columns * rows;
            
            this.widthOfPictureIRL = columns * PENNY_WIDTH;
            this.heightOfPictureIRL = rows * PENNY_WIDTH;
            
        } else if (this.honeyCombButton.isSelected()) {
            
            int penniesPerRow = image.getWidth() / resScan;
            int totalPennies = 0;
            
            int rows = (int) ((image.getWidth() / resScan) * ROOT3_OVER2);
            
            //assume starting with small row first
            int numSmallRows = (rows / 2) + 1;
            int numBigRows = rows / 2;
            
            totalPennies += numSmallRows * (penniesPerRow - 1);
            totalPennies += numBigRows * penniesPerRow;
            this.numPennies = totalPennies;
            
            this.widthOfPictureIRL = penniesPerRow * PENNY_WIDTH;
            this.heightOfPictureIRL = rows * PENNY_WIDTH * ROOT3_OVER2;
            
        } else {
            System.out.println("error");
        }
    }
    
    private void updateLabels() {
        this.doMath();
        
        //res slider
        int pixels = this.resolutionSlider.getValue();
        this.resolutionLabel.setText(pixels + " pixel" + ( (pixels > 1) ? "s":"" ) );
        
        //brightness
        this.brightnessLabel.setText(this.brightnessSlider.getValue() + "");
        this.brightness = this.brightnessSlider.getValue();
        
        //contrast
        this.contrast = (float) (this.contrastSlider.getValue() * 5.0 / 10000.0);
        this.contrastLabel.setText(this.contrast + "");
        
        //num pennies
        this.numPenniesLabel.setText(this.numPennies + " Pennies");
        
        //width and height
        String widthString = "";
        if (this.widthOfPictureIRL >= 12) {
            widthString += ((int) widthOfPictureIRL / 12) + "' ";
        }
        double inches = (widthOfPictureIRL % 12);
        inches = Math.round(inches * 100.0) / 100.0;
        widthString += inches + "\" wide";
        
        String heightString = "";
        if (this.heightOfPictureIRL >= 12) {
            heightString += ((int) heightOfPictureIRL / 12) + "' ";
        }
        inches = (heightOfPictureIRL % 12);
        inches = Math.round(inches * 100.0) / 100.0;
        heightString += inches + "\" tall";
        
        this.dimensionsLabel.setText(widthString + ", " + heightString);
    }
    
    private BufferedImage image;
    private Main manager;
    
    private long lastDrawTime;
    
    private float contrast;
    private int brightness;
    
    private int numPennies;
    private double widthOfPictureIRL;
    private double heightOfPictureIRL;
    
    private static final int outputPennyPixelDiameter = 200; //pixels
    private static final int outputPennyPixelDiameterForScreen = 70; //pixels
    private static final Color outputImageBackgroundColor = Color.BLACK;
    
    private static final int REDRAW_WAIT_TIME = 10; //ms
    private static final double PENNY_WIDTH = 0.75; //inches
    private static final double ROOT3_OVER2 = 0.86602540378443864676372317075294;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel brightnessLabel;
    private javax.swing.JPanel brightnessPanel;
    private javax.swing.JSlider brightnessSlider;
    private javax.swing.JLabel brightnessTitleLabel;
    private javax.swing.JLabel contrastLabel;
    private javax.swing.JPanel contrastPanel;
    private javax.swing.JSlider contrastSlider;
    private javax.swing.JLabel contrastTitleLabel;
    private javax.swing.JLabel dimensionsLabel;
    private javax.swing.JMenu exitButton;
    private javax.swing.JButton exportImageButton;
    private javax.swing.JButton exportPrintButton;
    private javax.swing.JRadioButton honeyCombButton;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel middlePanel;
    private javax.swing.JButton minusButton;
    private javax.swing.JLabel numPenniesLabel;
    private javax.swing.JMenu openPictureButton;
    private javax.swing.JLabel pictureNameLabel;
    private javax.swing.JButton plusButton;
    private javax.swing.JMenu redrawButton;
    private javax.swing.JLabel resTitleLabel;
    private javax.swing.JLabel resolutionLabel;
    private javax.swing.JLabel resolutionLabel2;
    private javax.swing.JPanel resolutionPanel;
    private javax.swing.JSlider resolutionSlider;
    private javax.swing.JSlider resolutionSlider2;
    private javax.swing.JPanel sliderPanel;
    private javax.swing.JRadioButton squareButton;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
