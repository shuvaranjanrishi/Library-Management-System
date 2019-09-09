
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class AllBooks extends javax.swing.JFrame {
    
    Connection connection;
    ResultSet resultSet;
    PreparedStatement preparedStatement;
    DefaultTableModel defaultTableModel;
    
    public AllBooks() {
        super("Book List");
        initComponents();
        connection=JavaConnect.connectDB();
        setAllBooksToTheTable();
        defaultTableModel =  (DefaultTableModel) all_book_table_id.getModel();
        
    }
    
    public void setAllBooksToTheTable(){
        
        bookListTitleId.setText("All Books");
        try{
            String sql = "SELECT book_id AS 'Book Id', book_name AS 'Book Name', department AS 'Department', edition AS 'Edition', writer AS 'Writer', pages AS 'Pages', price AS 'Price' FROM book_list";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            all_book_table_id.setModel(DbUtils.resultSetToTableModel(resultSet));
            jLabel_total_books_number.setText(String.valueOf(all_book_table_id.getRowCount()));
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                preparedStatement.close();
                resultSet.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        all_book_table_id = new javax.swing.JTable();
        bookListTitleId = new javax.swing.JLabel();
        jTextField_search_book = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_total_books_number = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_item_cse = new javax.swing.JMenuItem();
        menu_item_eng = new javax.swing.JMenuItem();
        menu_item_eee = new javax.swing.JMenuItem();
        menu_item_ece = new javax.swing.JMenuItem();
        menu_item_law = new javax.swing.JMenuItem();
        menu_item_bba = new javax.swing.JMenuItem();
        show_all_books_id = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(102, 0, 51))); // NOI18N

        all_book_table_id.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        all_book_table_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                all_book_table_idMouseClicked(evt);
            }
        });
        all_book_table_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                all_book_table_idKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(all_book_table_id);

        bookListTitleId.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bookListTitleId.setForeground(new java.awt.Color(255, 255, 255));
        bookListTitleId.setText("All Books");

        jTextField_search_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_search_bookActionPerformed(evt);
            }
        });
        jTextField_search_book.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_search_bookKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Search Book: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Total Books: ");

        jLabel_total_books_number.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_total_books_number.setText("number");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel_total_books_number)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookListTitleId)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_search_book, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_search_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel_total_books_number)
                            .addComponent(bookListTitleId))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn)
                .addContainerGap())
        );

        jMenu1.setText("Show Books");

        menu_item_cse.setText("Show As CSE");
        menu_item_cse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_cseActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_cse);

        menu_item_eng.setText("Show As ENG");
        menu_item_eng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_engActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_eng);

        menu_item_eee.setText("Show As EEE");
        menu_item_eee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_eeeActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_eee);

        menu_item_ece.setText("Show As ECE");
        menu_item_ece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_eceActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_ece);

        menu_item_law.setText("Show As LAW");
        menu_item_law.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_lawActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_law);

        menu_item_bba.setText("Show As BBA");
        menu_item_bba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_bbaActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_bba);

        show_all_books_id.setText("Show All Books");
        show_all_books_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_all_books_idActionPerformed(evt);
            }
        });
        jMenu1.add(show_all_books_id);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        Home ob = new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void menu_item_engActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_engActionPerformed
        bookListTitleId.setText("Books of ENG");
        try{
            String sql = "SELECT book_id AS 'Book Id', book_name AS 'Book Name', department AS 'Department', edition AS 'Edition', writer AS 'Writer', pages AS 'Pages', price AS 'Price' FROM new_book WHERE department = 'ENG'";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            all_book_table_id.setModel(DbUtils.resultSetToTableModel(resultSet));
            jLabel_total_books_number.setText(String.valueOf(all_book_table_id.getRowCount()));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                preparedStatement.close();
                resultSet.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menu_item_engActionPerformed

    private void menu_item_cseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_cseActionPerformed
       
        bookListTitleId.setText("Books of CSE");
        
        try{
            String sql = "SELECT book_id AS 'Book Id', book_name AS 'Book Name', department AS 'Department', edition AS 'Edition', writer AS 'Writer', pages AS 'Pages', price AS 'Price' FROM new_book WHERE department = 'CSE'";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            all_book_table_id.setModel(DbUtils.resultSetToTableModel(resultSet));
            jLabel_total_books_number.setText(String.valueOf(all_book_table_id.getRowCount()));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                preparedStatement.close();
                resultSet.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menu_item_cseActionPerformed

    private void menu_item_eeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_eeeActionPerformed
        bookListTitleId.setText("Books of EEE");
        try{
            String sql = "SELECT book_id AS 'Book Id', book_name AS 'Book Name', department AS 'Department', edition AS 'Edition', writer AS 'Writer', pages AS 'Pages', price AS 'Price' FROM new_book WHERE department = 'EEE'";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            all_book_table_id.setModel(DbUtils.resultSetToTableModel(resultSet));
            jLabel_total_books_number.setText(String.valueOf(all_book_table_id.getRowCount()));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                preparedStatement.close();
                resultSet.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menu_item_eeeActionPerformed

    private void menu_item_eceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_eceActionPerformed
        bookListTitleId.setText("Books of ECE");
        try{
            String sql = "SELECT book_id AS 'Book Id', book_name AS 'Book Name', department AS 'Department', edition AS 'Edition', writer AS 'Writer', pages AS 'Pages', price AS 'Price' FROM new_book WHERE department = 'ECE'";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            all_book_table_id.setModel(DbUtils.resultSetToTableModel(resultSet));
            jLabel_total_books_number.setText(String.valueOf(all_book_table_id.getRowCount()));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                preparedStatement.close();
                resultSet.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menu_item_eceActionPerformed

    private void menu_item_lawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_lawActionPerformed
        bookListTitleId.setText("Books of LAW");
        try{
            String sql = "SELECT book_id AS 'Book Id', book_name AS 'Book Name', department AS 'Department', edition AS 'Edition', writer AS 'Writer', pages AS 'Pages', price AS 'Price' FROM new_book WHERE department = 'LAW'";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            all_book_table_id.setModel(DbUtils.resultSetToTableModel(resultSet));
            jLabel_total_books_number.setText(String.valueOf(all_book_table_id.getRowCount()));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                preparedStatement.close();
                resultSet.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menu_item_lawActionPerformed

    private void menu_item_bbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_bbaActionPerformed
        bookListTitleId.setText("Books of BBA");
        try{
            String sql = "SELECT book_id AS 'Book Id', book_name AS 'Book Name', department AS 'Department', edition AS 'Edition', writer AS 'Writer', pages AS 'Pages', price AS 'Price' FROM new_book WHERE department = 'BBA'";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            all_book_table_id.setModel(DbUtils.resultSetToTableModel(resultSet));
            jLabel_total_books_number.setText(String.valueOf(all_book_table_id.getRowCount()));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                preparedStatement.close();
                resultSet.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menu_item_bbaActionPerformed

    private void show_all_books_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_all_books_idActionPerformed
        setAllBooksToTheTable();
    }//GEN-LAST:event_show_all_books_idActionPerformed

    private void jTextField_search_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_search_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_search_bookActionPerformed

    private void jTextField_search_bookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_bookKeyReleased
        
        String query = jTextField_search_book.getText();

        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(defaultTableModel);
        all_book_table_id.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + query));
        jLabel_total_books_number.setText(String.valueOf(all_book_table_id.getRowCount()));
    }//GEN-LAST:event_jTextField_search_bookKeyReleased

    private void all_book_table_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_book_table_idMouseClicked

        int row = all_book_table_id.getSelectedRow();
        
        if (all_book_table_id.getRowSorter() != null) {
            row = all_book_table_id.getRowSorter().convertRowIndexToModel(row);
        }
        String id = (all_book_table_id.getModel().getValueAt(row, 0)).toString();

        BookUpdateForm buf = new BookUpdateForm();
        buf.setDataToTheField(id);
        buf.setVisible(true);

    
    }//GEN-LAST:event_all_book_table_idMouseClicked

    private void all_book_table_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_all_book_table_idKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_all_book_table_idKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable all_book_table_id;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bookListTitleId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_total_books_number;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_search_book;
    private javax.swing.JMenuItem menu_item_bba;
    private javax.swing.JMenuItem menu_item_cse;
    private javax.swing.JMenuItem menu_item_ece;
    private javax.swing.JMenuItem menu_item_eee;
    private javax.swing.JMenuItem menu_item_eng;
    private javax.swing.JMenuItem menu_item_law;
    private javax.swing.JMenuItem show_all_books_id;
    // End of variables declaration//GEN-END:variables
}
