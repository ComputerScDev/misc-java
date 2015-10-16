import java.util.Scanner;

class e3printpatterns {
	
	public static void printPatternA(int size) {
		for	(int i=0; i<size+1; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	public static void printPatternB(int size) {
		for	(int i=size-1; i>=0; i--) {
			for (int j=0; j<i+1; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	public static void printPatternC(int size) {
		for	(int i=0; i<size+1; i++) {
			for (int j=0; j<size; j++) {
				System.out.print((j>=i? "# ": "  "));
			}
			if (i<size) {
				System.out.println();
			}
		}
	}
	
	public static void printPatternD(int size) {
		for	(int i=size-1; i>=0; i--) {
			for (int j=0; j<size; j++) {
				System.out.print((j>i-1 ? "# ": "  "));
			}
			System.out.println();
		}
	}
	
	public static void printPatternE(int size) {
		for	(int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (i == 0) {
					System.out.print(" #");
				} else if (i == size-1) {
					System.out.print(" #");
				} else if (j == 0) {
					System.out.print(" #");
				} else if (j == size-1) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printPatternF(int size) {
		for	(int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (i == 0) {
					System.out.print(" #");
				} else if (i == size-1) {
					System.out.print(" #");
				} else if (j == i) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printPatternG(int size) {
		for	(int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (i == 0) {
					System.out.print(" #");
				} else if (i == size-1) {
					System.out.print(" #");
				} else if (j == size-i-1) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printPatternH(int size) {
		for	(int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (i == 0) {
					System.out.print(" #");
				} else if (i == size-1) {
					System.out.print(" #");
				} else if ((j == size-i-1)||(j == i)) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printPatternI(int size) {
		for	(int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (i == 0) {
					System.out.print(" #");
				} else if (i == size-1) {
					System.out.print(" #");
				} else if ((j == size-i-1)||(j == i)) {
					System.out.print(" #");
				} else if (j == 0) {
					System.out.print(" #");
				} else if (j == size-1) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printPatternJ(int size) {
		for	(int i=0; i<size+3; i++) {
			for (int j=0; j<size+3; j++) {
				System.out.print((j>2*i-1 ? "# " : " "));
			}
			if (i<size) {///
				System.out.println();
			}
		}
		
	}
	
	public static void printPatternK(int size) {
		for	(int i=size+3; i>0; i--) {
			for (int j=0; j<=size+3; j++) {
				System.out.print((j>=2*i-1 ? "# " : " "));
			}
			if (i<size+3) {///
				System.out.println();
			}
		}
	}
	
	public static void printPatternL(int size) {
		for	(int i=size+3; i>0; i--) {
			for (int j=0; j<=size+3; j++) {
				System.out.print((j>=2*i-1 ? "# " : " "));
			}
			if (i<size+3) {///
				System.out.println();
			}
		}
		for	(int i=1; i<size+2; i++) {
			for (int j=0; j<=size+2; j++) {
				System.out.print((j>2*i-1 ? " #" : " "));
			}
			if (i<size-1) {
				System.out.println();
			}
		}
	}
	
	public static void printPatternM(int size) {
		for	(int i=0; i<size+1; i++) {
			for (int j=0; j<i; j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
	}
	
	public static void printPatternN(int size) {
		for	(int i=0; i<size+1; i++) {
			int k=1;
			for (int j=0; j<size; j++) {
				System.out.print((j>=i? (k-i)+" ": "  "));
				k++;
			}
			if (i<size) {
				System.out.println();
			}
		}
	}
	
	public static void printPatternO(int size) {
		for	(int i=size-1; i>=0; i--) {
			for (int j=0; j<size; j++) {
				System.out.print((j>i-1 ? (size-j)+" ": "  "));
			}
			System.out.println();
		}
	}
	
	public static void printPatternP(int size) {
		for	(int i=size-1; i>=0; i--) {
			int k=i;
			for (int j=0; j<i+1; j++) {
				System.out.print(k+1+" ");
				k--;
			}
			System.out.println();
		}
	}
	
	public static void printPatternQ(int size) {
		for	(int i=size-1; i>=0; i--) {
			int k=0;
			for (int j=0; j<size; j++) {
				System.out.print((j>i-1 ? (k+1)+" ": "  "));
				if (j>i-1) {
					k++;
				}
			}
			for (int l=size-1; l>=0; l--) {
				System.out.print((l>i ? (k-1)+" ": "  "));
				if (l>i-1) {
					k--;
				}
			}
			System.out.println();
		}
	}
	
	public static void printPatternR(int size) {
		for	(int i=0; i<size+1; i++) {
			int k=1;
			for (int j=0; j<size; j++) {
				System.out.print((j>=i ? (k-i)+" ": "  "));
				k++;
			}
			for (int l = size-1; l>=0; l--) {
				System.out.print((i<l ? (k-(i+2))+" ": "  "));
				k--;
			}
			System.out.println();
		}
	}

	public static void printPatternS(int size) {
		
	}
	
	public static void printPatternT(int size) {
		
	}
	
	public static void printPatternU(int size) {
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = in.nextInt();
		
		e3printpatterns im = new e3printpatterns();
		System.out.println();
		im.printPatternA(size);
		System.out.println();
		im.printPatternB(size);
		System.out.println();
		im.printPatternC(size);
		System.out.println();
		im.printPatternD(size);
		System.out.println();
		im.printPatternE(size);
		System.out.println();
		im.printPatternF(size);
		System.out.println();
		im.printPatternG(size);
		System.out.println();
		im.printPatternH(size);
		System.out.println();
		im.printPatternI(size);
		System.out.println();
		im.printPatternJ(size);
		System.out.println();
		im.printPatternK(size);
		System.out.println();
		im.printPatternL(size);
		System.out.println();
		im.printPatternM(size);
		System.out.println();
		im.printPatternN(size);
		System.out.println();
		im.printPatternO(size);
		System.out.println();
		im.printPatternP(size);
		System.out.println();
		im.printPatternQ(size);
		System.out.println();
		im.printPatternR(size);
	}
	
}
/* 
Write a method to print each of the followings patterns using 
nested loops in a class called PrintPatterns.

   
1                           1      1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2                       2 1      1 2 3 4 5 6 7   7 6 5 4 3 2 1
1 2 3                   3 2 1      1 2 3 4 5 6       6 5 4 3 2 1
1 2 3 4               4 3 2 1      1 2 3 4 5           5 4 3 2 1
1 2 3 4 5           5 4 3 2 1      1 2 3 4               4 3 2 1
1 2 3 4 5 6       6 5 4 3 2 1      1 2 3                   3 2 1
1 2 3 4 5 6 7   7 6 5 4 3 2 1      1 2                       2 1
1 2 3 4 5 6 7 8 7 6 5 4 3 2 1      1                           1
             (s)                                (t)
   
              1
            2 3 2
          3 4 5 4 3
        4 5 6 7 6 5 4
      5 6 7 8 9 8 7 6 5
    6 7 8 9 0 1 0 9 8 7 6
  7 8 9 0 1 2 3 2 1 0 9 8 7 
8 9 0 1 2 3 4 5 4 3 2 1 0 9 8
             (u) */