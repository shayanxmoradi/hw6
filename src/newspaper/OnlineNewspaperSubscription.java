package newspaper;

public class OnlineNewspaperSubscription extends NewspaperSubscription{



    @Override
    public void setAddress(String address) {
        if (address != null && !address.isEmpty()) {
            if (!address.contains("@")){
                System.err.println("invalid address: " + address);
                this.address= "ivalid";
            }else {
                this.address = address;
                this.rate= 9;
            }

        }

    }
}
