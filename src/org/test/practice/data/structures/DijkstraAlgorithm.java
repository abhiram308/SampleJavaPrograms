package org.test.practice.data.structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Node {
	private String name;
	private List<Node> adjecentNodes;
}

@Getter
@Setter
class Edge {
	private Node source;
	private Node destination;
	private int distance;
}

@Getter
@Setter
class Graph {
	Set<Node> nodes;
	Set<Edge> edges;
}

@Getter
@Setter
class DijkstraNode {
	private Node node;
	private boolean isVisited;
	private int minDistance;

}

public class DijkstraAlgorithm {
	final static int INFINITY = 99999;
	
	public static void main(String[] args) {
		DijkstraAlgorithm algorithm = new DijkstraAlgorithm();
		Graph graph = algorithm.createGraph();
		Set<Node> nodes = graph.getNodes(); 
		List<DijkstraNode> dijkstraNodes = algorithm.createDijkstraNodes(nodes);
		Node source = dijkstraNodes.get(0).getNode();
		Node destination = dijkstraNodes.get(dijkstraNodes.size() - 1).getNode();
		List<DijkstraNode> path = algorithm.findOptimalPath(dijkstraNodes, source, destination);
		
		for(DijkstraNode dijkstraNode : path) {
			System.out.println(dijkstraNode.getNode().getName());
		}
	}
	
	public List<DijkstraNode> findOptimalPath(List<DijkstraNode> dijkstraNodes, Node source, Node destination) {
		List<DijkstraNode> path = new ArrayList<>();
		
		return path;
	}
	
	public List<DijkstraNode> createDijkstraNodes(Set<Node> nodes) {
		Node[] nodesList = nodes.toArray(new Node[nodes.size()]);
		List<DijkstraNode> dijkstraNodes = new ArrayList<DijkstraNode>();
		for(Node node : nodesList) {
			DijkstraNode dijkstraNode = new DijkstraNode();
			dijkstraNode.setNode(node);
			dijkstraNode.setMinDistance(INFINITY);
			dijkstraNode.setVisited(false);
			dijkstraNodes.add(dijkstraNode);
		}
		
		return dijkstraNodes;
	}
	
	public Graph createGraph() {
		Graph graph = new Graph();
		Set<Node> nodes = getNodes();
		Set<Edge> edges = getEdges(nodes);
		graph.setNodes(nodes);
		graph.setEdges(edges);
		
		return graph;
	}
	
	public Set<Node> getNodes() {
		Set<Node> nodes = new HashSet<Node>();
		
		Node node0 = new Node();
		node0.setName("0");
		nodes.add(node0);
		
		Node node1 = new Node();
		node1.setName("1");
		nodes.add(node1);
		
		Node node2 = new Node();
		node2.setName("2");
		nodes.add(node2);
		
		Node node3 = new Node();
		node3.setName("3");
		nodes.add(node3);
		
		Node node4 = new Node();
		node4.setName("4");
		nodes.add(node4);
		
		Node node5 = new Node();
		node5.setName("5");
		nodes.add(node5);
		
		Node node6 = new Node();
		node6.setName("6");
		nodes.add(node6);
		
		Node node7 = new Node();
		node7.setName("7");
		nodes.add(node7);
		
		Node node8 = new Node();
		node8.setName("8");
		nodes.add(node8);
		
		return nodes;
	}
	
