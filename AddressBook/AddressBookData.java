class AddressBookData
{
     String name;
     String houseNum;
     String streetName;
     String pincode;
    public AddressBookData (String name,String houseNum,String streetName,String pincode)
    {
        this.name = name;
        this.houseNum = houseNum;
        this.streetName=streetName;
        this.pincode=pincode;
    }
	public String getName() {
		return name;
	}
	public String getHouseNum() {
		return houseNum;
	}
	public String getStreetName() {
		return streetName;
	}
	public String getPincode() {
		return pincode;
	}
    public String toString()
    {
        return "Person Name ="+name+"House number ="+houseNum+"Street Name ="+streetName+"Pin code="+pincode;
    }
}