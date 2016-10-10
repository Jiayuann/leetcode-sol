public class CloneGraphDFS{
	class UndirectedGraphNode{
		int label;
		List<UndirectedGraphNode> neighbors;
		public UndirectedGraphNode(int lebel){
			this.label=label;
			this.neighbors=new ArrayList<UndirectedGraphNode>();
		}
	}
	
	public UndirectedGraphNode cloneGraphDFS(UndirectedGraphNode node){
		if(node==null)
			return null;
		Map<UndirectedGraphNode,UndirectedGraphNode> map=new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
		UndirectedGraphNode head=new UndirectedGraphNode(nade.label);
		map.put(node,head);
		
		DFS(map,node);
		return head;
	}
	public void DFS(Map<UndirectedGraphNode,UndirectedGraphNode> map,UndirectedGraphNode node){
		if(node==null)return null;
		for(UndirectedGraphNode neighbor:node.neighbors){
			if(!map.containsKey(neighbor)){
				map.put(neighbor,new UndirectedGraphNode(neighbor.lebel));
				DFS(map,neighbor);
			}
			map.get(node).neighbors.add(map.get(neighbor));
		}
		
	}

}  