	public Set<Edge> getEdges(Set<Node> nodes) {
		Set<Edge> edges = new HashSet<Edge>();
		Node[] nodesList = nodes.toArray(new Node[nodes.size()]);
		
		Edge edge1 = new Edge();
		edge1.setSource(nodesList[0]);
		edge1.setDestination(nodesList[1]);
		edge1.setDistance(4);
		
		Edge edge2 = new Edge();
		edge2.setSource(nodesList[0]);
		edge2.setDestination(nodesList[7]);
		edge2.setDistance(8);
		
		Edge edge3 = new Edge();
		edge3.setSource(nodesList[1]);
		edge3.setDestination(nodesList[7]);
		edge3.setDistance(11);

		Edge edge4 = new Edge();
		edge4.setSource(nodesList[1]);
		edge4.setDestination(nodesList[2]);
		edge4.setDistance(8);

		Edge edge5 = new Edge();
		edge5.setSource(nodesList[7]);
		edge5.setDestination(nodesList[8]);
		edge5.setDistance(7);

		Edge edge6 = new Edge();
		edge6.setSource(nodesList[7]);
		edge6.setDestination(nodesList[6]);
		edge6.setDistance(1);

		Edge edge7 = new Edge();
		edge7.setSource(nodesList[7]);
		edge7.setDestination(nodesList[8]);
		edge7.setDistance(6);

		Edge edge8 = new Edge();
		edge8.setSource(nodesList[2]);
		edge8.setDestination(nodesList[8]);
		edge8.setDistance(2);

		Edge edge9 = new Edge();
		edge9.setSource(nodesList[2]);
		edge9.setDestination(nodesList[3]);
		edge9.setDistance(7);

		Edge edge10 = new Edge();
		edge10.setSource(nodesList[2]);
		edge10.setDestination(nodesList[5]);
		edge10.setDistance(4);

		Edge edge11 = new Edge();
		edge11.setSource(nodesList[6]);
		edge11.setDestination(nodesList[5]);
		edge11.setDistance(2);

		Edge edge12 = new Edge();
		edge12.setSource(nodesList[3]);
		edge12.setDestination(nodesList[5]);
		edge12.setDistance(14);

		Edge edge13 = new Edge();
		edge13.setSource(nodesList[5]);
		edge13.setDestination(nodesList[4]);
		edge13.setDistance(10);

		Edge edge14 = new Edge();
		edge14.setSource(nodesList[3]);
		edge14.setDestination(nodesList[4]);
		edge14.setDistance(9);

		Edge edge15 = new Edge();
		edge15.setSource(nodesList[1]);
		edge15.setDestination(nodesList[0]);
		edge15.setDistance(4);
		
		Edge edge16 = new Edge();
		edge16.setSource(nodesList[7]);
		edge16.setDestination(nodesList[0]);
		edge16.setDistance(8);
		
		Edge edge17 = new Edge();
		edge17.setSource(nodesList[7]);
		edge17.setDestination(nodesList[1]);
		edge17.setDistance(11);

		Edge edge18 = new Edge();
		edge18.setSource(nodesList[2]);
		edge18.setDestination(nodesList[1]);
		edge18.setDistance(8);

		Edge edge19 = new Edge();
		edge19.setSource(nodesList[8]);
		edge19.setDestination(nodesList[7]);
		edge19.setDistance(7);

		Edge edge20 = new Edge();
		edge20.setSource(nodesList[6]);
		edge20.setDestination(nodesList[7]);
		edge20.setDistance(1);

		Edge edge21 = new Edge();
		edge21.setSource(nodesList[8]);
		edge21.setDestination(nodesList[7]);
		edge21.setDistance(6);

		Edge edge22 = new Edge();
		edge22.setSource(nodesList[8]);
		edge22.setDestination(nodesList[2]);
		edge22.setDistance(2);

		Edge edge23 = new Edge();
		edge23.setSource(nodesList[3]);
		edge23.setDestination(nodesList[2]);
		edge23.setDistance(7);

		Edge edge24 = new Edge();
		edge24.setSource(nodesList[5]);
		edge24.setDestination(nodesList[2]);
		edge24.setDistance(4);

		Edge edge25 = new Edge();
		edge25.setSource(nodesList[5]);
		edge25.setDestination(nodesList[6]);
		edge25.setDistance(2);

		Edge edge26 = new Edge();
		edge26.setSource(nodesList[5]);
		edge26.setDestination(nodesList[3]);
		edge26.setDistance(14);

		Edge edge27 = new Edge();
		edge27.setSource(nodesList[4]);
		edge27.setDestination(nodesList[5]);
		edge27.setDistance(10);

		Edge edge28 = new Edge();
		edge28.setSource(nodesList[4]);
		edge28.setDestination(nodesList[3]);
		edge28.setDistance(9);


		edges.add(edge1);
		edges.add(edge2);
		edges.add(edge3);
		edges.add(edge4);
		edges.add(edge5);
		edges.add(edge6);
		edges.add(edge7);
		edges.add(edge8);
		edges.add(edge9);
		edges.add(edge10);
		edges.add(edge11);
		edges.add(edge12);
		edges.add(edge13);
		edges.add(edge14);
		edges.add(edge15);
		edges.add(edge16);
		edges.add(edge17);
		edges.add(edge18);
		edges.add(edge19);
		edges.add(edge20);
		edges.add(edge21);
		edges.add(edge22);
		edges.add(edge23);
		edges.add(edge24);
		edges.add(edge25);
		edges.add(edge26);
		edges.add(edge27);
		edges.add(edge28);

		
		return edges;
	}
}
