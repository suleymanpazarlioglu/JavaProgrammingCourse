package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str="Java is fun, I love learning Java";
        str=str.replace("Java","C#");
        System.out.println(str);

        String email="johnsmith@yahoo.com";
        email=email.replace("yahoo","gmail");
        System.out.println(email);

        String sentence="Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence=sentence.replace("Python ","");
        System.out.println(sentence);



    }
}
