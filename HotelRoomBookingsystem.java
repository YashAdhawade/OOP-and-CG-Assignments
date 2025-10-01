import java.util.Scanner; 

pulic class HotelRoomBookingsystem{ 

public static void main(String[] args) {
Scanner scanner=new Scanner(System.in); 


//let assume the hotel has 4 floors and 5 rooms per floor 
final int floors=4;
final int rooms=5;


//false=available,true=booked
boolean[][]hotelRooms=new boolean[FLOORS][ROOMS];

int choice;
do{
System.out.println("\n===Hotel Room Booking System===");
System.out.println("1.View Room Status");
System.out.println("2.Book a Room");
Sysrem.out.println("3.Exit");
System.out.println("Enter your choice(1-4):");
choice = scanner.nextint();

switch(choice){
 case 1:
   viewRooms(hotelRooms);
   
   break;
   
 case 2:
   bookRoom(hotelRooms,scanner);
   
   break;
 
 case 3:
   System.out.println("Thank you for using the system Goodbye!");
   
   break;
   
   
 default:
   System.out.println("invalid choice! please select 1 to 4");
  }
 
 }while (choice!=3);
}

//Method to view all rooms 
public static void viewRooms(boolean[][]rooms){
  System.out.println("\nRoom Status(A=Available,B=Booked):");
  
  for(int i=0;i<rooms.length;i++){
    System.out.print("Floor"+(i+1)+":");
    for(int j=0;j<rooms[i].length;j++){
    
      if(rooms[i][j]){
         System.out.print("[B]");
      }else{
        System.out.print("[A]");
      }
     }
     System.out.println();
     }
    }
    
     //Method to book a room
     public static void bookRoom(boolean [][]rooms,Scannerscanner) {
       Systen.out.print("Enter floor number(1."+rooms.length+"):");
       
    int floor=scanner.nextint();
    System.out.print("enter room number(1."+rooms[0].length+"):");
    int room=scanner.nextint();
    
    
    //Check for valid input 
    if(floor<1||floor>rooms.length||room<1||room>rooms[0].length){
       System.out.println("invalid floor or room number.Try again");
       
       return;
       
      }
      
      
      //Check if already booked
      if(rooms[floor-1][room-1]){
         System.out.println("Sorry,tht room is already booked");
         
     }else{
       rooms[floor-1][room-1]=true;
       System.out.println("Room"+room+"onFloor"+floor+"booked sucessfully");
     }
    }
   }



