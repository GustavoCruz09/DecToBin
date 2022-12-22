import javax.swing.JOptionPane;

public class DecToBin{
  
public static void main ( String args[]){
    int v[] = new int[5];

    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero decimal ate 31 para ser convertido em binario"));
    
    for(int i = 4; i >= 0; i--){
        if(n >= 1){
            if((n%2) == 0){
                v[i] = 0;
              } else{
                if((n%2) != 0){
                  v[i] = 1;
                }
              }
            n = n / 2;
        }
    }
    
    String mostra = "";
    
    for(int i = 0; i < 5; i++){
      mostra += (v[i] + " ");
    }
    JOptionPane.showMessageDialog(null, mostra);
  }
}