package homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ','c','a','t',' ','b','i',' ','b',' ',' '};
        int firstindex = 0;
        int lastIndex = spaceArray.length-1;
        while (firstindex < lastIndex && spaceArray[firstindex] == ' '){
            firstindex++;
            while (firstindex < lastIndex && spaceArray[lastIndex] == ' '){
                lastIndex--;
            }
            char[]result = new char[(lastIndex - firstindex)+1];
            int index = 0;
            for (int i = firstindex; i < lastIndex+1;i++) {
                result[index++] = spaceArray[i];
            }
            for (int i = 0; i < result.length ; i++) {
                System.out.println(result[i]);

            }
        }
    }
}
