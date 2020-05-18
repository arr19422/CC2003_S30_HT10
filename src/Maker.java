import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Maker {
	
	int vertices = 5;
	String[] departments = new String[] {"Guatemala", "Sacatepeques", "Chimaltenango", "SantaRosa", "Escuintla"}; 
	WeightedGraph.Graph graph = new WeightedGraph.Graph(vertices);
	
	public void generateGraph() {
		try {
			String directorioTexto = System.getProperty("user.dir");
            
			Scanner inputScan = new Scanner(new File(directorioTexto + "\\guategrafo.txt"));
			while (inputScan.hasNextLine()) {
                String line = inputScan.nextLine();
                String[] linePartition = line.split(" ");
                graph.addEdge(Arrays.asList(departments).indexOf(linePartition[0]), Arrays.asList(departments).indexOf(linePartition[1]),
                		Integer.parseInt(linePartition[2])); 
            }
            graph.printGraph();
            Floyd f = new Floyd();
            f.floydWarshall(graph);
			inputScan.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
	}
}
