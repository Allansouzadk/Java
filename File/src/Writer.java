import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Writer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "C:\\\\tem\\allan123.txt";
		
		String[]  lines = new String[] { " bom dia"," boa tarde", " boa noite"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
				}
	
			}
		
		catch (IOException e) {
			System.out.println("ERROR:"+ e.getMessage());
		
		}
	}
}
