package paoc.actions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import paoc.Application;
import paoc.helper.IImageKeys;

public class ProbeToFeatureMappingAction extends Action implements ISelectionListener,IWorkbenchAction{
	
	private final IWorkbenchWindow window;
	
	public final static String ID = "edit_mapping_between_probe_and_attribute";

	public ProbeToFeatureMappingAction(IWorkbenchWindow window){
		this.window = window;
		this.setId(ID);
		this.setText("&Probe Map To Feature");
		this.setToolTipText("Edit the mapping between probe and feature");
		this.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.PROBETOFEATUREMAPPING));
		this.window.getSelectionService().addSelectionListener(this);
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		this.window.getSelectionService().removeSelectionListener(this);
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	public void run(){
		final List<ProbeToFeatureMapping> mappings = GetMappings.getProbeToFeatureMappings();
		
		class ProbeToFeatureMappingTable {

			 class Table_Model extends AbstractTableModel {
					private static final long serialVersionUID = -7495940408592595397L;
					
					private Vector content = null;
	
					private String[] title_name = { "ID", "Probe Type", "Feature Type"};
	
					public Table_Model() {
						content = new Vector();
					}
	
					public Table_Model(int count) {
						content = new Vector(count);
					}
	
					public void addRow(String probeType, String featureType) {
						Vector v = new Vector(3);
						v.add(0, new Integer(content.size()));
						v.add(1, probeType);
						v.add(2, featureType);
						content.add(v);
					}
	
	
					public void removeRow(int row) {
						content.remove(row);
						for(int i = 0; i < content.size(); i ++){
							this.setValueAt(i, i, 0);
						}
					}
	
					public void removeRows(int row, int count) {
						for (int i = 0; i < count; i++) {
							if (content.size() > row) {
								content.remove(row);
							}
						}
					}
	
					 public boolean isCellEditable(int rowIndex, int columnIndex) {
						 if (columnIndex == 0) {
							 return false;
						 }
						 return true;
					 }
	
					 public void setValueAt(Object value, int row, int col) {
						 ((Vector) content.get(row)).remove(col);
						 ((Vector) content.get(row)).add(col, value);
						 this.fireTableCellUpdated(row, col);
					 }
	
					 public String getColumnName(int col) {
						 return title_name[col];
					 }
	
					 public int getColumnCount() {
						 return title_name.length;
					 }
	
					 public int getRowCount() {
						 return content.size();
					 }
	
					 public Object getValueAt(int row, int col) {
						 return ((Vector) content.get(row)).get(col);
					 }
	
					 public Class getColumnClass(int col) {
						 return getValueAt(0, col).getClass();
					 }
	
				}
			 private JFrame frame;
	
			 private JTable table;
	
			 private Table_Model model;
	
			 private JScrollPane s_pan;
	
			 private JButton button_1, button_2, button_3;
	
			 private JPanel pane;
	
			 public ProbeToFeatureMappingTable() {
				 frame = new JFrame("Probe to Feature Mappings");
				 pane = new JPanel();
				 
				 button_1 = new JButton("Add Mapping");
				 button_1.addActionListener(new ActionListener() {
					 public void actionPerformed(ActionEvent e) {
						 addData();
					 }
				 });
				 
				 button_2 = new JButton("Remove Mapping");
				 button_2.addActionListener(new ActionListener() {
					 public void actionPerformed(ActionEvent e) {
						 removeData();
					 }
				 });
				 
				 button_3 = new JButton("Save Mapping");
				 button_3.addActionListener(new ActionListener() {
					 public void actionPerformed(ActionEvent e) {
						 saveData();
					 }
				 });
				 
				 pane.add(button_1);
				 pane.add(button_2);
				 pane.add(button_3);
				 
				 model = new Table_Model(200);
				 
				 for(int i = 0; i < mappings.size(); i++){
					 model.addRow(mappings.get(i).getProbeType(), mappings.get(i).getFeatureType());
				 }
				 
				 table = new JTable(model);
				 table.setBackground(Color.white);
				 TableColumnModel tcm = table.getColumnModel();
				 tcm.getColumn(0).setPreferredWidth(100);
				 tcm.getColumn(1).setPreferredWidth(150);
				 tcm.getColumn(2).setPreferredWidth(150);
	
				 s_pan = new JScrollPane(table);
	
				 frame.getContentPane().add(s_pan, BorderLayout.CENTER);
				 frame.getContentPane().add(pane, BorderLayout.SOUTH);
				 frame.setSize(400, 300);
				 frame.setVisible(true);
				 frame.setResizable(false);
				 frame.setLocation(300, 200);
	
			 }
			 
				class GetProbeToFeatureMappingDialog extends Dialog implements ActionListener{

					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;
					JLabel label1 = new JLabel("Probe Type");
					JLabel label2 = new JLabel("Feature Type");
					JTextField probeTextField = new JTextField(64);
					JTextField featureTextField = new JTextField(64);
					JButton ok = new JButton("OK");
					JButton cancel = new JButton("Cancle");
					public GetProbeToFeatureMappingDialog(JFrame parent) {
						super(parent);
						// TODO Auto-generated constructor stub
						this.setTitle("Add Probe to Feature Mapping");
						this.setSize(300, 140);
						this.setResizable(false);
						this.setVisible(true);
						this.add(label1);
						this.add(label2);
						label1.setBounds(30, 30, 100, 20);
						label2.setBounds(30, 60, 100, 20);
						this.add(probeTextField);
						this.add(featureTextField);
						probeTextField.setBounds(140, 30, 130, 20);
						featureTextField.setBounds(140, 60, 130, 20);
						this.add(ok);
						this.add(cancel);
						ok.setBounds(30, 100, 100, 25);
						cancel.setBounds(170, 100, 100, 25);
						ok.addActionListener(this);
						cancel.addActionListener(this);
						this.setLocation(500, 220);
					}

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(e.getSource().equals(ok)){
							String probeType = this.probeTextField.getText();
							String featureType = this.featureTextField.getText();
							if(probeType.equals("") || featureType.equals(""))
								JOptionPane.showMessageDialog(null, "Input is not completed", "Error", JOptionPane.ERROR_MESSAGE);
							else{
								boolean ifExisted = false;
								for(int i = 0; i < mappings.size(); i++){
									ProbeToFeatureMapping model = mappings.get(i);
									if(probeType.equals(model.getProbeType()) && featureType.equals(model.getFeatureType())){
										JOptionPane.showMessageDialog(null, "This mapping has already existed", "Error", JOptionPane.ERROR_MESSAGE);
										ifExisted = true;
										break;
									}
								}
								if(!ifExisted){
									mappings.add(new ProbeToFeatureMapping(probeType, featureType));
									model.addRow(probeType, featureType);
									 table.updateUI();
								}

								this.probeTextField.setText("");
								this.featureTextField.setText("");
							}
							
						}
						else 
							dispose();
					}
					
				}
	
			 private void addData() {
				 new GetProbeToFeatureMappingDialog(frame);
			 }
	
			 private void removeData() {
				 if(table.getSelectedRow() < 0){
					 JOptionPane.showMessageDialog(null, "Haven't selected any item", "Error", JOptionPane.ERROR_MESSAGE);
				 }
				 else{
					 String probeType = (String) model.getValueAt(table.getSelectedRow(), 1);
					 String featureType = (String) model.getValueAt(table.getSelectedRow(), 2);
					 for(int i = 0;  i < mappings.size(); i++){
						 if(probeType.equals(mappings.get(i).getProbeType()) && featureType.equals(mappings.get(i).getFeatureType())){
							 mappings.remove(i);
							 break;
						 }
					 }
					 model.removeRow(table.getSelectedRow());
					 table.updateUI();
				 }
			 }
	
			 private void saveData() {
				 mappings.clear();
				 for(int i = 0; i < model.getRowCount(); i ++)
					 mappings.add(new ProbeToFeatureMapping((String)model.getValueAt(i, 1), 
							 (String)model.getValueAt(i, 2))); 
				 PutMappings.putProbeToFeatureMappings(mappings);
				 frame.setVisible(false);
			 }
		 }
		new ProbeToFeatureMappingTable();
	}

}
