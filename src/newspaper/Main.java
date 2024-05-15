package newspaper;

public class Main {
    public static void main(String[] args) {
        OnlineNewspaperSubscription onlineNewspaperSubscription = new OnlineNewspaperSubscription();
        onlineNewspaperSubscription.setName("shayan");
        onlineNewspaperSubscription.setAddress("shayan.moradi92");
        System.out.println(onlineNewspaperSubscription);

        OnlineNewspaperSubscription onlineNewspaperSubscription2 = new OnlineNewspaperSubscription();
        onlineNewspaperSubscription2.setName("shayan");
        onlineNewspaperSubscription2.setAddress("shayan.moradi92@gmail.com");
        System.out.println(onlineNewspaperSubscription2);

        PhysicalNewspaperSubscription physicalNewspaperSubscription = new PhysicalNewspaperSubscription();
        physicalNewspaperSubscription.setName("shayan");
        physicalNewspaperSubscription.setAddress("Emil-Moog-Platz");
        System.out.println(physicalNewspaperSubscription);

        PhysicalNewspaperSubscription physicalNewspaperSubscription2 = new PhysicalNewspaperSubscription();
        physicalNewspaperSubscription2.setName("shayan");
        physicalNewspaperSubscription2.setAddress("Emil-Moog-Platz2");
        System.out.println(physicalNewspaperSubscription2);
    }
}