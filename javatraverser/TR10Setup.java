/*
		A basic implementation of the DeviceSetup class.
*/

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class TR10Setup extends DeviceSetup
{
	public TR10Setup(Frame parent)
	{
		super(parent);
		
		// This code is automatically generated by Visual Cafe when you add
		// components to the visual environment. It instantiates and initializes
		// the components. To modify the code, only use code syntax that matches
		// what Visual Cafe can generate, or Visual Cafe may be unable to back
		// parse your Java file into its visual environment.
		//{{INIT_CONTROLS
		setDeviceTitle("INCAA TR10 CPCI Transient Recorder");
		setDeviceType("TR10");
		getContentPane().setLayout(new BorderLayout(0,0));
		setSize(544,429);
		JPanel2.setLayout(new BorderLayout(0,0));
		getContentPane().add(BorderLayout.NORTH,JPanel2);
		JPanel3.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		JPanel2.add(BorderLayout.NORTH, JPanel3);
		deviceField1.setNumCols(4);
		deviceField1.setOffsetNid(1);
		deviceField1.setLabelString("Board ID: ");
		JPanel3.add(deviceField1);
		deviceChoice5.setOffsetNid(2);
		{
			String[] tempString = new String[2];
			tempString[0] = "LOCAL";
			tempString[1] = "REMOTE";
			deviceChoice5.setChoiceItems(tempString);
		}
		deviceChoice5.setLabelString("Software Mode:");
		JPanel3.add(deviceChoice5);
		deviceField69.setTextOnly(true);
		deviceField69.setOffsetNid(3);
		deviceField69.setLabelString("Crate IP Addr:");
		JPanel3.add(deviceField69);
		JPanel5.setLayout(new BorderLayout(0,0));
		JPanel2.add(BorderLayout.CENTER, JPanel5);
		JPanel7.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		JPanel5.add(BorderLayout.NORTH, JPanel7);
		deviceField2.setNumCols(30);
		deviceField2.setTextOnly(true);
		deviceField2.setOffsetNid(4);
		deviceField2.setLabelString("Comment:");
		JPanel7.add(deviceField2);
		JPanel7.add(deviceDispatch1);
		JPanel8.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		JPanel5.add(BorderLayout.SOUTH, JPanel8);
		deviceField4.setNumCols(15);
		deviceField4.setOffsetNid(7);
		deviceField4.setLabelString("Clock source:");
		JPanel8.add(deviceField4);
		deviceField3.setNumCols(15);
		deviceField3.setOffsetNid(6);
		deviceField3.setLabelString("Trig.  Source:");
		JPanel8.add(deviceField3);
		JPanel6.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		JPanel2.add(BorderLayout.SOUTH, JPanel6);
		JPanel6.setBackground(new java.awt.Color(204,204,204));
		deviceChoice1.setOffsetNid(5);
		{
			String[] tempString = new String[2];
			tempString[0] = "INTERNAL";
			tempString[1] = "EXTERNAL";
			deviceChoice1.setChoiceItems(tempString);
		}
		deviceChoice1.setLabelString("Clock mode:");
		JPanel6.add(deviceChoice1);
		deviceChoice2.setChoiceFloatValues(new float[] {(float)200000.0,(float)100000.0,(float)50000.0,(float)20000.0,(float)10000.0,(float)5000.0,(float)2000.0,(float)1000.0,(float)500.0,(float)200.0,(float)100.0});
		deviceChoice2.setOffsetNid(8);
		{
			String[] tempString = new String[11];
			tempString[0] = "200E3";
			tempString[1] = "100E3";
			tempString[2] = "50E3";
			tempString[3] = "20E3";
			tempString[4] = "10E3";
			tempString[5] = "5E3";
			tempString[6] = "2E3";
			tempString[7] = "1E3";
			tempString[8] = "500";
			tempString[9] = "200";
			tempString[10] = "100";
			deviceChoice2.setChoiceItems(tempString);
		}
		deviceChoice2.setLabelString("Frequency: ");
		JPanel6.add(deviceChoice2);
		{
			String[] tempString = new String[3];
			tempString[0] = "init";
			tempString[1] = "trigger";
			tempString[2] = "store";
			deviceButtons1.setMethods(tempString);
		}
		getContentPane().add(BorderLayout.SOUTH,deviceButtons1);
		getContentPane().add(BorderLayout.CENTER, JTabbedPane1);
		JScrollPane1.setAutoscrolls(true);
		JTabbedPane1.add(JScrollPane1);
		JScrollPane1.setBounds(2,24,539,200);
		JScrollPane1.setVisible(false);
		JViewport1.setExtentSize(new java.awt.Dimension(563,656));
		JViewport1.setViewSize(new java.awt.Dimension(505,656));
		JScrollPane1.getViewport().add(JViewport1);
		JViewport1.setBounds(0,0,521,656);
		JPanel1.setLayout(new GridLayout(16,1,0,0));
		JViewport1.add(JPanel1);
		JPanel1.setBounds(0,0,521,656);
		timeChannel1.setInSameLine(true);
		timeChannel1.setOffsetNid(11);
		timeChannel1.setLabelString("Ch1:");
		timeChannel1.setBorderVisible(true);
		JPanel1.add(timeChannel1);
		deviceField5.setNumCols(15);
		deviceField5.setOffsetNid(12);
		deviceField5.setLabelString("Start :");
		timeChannel1.add(deviceField5);
		deviceField6.setNumCols(15);
		deviceField6.setOffsetNid(13);
		deviceField6.setLabelString("End :");
		timeChannel1.add(deviceField6);
		timeChannel2.setInSameLine(true);
		timeChannel2.setOffsetNid(17);
		timeChannel2.setLabelString("Ch2:");
		timeChannel2.setBorderVisible(true);
		JPanel1.add(timeChannel2);
		deviceField7.setNumCols(15);
		deviceField7.setOffsetNid(18);
		deviceField7.setLabelString("Start :");
		timeChannel2.add(deviceField7);
		deviceField8.setNumCols(15);
		deviceField8.setOffsetNid(19);
		deviceField8.setLabelString("End :");
		timeChannel2.add(deviceField8);
		timeChannel3.setInSameLine(true);
		timeChannel3.setOffsetNid(23);
		timeChannel3.setLabelString("Ch3:");
		timeChannel3.setBorderVisible(true);
		JPanel1.add(timeChannel3);
		deviceField9.setNumCols(15);
		deviceField9.setOffsetNid(24);
		deviceField9.setLabelString("Start :");
		timeChannel3.add(deviceField9);
		deviceField10.setNumCols(15);
		deviceField10.setOffsetNid(25);
		deviceField10.setLabelString("End :");
		timeChannel3.add(deviceField10);
		timeChannel4.setInSameLine(true);
		timeChannel4.setOffsetNid(29);
		timeChannel4.setLabelString("Ch4:");
		timeChannel4.setBorderVisible(true);
		JPanel1.add(timeChannel4);
		deviceField11.setNumCols(15);
		deviceField11.setOffsetNid(30);
		deviceField11.setLabelString("Start :");
		timeChannel4.add(deviceField11);
		deviceField12.setNumCols(15);
		deviceField12.setOffsetNid(31);
		deviceField12.setLabelString("End :");
		timeChannel4.add(deviceField12);
		timeChannel5.setInSameLine(true);
		timeChannel5.setOffsetNid(35);
		timeChannel5.setLabelString("Ch5:");
		timeChannel5.setBorderVisible(true);
		JPanel1.add(timeChannel5);
		deviceField13.setNumCols(15);
		deviceField13.setOffsetNid(36);
		deviceField13.setLabelString("Start :");
		timeChannel5.add(deviceField13);
		deviceField14.setNumCols(15);
		deviceField14.setOffsetNid(37);
		deviceField14.setLabelString("End :");
		timeChannel5.add(deviceField14);
		timeChannel6.setInSameLine(true);
		timeChannel6.setOffsetNid(41);
		timeChannel6.setLabelString("Ch6:");
		timeChannel6.setBorderVisible(true);
		JPanel1.add(timeChannel6);
		deviceField15.setNumCols(15);
		deviceField15.setOffsetNid(42);
		deviceField15.setLabelString("Start :");
		timeChannel6.add(deviceField15);
		deviceField16.setNumCols(15);
		deviceField16.setOffsetNid(43);
		deviceField16.setLabelString("End :");
		timeChannel6.add(deviceField16);
		timeChannel7.setInSameLine(true);
		timeChannel7.setOffsetNid(47);
		timeChannel7.setLabelString("Ch7:");
		timeChannel7.setBorderVisible(true);
		JPanel1.add(timeChannel7);
		deviceField29.setNumCols(15);
		deviceField29.setOffsetNid(48);
		deviceField29.setLabelString("Start :");
		timeChannel7.add(deviceField29);
		deviceField30.setNumCols(15);
		deviceField30.setOffsetNid(49);
		deviceField30.setLabelString("End :");
		timeChannel7.add(deviceField30);
		timeChannel8.setInSameLine(true);
		timeChannel8.setOffsetNid(53);
		timeChannel8.setLabelString("Ch8:");
		timeChannel8.setBorderVisible(true);
		JPanel1.add(timeChannel8);
		deviceField31.setNumCols(15);
		deviceField31.setOffsetNid(54);
		deviceField31.setLabelString("Start :");
		timeChannel8.add(deviceField31);
		deviceField32.setNumCols(15);
		deviceField32.setOffsetNid(55);
		deviceField32.setLabelString("End :");
		timeChannel8.add(deviceField32);
		timeChannel9.setInSameLine(true);
		timeChannel9.setOffsetNid(59);
		timeChannel9.setLabelString("Ch9:");
		timeChannel9.setBorderVisible(true);
		JPanel1.add(timeChannel9);
		deviceField33.setNumCols(15);
		deviceField33.setOffsetNid(60);
		deviceField33.setLabelString("Start :");
		timeChannel9.add(deviceField33);
		deviceField34.setNumCols(15);
		deviceField34.setOffsetNid(61);
		deviceField34.setLabelString("End :");
		timeChannel9.add(deviceField34);
		timeChannel10.setInSameLine(true);
		timeChannel10.setOffsetNid(65);
		timeChannel10.setLabelString("Ch10:");
		timeChannel10.setBorderVisible(true);
		JPanel1.add(timeChannel10);
		deviceField35.setNumCols(15);
		deviceField35.setOffsetNid(66);
		deviceField35.setLabelString("Start :");
		timeChannel10.add(deviceField35);
		deviceField36.setNumCols(15);
		deviceField36.setOffsetNid(67);
		deviceField36.setLabelString("End :");
		timeChannel10.add(deviceField36);
		timeChannel11.setInSameLine(true);
		timeChannel11.setOffsetNid(71);
		timeChannel11.setLabelString("Ch11:");
		timeChannel11.setBorderVisible(true);
		JPanel1.add(timeChannel11);
		deviceField37.setNumCols(15);
		deviceField37.setOffsetNid(72);
		deviceField37.setLabelString("Start :");
		timeChannel11.add(deviceField37);
		deviceField38.setNumCols(15);
		deviceField38.setOffsetNid(73);
		deviceField38.setLabelString("End :");
		timeChannel11.add(deviceField38);
		timeChannel12.setInSameLine(true);
		timeChannel12.setOffsetNid(77);
		timeChannel12.setLabelString("Ch12:");
		timeChannel12.setBorderVisible(true);
		JPanel1.add(timeChannel12);
		deviceField39.setNumCols(15);
		deviceField39.setOffsetNid(78);
		deviceField39.setLabelString("Start :");
		timeChannel12.add(deviceField39);
		deviceField40.setNumCols(15);
		deviceField40.setOffsetNid(79);
		deviceField40.setLabelString("End :");
		timeChannel12.add(deviceField40);
		timeChannel13.setInSameLine(true);
		timeChannel13.setOffsetNid(83);
		timeChannel13.setLabelString("Ch13:");
		timeChannel13.setBorderVisible(true);
		JPanel1.add(timeChannel13);
		deviceField41.setNumCols(15);
		deviceField41.setOffsetNid(84);
		deviceField41.setLabelString("Start :");
		timeChannel13.add(deviceField41);
		deviceField42.setNumCols(15);
		deviceField42.setOffsetNid(85);
		deviceField42.setLabelString("End :");
		timeChannel13.add(deviceField42);
		timeChannel14.setInSameLine(true);
		timeChannel14.setOffsetNid(89);
		timeChannel14.setLabelString("Ch14:");
		timeChannel14.setBorderVisible(true);
		JPanel1.add(timeChannel14);
		deviceField43.setNumCols(15);
		deviceField43.setOffsetNid(90);
		deviceField43.setLabelString("Start :");
		timeChannel14.add(deviceField43);
		deviceField44.setNumCols(15);
		deviceField44.setOffsetNid(91);
		deviceField44.setLabelString("End :");
		timeChannel14.add(deviceField44);
		timeChannel15.setInSameLine(true);
		timeChannel15.setOffsetNid(95);
		timeChannel15.setLabelString("Ch15:");
		timeChannel15.setBorderVisible(true);
		JPanel1.add(timeChannel15);
		deviceField45.setNumCols(15);
		deviceField45.setOffsetNid(96);
		deviceField45.setLabelString("Start :");
		timeChannel15.add(deviceField45);
		deviceField46.setNumCols(15);
		deviceField46.setOffsetNid(97);
		deviceField46.setLabelString("End :");
		timeChannel15.add(deviceField46);
		timeChannel16.setInSameLine(true);
		timeChannel16.setOffsetNid(101);
		timeChannel16.setLabelString("Ch16:");
		timeChannel16.setBorderVisible(true);
		JPanel1.add(timeChannel16);
		deviceField47.setNumCols(15);
		deviceField47.setOffsetNid(102);
		deviceField47.setLabelString("Start :");
		timeChannel16.add(deviceField47);
		deviceField48.setNumCols(15);
		deviceField48.setOffsetNid(103);
		deviceField48.setLabelString("End :");
		timeChannel16.add(deviceField48);
		JTabbedPane1.add(JScrollPane2);
		JScrollPane2.setBounds(2,24,539,200);
		JScrollPane2.setVisible(false);
		JViewport2.setExtentSize(new java.awt.Dimension(563,656));
		JViewport2.setViewSize(new java.awt.Dimension(505,656));
		JScrollPane2.getViewport().add(JViewport2);
		JViewport2.setBounds(0,0,521,656);
		JPanel4.setLayout(new GridLayout(16,1,0,0));
		JViewport2.add(JPanel4);
		JPanel4.setBounds(0,0,521,656);
		idxChannel1.setInSameLine(true);
		idxChannel1.setOffsetNid(11);
		idxChannel1.setLabelString("Ch1:");
		idxChannel1.setBorderVisible(true);
		JPanel4.add(idxChannel1);
		deviceField17.setNumCols(15);
		deviceField17.setOffsetNid(14);
		deviceField17.setLabelString("Start :");
		idxChannel1.add(deviceField17);
		deviceField18.setNumCols(15);
		deviceField18.setOffsetNid(15);
		deviceField18.setLabelString("End :");
		idxChannel1.add(deviceField18);
		idxChannel2.setInSameLine(true);
		idxChannel2.setOffsetNid(17);
		idxChannel2.setLabelString("Ch2:");
		idxChannel2.setBorderVisible(true);
		JPanel4.add(idxChannel2);
		deviceField19.setNumCols(15);
		deviceField19.setOffsetNid(20);
		deviceField19.setLabelString("Start :");
		idxChannel2.add(deviceField19);
		deviceField20.setNumCols(15);
		deviceField20.setOffsetNid(21);
		deviceField20.setLabelString("End :");
		idxChannel2.add(deviceField20);
		idxChannel3.setInSameLine(true);
		idxChannel3.setOffsetNid(23);
		idxChannel3.setLabelString("Ch3:");
		idxChannel3.setBorderVisible(true);
		JPanel4.add(idxChannel3);
		deviceField21.setNumCols(15);
		deviceField21.setOffsetNid(26);
		deviceField21.setLabelString("Start :");
		idxChannel3.add(deviceField21);
		deviceField22.setNumCols(15);
		deviceField22.setOffsetNid(27);
		deviceField22.setLabelString("End :");
		idxChannel3.add(deviceField22);
		idxChannel4.setInSameLine(true);
		idxChannel4.setOffsetNid(29);
		idxChannel4.setLabelString("Ch4:");
		idxChannel4.setBorderVisible(true);
		JPanel4.add(idxChannel4);
		deviceField23.setNumCols(15);
		deviceField23.setOffsetNid(32);
		deviceField23.setLabelString("Start :");
		idxChannel4.add(deviceField23);
		deviceField24.setNumCols(15);
		deviceField24.setOffsetNid(39);
		deviceField24.setLabelString("End :");
		idxChannel4.add(deviceField24);
		idxChannel5.setInSameLine(true);
		idxChannel5.setOffsetNid(35);
		idxChannel5.setLabelString("Ch5:");
		idxChannel5.setBorderVisible(true);
		JPanel4.add(idxChannel5);
		deviceField25.setNumCols(15);
		deviceField25.setOffsetNid(38);
		deviceField25.setLabelString("Start :");
		idxChannel5.add(deviceField25);
		deviceField26.setNumCols(15);
		deviceField26.setOffsetNid(39);
		deviceField26.setLabelString("End :");
		idxChannel5.add(deviceField26);
		idxChannel6.setInSameLine(true);
		idxChannel6.setOffsetNid(41);
		idxChannel6.setLabelString("Ch6:");
		idxChannel6.setBorderVisible(true);
		JPanel4.add(idxChannel6);
		deviceField27.setNumCols(15);
		deviceField27.setOffsetNid(44);
		deviceField27.setLabelString("Start :");
		idxChannel6.add(deviceField27);
		deviceField28.setNumCols(15);
		deviceField28.setOffsetNid(45);
		deviceField28.setLabelString("End :");
		idxChannel6.add(deviceField28);
		idxChannel7.setInSameLine(true);
		idxChannel7.setOffsetNid(47);
		idxChannel7.setLabelString("Ch7:");
		idxChannel7.setBorderVisible(true);
		JPanel4.add(idxChannel7);
		deviceField49.setNumCols(15);
		deviceField49.setOffsetNid(50);
		deviceField49.setLabelString("Start :");
		idxChannel7.add(deviceField49);
		deviceField50.setNumCols(15);
		deviceField50.setOffsetNid(51);
		deviceField50.setLabelString("End :");
		idxChannel7.add(deviceField50);
		idxChannel8.setInSameLine(true);
		idxChannel8.setOffsetNid(53);
		idxChannel8.setLabelString("Ch8:");
		idxChannel8.setBorderVisible(true);
		JPanel4.add(idxChannel8);
		deviceField51.setNumCols(15);
		deviceField51.setOffsetNid(56);
		deviceField51.setLabelString("Start :");
		idxChannel8.add(deviceField51);
		deviceField52.setNumCols(15);
		deviceField52.setOffsetNid(57);
		deviceField52.setLabelString("End :");
		idxChannel8.add(deviceField52);
		idxChannel9.setInSameLine(true);
		idxChannel9.setOffsetNid(59);
		idxChannel9.setLabelString("Ch9:");
		idxChannel9.setBorderVisible(true);
		JPanel4.add(idxChannel9);
		deviceField53.setNumCols(15);
		deviceField53.setOffsetNid(62);
		deviceField53.setLabelString("Start :");
		idxChannel9.add(deviceField53);
		deviceField54.setNumCols(15);
		deviceField54.setOffsetNid(63);
		deviceField54.setLabelString("End :");
		idxChannel9.add(deviceField54);
		idxChannel10.setInSameLine(true);
		idxChannel10.setOffsetNid(65);
		idxChannel10.setLabelString("Ch10:");
		idxChannel10.setBorderVisible(true);
		JPanel4.add(idxChannel10);
		deviceField55.setNumCols(15);
		deviceField55.setOffsetNid(68);
		deviceField55.setLabelString("Start :");
		idxChannel10.add(deviceField55);
		deviceField56.setNumCols(15);
		deviceField56.setOffsetNid(69);
		deviceField56.setLabelString("End :");
		idxChannel10.add(deviceField56);
		idxChannel11.setInSameLine(true);
		idxChannel11.setOffsetNid(71);
		idxChannel11.setLabelString("Ch11:");
		idxChannel11.setBorderVisible(true);
		JPanel4.add(idxChannel11);
		deviceField57.setNumCols(15);
		deviceField57.setOffsetNid(74);
		deviceField57.setLabelString("Start :");
		idxChannel11.add(deviceField57);
		deviceField58.setNumCols(15);
		deviceField58.setOffsetNid(75);
		deviceField58.setLabelString("End :");
		idxChannel11.add(deviceField58);
		idxChannel12.setInSameLine(true);
		idxChannel12.setOffsetNid(77);
		idxChannel12.setLabelString("Ch12:");
		idxChannel12.setBorderVisible(true);
		JPanel4.add(idxChannel12);
		deviceField59.setNumCols(15);
		deviceField59.setOffsetNid(80);
		deviceField59.setLabelString("Start :");
		idxChannel12.add(deviceField59);
		deviceField60.setNumCols(15);
		deviceField60.setOffsetNid(81);
		deviceField60.setLabelString("End :");
		idxChannel12.add(deviceField60);
		idxChannel13.setInSameLine(true);
		idxChannel13.setOffsetNid(83);
		idxChannel13.setLabelString("Ch13:");
		idxChannel13.setBorderVisible(true);
		JPanel4.add(idxChannel13);
		deviceField61.setNumCols(15);
		deviceField61.setOffsetNid(86);
		deviceField61.setLabelString("Start :");
		idxChannel13.add(deviceField61);
		deviceField62.setNumCols(15);
		deviceField62.setOffsetNid(87);
		deviceField62.setLabelString("End :");
		idxChannel13.add(deviceField62);
		idxChannel14.setInSameLine(true);
		idxChannel14.setOffsetNid(89);
		idxChannel14.setLabelString("Ch14:");
		idxChannel14.setBorderVisible(true);
		JPanel4.add(idxChannel14);
		deviceField63.setNumCols(15);
		deviceField63.setOffsetNid(92);
		deviceField63.setLabelString("Start :");
		idxChannel14.add(deviceField63);
		deviceField64.setNumCols(15);
		deviceField64.setOffsetNid(93);
		deviceField64.setLabelString("End :");
		idxChannel14.add(deviceField64);
		idxChannel15.setInSameLine(true);
		idxChannel15.setOffsetNid(95);
		idxChannel15.setLabelString("Ch15:");
		idxChannel15.setBorderVisible(true);
		JPanel4.add(idxChannel15);
		deviceField65.setNumCols(15);
		deviceField65.setOffsetNid(98);
		deviceField65.setLabelString("Start :");
		idxChannel15.add(deviceField65);
		deviceField66.setNumCols(15);
		deviceField66.setOffsetNid(99);
		deviceField66.setLabelString("End :");
		idxChannel15.add(deviceField66);
		idxChannel16.setInSameLine(true);
		idxChannel16.setOffsetNid(101);
		idxChannel16.setLabelString("Ch16:");
		idxChannel16.setBorderVisible(true);
		JPanel4.add(idxChannel16);
		deviceField67.setNumCols(15);
		deviceField67.setOffsetNid(104);
		deviceField67.setLabelString("Start :");
		idxChannel16.add(deviceField67);
		deviceField68.setNumCols(15);
		deviceField68.setOffsetNid(105);
		deviceField68.setLabelString("End :");
		idxChannel16.add(deviceField68);
		JTabbedPane1.setSelectedIndex(0);
		JTabbedPane1.setTitleAt(0,"Channels(Time)");
		JTabbedPane1.setTitleAt(1,"Channels(Samples)");
		//}}
	}

	public TR10Setup()
	{
		this((Frame)null);
	}

	public TR10Setup(String sTitle)
	{
		this();
		setTitle(sTitle);
	}

	static public void main(String args[])
	{
		(new TR10Setup()).setVisible(true);
	}

	public void addNotify()
	{
		// Record the size of the window prior to calling parents addNotify.
		Dimension size = getSize();

		super.addNotify();

		if (frameSizeAdjusted)
			return;
		frameSizeAdjusted = true;

		// Adjust size of frame according to the insets
		Insets insets = getInsets();
		setSize(insets.left + insets.right + size.width, insets.top + insets.bottom + size.height);
	}

	// Used by addNotify
	boolean frameSizeAdjusted = false;

	//{{DECLARE_CONTROLS
	javax.swing.JPanel JPanel2 = new javax.swing.JPanel();
	javax.swing.JPanel JPanel3 = new javax.swing.JPanel();
	DeviceField deviceField1 = new DeviceField();
	DeviceChoice deviceChoice5 = new DeviceChoice();
	DeviceField deviceField69 = new DeviceField();
	javax.swing.JPanel JPanel5 = new javax.swing.JPanel();
	javax.swing.JPanel JPanel7 = new javax.swing.JPanel();
	DeviceField deviceField2 = new DeviceField();
	DeviceDispatch deviceDispatch1 = new DeviceDispatch();
	javax.swing.JPanel JPanel8 = new javax.swing.JPanel();
	DeviceField deviceField4 = new DeviceField();
	DeviceField deviceField3 = new DeviceField();
	javax.swing.JPanel JPanel6 = new javax.swing.JPanel();
	DeviceChoice deviceChoice1 = new DeviceChoice();
	DeviceChoice deviceChoice2 = new DeviceChoice();
	DeviceButtons deviceButtons1 = new DeviceButtons();
	javax.swing.JTabbedPane JTabbedPane1 = new javax.swing.JTabbedPane();
	javax.swing.JScrollPane JScrollPane1 = new javax.swing.JScrollPane();
	javax.swing.JViewport JViewport1 = new javax.swing.JViewport();
	javax.swing.JPanel JPanel1 = new javax.swing.JPanel();
	DeviceChannel timeChannel1 = new DeviceChannel();
	DeviceField deviceField5 = new DeviceField();
	DeviceField deviceField6 = new DeviceField();
	DeviceChannel timeChannel2 = new DeviceChannel();
	DeviceField deviceField7 = new DeviceField();
	DeviceField deviceField8 = new DeviceField();
	DeviceChannel timeChannel3 = new DeviceChannel();
	DeviceField deviceField9 = new DeviceField();
	DeviceField deviceField10 = new DeviceField();
	DeviceChannel timeChannel4 = new DeviceChannel();
	DeviceField deviceField11 = new DeviceField();
	DeviceField deviceField12 = new DeviceField();
	DeviceChannel timeChannel5 = new DeviceChannel();
	DeviceField deviceField13 = new DeviceField();
	DeviceField deviceField14 = new DeviceField();
	DeviceChannel timeChannel6 = new DeviceChannel();
	DeviceField deviceField15 = new DeviceField();
	DeviceField deviceField16 = new DeviceField();
	DeviceChannel timeChannel7 = new DeviceChannel();
	DeviceField deviceField29 = new DeviceField();
	DeviceField deviceField30 = new DeviceField();
	DeviceChannel timeChannel8 = new DeviceChannel();
	DeviceField deviceField31 = new DeviceField();
	DeviceField deviceField32 = new DeviceField();
	DeviceChannel timeChannel9 = new DeviceChannel();
	DeviceField deviceField33 = new DeviceField();
	DeviceField deviceField34 = new DeviceField();
	DeviceChannel timeChannel10 = new DeviceChannel();
	DeviceField deviceField35 = new DeviceField();
	DeviceField deviceField36 = new DeviceField();
	DeviceChannel timeChannel11 = new DeviceChannel();
	DeviceField deviceField37 = new DeviceField();
	DeviceField deviceField38 = new DeviceField();
	DeviceChannel timeChannel12 = new DeviceChannel();
	DeviceField deviceField39 = new DeviceField();
	DeviceField deviceField40 = new DeviceField();
	DeviceChannel timeChannel13 = new DeviceChannel();
	DeviceField deviceField41 = new DeviceField();
	DeviceField deviceField42 = new DeviceField();
	DeviceChannel timeChannel14 = new DeviceChannel();
	DeviceField deviceField43 = new DeviceField();
	DeviceField deviceField44 = new DeviceField();
	DeviceChannel timeChannel15 = new DeviceChannel();
	DeviceField deviceField45 = new DeviceField();
	DeviceField deviceField46 = new DeviceField();
	DeviceChannel timeChannel16 = new DeviceChannel();
	DeviceField deviceField47 = new DeviceField();
	DeviceField deviceField48 = new DeviceField();
	javax.swing.JScrollPane JScrollPane2 = new javax.swing.JScrollPane();
	javax.swing.JViewport JViewport2 = new javax.swing.JViewport();
	javax.swing.JPanel JPanel4 = new javax.swing.JPanel();
	DeviceChannel idxChannel1 = new DeviceChannel();
	DeviceField deviceField17 = new DeviceField();
	DeviceField deviceField18 = new DeviceField();
	DeviceChannel idxChannel2 = new DeviceChannel();
	DeviceField deviceField19 = new DeviceField();
	DeviceField deviceField20 = new DeviceField();
	DeviceChannel idxChannel3 = new DeviceChannel();
	DeviceField deviceField21 = new DeviceField();
	DeviceField deviceField22 = new DeviceField();
	DeviceChannel idxChannel4 = new DeviceChannel();
	DeviceField deviceField23 = new DeviceField();
	DeviceField deviceField24 = new DeviceField();
	DeviceChannel idxChannel5 = new DeviceChannel();
	DeviceField deviceField25 = new DeviceField();
	DeviceField deviceField26 = new DeviceField();
	DeviceChannel idxChannel6 = new DeviceChannel();
	DeviceField deviceField27 = new DeviceField();
	DeviceField deviceField28 = new DeviceField();
	DeviceChannel idxChannel7 = new DeviceChannel();
	DeviceField deviceField49 = new DeviceField();
	DeviceField deviceField50 = new DeviceField();
	DeviceChannel idxChannel8 = new DeviceChannel();
	DeviceField deviceField51 = new DeviceField();
	DeviceField deviceField52 = new DeviceField();
	DeviceChannel idxChannel9 = new DeviceChannel();
	DeviceField deviceField53 = new DeviceField();
	DeviceField deviceField54 = new DeviceField();
	DeviceChannel idxChannel10 = new DeviceChannel();
	DeviceField deviceField55 = new DeviceField();
	DeviceField deviceField56 = new DeviceField();
	DeviceChannel idxChannel11 = new DeviceChannel();
	DeviceField deviceField57 = new DeviceField();
	DeviceField deviceField58 = new DeviceField();
	DeviceChannel idxChannel12 = new DeviceChannel();
	DeviceField deviceField59 = new DeviceField();
	DeviceField deviceField60 = new DeviceField();
	DeviceChannel idxChannel13 = new DeviceChannel();
	DeviceField deviceField61 = new DeviceField();
	DeviceField deviceField62 = new DeviceField();
	DeviceChannel idxChannel14 = new DeviceChannel();
	DeviceField deviceField63 = new DeviceField();
	DeviceField deviceField64 = new DeviceField();
	DeviceChannel idxChannel15 = new DeviceChannel();
	DeviceField deviceField65 = new DeviceField();
	DeviceField deviceField66 = new DeviceField();
	DeviceChannel idxChannel16 = new DeviceChannel();
	DeviceField deviceField67 = new DeviceField();
	DeviceField deviceField68 = new DeviceField();
	//}}

}