import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dem {

	
	public static void main(String[] args) throws IOException {
	
		String fileName = "C:\\Anup\\flatfiles\\GoogleDriveFlatFile_7302018\\flatfile\\flatfile\\Files_Get.csv";
		 File file = new File(fileName);
		String lineToRemove = "\"mno\"";
		 List<String> out = Files.lines(file.toPath())
                 .filter(line -> !line.contains(lineToRemove))
                 .collect(Collectors.toList());
Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
		/*BufferedWriter w=new BufferedWriter(new FileWriter(fileName));
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.filter(line->!line.trim().equals(lineToRemove));
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		 
	}
}
