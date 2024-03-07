package Stack;

import java.util.Stack;

public class infinix {
    public static void main(String[] args) {
        String s1 = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int ascii = (int)ch;
            if(ascii >=48 && ascii <=57) val.push(ascii-48);
            else if (op.isEmpty()) op.push(ch);

            else{
                if(ch=='+' || ch == '-'){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    int operator = op.pop();

                    if(operator == '+' ) val.push(val1+val2);
                    if(operator == '-' ) val.push(val1-val2);
                    if(operator == '*' ) val.push(val1*val2);
                    if(operator == '/' ) val.push(val1/val2);

                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        int val2 = val.pop();
                        int val1 = val.pop();
                        int operator = op.pop();

                        if(operator == '*' ) val.push(val1*val2);
                        if(operator == '/' ) val.push(val1/val2);

                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }

        while(val.size()>1){
            int val2 = val.pop();
            int val1 = val.pop();
            int operator = op.pop();

            if(operator == '+' ) val.push(val1+val2);
            if(operator == '-' ) val.push(val1-val2);
            if(operator == '*' ) val.push(val1*val2);
            if(operator == '/' ) val.push(val1/val2);

        }

        System.out.println(val.peek());

    }
}


