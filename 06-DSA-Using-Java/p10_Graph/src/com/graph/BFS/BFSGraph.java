// This program show Graph Representation and BFS using Adjacent MATRAX Technique | Uses Queue
package com.graph.BFS;

import java.util.ArrayList;

class GraphNode {
	public String name;
	public int index;
	public boolean isVisited = false;
	
	public GraphNode(String name, int index) {
		super();
		this.name = name;
		this.index = index;
	}
}

public class BFSGraph {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int[][] adjacencyMatrix;
	
	public BFSGraph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}
	
	public void addUndirected(int i, int j) {
		adjacencyMatrix[i][j] = 1;		// two way
		adjacencyMatrix[j][i] = 1;		// two way
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("  ");
		for (int i = 0; i < nodeList.size(); i++) {
			s.append(nodeList.get(i).name + " ");
		}
		s.append("\n");
		for (int i = 0; i < nodeList.size(); i++) {
			s.append(nodeList.get(i).name + " ");
			// getting the number rows
			for (int j : adjacencyMatrix[i]) {
				s.append((j) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}
	
	// Find All Neighbors
	public ArrayList<GraphNode> getNeighbors(GraphNode gNode) {
		ArrayList<GraphNode> neighborsList = new ArrayList<GraphNode>();
		int nodeIndex = gNode.index;
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			// meaning which nodes are connected
			if (adjacencyMatrix[nodeIndex][i] == 1) {
				neighborsList.add(nodeList.get(i));		// add it to the list if they are neighbors
			}
		}
		return (neighborsList);
	}
	
	// BFS Traversal
	public void bfsTraversal(GraphNode gNode) {
		ArrayList<GraphNode> queue = new ArrayList<GraphNode>();
		queue.add(gNode);
		while (!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			currentNode.isVisited = true;
			System.out.println("Visited " + currentNode.name);
			ArrayList<GraphNode> neighborsList = getNeighbors(currentNode);
			for (GraphNode neighbor : neighborsList) {
				if (!neighbor.isVisited) {
					queue.add(neighbor);
					neighbor.isVisited = true;
				}
			}
		}
	}
	
	// BFS Search (Caller Meth)
	public void BreadthFirstSearch() {
		for (GraphNode gNode : nodeList) {
			if (!(gNode.isVisited)) {
				bfsTraversal(gNode);
			}
		}
	}
	
	// Time Complexity: O(V+E)
	// SpaceComplexity: O(V+E)
	
	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		
		// creating graph based up off above nodes
		
		BFSGraph graph = new BFSGraph(nodeList);
		// making connection
		graph.addUndirected(0, 1);	// Connect A (0) to B(1) and B to A
		graph.addUndirected(0, 2);	// Connect A to C
		graph.addUndirected(0, 3);	// Connect A to D
		graph.addUndirected(1, 4);	// Connect B to E
		graph.addUndirected(1, 2);	// Connect B to C
		graph.addUndirected(2, 3);	// Connect C to D
		graph.addUndirected(3, 4);	// Connect D to E
		
		// Printing the Graph
		System.out.println(graph.toString());
		
		graph.BreadthFirstSearch();
	}

}
