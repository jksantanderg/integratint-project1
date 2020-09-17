import java.util.Scanner;
public class Laboratorio1{

	static int size = 0;
	static int sizeestab = 0;
	static String utilizacion = "";
	
	static String [] utilization = new String[size];
	static String [] blanckWork  = new String[size];
	static String [] whiteWork = new String[size];
	static String [] painting = new String[size];
	static String [] establishments = new String [sizeestab];
	static String [] nameMaterials = new String [size];
	static int [] sizeMaterials = new int [size];
	
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		
		readOptions();
		
	}
	
	public static void readOptions(){
	Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Welcome to the main menu");
		
		int option = 0;
		do{
			System.out.println("============");
			System.out.println("\nOptions Menu");
			System.out.println("============");
			System.out.println("1. Enter three character strings");
			System.out.println("2. Enter the values of each material for each of the establishments");
			System.out.println("3. Generate the total to be paid for the entire work for each of the establishments");
			System.out.println("4. Display for each product where it is best to buy it and the value to pay. ");
			System.out.println("5. Display the products by type of use");
			System.out.println("6. Exit\n");
			System.out.println("Enter option (1-6): ");
			System.out.print("Enter the option: ");
			option = sc.nextInt();
			
			
			switch(option){
				case 1:
					System.out.println("1");
					
					sizeArray(size);
					enterNameMaterials(nameMaterials,sizeMaterials,utilization);
					//enterUtilization(utilizacion);
				
				break;

				case 2:
					System.out.println("2");
					establishmentsSize(sizeestab);
					establishmentsName(establishments);
				break;
					
				case 3:
				break;
				
				case 4:
				break;
				
				case 5:
				break;
				
			}	
		}
		while(option !=6);
			System.out.println("Thank you for using this program. Good bye!");
		}
	

	
	public static String enterUtilization(String utilizacion) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter if the material to be entered in for, ---blackwork,whiteWork,painting-- no space between words");
		utilizacion = sc.nextLine();
		return utilizacion;
	}
	
	public static void sizeArray(int size) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount of materials you want to enter");
		size = sc.nextInt();
	}
	
	public static void enterNameMaterials(String nameMaterials[],int sizeMaterials [],String utilization []){
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<nameMaterials.length;i++){
			for (int j=0; j<sizeMaterials.length;j++){
				for (int x=0; x<utilization.length;x++){
					System.out.println("Enter the name of the material "+(i+1)+":");
					nameMaterials[i] = sc.nextLine();
					System.out.println("Enter the name of the material "+(nameMaterials[i])+":");
					sizeMaterials[j] = sc.nextInt();
					System.out.println("Enter if the material to be entered in for, ---blackwork,whiteWork,painting-- no space between words "+(nameMaterials[i])+":");
					utilization[x] = sc.nextLine();
				}
			}
		}
	}
	
	/**
	*obtiene el tamano de un arreglo a partir de un indice.<br>
	*<b>pre: </b><br>
	*<b>post:</b> se da el tamaño de un arreglo.<br>
	@param un numero diferente de null.
	*/
	public static void establishmentsSize(int sizeestab){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter how many establishments you want to enter");
		sizeestab = sc.nextInt();
	}
	
	public static void establishmentsName(String establishments[]){
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<establishments.length;i++){
			System.out.println("...");
			establishments[i]= sc.nextLine();
		}
	
	}
	
	
	
	/*public static void saveMaterials(String utilizacion) {
		String blackwork = "";
		String whiteWork = "";
		String painting = "";
		
		if(utilizacion.equals(blackwork)){
			
		}
		
		if(utilizacion.equals(whiteWork)){
			
		}
		
		if(utilizacion.equals(painting)){
			
		}
	
	}*/
	
	
	
	/*public void xxx (){
		Scanner sc = new Scanner(System.in);
		String name = " ";
		System.out.println("als");
		utilizacion = sc.nextLine();
		
	}
	*/
	
}	
		
	
	 
	
	
	
