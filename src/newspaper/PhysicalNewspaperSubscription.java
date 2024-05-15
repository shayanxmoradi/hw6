package newspaper;

public class PhysicalNewspaperSubscription extends NewspaperSubscription{


    @Override
    public void setAddress(String address) {
        String numberOnly= address.replaceAll("[^0-9]", "");
        if (numberOnly.length()<1) {
            this.address ="Invalid";
            this.rate=0;
            System.err.println("Invalid physical address, requires min 1 digit " );
        }else {
            this.address = address;
            this.rate = 15;
        }

    }
}
