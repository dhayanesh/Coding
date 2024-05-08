import java.util.Scanner;

public class Dhayanes_MinSpanTree {

	final int vertices, edges;
	Edge edge[];

	class Edge {
		int u, v, w;
	}

	void swap(Edge edgArrSwap[], int i, int j) {
		Edge tmp = edgArrSwap[i];
		edgArrSwap[i] = edgArrSwap[j];
		edgArrSwap[j] = tmp;
	}

	int divide(Edge edgArrDiv[], int low, int high) {
		Edge pivot = edgArrDiv[high];
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			if (edgArrDiv[j].w < pivot.w) {
				i++;
				swap(edgArrDiv, i, j);
			}
		}
		swap(edgArrDiv, i + 1, high);
		return (i + 1);
	}

	void sort(Edge edgArrSrt[], int low, int high) {
		if (low < high) {
			int mid = divide(edgArrSrt, low, high);
			sort(edgArrSrt, low, mid - 1);
			sort(edgArrSrt, mid + 1, high);
		}
	}

	int rootVertex(int roots[], int i) {
		for (; roots[i] != i; i = roots[i])
			;
		return i;
	}

	Dhayanes_MinSpanTree(int vertices, int edges) {
		this.vertices = vertices;
		this.edges = edges;
		edge = new Edge[this.edges];
		for (int i = 0; i < edges; i++)
			edge[i] = new Edge();
	}

	int kruskal() {
		int wt = 0, i = 0, nxtU = -1, nxtV = -1;

		sort(edge, 0, edges - 1);

		int roots[] = new int[vertices];
		for (i = 0; i < vertices; roots[i] = i++)
			;

		i = 0;
		for (int e = 0; e < vertices - 1;) {
			Edge nxtEd = new Edge();
			nxtEd = edge[i++];
			nxtU = rootVertex(roots, nxtEd.u);
			nxtV = rootVertex(roots, nxtEd.v);
			if (nxtU != nxtV) {
				wt += nxtEd.w;
				roots[nxtV] = nxtU;
				e++;
			}
		}
		return wt;
	}

	public static void main(String[] args) {

		int n, m;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		if (n >= 1 && n <= 1000 && m >= 1 && m <= 100000) {

			Dhayanes_MinSpanTree graph = new Dhayanes_MinSpanTree(n, m);

			for (int i = 0; i < m; i++) {
				graph.edge[i].u = scan.nextInt() - 1;
				graph.edge[i].v = scan.nextInt() - 1;
				graph.edge[i].w = scan.nextInt();
			}
			scan.close();
			System.out.println(graph.kruskal());
		} else {
			System.out.println(0);
		}
	}
}
