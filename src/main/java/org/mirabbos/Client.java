package org.mirabbos;

public class Client {
    private int ClientID;
    private String FullName;
    private String Address;
    private String Phone;
    private String Username;
    private String Password;

    public Client(int clientID, String fullName,String address,String phone, String username, String password) {
        Address = address;
        ClientID = clientID;
        FullName = fullName;
        Password = password;
        Phone = phone;
        Username = username;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Address='" + Address + '\'' +
                ", ClientID=" + ClientID +
                ", FullName='" + FullName + '\'' +
                ", Phone=" + Phone +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
