/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import models.Test;
import services.ThongKeTestService;
import utility.ClassTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hieppm
 */
public class ThongKeTest extends javax.swing.JPanel {

    private final String[] COLUMNS = {"Mã test", "ID nhân khẩu", "Thời điểm test", "Hình thức test", "Kết quả"};
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private int stateButton;
    private ThongKeTestService service;
    private List<Test> testList;
    private ClassTableModel classTableModel;
    /**
     * Creates new form ThongKeTest
     */
    public ThongKeTest() {
        initComponents();
        this.stateButton = 0;
        setData();
        setDataTable();
    }

    public ThongKeTestService getService() {
        return service;
    }

    public void setService(ThongKeTestService service) {
        this.service = service;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public int getStateButton() {
        return stateButton;
    }

    public void setStateButton(int stateButton) {
        this.stateButton = stateButton;
    }

    public String[] getCOLUMNS() {
        return COLUMNS;
    }


    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    public ClassTableModel getClassTableModel() {
        return classTableModel;
    }

    public void setClassTableModel(ClassTableModel classTableModel) {
        this.classTableModel = classTableModel;
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        classTableModel = new ClassTableModel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 697, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 385, Short.MAX_VALUE)
        );

        jLabel1.setText("Kết quả test: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Âm tính", "Dương tính"}));

        jLabel2.setText("Thời gian test: ");

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(jLabel1)
                                                .addGap(1, 1, 1)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addComponent(jButton1)))
                                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addGap(31, 31, 31)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            stateButton = 1;
            setData();
            setDataTable();
    }

    public void setData() {
        ThongKeTestService service = new ThongKeTestService();
        String tinhTrangGender = (String) jComboBox1.getSelectedItem();
        String tgian = jTextField1.getText();
        while (!service.validateJavaDate(tgian)) {
            JOptionPane.showMessageDialog(null, "Thời gian cần có định dạng yyyy-MM-dd!", "Input Error", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
            tgian = jTextField1.getText();
        }
        List<Test> listItem = service.getALlListTest();
        try {
            if (tinhTrangGender == null) {
                JOptionPane.showMessageDialog(null, "Chưa chọn kết quả thống kê!", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                if (stateButton == 1)
                    listItem = service.getListCachLy(tinhTrangGender, tgian);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng kiểu dữ liệu!!", "Warring", JOptionPane.ERROR_MESSAGE);
        }
        this.testList = listItem;
        setDataTable();
    }

    public void setDataTable() {
        List<Test> listItem = new ArrayList<>();
        this.testList.forEach(test -> {
            listItem.add(test);
        });
        DefaultTableModel model = classTableModel.setTableTest(listItem, COLUMNS);
        JTable table = new JTable(model);

        // thiet ke bang
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.getColumnModel().getColumn(0).setMaxWidth(80);
        table.getColumnModel().getColumn(0).setMinWidth(80);
        table.getColumnModel().getColumn(0).setPreferredWidth(80);

        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jPanel1.removeAll();
        jPanel1.setLayout(new CardLayout());
        jPanel1.add(scroll);
        jPanel1.validate();
        jPanel1.repaint();
    }
    // End of variables declaration

}
