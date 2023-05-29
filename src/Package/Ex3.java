package Package;
public class Ex3 {
    //1
    public static boolean validPassword(String s) {
     if (s.length()>=6&&containsNumber(s)&&(s.contains("!")||s.contains("@")||s.contains("#")||s.contains("$")||s.contains("%"))&&!s.contains(" "))
     {
         return true;
     }
        return false;
    }
    public static boolean containsNumber(String s)
    {
        char [] arr;
        arr= s.toCharArray();
        for (int i = 48; i <=57 ; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (arr[j]==i)
                    return true;
            }
        }
        return false;
    }
    //2
    public static String sentence(String s)	{
        String temp="", end="";
     String[] arr=  s.split(" ");
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            end+=arr[i]+" ";
        }
        return end;
    }
    //3
    public static boolean deletions(String s, String t) {
        char [] arrt=t.toCharArray();
        char[] arrs=s.toCharArray();
        int count=0;
        while (count!= arrt.length) {
            if (arrs.length< arrt.length)
                return false;
            if (arrt[count] != arrs[count]) {
                arrs = remove(arrs, arrs[count]);
            } else if (arrt[count] == arrs[count]) {
                count++;
            }
        }
        if (count== arrt.length)
            return true;
        return false;
    }
    public static char[] remove(char[]arr,char a)
    {
        String end="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a)
            {
                for (int j = i; j <arr.length-1 ; j++) {
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            end+=arr[i];
        }
        arr=end.toCharArray();
        return arr;
    }
    //4
    public static int divide(int a, int b) {
      if (a<b)
      {
          return 0;
      }
        return 1 + divide(a-b,b);
    }
}
