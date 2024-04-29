package UlsterCS250.entities;

public class JEmployee {

    private int id;
    private String username;
    private String passwordHash;
    private String email;
    private String firstName;
    private String lastName;
    private boolean isManager;
    private boolean isActive;
    private String lastLogin;
    private String createTime;
    private int yearsOfService;

    public JEmployee(){

    }

    public JEmployee(int id, String username, String passwordHash, String email,
                    String firstName, String lastName, Boolean isManager, Boolean isActive,
                    String lastLTime, String createTime,
                    int yoe) {
        this.id=id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isManager = isManager;
        this.isActive = isActive;
        this.lastLogin = lastLTime;
        this.createTime = createTime;
        this.yearsOfService = yoe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getIsManager() {
        return isManager;
    }

    public void setIsManager(Boolean isManager) {
        this.isManager = isManager;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public int getYoe(){
        return yearsOfService;
    }

    public void setYoe(int yoe){
        this.yearsOfService = yoe;
    }
}
