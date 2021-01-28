import java.util.Stack;

public class l1209 {
    public String removeDuplicates(String s, int k) {

        Stack<Integer> countStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();

        for(Character c : s.toCharArray()){

            if(!countStack.isEmpty() && !charStack.isEmpty()
                    && charStack.peek() == c && countStack.peek()==k-1){

                while(!charStack.isEmpty() && charStack.peek() == c){
                    charStack.pop();
                }
                countStack.pop();

            }else{

                int temp =1;

                if(!charStack.isEmpty() && charStack.peek() == c){
                    temp = countStack.pop()+1;
                }

                charStack.push(c);
                countStack.push(temp);

            }

        }

        StringBuilder sb = new StringBuilder();


        while(!charStack.isEmpty()){
            sb.append(charStack.pop());
        }

        return sb.reverse().toString();
    }
}
