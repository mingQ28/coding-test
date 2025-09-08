import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		int[] n_val = new int[n];
		String[] a = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			n_val[i] = Integer.parseInt(a[i]);
			hashMap.put(n_val[i], 0);
		}
		int m = Integer.parseInt(br.readLine());
		int[] m_val = new int[m];
		String[] b = br.readLine().split(" ");
		for(int i = 0; i < m; i++) {
			m_val[i] = Integer.parseInt(b[i]);
			if(hashMap.containsKey(m_val[i])) {
				hashMap.put(m_val[i], 1);
			}else {
				hashMap.put(m_val[i], 0);
			}
		}
		for(int key: m_val) {
			int val = hashMap.get(key);
			sb.append(val).append(" ");
		}
		System.out.println(sb);
	}
} 