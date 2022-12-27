package com.interview;

public class CSVFormatter {

    public static void main(String args[]) {
        String studentsNotes = getNotes();

        System.out.println(studentsNotes);

        //Instruction:
        //----------------------------------------------
        // Print the data this way:
        // Nombre: David Grupo: 3 - A No. Lista: 24
        // Materia 1: Espaniol 75
        // Materia 2: Matematicas 43



        //Solution
        //----------------------------------------------
        //
        // Split the input string into individual lines
        String[] lines = studentsNotes.split("\n");

        // Iterate through each line of the input
        for (String line : lines) {

            // Split the line into parts
            String[] parts = line.split(",");

            // Check the first part to determine whether it is an "S" or an "N"
            if (parts[0].trim().equals("S")) {
                // If it is an "S", then this line contains student information
                //
                // Extract the student name, group, and list number from the line

                String name = parts[4].trim();
                String group = parts[1].trim() + " - " + parts[2].trim();
                int listNumber = Integer.parseInt(parts[3].trim());

                System.out.println("Nombre: " + name + " Grupo: " + group + " No. Lista: " + listNumber);
            } else if (parts[0].trim().equals("N")) {
                // If it is an "N", then this line contains course information
                //
                // Extract the student name, group, and list number from the line

                String subject = parts[1].trim();
                int grade = Integer.parseInt(parts[2].trim());

                System.out.println("Materia: " + subject + " " + grade);
            }
        }
    }

    public static String getNotes() {
        StringBuilder studentsNotes = new StringBuilder();

        /*
         * S = Student; Where the second value is the school grade,
         *       third is the group, fourth is the number list,
         *       and fifth is the student's name
         *
         * N = Note; Where the second value is the subject's name,
         *       and the third vaue is the final grade
         */


        studentsNotes.append("S, 3, A, 24, David\n");
        studentsNotes.append("N, Espaniol, 75\n");
        studentsNotes.append("N, Matematicas, 43\n");
        studentsNotes.append("S, 3, A, 22, Laura\n");
        studentsNotes.append("N, Espaniol, 96\n");
        studentsNotes.append("N, Matematicas, 75\n");
        studentsNotes.append("S, 3, B, 06, Jorge\n");
        studentsNotes.append("N, Espaniol, 55\n");
        studentsNotes.append("N, Matematicas, 67\n");
        studentsNotes.append("S, 4, A, 06, Maria\n");
        studentsNotes.append("N, Ciencias, 54\n");
        studentsNotes.append("N, Algebra, 72\n");

        return studentsNotes.toString();
    }


}
