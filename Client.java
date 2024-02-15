package Model.Clients;

/**
 * Identification comments:
 *   Name: Soham patil
 *   Experiment No: 02
 *   Experiment Title: Client Class
 *   Experiment Date:08-02-2024
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Client.java
 * @author:  Soham patil
 * Overview: This is the Client class. In this file we have achieved the following
 * - Created Attributes
 * --- int client_id
 * --- String client_name
 * --- String client_email
 * --- int client_age
 * --- String client_gender
 * --- String client_height
 * --- String client_weight
 *
 * - Created Setters and Getters
 * - Created a Display Function to call the getters and display Instance data
 *
 */
public class Client {
    String client_name;
    String client_email;
    int client_age;
    String client_gender;
    int client_height;
    int client_weight;


    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public void setClient_age(int client_age) {
        this.client_age = client_age;
    }

    public void setClient_gender(String client_gender) { 
        this.client_gender = client_gender;
    }

    public void setClient_height(int client_height) {
        this.client_height = client_height;
    }

    public void setClient_weight(int client_weight) { this.client_weight = client_weight;
    }


    public String getClient_name() {
        return client_name;
    }

    public String getClient_email() {
        return client_email;
    }

    public int getClient_age() {
        return client_age;
    }

    public String getClient_gender() {
        return client_gender;
    }

    public int getClient_height() {
        return client_height;
    }

    public int getClient_weight() {
        return client_weight; }

    public void display()
    {
        System.out.println("Client Name: "+getClient_name());
        System.out.println("Client Email: "+getClient_email());
        System.out.println("Client Age: "+getClient_age());
        System.out.println("Client Gender: "+getClient_gender());
        System.out.println("Client Height: "+getClient_height());
        System.out.println("Client Weight: "+getClient_weight());
    }
}
