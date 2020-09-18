import java.util.Scanner;
public class Laboratorio1{
	
	static int [] utilization = new int[3];//size
	static String [] nameMaterials = new String [3];//size
	static int [] sizeMaterials = new int [3];//size
	static int [] priceMaterials = new int [3];
	static String [] blackWork  = new String[1];//accountantb
	static String [] whiteWork = new String[1];//accountantw
	static String [] painting = new String[1];//accountantp
	static String [] establishments = new String [2];//sizeestab
	static int [] priceMaterialsB = new int [2];
	static int [] priceMaterialsW = new int [2];
	static int [] priceMaterialsP = new int [2];
	
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
					
					sizeArray();
					enterNameMaterials(nameMaterials);
					entersizeMaterials(sizeMaterials);
					enterUtilizationMaterials(utilization);
					sizeTypeB(utilization);
					sizeTypeW(utilization);
					sizeTypeP(utilization);
					typeUtilizationMaterials(utilization,blackWork,whiteWork,painting,nameMaterials);
					
				break;

				case 2:
					System.out.println("2");
					//establishmentsSize(sizeestab);
					establishmentsName(establishments);
					//toEstablishments(establishments);
					ePriceBlackWork(establishments,blackWork,priceMaterialsB);
					ePricePainting(establishments,painting,priceMaterialsP);
					ePriceWiteWork(establishments,whiteWork,priceMaterialsW);
				break;
					
				case 3:
				break;
				
				case 4:
				break;
				
				case 5:
					
					toDeployUtilization(blackWork,whiteWork,painting);
					
				break;
				
			}	
		}
		while(option !=6);
			System.out.println("Thank you for using this program. Good bye!");
	}

	public static int sizeTypeB(int utilization []) {
		for (int i=0; i<nameMaterials.length;i++){
			
			int accountantb = 0;
			if(utilization[i]==1){
				accountantb = accountantb+1;	
			}		
		}
		return accountantb;
	}
	public static int sizeTypeW(int utilization []) {
		for (int i=0; i<nameMaterials.length;i++){
			
			int accountantw = 0;
			if(utilization[i]==2){
				accountantw = accountantw+1;	
			}
		}
		return accountantw;
	}
	public static int sizeTypeP(int utilization []) {
		for (int i=0; i<nameMaterials.length;i++){
			
			int accountantp = 0;
			if(utilization[i]==2){
				accountantp = accountantp+1;	
			}
		}
		return accountantp;
	}
	
	public static int sizeArray() {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		System.out.println("Enter the amount of materials you want to enter");
		size = sc.nextInt();
		
		return size;
	}
	
	public static void enterNameMaterials(String nameMaterials[]){
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<nameMaterials.length;i++){
			System.out.println("Enter the name of the material "+(i+1)+":");
			nameMaterials[i] = sc.nextLine();
		}
	}
	
	public static void entersizeMaterials(int sizeMaterials []){
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<nameMaterials.length;i++){
			System.out.println("Enter the name of the material "+(nameMaterials[i])+":");
			sizeMaterials[i] = sc.nextInt();
		}
	}

	public static void enterUtilizationMaterials(int utilization []){
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<nameMaterials.length;i++){
			System.out.println("\nEnter if the material to be entered in for");
			System.out.println("1. blackwork");
			System.out.println("2. whiteWork"); 
			System.out.println("3. painting");
			System.out.println("of the materials"+(nameMaterials[i])+":");
			utilization[i] = sc.nextInt();
		}
	}
	
	public static void typeUtilizationMaterials(int utilization [],String blackWork [],String whiteWork [],String painting [],String nameMaterials[]){
		for (int i=0; i<nameMaterials.length;i++){
			for (int j=0; j<1;j++){
				int pos = 0;
			
				if(utilization[i]==1){
					pos = i;
					blackWork [j] = nameMaterials[pos];
				
				}else if(utilization[i]==2){
					pos = i;
					whiteWork [j] = nameMaterials[pos];
				
				}else if(utilization[i]==3){
					pos = i;
					painting [j] = nameMaterials[pos];
			
				}		
			}
		}	
	}

	public static void toDeployUtilization(String blackWork[],String whiteWork[],String painting[]){
		Scanner sc = new Scanner(System.in);

		int to =0;
		System.out.println("\nwhich use do you want to display");
		System.out.println("1. blackwork");
		System.out.println("2. whiteWork"); 
		System.out.println("3. painting");
		to = sc.nextInt();
	
		if(to==1){
			System.out.println("The materials of painting are: ");
			for (int i=0; i<blackWork.length;i++){
				System.out.println("-"+(blackWork[i]));
			}
		
		}else if(to==2){
			System.out.println("The materials of painting are: ");
			for (int i=0; i<whiteWork.length;i++){
				System.out.println("-"+(whiteWork[i]));
			}
		
		}else if(to==3){
			System.out.println("The materials of painting are: ");
			for (int i=0; i<painting.length;i++){
				System.out.println("-"+(painting[i]));
			}
		
		}
	}
	
	public static void ePriceBlackWork(String establishments [],String blackWork [],int priceMaterialsB []){
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<blackWork.length;i++){
			
			System.out.println("Enter the price of the material: "+(blackWork[i]));
			priceMaterials[i] = sc.nextInt();
			
		}
	}
	
	public static void ePriceWiteWork(String establishments [],String whiteWork [],int priceMaterialsW []){
		Scanner sc = new Scanner(System.in);
		
			for (int i=0; i<blackWork.length;i++){
			
			System.out.println("Enter the price of the material: "+(blackWork[i]));
			priceMaterialsW[i] = sc.nextInt();
			
		}
	}
	
	public static void ePricePainting(String establishments [],String painting [],int priceMaterialsP []){
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<blackWork.length;i++){
	
			System.out.println("Enter the price of the material: "+(blackWork[i]));
			priceMaterialsP[i] = sc.nextInt();
			
		}
	}
	
	public static void establishmentsName(String establishments []){
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<establishments.length;i++){
			System.out.println("Enter establishment "+(i+1));
			establishments[i] = sc.nextLine();
		}
	}
	
}


	
	/*public static void	toEstablishments(String establishments []){
		Scanner sc = new Scanner(System.in);
		int toes = 0;
		System.out.println("To which establishment you want to enter the price");
		for (int i=0; i<establishments.length;i++){	
			System.out.println((i+1)+".  "+(establishments[i]));
			
		}
		toes = sc.nextInt();
	}*/
	
	/**/
	

	
	
	
		/*/**
		*obtiene el tamano de un arreglo a partir de un indice.<br>
		*<b>pre: </b><br>
		*<b>post:</b> se da el tamaño de un arreglo.<br>
		@param un numero diferente de null.
		*/
		/*public static int establishmentsSize(){
		Scanner sc = new Scanner(System.in);
		int sizeestab = 0;
		System.out.println("Enter how many establishments you want to enter");
		sizeestab = sc.nextInt();
		
		return sizeestab
		*/
		
	

		/*public void enterPriceMaterials(int priceMaterials []){
			Scanner sc = new Scanner(System.in);
		
			for(int i=0; i<establishments.length;i++){
				for(int i=0; i<nameMaterials.length;i++){
				System.out.println("Enter the price of material X of establishment X");
				priceMaterials[] = sc.nextInt();
				}
			}
		
		
		
		}*/
	
	
	

	
	
		
	
	 
	
	
	
