public class JavaNestedForLoop{
    public static void main(String[] args){
        String[][] programming = {{"JAVA", "KOTLIN", "C++"},
                {"PHP", "RUBY", "CSS"},
                {"JS", "PYTHON", "C#"}
        };

        for(int b=0; b<programming.length; b++){

            for(int k=0; k<programming[b].length; k++){
                System.out.println(programming[b][k]);
            }

        }
    }
}
