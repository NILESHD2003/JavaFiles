package Programs;

public class Occurence_String {
    public static void main(String[] args) {
        String name="nilesh deshpande";
        char ch='e';

        int count=counter(name,ch);

        System.out.println(count);
    }

    static int counter(String name,char x)
    {
        int count=0;

        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)=='e')
                count++;
        }
        return count;
    }
}
