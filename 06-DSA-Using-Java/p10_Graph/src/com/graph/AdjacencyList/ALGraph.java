package com.graph.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

class GraphNode {
	public String name;
	public int index;
	public boolean isVisited = false;

	public ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

	public GraphNode(String name, int index) {
		this.name = name;
		this.index = index;
	}
}

public class ALGraph {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	public ALGraph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addUndirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i);
		GraphNode second = nodeList.get(j);
		first.neighbors.add(second);
		second.neighbors.add(first);
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < nodeList.size(); i++) {
			s.append(nodeList.get(i).name + ": ");
			for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
				if (j == nodeList.get(i).neighbors.size() - 1) {
					s.append((nodeList.get(i).neighbors.get(j).name));
				} else {
					s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
				}
			}
			s.append("\n");
		}
		return (s.toString());
	}

	// BFS traversal
	public void bfsTraversal(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			currentNode.isVisited = true;
			System.out.print(currentNode.name + " ");
			ArrayList<GraphNode> neighbors = currentNode.neighbors;
			for (GraphNode n : neighbors) {
				if (!n.isVisited) {
					queue.add(n);
					n.isVisited = true;
				}
			}
		}
	}
	
	// BFS Method
	public void BreadthFirstSearch() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				bfsTraversal(node);
			}
		}
	}

	// DRIVER CLASS
	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));

		// create graph with above nodes
		ALGraph graph = new ALGraph(nodeList);
		// making connection
		graph.addUndirectedEdge(0, 1);
		graph.addUndirectedEdge(0, 2);
		graph.addUndirectedEdge(0, 3);
		graph.addUndirectedEdge(1, 4);
		graph.addUndirectedEdge(2, 3);
		graph.addUndirectedEdge(3, 4);

		// Printing the adjacency List 
		System.out.println(graph.toString());
		
		graph.BreadthFirstSearch();
	}
}