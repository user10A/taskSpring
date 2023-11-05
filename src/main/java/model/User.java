package model;

public class User {
    private Long id;
    private String FirstName;
    private String LastName;
    private String UserName;
    private String Password;
    private boolean isActive;

    public User(Long id, String firstName, String lastName, String userName, String password, boolean isActive) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        UserName = userName;
        Password = password;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
