package assignments;

public class Assignment2_3DArray {

	public static void main(String[] args) {
		String[][][] ProgressReport= {
				{ // Semester 1
		            {"Mathematics I","Physics","Chemistry","Computer Programming" ,"Engineering Drawing","Basic Electrical Eng."},
		            { "Pass(78)","Pass(85)","Fail(21)","Pass(74)", "Pass(88)","Pass(79)"}
		          
		        },
		        { // Semester 2
		        	{"Mathematics II", "Mechanics", "EnvironmentalSci.", "Basic Electronics Engineering", "Physics", "Engineering Graphics"},
		        	{"Pass(82)" ,"Pass(77)" ,"Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)"}
		        },
		        { // Semester 3
		            {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog."},
		            {"Pass(88)", "Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"},
		        },
		        { // Semester 4
		            {"Algorithms","Computer Networks","Database Systems","Microprocessors", "Communication Eng.", "Software Engineering"},
		            {"Pass(91)", "Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"}
		        },
		        { // Semester 5
		            {"Probability & Stats","Machine Learning", "Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"},
		            {"Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)" ,"Pass(73)", "Pass(90)"}
		        }};
				//Sem3 4th subj Name
				System.out.println(ProgressReport[2][0][3]);
				//Sem3 5th subj Name
				System.out.println(ProgressReport[2][0][4]);
				//Sem4 3rd sub marks
				System.out.println(ProgressReport[3][1][2]);
				//Sem4 6th sub marks
				System.out.println(ProgressReport[3][1][5]);

	}

}
