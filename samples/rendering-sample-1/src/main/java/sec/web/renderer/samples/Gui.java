package sec.web.renderer.samples;

import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

import sec.web.renderer.SECRenderer;
import sec.web.renderer.utilities.PNGInfo;
import ArmyC2.C2SD.Utilities.ErrorLogger;
import ArmyC2.C2SD.Utilities.MilStdAttributes;
import ArmyC2.C2SD.Utilities.ModifiersTG;
import ArmyC2.C2SD.Utilities.RendererSettings;

/**
 * @author michael.spinelli
 */
@SuppressWarnings("unused")
public class Gui extends JFrame {
	private static final long serialVersionUID = -7644156159881746816L;

	/**
     * Creates new form gui
     */
    public Gui() {
        initComponents();
        
        //Initialize Renderer
        //change the default renderer settings.
        RendererSettings rs = RendererSettings.getInstance();
        //set default rendering standard to 2525C
        //rs.setSymbologyStandard(RendererSettings.Symbology_2525C);
        //outline modifier text for visibility
        rs.setTextBackgroundMethod(RendererSettings.TextBackgroundMethod_OUTLINE_QUICK);
        //with out modifier text outline
        rs.setTextOutlineWidth(2);
        //outline tactical singlepoints for visibility on map
        rs.setSinglePointSymbolOutlineWidth(1);
    }

