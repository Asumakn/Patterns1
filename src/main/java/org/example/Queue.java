package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Queue {


}
    class Ticket{
        String ticketId ="0000001";
        String title;
        String description;
        LocalDateTime creationTime;
        User CreatedBy;
        Technician assignedTo;
        Status status;
        //MyQueue<Operation> operationHistory;

        public Ticket(String title, String description, User createdBy) {
            this.title = title;
            this.description = description;
           CreatedBy = createdBy;
         // ticketId =ticketId+1;
            creationTime = LocalDateTime.now();
            //CreatedBy\
            status  = Status.CREATED;
            //operationHistory =new Queue();
            //operationHistory.add(Create)

        }
        enum Status{
            CREATED,
            ASSIGNED,
            PROCESSING,
            BLOCKED,
            CLOSED

        }
      public class Operation{
          LocalDateTime operationTime;
          User operatedBy;
          String description;

          public Operation(User operatedBy, String description) {
              this.operatedBy = operatedBy;
              this.description = description;
              operationTime = LocalDateTime.now();
          }

          @Override
          public String toString() {
              return "Operation{" +
                      "operationTime=" + operationTime +
                      ", operatedBy=" + operatedBy +
                      ", description='" + description + '\'' +
                      '}';
          }
      }

public class User{
   String userId;
   String fName;
   String lName;

    public User(String fName, String lName) {
        this.fName = toPascalCase(fName);
        this.lName =toPascalCase(lName);

        //userId
    }
    public String toPascalCase(String word){

        return word.substring(0,1).toUpperCase()+word.substring(1);
    }
public String getFullName(){

        return lName+" "+fName;
}
public void createTicket(String first,String last,User person){
     Ticket n = new Ticket(first,last,person);
}

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
public class Technician extends User{
     List<Ticket> assignedTickets;


    public Technician(String fName, String lName) {
        super(fName, lName);
        List<Ticket> assignedTickets ;
    }
    public void fetchNewTicket(){



    }
}
public class TicketSystem{
List<User> users;
List<Technician> technicians;
List<Ticket> unassignedTickets;
List<Ticket> processingTickets;
List<Ticket> completedTickets;

    public TicketSystem() {
        List<User> users;
        List<Technician> technicians;
        Queue unassignedTickets;
        List<Ticket> processingTickets;
        List<Ticket> completedTickets;

    }
    public Ticket search(String keyword){

        for (int i = 0;i<unassignedTickets.size()-1;i++){
            if (unassignedTickets.get(i).ticketId.equals(keyword)){
                return unassignedTickets.get(i);
         }
        }
        for (int i = 0;i<processingTickets.size()-1;i++){
            if (processingTickets.get(i).ticketId.equals(keyword)){
                return processingTickets.get(i);
            }
        }
        for (int i = 0;i<completedTickets.size()-1;i++){
            if (completedTickets.get(i).ticketId.equals(keyword)){
                return completedTickets.get(i);
            }
        }
return null;
    }
    public void addUser(User newUser){
      users.add(newUser);

    }
    public void addTechnician(Technician tech){

        technicians.add(tech);
        users.add(tech);
    }



}

    public static void main(String[] args) {





    }
}


