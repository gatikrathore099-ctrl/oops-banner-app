public class OOPSBannerUC3 {

    public static void main(String[] args) {

        String star = "*";
        String space = " ";

        // Line 1
        System.out.println(String.join("",
                star, star, star, star, star, space, space,
                star, star, star, star, star, space, space,
                star, star, star, star, star, space, space,
                star, star, star, star, star
        ));

        // Line 2
        System.out.println(String.join("",
                star, space, space, space, star, space, space,
                star, space, space, space, star, space, space,
                star, space, space, space, space, space, space,
                star
        ));

        // Line 3
        System.out.println(String.join("",
                star, space, space, space, star, space, space,
                star, star, star, star, star, space, space,
                star, star, star, star, star, space, space,
                star, star, star, star, star
        ));

        // Line 4
        System.out.println(String.join("",
                star, space, space, space, star, space, space,
                star, space, space, space, space, space, space,
                space, space, space, space, star, space, space,
                space, space, space, space, star
        ));

        // Line 5
        System.out.println(String.join("",
                star, star, star, star, star, space, space,
                star, space, space, space, space, space, space,
                star, star, star, star, star, space, space,
                star, star, star, star, star
        ));
    }
}
