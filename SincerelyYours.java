

import javax.swing.JOptionPane;


public class SincerelyYours {
    
    public static void main(String[] args) {
       
        
        Object [] options= {"Okumaya Devam Etmek �stiyorum", "Okumadan 0 Veriyorum" };
        int n=JOptionPane.showOptionDialog(null, "Merhaba Hocam,"+"\n"+"Transpose Graph taraf�mdan yaz�lamad��� i�in �devi tamamlayamad�m!", "DENED�M, OLMADI!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null , options, options[1]);
        if(n==0)
        	JOptionPane.showMessageDialog(null, "YAPAMADIM. U�RA�TIM, EMEK VERD�M. BU SEFER OLMADI BELK�, AMA �NEML� OLAN VARILAN YER DE��L"+"\n" 
                                               +"YOLCULU�UN KEND�S� �SE BU �DEV� YAPAMAMI� OLMAMI B�R BA�ARISIZLIK OLARAK DE�ERLEND�REMEY�Z."+"\n "+
        			                            "�NEML� OLAN BU �DEV YOLCULU�UNDA HARCADI�IM EMEK �SE OLDUK�A BA�ARILI OLDU�UMU D�ކNEB�L�R�Z BENCE."+"\n"+
                                                "FAKAT Y�NE DE KANAAT S�Z�ND�R. "+"\n"+ "SAYGILARIMLA..." , "�ZG�N�M", JOptionPane.INFORMATION_MESSAGE);    
        else if(n==1)
        	JOptionPane.showMessageDialog(null, "Peki �yle olsun...", "  ",JOptionPane.ERROR_MESSAGE);
 
        
    }
    
}  


