public class Main {
    public static void main(String[] args) {

        Game game1 = new Game("Subnautica");
        game1.addHours(6);
        System.out.println(Game.libraryInfo());

        System.out.println("\nAdding new game\n");

        Game game2 = new Game("Minecraft");
        game2.addHours(20);
        System.out.println(Game.libraryInfo());

        System.out.println("\nAdding more hours\n");

        game1.addHours(15);
        System.out.println(Game.libraryInfo());

    }
}
