package conditional.statements;

public class Switch {
    public static void main(String[] args) {
        int number = 29;
        String size;

        switch (number) {
            case 29: // if (number == 29)
                size = "Small";
                break;
            case 44: //else if (number == 44)
                size = "Large";
                break;
            case 48: //else if (number == 48)
                size = "Extra Large";
                break;
            default: //else
                size = "Unknown";
                break;
        }

//        if (number == 29) {
//            size = "Small";
//        } else if (number == 44) {
//            size = "Large";
//        } else if (number == 48) {
//            size = "Extra Large";
//        } else {
//            size = "Unknown";
//        }

        System.out.println("Size: " + size);
    }
}
