public class JavaEnum {
    public static void main(String[] args) {
        Level gameLevel = Level.LOW;
        System.out.println(gameLevel);

        switch (gameLevel) {
            case LOW:
                System.out.println(Level.LOW.toString());
                break;
            case MEDIUM:
                 System.out.println(Level.MEDIUM.toString());
                 break;
            case HIGH:
                 System.out.println(Level.HIGH.toString());
                break;
            default:
                System.out.println("Unknown Level");
                break;
        }

        System.out.println("-----------");

        for (Level level : Level.values()) {
            System.out.println(level.toString());
        }
    }
}