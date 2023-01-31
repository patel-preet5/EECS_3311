public class person{

    private int userId;
    private String name; 
    private String contactInfo;

    public void newPerson(int perUserId, String perName, String perContactInfo){
        
    }

    public void newTeam(){

    }

    public void assignToTeam(){

    }



    // getters to get info about the person 
    public int getUserId(){// get the userID
        return userId;
    }

    public String getName(){// get the name of person
        return name;
    }

    public String getContactInfo(){// get  the contact info of the person
        return contactInfo;
    }

    // Only setter just in case a person changes there contact info
    public void setContactInfo(String newInfo){// to change the contact info to the new contact info 
        contactInfo = newInfo;  
    }

}
