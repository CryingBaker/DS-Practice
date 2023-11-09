import java.util.*;
public class hotelmenuls {
    public static int menupicker(String menuChoice, String menu[]){
        for(int i = 0 ; i<menu.length; i++){
            if(menu[i].equals(menuChoice)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String menu[] = {"Idli","Medu Vada","Dosa","Pav Bhaji","Pizza","Burger","Ice-cream","Tea"};
        System.out.println("Menu:");
        for(int i = 0 ; i<menu.length; i++){
            System.out.print(menu[i]+"  ");
        }
        System.out.println();
        System.out.println("Waiter: What would you like?");
        String menuChoice = sc.nextLine();
        int menuOption = menupicker(menuChoice,menu);
        if(menuOption==-1){
            System.out.println("Waiter(to Customer): Sorry, thats not available!");
        }else{
            System.out.println("Waiter(to Chef): Customer wants to order "+menu[menuOption]);
        }
    }
}
