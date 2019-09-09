
public class MultiplicadorMatriz{

 public static void main(String[] args) {
  
    int n = 3; 
    int i, j, k, sm;
	int [] [] a = {{ 2,5,8}, {7,7,6}, {1,3,1}};
	int [] [] b = {{ 6,2,4}, {1,9,2}, {7,6,3}};    	
    int ab[][] = new int[3][3];

    for (i=0; i<n; i++) {
      for (j=0; j<n; j++) {
        sm = 0;
        for (k=0; k<n; k++) {
          sm = sm + (a[i][k] * b[k][j]);
        }
        ab[i][j] = sm;
      }
    }

    System.out.printf("\n1a. Matriz________\n");
    for (i=0; i<n; i++) {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("%d ", a[i][j]);
      }
      System.out.printf("\n");
    }

    System.out.printf("\n2a. Matriz________\n");
    for (i=0; i<n; i++) {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("%d ", b[i][j]);
      }
      System.out.printf("\n");
    }

    System.out.printf("\nProduto___________\n");
    for (i=0; i<n; i++) {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("%d ", ab[i][j]);
      }
      System.out.printf("\n");
    }
  }
}