    // <editor-fold defaultstate="collapsed" desc="auto generated">
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        panel1 =  new java.awt.Panel();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        button1.setLabel("make ambush kml");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setLabel("draw unit");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setLabel("make ambush json");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button4.setLabel("draw TG");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setLabel("S Range Fan KML");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 251, Short.MAX_VALUE))
                    .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        generateAmbushKML();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        DrawUnit();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        generateAmbushJSON();
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        DrawTG();
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        generateSectorRangeFanKML();
    }//GEN-LAST:event_button5ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables


    private void DrawUnit() {
        try {
             //DRAW UNIT
            SECRenderer sr = SECRenderer.getInstance();
           
            //submarine snorkeling
            String subsnrkl = "SFUPSK----*****";
            String groundUnit = "SFGP------*****";
            String badCode = "BLAH-----------";
            String symbolID = groundUnit;
            
            Map<String,String> params = new HashMap<String, String>();
            
            //params.put(ModifiersUnits.T_UNIQUE_DESIGNATION_1, "T modifier");
            
            //not necessary but you can force different symbology standards on a per symbol basis.
            //params.put(MilStdAttributes.SymbologyStandard, String.valueOf(RendererSettings.Symbology_2525Bch2_USAS_13_14));

            //set symbol size (does not include space that modifiers take up)
            params.put(MilStdAttributes.PixelSize, "50");
            
            //if you want the core symbol size to be exact, set the following
            params.put(MilStdAttributes.KeepUnitRatio, "true");//default is true
            //when true, renderer follows the size chart from 2525C:
            //TABLE VIII. Symbol frame relative sizes
            //if set to true and size is 50, 1.5 = 50
            //so for a hostile unit, 1.44L x 1.44L, it's size would be: 48x48
            
            
            PNGInfo pi = sr.getMilStdSymbolImage(symbolID, params);
            
            Graphics2D graphics = (Graphics2D)panel1.getGraphics();
            graphics.clearRect(0, 0, 800,800);
            graphics.drawImage(pi.getImage(), 0, 0, null);
            
            
            //save image to a file
            pi.saveImageToFile("C:\\unittest.png");
            
            //center image in a sqaure icon the height & width of it's longest side.
            pi = pi.squareImage();//useful for tree icons
            //recommened no modifiers are set and the last 5 characters of the symbolID
            //are "-----" or "*****" so that no display modifiers are shown.
            //tree icons are typically small, all that detail will be useless in 
            //such a tiny image.
            pi.saveImageToFile("C:\\unittestSquare.png");
            
        }
        catch(Exception exc)
        {
            ErrorLogger.LogException("gui", "DrawUnit", exc);
        }
    }

	private void DrawTG() {
		// force a different line color (frame color for units)
		// params.put(MilStdAttributes.LineColor, "FFFFFF");

		try {
             //DRAW TG
            SECRenderer sr = SECRenderer.getInstance();

            //reference point
            String referencePoint = "GFGPGPR---*****";//has no modifiers
            String actionPoint = "GFGPGPP---****X";// has modifiers
            String symbolID = "GFPOLA---****X";//referencePoint;
            
            
            Map<String,String> params = new HashMap<String, String>();
            
            //if symbol has modifiers, you can set them like so:
            params.put(ModifiersTG.T_UNIQUE_DESIGNATION_1, "T modifier");
            
            //not necessary but you can force different symbology standards on a per symbol basis.
            //params.put(MilStdAttributes.SymbologyStandard, String.valueOf(RendererSettings.Symbology_2525Bch2_USAS_13_14));
            params.put(MilStdAttributes.FillColor, "00000000");
            
            params.put(MilStdAttributes.PixelSize, "50");
            
            PNGInfo pi = sr.getMilStdSymbolImage(symbolID, params);
            
            Graphics2D graphics = (Graphics2D)panel1.getGraphics();
            graphics.clearRect(0, 0, 800,800);
            graphics.drawImage(pi.getImage(), 0, 0, null);
            
            
            //save image to a file
            //pi.saveImageToFile("C:\\unittest.png");
		} catch (Exception exc) {
			ErrorLogger.LogException("gui", "DrawTG", exc);
		}
	}

	private void generateAmbushKML() {
		try {
            String modifiers = "";
            //AMBUSH EXAMPLE
            String symbolCode = "GHGPSLA-------X";//ambush
            //var symbolCode = "GHGPGAA-------X"; //assembly area
            String controlPoints = "66.26700036208742,30.62755038706961 66.27555681517738,30.64727776502703 66.25654247497746,30.64632704801704";
            //String controlPoints = "66.26700036208742,30.62755038706961 66.27555681517738,30.64727776502703";
        
            String bbox = "66.25,30.60,66.28,30.65";
            //var bbox = "-180.0,-90.0,180.0,90.0";
            double scale = 50000.0;

            int formatJSON = 1;
            int formatKML = 0;
            int pixelWidth = 800;
            int pixelHeight = 600;

            //change this to format JSON to see the different output.
            int format = formatJSON;
            //var format = formatKML;

			// Let's user choose between 2525Bch2 and 2525C.
			int ms2525Bch2 = RendererSettings.Symbology_2525Bch2_USAS_13_14;// 0;
			int ms2525C = RendererSettings.Symbology_2525C;// 1;
			int symStd = ms2525C;

            String kml = SECRenderer.getInstance().RenderMultiPointSymbol("ID","Name","Description", 
                    symbolCode, controlPoints, "clampToGround",scale, bbox, modifiers,formatKML,symStd);
            
            System.out.println(kml);
		} catch (Exception exc) {
			ErrorLogger.LogException("gui", "generateAmbushKML", exc);
		}
	}

	private void generateAmbushJSON() {
		try {
            String modifiers = "";
            //AMBUSH EXAMPLE
            String symbolCode = "GHGPSLA-------X";//ambush
            //var symbolCode = "GHGPGAA-------X"; //assembly area
            String controlPoints = "66.26700036208742,30.62755038706961 66.27555681517738,30.64727776502703 66.25654247497746,30.64632704801704";
        
            String bbox = "66.25,30.60,66.28,30.65";
            //var bbox = "-180.0,-90.0,180.0,90.0";
            double scale = 50000.0;

            int formatJSON = 1;
            int formatKML = 0;
            int pixelWidth = 800;
            int pixelHeight = 600;

            //change this to format JSON to see the different output.
            int format = formatJSON;
            //var format = formatKML;

			// Let's user choose between 2525Bch2 and 2525C.
			int ms2525Bch2 = RendererSettings.Symbology_2525Bch2_USAS_13_14;// 0;
			int ms2525C = RendererSettings.Symbology_2525C;// 1;
			int symStd = ms2525C;

			String json = SECRenderer.getInstance().RenderMultiPointSymbol2D(
					"uniqueID", "name", "description", symbolCode,
					controlPoints, pixelWidth, pixelHeight, bbox, modifiers,
					formatJSON, symStd);

			System.out.println(json);
		} catch (Exception exc) {
			ErrorLogger.LogException("gui", "generateAmbushJSON", exc);
		}
	}
    
	private void generateSectorRangeFanKML() {
		try {
            //good modifiers
            String modifiers = "{\"modifiers\":{\"distance\":[300,1000],\"azimuth\":[315,45],\"altitudeDepth\":[0]}}";
            //bad modifiers test
            //String modifiers = "{\"modifiers\":{\"distance\":[300,1000],\"azimuth\":[315],\"altitudeDepth\":[0]}}";
            //AMBUSH EXAMPLE
            String symbolCode = "GFFPAXS---****X";//sector range fac
            
            String controlPoints = "66.26700036208742,30.62755038706961";
            
        
            String bbox = "66.25,30.60,66.28,30.65";
            //var bbox = "-180.0,-90.0,180.0,90.0";
            double scale = 50000.0;

            int formatJSON = 1;
            int formatKML = 0;
            int pixelWidth = 800;
            int pixelHeight = 600;

            //change this to format JSON to see the different output.
            int format = formatJSON;
            //var format = formatKML;

			// Let's user choose between 2525Bch2 and 2525C.
			int ms2525Bch2 = RendererSettings.Symbology_2525Bch2_USAS_13_14;// 0;
			int ms2525C = RendererSettings.Symbology_2525C;// 1;
			int symStd = ms2525C;

			String kml = SECRenderer.getInstance().RenderMultiPointSymbol("ID",
					"Name", "Description", symbolCode, controlPoints,
					"clampToGround", scale, bbox, modifiers, formatKML, symStd);

			System.out.println(kml);
		} catch (Exception exc) {
			ErrorLogger.LogException("gui", "generateAmbushKML", exc);
		}
	}

}