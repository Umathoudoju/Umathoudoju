public class Duplicatechar {    
     public static void main(String[] args) {    
        String text = "tomato";
        System.out.println(text);
        int count;    
        char textarr[] = text.toCharArray();      
        for(int i = 0; i <textarr.length; i++) {    
            count = 1;    
            for(int j = i+1; j <textarr.length; j++) {    
                if(textarr[i] == textarr[j] && textarr[i] != ' ') {    
                    count++;       
                    textarr[j] = '0';    
                }    
            }    
                
            if(count > 1 && textarr[i] != '0')    
                System.out.println(textarr[i]);    
        }    
    }    
}     