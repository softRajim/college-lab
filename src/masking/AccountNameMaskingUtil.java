package masking;

/**
 * @author rajimalimiya
 * @created 17/09/2023 - 11:53
 * @project StudentProject
 **/
public class AccountNameMaskingUtil {

    // Function to mask account names as specified
    public static String maskAccountName(String accountName) {
        // Check if the account name is null or empty
        if (accountName == null || accountName.isEmpty()) {
            return "Account Name Not Provided";
        }

        // Split the full name into its constituent parts (first name and last name)
        String[] nameParts = accountName.split(" ");

        // Check if there are at least two parts (first name and last name)
        if (nameParts.length >= 2) {
            String firstName = nameParts[0]; // First name
            String lastName = nameParts[nameParts.length - 1]; // Last name

            // Create a masked name using the specified format
            StringBuilder maskedName = new StringBuilder();
            maskedName.append(firstName.charAt(0)); // Keep the first character unmasked
            for (int i = 1; i < firstName.length(); i++) {
                maskedName.append("*"); // Mask the remaining characters of the first name
            }
            maskedName.append(" "); // Add a separator
            maskedName.append(lastName); // Keep the last name unmasked

            return maskedName.toString();
        } else {
            // Handle the case of a single name (e.g., "John")
            String singleName = nameParts[0];
            StringBuilder maskedName = new StringBuilder();
            maskedName.append(singleName.charAt(0)); // Keep the first character unmasked
            for (int i = 1; i < singleName.length(); i++) {
                maskedName.append("*"); // Mask the remaining characters of the single name
            }
            return maskedName.toString();
        }
    }


    public static void main(String[] args) {
        // Example usage
        String accountName1 = "John Doe";
        String maskedAccountName1 = maskAccountName(accountName1);
        System.out.println("Original Account Name: " + accountName1);
        System.out.println("Masked Account Name: " + maskedAccountName1);

        String accountName2 = "Rajim Ali Miya";
        String maskedAccountName2 = maskAccountName(accountName2);
        System.out.println("Original Account Name: " + accountName2);
        System.out.println("Masked Account Name: " + maskedAccountName2);

        String accountName3 = "Sudan Shrestha";
        String maskedAccountName3 = maskAccountName(accountName3);
        System.out.println("Original Account Name: " + accountName3);
        System.out.println("Masked Account Name: " + maskedAccountName3);

        String accountName4 = "Kush Raj Rimal Magar";
        String maskedAccountName4 = maskAccountName(accountName4);
        System.out.println("Original Account Name: " + accountName4);
        System.out.println("Masked Account Name: " + maskedAccountName4);

        String accountName5 = "Rahim";
        String maskedAccountName5 = maskAccountName(accountName5);
        System.out.println("Original Account Name: " + accountName5);
        System.out.println("Masked Account Name: " + maskedAccountName5);
    }
}
//    Original Account Name: John Doe
//        Masked Account Name: J***** Doe
//
//        Original Account Name: Rajim Ali Miya
//        Masked Account Name: R***** Miya