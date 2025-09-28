import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            switch(str[0]){
                case "1":
                    stack.push(Integer.parseInt(str[1]));
                    break;
                case "2":
                    if(stack.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(stack.pop() + "\n");
                    }
                    break;
                case "3":
                    sb.append(stack.size() + "\n");
                    break;
                case "4":
                    if(stack.isEmpty()){
                        sb.append("1\n");
                    }else {
                        sb.append("0\n");
                    }
                    break;
                case "5":
                    if(stack.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(stack.peek() + "\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}