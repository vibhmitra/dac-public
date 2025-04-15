// Depth-First Search | Uses Stack
package com.graph.DFS;

import java.util.ArrayList;
import java.util.Stack;

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

public class DFSGraph {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	public DFSGraph(ArrayList<GraphNode> nodeList) {
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

	// DFS traversal
	public void dfstraversal(GraphNode node) {
		Stack<GraphNode> stack = new Stack<GraphNode>();
		stack.push(node);
		while (!stack.isEmpty()) {
			GraphNode currentNode = stack.pop();
			currentNode.isVisited = true;
			System.out.print(currentNode.name + " ");

			for (GraphNode n : currentNode.neighbors) {
				if (!n.isVisited) {
					stack.push(n);
					n.isVisited = true;
				}
			}
		}
	}

	public void DepthFirstSearch() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				dfstraversal(node);
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

		// Creating Graph up off the Above nodes
		DFSGraph graph = new DFSGraph(nodeList);
		
		// Making Connection
		graph.addUndirectedEdge(0, 1);
		graph.addUndirectedEdge(0, 2);
		graph.addUndirectedEdge(0, 3);
		graph.addUndirectedEdge(1, 4);
		graph.addUndirectedEdge(2, 3);
		graph.addUndirectedEdge(3, 4);

		// Printing List
		System.out.println(graph.toString());

		// visiting all elements
		graph.DepthFirstSearch();

	}
}
