package assignment3;

public class Organization implements Cloneable 
{
	   private int organizationCode;
	    private String organizationName;
	    private String organizationAddress;
	    public Organization(int organizationCode, String organizationName, String organizationAddress)
	    {
	        this.organizationCode = organizationCode;
	        this.organizationName = organizationName;
	        this.organizationAddress = organizationAddress;
	    }
	    public void printDetails()
	    {
	        System.out.println("Organization Code: " + organizationCode);
	        System.out.println("Organization Name: " + organizationName);
	        System.out.println("Organization Address: " + organizationAddress);
	    }
	    @Override
	    protected Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }
	    public static void main(String[] args) 
	    {
	        Organization originalOrganization = new Organization(12345, "OpenAI", "123 AI Street, AI City");

	        try {
	            Organization clonedOrganization = (Organization) originalOrganization.clone();
	            System.out.println("Original Organization:");
	            originalOrganization.printDetails();
	            
	            System.out.println("\nCloned Organization:");
	            clonedOrganization.printDetails();
	            } 
	        catch (CloneNotSupportedException e)
	           {
	            System.err.println("Cloning not supported");
	            e.printStackTrace();
	           }
	    }
}
