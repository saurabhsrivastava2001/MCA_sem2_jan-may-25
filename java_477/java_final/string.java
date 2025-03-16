public class string {

    public static void main(String[] args) {
        String s = "Hello, World!";

        System.out.println(s.length());              // 13
        System.out.println(s.charAt(0));             // 'H'
        System.out.println(s.toUpperCase());         // "HELLO, WORLD!"
        System.out.println(s.toLowerCase());         // "hello, world!"
        System.out.println(s.trim());                // Removes leading and trailing spaces
        System.out.println(s.substring(7));          // "World!"
        System.out.println(s.substring(0, 5));       // "Hello"
        System.out.println(s.contains("World"));     // true
        System.out.println(s.startsWith("Hello"));   // true
        System.out.println(s.endsWith("!"));         // true
        System.out.println(s.indexOf('o'));          // 4
        System.out.println(s.lastIndexOf('o'));      // 8
        System.out.println(s.replace("World", "Java"));  // "Hello, Java!"
        System.out.println(s.equals("hello"));       // false (case-sensitive)
        System.out.println(s.equalsIgnoreCase("hello, world!"));  // true
        System.out.println(s.isEmpty());             // false
        System.out.println(s.concat(" Java!"));      // "Hello, World! Java!"
    }
}
