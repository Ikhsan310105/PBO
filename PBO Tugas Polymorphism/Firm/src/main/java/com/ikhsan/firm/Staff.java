package com.ikhsan.firm;

public class Staff {

    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[8];

        staffList[0] = new Executive("Tony", "123 Main Line",
                "555-0469", "123-45-6789", 2423.07);

        staffList[1] = new Employee("Paulie", "456 Off Line",
                "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Vito", "789 Off Rocker",
                "555-0000", "010-20-3040", 1169.23);

        staffList[3] = new Hourly("Michael", "678 Fifth Ave.",
                "555-0690", "958-47-3625", 10.55);

        staffList[4] = new Volunteer("Adrianna", "987 Babe Blvd.",
                "555-8374");
        staffList[5] = new Volunteer("Benny", "321 Dud Lane",
                "555-7282");

        staffList[6] = new Commission("Ikhsan", "Pasteur",
                "010101010101", "275-98-2756", 6.25, 0.20);
        
        staffList[7] = new Commission("Refan", "Cimahi",
                "20202020202", "375-98-3756", 9.75, 0.15);

        ((Executive) staffList[0]).awardBonus(500.00);

        ((Hourly) staffList[3]).addHours(40);
        ((Hourly) staffList[6]).addHours(35);
        ((Hourly) staffList[7]).addHours(40);
        
        ((Commission) staffList[6]).addSales(400);
        ((Commission) staffList[7]).addSales(950);
    }
    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------

    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }

            System.out.println("-----------------------------------");
        }
    }
}
