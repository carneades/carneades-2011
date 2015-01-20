/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrintPreviewDialog.java
 *
 * Created on Aug 25, 2010, 2:56:54 PM
 */

package carneades.editor.uicomponents;

/**
 *
 * @author pal
 */
public class PrintPreviewDialog extends javax.swing.JDialog {

    /** Creates new form PrintPreviewDialog */
    public PrintPreviewDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setMinimumSize(new java.awt.Dimension(12, 46));

        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/document-print.png"))); // NOI18N
        printButton.setText("Print...");
        printButton.setAutoscrolls(true);
        printButton.setFocusable(false);
        printButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jToolBar1.add(printButton);
        jToolBar1.add(jSeparator2);

        jLabel1.setText("Scale: ");
        jToolBar1.add(jLabel1);

        scaleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%", "125%", "150%", "200%", "300%" }));
        scaleComboBox.setSelectedIndex(7);
        scaleComboBox.setMinimumSize(new java.awt.Dimension(100, 27));
        scaleComboBox.setPreferredSize(new java.awt.Dimension(100, 27));
        jToolBar1.add(scaleComboBox);
        jToolBar1.add(jSeparator1);

        portraitToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/portrait.png"))); // NOI18N
        portraitToggleButton.setText("Portrait ");
        portraitToggleButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        portraitToggleButton.setFocusable(false);
        jToolBar1.add(portraitToggleButton);

        landscapeToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landscape.png"))); // NOI18N
        landscapeToggleButton.setText("Landscape ");
        landscapeToggleButton.setFocusable(false);
        jToolBar1.add(landscapeToggleButton);
        jToolBar1.add(jSeparator3);

        closePreviewButton.setText("Close Preview");
        closePreviewButton.setFocusable(false);
        closePreviewButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closePreviewButton.setMaximumSize(new java.awt.Dimension(100, 29));
        closePreviewButton.setMinimumSize(new java.awt.Dimension(100, 29));
        closePreviewButton.setPreferredSize(new java.awt.Dimension(100, 29));
        closePreviewButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(closePreviewButton);

        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrintPreviewDialog dialog = new PrintPreviewDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JButton closePreviewButton = new javax.swing.JButton();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    public final javax.swing.JToggleButton landscapeToggleButton = new javax.swing.JToggleButton();
    public final javax.swing.JPanel mainPanel = new javax.swing.JPanel();
    public final javax.swing.JToggleButton portraitToggleButton = new javax.swing.JToggleButton();
    public final javax.swing.JButton printButton = new javax.swing.JButton();
    public final javax.swing.JComboBox scaleComboBox = new javax.swing.JComboBox();
    // End of variables declaration//GEN-END:variables

}