public class CafeJava {
    public static void main(String[] args) {
        
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = " Your total is $";
        
        
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 2.5;
        double cappucinoPrice = 2.2;
    
        
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
        
     
        System.out.print(generalGreeting + customer1); 
        if (isReadyOrder1) {
            System.out.println(readyMessage);
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.print(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.print(readyMessage);
            System.out.println(displayTotalMessage + (2 * lattePrice));
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.print(generalGreeting + customer3);
        if (isReadyOrder3) {
            System.out.print(readyMessage);
            System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.print(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.print(readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);

        }
        else {
            System.out.println(pendingMessage);
        }
      
    }
}
