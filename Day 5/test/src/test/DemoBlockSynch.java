package test;

class TicketBooking
{
    int seats = 1;
    void bookTicket(String name)
    {
        System.out.println(name + " is trying to book ticket");
        // Block level synchronization
        synchronized(this)
        {
            if(seats > 0)
            {
                System.out.println(name + " successfully booked the ticket");
                seats--;
            }
            else
            {
                System.out.println("Sorry ticket not available for " + name);
            }
        }
    }
}

class Customer1 extends Thread
{
    TicketBooking tb;
    String name;
    Customer1(TicketBooking tb, String name)
    {
        this.tb = tb;
        this.name = name;
    }
    public void run()
    {
        tb.bookTicket(name);
    }
}

public class DemoBlockSynch {
	public static void main(String args[])
    {
        TicketBooking obj = new TicketBooking();

        Customer1 c1 = new Customer1(obj,"Customer 1");
        Customer1 c2 = new Customer1(obj,"Customer 2");

        c1.start();
        c2.start();
    }
}
