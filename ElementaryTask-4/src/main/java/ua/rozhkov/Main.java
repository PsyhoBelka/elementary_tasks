package ua.rozhkov;

public class Main {

    public static void main(String[] args) {

        FileParser fileParser = new FileParser();
        String sourceF = Main.getResource();
        fileParser.resetFile(sourceF);
        String stringSearch = "мама мыла";
        String stringReplace = "мама123";
        System.out.println(fileParser.parseFile(sourceF, stringSearch));
        fileParser.parseFile(sourceF, stringSearch, stringReplace);
        System.out.println(fileParser.parseFile(sourceF, stringReplace));
//		fileParser.resetFile(sourceF);
    }

    private static String getResource() {
        return String.valueOf(Main.class.getResource("search.txt"));
    }

}
