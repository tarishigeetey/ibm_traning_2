import com.ibm.ott.AgeRestractionException;
import com.ibm.ott.Movie;
import com.ibm.ott.Series;
import com.ibm.ott.Subscribing;
import com.ibm.ott.Subscription;
import com.ibm.ott.SubscriptionException;
import com.ibm.ott.SubscriptonFactory;
import com.ibm.ott.User;

public class TestOtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User("Polo", 17 , "Male", 10089.65 );
		User u2 = new User("Lili", 21 , "Female", 120.65 );
		User u3 = new User("Kkim", 51 , "Male", 00);
		
		Subscribing subscription = SubscriptonFactory.cresteSubscriber();
		
		Movie m1 = new Movie("American Pie", "Erotic", false);
		Movie m2 = new Movie("Evil Dead", "Horror", true);
		Movie m3 = new Movie("Avtar", "Action", false);
		
		Series s1 = new Series("GOT", "Erotic", false, 7, 10);
		Series s2 = new Series("LOST", "Action", false, 3, 10);
//		
//		try {
//			subscription.subscriber("ANNUALY", u1);
//		} catch (SubscriptionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			m2.play(u3);
//		} catch (SubscriptionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (AgeRestractionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		u2.mySubscription();
		
//		try {
//			subscription.subscriber("ANNUALY", u1);
//		} catch (SubscriptionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		u1.mySubscription();
//		
//		try {
//			subscription.subscriber("MONTHLY", u1);
//		} catch (SubscriptionException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}

		try {
			subscription.subscriber("Monthly", u1);
		} catch (SubscriptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		u1.mySubscription();
		
		try {
			subscription.subscriber("Monthly", u1);
		} catch (SubscriptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
