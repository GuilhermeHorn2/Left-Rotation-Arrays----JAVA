package misc;

public class main_misc2 {

	public static void main(String[] args) {
		// 
		int[]v  = {1,2,3,4,5};
		int[]k = rot_left(v,4);
		for(int i = 0;i < k.length;i++) {
			System.out.println(k[i]);
		}
		
	
	}
	private static int[] dup_vector(int[]v) {
		int[] r = new int[2*v.length];
		int j = 0;
		for(int i = 0;i < v.length;i++) {
			r[j] = v[i];
			j++;
		}
		for(int i = 0;i < v.length;i++) {
			r[j] = v[i];
			j++;
		}
		return r;
	}
	private static int[] rot_left(int[]v,int d) {
		//every integer can be described by: k = n*m + r
		//if d is a multiple o v.length you completed a cicle so no ration is needed
		//every rotation is just a multiple of rotations from 1 to v.length 
		int r = d % v.length;
		if(r == 0) {
			return v;
		}
		int[] k = new int[v.length];
		if(r != 0) {
			int[] l = dup_vector(v);
			int j = 0;
			for(int i = r;i < v.length+r;i++) {
				k[j] = l[i];
				j++;
			}
			
		}
		return k;
	}

	}


