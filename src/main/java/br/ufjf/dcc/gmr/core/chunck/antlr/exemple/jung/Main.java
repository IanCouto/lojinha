package br.ufjf.dcc.gmr.core.chunck.antlr.exemple.jung;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.event.GraphEvent;
import edu.uci.ics.jung.graph.event.GraphEvent.Vertex;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import java.awt.Dimension;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
    Graph<Integer, String> g = new DirectedSparseMultigraph<>();
    
    g.addVertex(1);
    g.addVertex(2);
    g.addVertex(3);
    g.addVertex(4);
    g.addVertex(5);
    
    g.addEdge("Edge-A", 1, 2);
    g.addEdge("Edge-B", 2, 3);
    g.addEdge("Edge-C", 2, 5);
    g.addEdge("Edge-D", 3, 1);
    g.addEdge("Edge-E", 3, 5);
    g.addEdge("Edge-F", 5, 4);
    g.addEdge("Edge-G", 4, 2);

    Layout<Integer, String> layout = new CircleLayout(g);
    layout.setSize(new Dimension(300,300)); 
    
    BasicVisualizationServer<Integer,String> vv = new BasicVisualizationServer<>(layout);
    vv.setPreferredSize(new Dimension(350,350)); 
    JFrame frame = new JFrame("Simple Graph View");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(vv);
    frame.pack();
    frame.setVisible(true);
    }
}
