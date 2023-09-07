package Assignment_02;

public class Song2 {
    static String verseends = "";

    public static void cat(String[] args) {
        System.out.print("Bought me a cat and the cat pleased me,\r\n" + //
                "I fed my cat under yonder tree.\r\n");
        verseends = "Cat goes fiddle-i-fee\r\n" + verseends;
        System.out.print(verseends);
        System.out.println();

    }

    public static void hen(String[] args) {
        System.out.print("Bought me a hen and the hen pleased me,\r\n" + //
                "I fed my hen under yonder tree.\r\n");
        verseends = "Hen goes chimmy-chuck, chimmy-chuck,\r\n" + verseends;
        System.out.print(verseends);
        System.out.println();

    }

    public static void duck(String[] args) {
        System.out.print("Bought me a duck and the duck pleased me,\r\n" + //
                "I fed my duck under yonder tree.\r\n");
        verseends = "Duck goes quack, quack,\r\n" + verseends;
        System.out.print(verseends);
        System.out.println();
    }

    public static void goose(String[] args) {
        System.out.print("Bought me a goose and the goose pleased me,\r\n" + //
                "I fed my goose under yonder tree.\r\n");
        System.out.print("Goose goes hissy, hissy,\r\n" + verseends);
        verseends = "Goose goes hissy, hissy,\r\n" + verseends;
        System.out.println();
    }

    public static void sheep(String[] args) {
        System.out.print("Bought me a sheep and the sheep pleased me,\r\n" + //
                "I fed my sheep under yonder tree.\r\n");
        System.out.print("Sheep goes baa, baa,\r\n" + verseends);
        verseends = "Sheep goes baa, baa,\r\n" + verseends;
        System.out.println();
    }

    public static void wendigo(String[] args) {
        System.out.print("Bought me a wendigo and the wen... wait a minute.\r\n" + //
                "JESUS CHRIST! AHHHHUUUGGHHH! GET OFF MY ARMM! AAAAH *click*\r\n" + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%.%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%..%.%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%..,..%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%/.%%..%%.......%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%..%%%%%%.(%,..%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%*..%%%.....%%%..%%%%%%%%%%%%%%%%%%%%%%%..,,...%%%#,...%%.%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%.%%%.#%...%.........(%%%%%%%%%%%%%%%%%.......*%,...%#..%%,.%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%,..%%%%%%%,.......%%.*%%%%%%%%%%%%%%%.(%.......%%,%%(%%%...%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%,.%%%%%%%%%%%%*..%%......,,,,,.....%%...%%%%%%%%%%%%...%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%,...%%%%%%%.%,%%%%%%(.,%%%%%%%%%...,*,.,,*%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%,..,,,%%%%%%...%%,%*%%%#,*%%%%%%%%%%,...%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%,..,,,%%%%%..%%%%%.%%%%%..%%%%%%,.....,,%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%,..%%%%%.%%%%%,..%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%,.%,%%%%,%%%%%%../%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%,..../%%.%%#.%...%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%,,.%.%/%.%*%,%,..%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%...%%%%(%((%...%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%,..%#%(%%%...%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%..%%%,%%,.(%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%..,.,.%..%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%/.%,,%..%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%..%/...%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
                + //
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n");
        verseends = "Wendigo wails and cries for flesh,\r\n" + verseends;
        System.out.print(verseends);
        System.out.println();
    }

    public static void main(String[] args) {
        cat(null);
        hen(null);
        duck(null);
        goose(null);
        sheep(null);
        wendigo(null);
    }
}
