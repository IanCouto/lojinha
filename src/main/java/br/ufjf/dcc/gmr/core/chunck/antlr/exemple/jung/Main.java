/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunck.antlr.exemple.jung;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.event.GraphEvent;
import edu.uci.ics.jung.graph.event.GraphEvent.Vertex;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author onofre
 */
public class Main {
    public static void main(String[] args) {
        
        Graph<Vertice, Aresta> graph = new DirectedSparseMultigraph<Vertice, Aresta>();
        
        Vertice loja = new Vertice(0,0);
        Vertice a = new Vertice(0,1);
        Vertice b = new Vertice(1,2);
        Vertice c = new Vertice(1,3);
        Vertice d = new Vertice(2,0);
        Vertice e = new Vertice(2,1);
        Vertice f = new Vertice(3,1);
        
        
        graph.addVertex(loja);
        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);
        
        Aresta la = new Aresta(loja, a);
        Aresta lb = new Aresta(loja, b);
        Aresta lc = new Aresta(loja, c);
        Aresta ld = new Aresta(loja, d);
        Aresta le = new Aresta(loja, e);
        Aresta lf = new Aresta(loja, f);
        Aresta de = new Aresta(d,e);
        
        graph.addEdge(la,loja,a);
        graph.addEdge(lb,loja,b);
        graph.addEdge(lc,loja,c);
        graph.addEdge(ld,loja,d);
        graph.addEdge(le,loja,e);
        graph.addEdge(lf,loja,f);
        graph.addEdge(de,d,e);
               
        
        Layout< Vertice, Aresta > layout = new FRLayout<Vertice, Aresta>(graph);
        layout.setSize(new Dimension(300,300)); 

        BasicVisualizationServer<Vertice, Aresta> vv = new BasicVisualizationServer<>(layout);
        vv.setPreferredSize(new Dimension(350,350)); 
        
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        
        JFrame frame = new JFrame("Simple Graph View");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }
} 
 
