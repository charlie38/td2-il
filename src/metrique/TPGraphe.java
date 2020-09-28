package metrique;
import java.io.*;
import java.util.*;
import java.util.logging.*;

import java.io.*;

public class TPGraphe {
	public static void main (String arg[]) throws IOException { 
		
		Logger logger = Logger.getLogger("logs");
		
		// graphe des diviseurs
		Graphe G1 = Graphe.randomDAG(10);  
		logger.log(Level.INFO, G1.toString());
		Graphe.toDot(G1,"prof.dot");
		G1.parcoursProfondeur(true);
		Graphe.toDot(G1,"profDiv.dot");
		G1.setColor("black");
		ArrayList L = G1.triTopologique(true); 
		logger.log(Level.INFO, L.toString());
		Graphe.toDot(G1,"profDiv.dot");


	}
}