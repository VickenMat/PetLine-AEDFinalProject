
package models;
import database.Db;
import java.sql.ResultSet;
import java.sql.Blob;
/**
 *
 * @author nikhilbindal
 */
public class Person {
    
    private int personID;
    private String personType;
    private String name;
    private int age;
    private String phoneNumber;
    private String dob;
    private String email;
    private String ssn;
    private String username;
    private String password;
    private int addressID;
    private int postID;
    private Blob profilePic;
    private Db database = new Db();
//    private 
    // private Post post;
    
    public Person(int personID, String name, int age, String phoneNumber, String email, String ssn, String username, 
            String password, int addressID){
        this.personID = personID;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.ssn = ssn;
        this.username = username;
        this.password = password;
        this.addressID = addressID;

    }

    public Person() {}
    
    public boolean isMatch(String name){
        if(getName().equals(name)) return true;
        return false;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Blob getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Blob profilePic) {
        this.profilePic = profilePic;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getSSN(){
        return ssn;
    }
    
    public void setSSN(String ssn){
        this.ssn = ssn;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public int getAddressID(){
        return addressID;
    }
    
    public void setAddressID(int addressID){
        this.addressID = addressID;
    }
    /*
    public Post getPost(){
        return post;
    }
    
    public void setPost(Post post){
        this.post = post;
    }
    */
    public int getPersonID(){
        return personID;
    }
    
    public void setPersonID(int personID){
        this.personID = personID;
    }
    
    public boolean checkIfUsernameExists(String uname) {
        boolean res = database.checkIfUsernameExists(uname);
        return res;
    }
    
    public boolean checkIfEmailExists(String email) {
        boolean res = database.checkIfEmailExists(email);
        return res;
    }
    
    public boolean checkIfPhoneNoExists(String phnNo) {
        boolean res = database.checkIfPhoneNoExists(phnNo);
        return res;
    }
    
    public boolean checkIfSSNExists(String ssn) {
        boolean res = database.checkIfSSNExists(ssn);
        return res;
    }
    
    public Person checkPersonCreds(String userType, String username, String password) {
        Person person = new Person();
        ResultSet rs = database.getPersonDetails(userType, username, password);
        try {
            if(rs != null) {
                person.personID = rs.getInt("personId");
                person.personType = rs.getString("personType");
                person.name = rs.getString("name");
                person.age = rs.getInt("age");
                person.ssn = rs.getString("ssn");
                person.username = rs.getString("username");
                person.password = rs.getString("password");
//                person.profilePic = rs.getBlob("profilePic");
                person.email = rs.getString("email");
                person.phoneNumber = rs.getString("phoneNo");
                return person;
            } else {
                return null;
            }
            
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("User created!");
        }
        if (rs == null) {
            return null;
        }
        return person;
    }
    
    public int createPerson(String name, String email, String phnNo, String uname, String pass, int age, String ssn, int addressId) {
        int res = database.createPerson(name, email, phnNo, uname, pass, age, ssn, addressId);
        return res;
    }
    
    public int createVendor(String name, String email, String phnNo, String uname, String pass, String orgName, int addressId, String city) {
        
        int res = database.createVendor(name, email, phnNo, uname, pass, orgName, addressId, city);
        return res;
    }
    
    public int createNgo(String name, String email, String phnNo, String uname, String pass, int ngoSize, String orgName, int addressId, String ngoDesc, String city) {
        
        int res = database.createNgo(name, email, phnNo, uname, pass, ngoSize, orgName, addressId, ngoDesc, city);
        return res;
    }
    
    public int createDelivery(String name, String email, String phnNo, String uname, String pass, String orgName, int addressId, String city) {
        
        int res = database.createDelivery(name, email, phnNo, uname, pass, orgName, addressId, city);
        return res;
    }
    
//    public int createHospital(String name, String email, String phnNo, String uname, String pass, String orgName, int addressId, String city) {
//        
//        int res = database.createHospital(name, email, phnNo, uname, pass, orgName, addressId, String city);
//        return res;
//    }
    
}
