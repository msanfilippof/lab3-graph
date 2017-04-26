package graph.real;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	private String id;
	private List<Edge> adjList;
	private String latlng;
	
	public Node(){
		adjList = new ArrayList<Edge>();
	}
	
	public Node(String id, String latlng){
		this.id = id;
		this.latlng = latlng;
		adjList = new ArrayList<Edge>();
	}
	
	public Node(ArrayList<Edge> al){
		adjList = al;
	}
	
	public Node(String id, ArrayList<Edge> al){
		this.id = id;
		adjList = al;
	}
	
	public Node(String id, ArrayList<Edge> al, String latlng){
		this.id = id;
		adjList = al;
		this.latlng = latlng;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Edge> getAdjList() {
		return adjList;
	}

	public void setAdjList(List<Edge> adjList) {
		this.adjList = adjList;
	}
	
	public String getLatLng(){
		return latlng;
	}
	
	public void setLatLng(String latlng){
		this.latlng = latlng;
	}
	
}
