import java.util.Scanner;

public class UC03 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }
    static int getUserSlot(){
        System.out.print("Enter slot (1 - 9): ");
        int slot = in.nextInt();
        return slot;
    }
}
