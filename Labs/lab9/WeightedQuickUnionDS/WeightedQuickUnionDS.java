public class WeightedQuickUnionDS {

    private int[] parent;

    /*
     * Returns the parent of element p.
     * If p is the root of a tree, returns the negative size
     * of the tree for which p is the root.
     */
    public int parent(int p) {
        return parent[p];
    }

    /* Prints the parents of the elements, separated by a space */
    public void printParent() {
        for (int element : parent) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    /*
     ***** HELPER METHODS START *****
     */

    // Add your own helper methods here
	// INCLUDE your helper methods in your submission !
	
	
	

    /*
     ***** HELPER METHODS END *****
     */

      public int findRoot(int p){
         if((parent[p]<0)){
            return p;
         }
         p=parent(p);
         return findRoot(p);


     }

     private int find(int p){
          validate(p);
          int root=p;
          while(parent[root]>-1){
             root=parent[root];

          }
          return root;

     }
    // LAB EXERCISE 9.3  CONSTRUCTOR

    /**
     * Creates a Disjoint Sets data structure with n elements,
     * 0 through n-1.
     * Initially, each element is in its own set.
     * @param N the number of elements
     */
    public WeightedQuickUnionDS(int N) {
        parent=new int[N];
        int m;
        for(m=0;m<N;m++){
            parent[m]=-1;
        }
		
		
    }


    // LAB EXERCISE 9.4 VALIDATE

    /**
     * Validates that p is a valid element/index.
     * @throws IllegalArgumentException if p is not a valid index.
     */
    public void validate(int p) {
        if(p<0||p>=parent.length)
            throw new IllegalArgumentException();

    }


    // EXERCISE 9.1  SIZE OF

    /**
     * Returns the size of the set element p belongs to.
     * @param p an element
     * @return the size of the set containing p
     */
    public int sizeOf(int p) {
        int s=parent[findRoot(p)];
		
		return 0-s;
    }


    // EXERCISE 9.2  IS CONNECTED


    /**
     * Returns true iff elements p and q are connected.
     * @param p an element
     * @param q the other element
     * @return true if p and q are in the same set
     *         false otherwise
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public boolean isConnected(int p, int q) {
        if(p<0||p>=parent.length|| q<0||q>=parent.length)
            throw new IllegalArgumentException();

        if(findRoot(p)==findRoot(q))
            return true;
        return false;
    }


    // EXERCISE 9.3  CONNECT

    /**
     * Connects two elements p and q together,
     * by combining the sets containing them.
     * @param p an element
     * @param q the other element
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public void connect(int p, int q) {
        if(p<0||p>=parent.length|| q<0||q>=parent.length)
            throw new IllegalArgumentException();

        if(isConnected(p,q)==true){
            // do nothing
        }
        if(isConnected(p,q)==false){
            int size1=sizeOf(p);
            int size2=sizeOf(q);
            int root1=findRoot(p);
            int root2=findRoot(q);
            if(size1>size2){
                parent[q]=p;
                parent[p]=-(root1+root2);

            }
            else if (size1==size2){
                parent[p]=q;
                parent[q]=-(root1+root2);

            }
            else{
                parent[p]=q;
                parent[q]=-(root1+root2);
            }

        }
		
		
    }


    public static void main(String[] args) {
        WeightedQuickUnionDS ds = new WeightedQuickUnionDS(4);
        ds.connect(1, 0);
        ds.connect(3, 2);
        ds.connect(3, 1);
        ds.printParent();
    }

}
