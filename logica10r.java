import javax.swing.JOption; //import javax.swing.JOptionPane
public class logica10r
{
    public static void main(String[] args)
    {
        double salary; // Annual salary
        double years0nJob; // Years at current job
        String input'; // To hold string input
        input = JOption.showInputDialog("Enter your annual salary: ");
        salary = Double.parseDouble(input);
        input = JOption.showInputDialog("Enter years at current job: ");
        years0nJob = Double.parseDouble(input);                 
        String input = JOption.showInputDialog("Enter the number of years at your current job: ");
        yearsOnJob = Double.parseDouble(input);
        // Determine whether the user is eligible for a loan
        if (salary >= 30000 && yearsOnJob >= 2)
        {
            JOption.showMessageDialog(null, "You are qualified for the loan.");
        }
        else
        {
            JOption.showMessageDialog(null, "You do not qualify for the loan.");
        }
    }
}