package org.example.selfcode;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class User {
    String name;
    String password;
    String username;
    String email;
    String roleName;

    public User(String name, String password, String username, String email, String roleName) {
        this.name = name;
        this.password = password;
        this.username = username;
        this.email = email;
        this.roleName = roleName;
    }

    // TODO Method to generate SQL-like insert format for User
    public String toSQLFormat() {
        return String.format("('%s', '%s', '%s', '%s', '%s')",
                name.replace("'", "''"), // Handle any single quotes in the name
                password,
                username.replace("'", "''"),
                email.replace("'", "''"),
                roleName
        );
    }
}

public class CustomerToUserConverter {

    public static String generateRandomPassword() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }
        return password.toString();
    }

    //TODO Method to convert a JSON node (representing a customer) to a User object
    public static User convertToUser(JsonNode customer) {
        String name = customer.get("name").asText();
        String password = generateRandomPassword();
        String username = customer.get("number").asText();
        String email = username.replaceAll(" ", "") + "@gmail.com";  // Create an email based on 'number' field
        String roleName = "CUSTOMER_ADMIN";

        return new User(name, password, username, email, roleName);
    }

    public static void main(String[] args) throws IOException {
        //TODO Load the JSON file from the resources folder using ClassLoader
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = CustomerToUserConverter.class.getClassLoader().getResourceAsStream("customer.json");

        // Ensure the file is found
        if (inputStream == null) {
            throw new IllegalArgumentException("File not found in resources: customer.json");
        }

        // Read and parse the JSON file
        JsonNode rootNode = objectMapper.readTree(inputStream);

        // Get the array of customers
        JsonNode customersArray = rootNode.get("customers");

        // List to store converted User objects
        List<User> users = new ArrayList<>();

        // Iterate over each customer and convert to User
        Iterator<JsonNode> customersIterator = customersArray.elements();
        while (customersIterator.hasNext()) {
            JsonNode customer = customersIterator.next();
            User user = convertToUser(customer);
            users.add(user);
        }

        // Print the converted users in SQL-like format
        System.out.println("INSERT INTO login_users (name, password, username, email, role_name) VALUES");
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.print(user.toSQLFormat());
            if (i < users.size() - 1) {
                System.out.print(",\n");
            } else {
                System.out.println(";");
            }
        }
    }
}



//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Random;
//
//class User {
//    String name;
//    String password;
//    String username;
//    String email;
//    String roleName;
//
//    public User(String name, String password, String username, String email, String roleName) {
//        this.name = name;
//        this.password = password;
//        this.username = username;
//        this.email = email;
//        this.roleName = roleName;
//    }
//
//    @Override
//    public String toString() {
//        return "User{name='" + name + "', password='" + password + "', username='" + username + "', email='" + email + "', roleName='" + roleName + "'}";
//    }
//}
//
//public class CustomerToUserConverter {
//
//    // Method to generate random 6-character password
//    public static String generateRandomPassword() {
//        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        StringBuilder password = new StringBuilder();
//        Random random = new Random();
//        for (int i = 0; i < 6; i++) {
//            password.append(chars.charAt(random.nextInt(chars.length())));
//        }
//        return password.toString();
//    }
//
//    // Method to convert a JSON node (representing a customer) to a User object
//    public static User convertToUser(JsonNode customer) {
//        String name = customer.get("name").asText();
//        String password = generateRandomPassword();
//        String username = customer.get("number").asText();
//        String email = username.replaceAll(" ", "") + "@gmail.com";  // Create an email based on 'number' field
//        String roleName = "CUSTOMER_ADMIN";
//
//        return new User(name, password, username, email, roleName);
//    }
//
//    public static void main(String[] args) throws IOException {
//        // Load the JSON file from the resources folder using ClassLoader
//        ObjectMapper objectMapper = new ObjectMapper();
//        InputStream inputStream = CustomerToUserConverter.class.getClassLoader().getResourceAsStream("customer.json");
//
//        // Ensure the file is found
//        if (inputStream == null) {
//            throw new IllegalArgumentException("File not found in resources: customer.json");
//        }
//
//        // Read and parse the JSON file
//        JsonNode rootNode = objectMapper.readTree(inputStream);
//
//        // Get the array of customers
//        JsonNode customersArray = rootNode.get("customers");
//
//        // List to store converted User objects
//        List<User> users = new ArrayList<>();
//
//        // Iterate over each customer and convert to User
//        Iterator<JsonNode> customersIterator = customersArray.elements();
//        while (customersIterator.hasNext()) {
//            JsonNode customer = customersIterator.next();
//            User user = convertToUser(customer);
//            users.add(user);
//        }
//
//        // Print the converted users
//        for (User user : users) {
//            System.out.println(user);
//        }
//    }
//}
//
