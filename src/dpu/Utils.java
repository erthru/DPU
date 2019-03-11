/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpu;

import com.digitalpersona.uareu.Fid;
import java.awt.image.BufferedImage;

/**
 *
 * @author JOHN
 */
public class Utils {
    
    public static BufferedImage getImageFromFid(Fid image){
        
        Fid.Fiv view = image.getViews()[0];
        BufferedImage buffImage = null;
	buffImage = new BufferedImage(view.getWidth(), view.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
	buffImage.getRaster().setDataElements(0, 0, view.getWidth(), view.getHeight(), view.getImageData());
        
        return buffImage;
        
    }
    
}
