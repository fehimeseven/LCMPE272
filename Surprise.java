import javax.swing.JOptionPane;




public class Surprise {
    
    public static void main(String[] args) {
       
        
        Object [] options= {"Okumaya Devam Etmek �stiyorum", "Okumadan 0 Veriyorum" };
        int n=JOptionPane.showOptionDialog(null, "Transpose Graph taraf�mdan yaz�lamam��t�r!", "DENED�M, OLMADI!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null , options, options[1]);
        if(n==0)
        	JOptionPane.showMessageDialog(null, " ��TE TAM OLARAK B�YLE H�SSED�YORUM:"+"\n"+
        			                            "Bug�nlerde kendimi h�yar gibi hissediyorum" +"\n"+ 
                                                "Hani dilim dilim do�rasalar beni"+"\n"+ 
                                                "Marmara Ege Karadeniz ve hatta Akdeniz cac�k olur diyorum "+"\n"+
                                                "�۟nmek gibi olmas�n ama hocam "+"\n"+
                                                "Kendimi h�yar gibi hissediyorum "+"\n"+
                                                "Hani ince k�y�m do�rasalar beni Akdeniz cac�k olur diyorum "+"\n"+
                                                "Ve hatta Atlas okyanusu ve hatta Hint okyanusu " +"\n"+ 
                                                "Ve hatta hatta B�y�k okyanus bile cac�k olur diyorum "+"\n"+ 
                                                "B�yle cac��a okul mu dayan�r...  "+"\n"+"Sayg�lar..." , "�ZG�N�M", JOptionPane.INFORMATION_MESSAGE);    
        else if(n==1)
        	JOptionPane.showMessageDialog(null, "Peki �yle olsun...", " B�R DAHAK� SEFERE �N�ALLAH ",JOptionPane.ERROR_MESSAGE);
 
        
    }
    
}  