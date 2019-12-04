package br.com.leonardonowacki.barbearia.view;

import javax.swing.text.JTextComponent;
import lombok.experimental.UtilityClass;

@UtilityClass
public class View {
    
    public void limpar(JTextComponent... campos) {
        for (JTextComponent campo : campos) {
            campo.setText("");
        }
    }    
}
