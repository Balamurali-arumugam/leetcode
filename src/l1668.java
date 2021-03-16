public class l1668 {

    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }

    public static int maxRepeating(String sequence, String word) {
        int output = 0;
        for(int i=0;i<sequence.length();i++){
            if(sequence.charAt(i)==word.charAt(0)){
                int j = 0;
                boolean flag = true;
                while(i<sequence.length() && j<word.length() && flag){
                    try{
                        if(sequence.charAt(i)== word.charAt(j)){
                            j++;
                            i++;
                        }else{
                            flag = false;
                        }
                    }catch(Exception e){
                        System.out.println(i);
                        System.out.println(i);
                    }

                }
                i--;
                if(flag){
                    output++;
                }
            }
        }
        return output;
    }
}
