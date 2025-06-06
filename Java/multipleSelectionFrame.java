
 import java.awt.FlowLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.JFrame;
 import javax.swing.JList;
 import javax.swing.JButton;
 import javax.swing.JScrollPane;
 import javax.swing.ListSelectionModel;
 
 public class MultipleSelectionFrame extends JFrame
 {
private JList<String> burgerJList; // list to hold burger names
private JList copyJList; // list to copy burger names into
private JButton copyJButton; // button to copy selected names
private static final String[] burgerNames =
{"Mushroom", "Onion and Cheese", "Red Pepper and Bacon", "Italian", "Lip Smacker", "Texan", "Californian", "Chili", "Bleu Cheese", "Fried Egg", "Triple Threat", "Veggie"};
// MultipleSelection Frame constructor
public MultipleSelectionFrame()
{
super( "Multiple Selection Lists");
setLayout( new FlowLayout() ); // set frame layout
burgerJList = new JList<>( burgerNames ); // holds names of all burgers
burgerJList.setVisibleRowCount( 5 ); // show five rows
burgerJList.setFixedCellWidth( 140 ); // set width
burgerJList.setFixedCellHeight( 15 ); // set height
burgerJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
add(new JScrollPane( burgerJList ) ); // add list with scrollpane

copyJButton = new JButton("Copy >>>"); // create copy button
copyJButton.addActionListener(
new ActionListener() // anonymous inner class
{
// handle button event
public void actionPerformed( ActionEvent event)
{
// place selected values in copy]List
copyJList.setListData( burgerJList.getSelectedValues() );
} // end method actionPerformed
} // end anonymous inner class
); // end call to addActionListener
add(copyJButton); // add copy button to JFrame 
copyJList = new JList(); // create list to hold copied burger names

copyJList.setVisibleRowCount( 5 ); // show 5 rows
copyJList.setFixedCellWidth( 140 ); // set width
copyJList.setFixedCellHeight( 15 ); // set height
copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION );
add(new JScrollPane( copyJList ) ); // add list with scrollpane
} // end MultipleSelection Frame constructor
} // end class MultipleSelection Frame
