public class OOPSBannerUC4 {

    public static void main(String[] args) {

        String star = "*";
        String space = " ";

        // Create array to store banner lines
        String[] banner = new String[5];

        banner[0] = String.join("",
                star, star, star, star, star, space, space,
                star, star, star, star, star, space, space,
                star, star, star, star, star, space, space,
                star, star, star, star, star
        );

        banner[1] = String.join("",
                star, space, space, space, star, space, space,
                star, space, space, space, star, space, space,
                star, space, space, space, space, space, space,
                star
        );

        banner[2] = String.join("",
                star, space, space, space, star, space, space,
                star, star, star, star, star, space, space,
                star, star, star, star, star, space, space,
                star, star, star, star, star
        );

        banner[3] = String.join("",
                star, space, space, space, star, space, space,
                star, space, space, space, space, space, space,
                space, space, space, space, star, space, space,
                space, space, space, space, star
        );

        banner[4] = String.join("",
                star, star, star, star, star, space, space,
                star, space, space, space, space, space, space,
                star, star, star, star, star, space, space,
                star, star, star, star, star
        );

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
