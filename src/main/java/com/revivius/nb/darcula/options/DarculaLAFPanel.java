/*
 * Copyright 2016 markiewb.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.revivius.nb.darcula.options;

import com.revivius.nb.darcula.DarculaLFCustoms;
import java.awt.Font;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.NbPreferences;

@org.netbeans.spi.options.OptionsPanelController.Keywords(location = "Appearance", tabTitle = "Darcula Look and Feel", keywords = {"dark theme", "dark", "theme", "laf", "font", "look and feel", "darcula"})
public class DarculaLAFPanel extends javax.swing.JPanel {

    private final DarculaLAFOptionsPanelController controller;

    DarculaLAFPanel(DarculaLAFOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
    }

    public void reinitUI() {
        if (!cbOverride.isSelected()) {
            lblFontName.setText(DarculaLFCustoms.DEFAULT_FONT);
        }
        
        lblFont.setEnabled(cbOverride.isSelected());
        lblFontName.setEnabled(cbOverride.isSelected());
        lblRestart.setEnabled(cbOverride.isSelected());
        btnChooseFont.setEnabled(cbOverride.isSelected());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbOverride = new javax.swing.JCheckBox();
        lblRestart = new javax.swing.JLabel();
        lblFontName = new javax.swing.JTextField();
        lblFont = new javax.swing.JLabel();
        btnChooseFont = new javax.swing.JButton();
        cbInvertIcons = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(cbOverride, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.cbOverride.text")); // NOI18N
        cbOverride.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbOverrideStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(lblRestart, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.lblRestart.text")); // NOI18N

        lblFontName.setEditable(false);
        lblFontName.setText(org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.lblFontName.text")); // NOI18N

        lblFont.setLabelFor(btnChooseFont);
        org.openide.awt.Mnemonics.setLocalizedText(lblFont, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.lblFont.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnChooseFont, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.btnChooseFont.text")); // NOI18N
        btnChooseFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFontActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cbInvertIcons, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.cbInvertIcons.text")); // NOI18N
        cbInvertIcons.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInvertIconsItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbOverride))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblFont)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFontName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChooseFont)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRestart))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbInvertIcons)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbOverride)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFontName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFont)
                    .addComponent(lblRestart)
                    .addComponent(btnChooseFont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbInvertIcons)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbOverrideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbOverrideStateChanged
        controller.changed();
        reinitUI();
    }//GEN-LAST:event_cbOverrideStateChanged

    private void btnChooseFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFontActionPerformed
        PropertyEditor pe = PropertyEditorManager.findEditor(Font.class);
        Font f = Font.decode(lblFontName.getText());
        pe.setValue(f);
        DialogDescriptor dd = new DialogDescriptor(
                pe.getCustomEditor(),
                "Font Chooser"
        );
        dd.setOptions(new Object[]{
            DialogDescriptor.OK_OPTION,
            DialogDescriptor.CANCEL_OPTION
        });
        DialogDisplayer.getDefault().createDialog(dd).setVisible(true);
        if (dd.getValue() == DialogDescriptor.OK_OPTION) {
            f = (Font) pe.getValue();
            lblFontName.setText(f.getName() + " " + f.getSize());
            controller.changed();
        }
    }//GEN-LAST:event_btnChooseFontActionPerformed

    private void cbInvertIconsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInvertIconsItemStateChanged
        controller.changed();
    }//GEN-LAST:event_cbInvertIconsItemStateChanged

    void load() {
        cbInvertIcons.setSelected(NbPreferences.forModule(DarculaLAFPanel.class).getBoolean("invertIcons", false));
        cbOverride.setSelected(NbPreferences.forModule(DarculaLAFPanel.class).getBoolean("overrideFont", false));
        lblFontName.setText(NbPreferences.forModule(DarculaLAFPanel.class).get("font", DarculaLFCustoms.DEFAULT_FONT));
        reinitUI();
    }

    void store() {
        NbPreferences.forModule(DarculaLAFPanel.class).putBoolean("invertIcons", cbInvertIcons.isSelected());
        NbPreferences.forModule(DarculaLAFPanel.class).putBoolean("overrideFont", cbOverride.isSelected());
        NbPreferences.forModule(DarculaLAFPanel.class).put("font", lblFontName.getText());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFont;
    private javax.swing.JCheckBox cbInvertIcons;
    private javax.swing.JCheckBox cbOverride;
    private javax.swing.JLabel lblFont;
    private javax.swing.JTextField lblFontName;
    private javax.swing.JLabel lblRestart;
    // End of variables declaration//GEN-END:variables
}
