/*Question Number: 2095
Level: Medium
Topic Covered:Array,String,Simulation
Date: 4th April 2026
 */
public class DecodeCipherText {
    public String decodeCiphertext(String encodedText, int rows) {
        StringBuilder sb=new StringBuilder();
        int lg=encodedText.length();
        int col=lg/rows;
        for(int i=0;i<col;i++){
            sb.append(encodedText.charAt(i));
            for(int j=i+col+1;j<lg;j=j+col+1){
                sb.append(encodedText.charAt(j));
            }
        }
        return sb.toString().replaceAll("\\s+$", "");
    }
}
