public class string 
{
    public static void test1() 
    {
        String hello="hello test1";
        System.out.println(hello);
        // substrings method 
        System.out.println(hello.substring(1,3));
        System.out.println(hello+"test2");
        String all=String.join("*","hello","world","this");
        System.out.println(all);
        String repeat="Java".repeat(3);
        System.out.println(repeat+"\n"+repeat.length());
        System.out.println("HELLO".equals(repeat));
        System.out.println("---"+"hello".equalsIgnoreCase("HEllo"));
        String empty="";
        System.out.println(empty.length()==0);
        int cpCount=repeat.codePointCount(7,repeat.length());
        System.out.println(cpCount);
    }
    public static void count()
    {
        String greeting="Hello Java";
        char first=greeting.charAt(4);
        System.out.println(first);
        int cp=greeting.codePointAt(0);
        System.out.println(cp);
    }
    public static void code()
    {
        String s1="code  is code  ";
        String s2="  code no code  ";
        int compare=s1.compareTo(s2);
        System.out.println(compare);
        System.out.println(s1.endsWith("co"));
        int index=s1.indexOf(111);
        System.out.println(index);
        int last=s1.lastIndexOf(111);
        System.out.println(last);
        int codecount=s1.codePointCount(6,8);
        System.out.println(codecount);
        String new_string=s1.replace("code","yellow");
        System.out.println(new_string);
        String substring=s1.substring(2,6);
        System.out.println(substring);
        String touppercase=s1.toUpperCase();
        System.out.println(touppercase);
        String strip=s1.trim();
        System.out.println(strip);
    }
    public static void stringbuilder()
    {
        StringBuilder str=new StringBuilder();
        System.out.println(str.length());
        str.append("he");
        str.append("llo");
        str.appendCodePoint(111);
        System.out.println(str);
        str.insert(str.length(),"jack");
        String a=str.toString();
        System.out.println(a);

    }
    public static void main(String[] args)
    {
        stringbuilder();
    }
}
