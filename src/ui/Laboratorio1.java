import java.util.Scanner;
public class Laboratorio1{
	
	public static final int BLACK_WORK  = 1300000;
	public static final int WHITE_WORK = 2600000;
	public static final int PAINTING = 980000;
	public static final int TOTAL_WORK = BLACK_WORK+WHITE_WORK*PAINTING;
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner (System.in);
		int size = 0;
		System.out.println("Enter the amount of materials you want to enter");
		size = sc.nextInt();
		//1
		String [] name_materials;
		int [] size_materials;
		int [] utilization;
		name_materials= enterNameMaterials(size);
		size_materials= entersizeMaterials(size, name_materials);
		utilization=enterUtilizationMaterials(size,name_materials);
		//2
		int [] pHome;
		int [] pCentro;
		int [] pBarrio;
		pHome=HomeCenter(name_materials,size);
		pCentro=FerreteriadelCentro(name_materials,size);
		pBarrio=FerreteríadelBarrio(name_materials,size);
		//3
		int location;
		int priceBarrio;
		int priceCentro;
		int priceHome;
		location=PropertyLocation();
		priceHome=priceHomeCenter(pHome);
		priceCentro=priceFerreteriadelCentro(pCentro);
		priceBarrio=priceFerreteriadelBarrio(pBarrio);
		totalPriceHome(location,priceHome,TOTAL_WORK);
		totalPriceCentro(location,priceHome,TOTAL_WORK);
		totalPriceBarrio(location,priceHome,TOTAL_WORK);
		//4
		bestPrice(pHome,pBarrio,pCentro,name_materials);
		
		//5
		int sizeb;
		int sizew;
		int sizep;
		int type;
		String []blackwork;
		String []whitework;
		String []painting;
		sizeb=sizeBlackWork(utilization);
		sizew=sizewhiteWork(utilization);
		sizep=sizePainting(utilization);
		type=typeUtilizationMaterials();
		blackwork=typeUtilizationB(utilization,sizeb,name_materials);
		whitework=typeUtilizationw(utilization,sizew,name_materials);
		painting=typeUtilizationp(utilization,sizep,name_materials);
		typeUtilizationMat(name_materials,type,blackwork,whitework,painting);
	}
	/**
	*full the array name_materials.
	*pre:<b>the user must enter an integer data.</b>
	*post:<b></b>
	*@param an array and a variable integer.
	*@return a array, containing the name of the materials.
	*/

	public static String[] enterNameMaterials(int size) {
		Scanner sc = new Scanner(System.in);
	
		String [] name_mat = new String[size];
		for (int i=0; i<name_mat.length;i++){
			
			System.out.println("Enter the name of the material :"+(i+1));
			name_mat[i] = sc.nextLine();
		}
		
		return name_mat;
	}
	/**
	*full the array size_materials, 
	*pre:<b>the user must enter an integer data.</b>
	*post:<b></b>
	*@param an array and a variable integer.
	*@return a array, containing the quiantify of the materials.
	*/
	public static int[] entersizeMaterials(int size,String name_materials []){
		Scanner sc = new Scanner(System.in);
		
		int [] size_mat = new int[size];
		for (int i=0; i<size_mat.length;i++){
			System.out.println("Enter the quantity of the material:"+(name_materials[i]));
			size_mat[i] = sc.nextInt();
		}
		return size_mat;
	}
	/**
	*full the array utilization.
	*<b>pre:<b>the user must enter an integer data.</b>
	*<b>post:<b></b>
	*@param an array and a variable integer and a variable integer.
	*@return a variable int.
	*/
	public static int[] enterUtilizationMaterials(int size,String name_materials []){
		Scanner sc = new Scanner(System.in);
		
		int [] uti = new int[size];
		for (int i=0; i<uti.length;i++){
			System.out.println("Enter if the material to be entered in for");
			System.out.println("1. blackwork");
			System.out.println("2. whiteWork"); 
			System.out.println("3. painting");
			System.out.println("of the materials "+(name_materials[i]));
			uti[i] = sc.nextInt();
		}
		return uti;
	}
	//2
	/**
	*full the array pHome.
	*<b>pre:<b>the user must enter an integer data.</b>
	*<b>post:<b></b>
	*@param an array and a variable integer.
	*@return a array, contains the price of the materials.
	*/
	public static int[] HomeCenter(String name_materials[],int size) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----HomeCenter-----");
		int [] hc = new int[size];
		for(int i=0; i<hc.length;i++){
			System.out.println("enter material price: "+(name_materials[i])+" in the HomeCenter");
			hc[i] = sc.nextInt();
		}
		
		return hc;
	}
	/**
	*full the array pCentro.
	*pre:<b>the user must enter an integer data.</b>
	*post:<b></b>
	*@param an array and a variable integer.
	*@return a array, contains the price of the materials
	*/
	public static int[] FerreteriadelCentro(String name_materials[],int size) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----Ferreteria del centro-----");
		int [] fdc = new int [size];
		for(int i=0; i<fdc.length;i++){
			System.out.println("enter material price: "+(name_materials[i])+" in the Ferreteria del centro");
			fdc[i] = sc.nextInt();
		}
		
		return fdc;
	}
	/**
	*full the array pBarrio.
	*<b>pre:<b>the user must enter an integer data.</b>
	*<b>post:<b></b>
	*@param an array and a variable integer.
	*@return a array, contains the price of the materials.
	*/
	public static int[] FerreteríadelBarrio(String name_materials[],int size) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----Ferretería del barrio-----");
		int [] fdb = new int[size];
		for(int i=0; i<fdb.length;i++){
			System.out.println("enter material value: "+(name_materials[i])+" in the Ferreteria del barrio");
			fdb[i] = sc.nextInt();
		}
		
		return fdb;
	}
	//3
	/**
	*It asks the user for a full piece of information, a value which will be useful later to know which work he wants to display.
	*<b>pre:<b>the user must enter an integer data.</b>
	*<b>post:<b></b>
	*@param 
	*@return variable integer, contains a numer which defines in which sector you live.
	*/
	public static int PropertyLocation(){
		Scanner sc = new Scanner(System.in);
		int loc = 0;
		System.out.println("\nPlease enter the location of the property");
		System.out.println("1. North");
		System.out.println("2. Center"); 
		System.out.println("3. South");
		loc = sc.nextInt();
		
		return loc;
	}
	/**
	*calculate total the price of the materials in HomeCenter.
	*<b>pre:<b></b>
	*post:
	*@param a array of String.
	*@return a variable integer, contains total the price.
	*/
	public static int priceHomeCenter(int pHome []){
		Scanner sc = new Scanner(System.in);
		
		int phc = 0;
		for(int i=0; i<pHome.length;i++){
			phc = phc+pHome[i];
		}
		return phc;
	}
	/**
	*calculate total the price of the materials in Ferreteria del centro.
	*pre:<b></b>
	*post:<b></b>
	*@param a array of String.
	*@return a variable integer, contains total the price.
	*/
	public static int priceFerreteriadelCentro(int pCentro []){
		Scanner sc = new Scanner(System.in);

		int pfdc = 0;
		for(int i=0; i<pCentro.length;i++){
			pfdc = pfdc+pCentro[i];
		}
		return pfdc;
	}
	/**
	*calculate total the price of the materials in Ferreteria del barrio.
	*pre:<b></b>
	*post:<b></b>
	*@param a array of String.
	*@return a variable integer, contains total the price.
	*/
	public static int priceFerreteriadelBarrio(int pBarrio []){
		Scanner sc = new Scanner(System.in);
		
		int pfdb = 0;
		for(int i=0; i<pBarrio.length;i++){
			pfdb = pfdb+pBarrio[i];
		}
		return pfdb;
	}
	/**
	*compare price, to know the cost including the address according to where it is located. It also gives the total value that it will cost to carry out the work, in HomeCenter.
	*<b>post:<b></br>
	*<b>post:<b></br>
	*@param dos variables integer and one constant.
	*/
	public static void totalPriceHome(int location,int priceHome,int TOTAL_WORK){
		Scanner sc = new Scanner(System.in);
		
		int pth=0;
		int total=0;
		if(priceHome<80000){
			if(location==1){
				pth= priceHome+120000;
			}else if(location==2){
				pth= priceHome+50000;
			}else if(location==3){
				pth= priceHome+120000;
			}
		}else if(priceHome>=300000){
			if(location==1){
				pth= priceHome;
			}else if(location==2){
				pth= priceHome;
			}else if(location==3){
				pth= priceHome;
			}
		}else{
			if(location==1){
				pth= priceHome+28000;
			}else if(location==2){
				pth= priceHome;
			}else if(location==3){
				pth= priceHome+55000;
			}
		}
		total=pth+TOTAL_WORK;
		System.out.println("The price ------Ferreteria HomeCenter------------ ");
		System.out.println("The price of work in HomeCenter is: "+pth+" NO DOMICILE");
		System.out.println("The price of work in HomeCenter is: "+pth);
		System.out.println("The price of work in HomeCenter IN TOTAL: "+total);
	}
	/**
	*compare price, to know the cost including the address according to where it is located. It also gives the total value that it will cost to carry out the work, in Ferreteria del centro.
	*pre:<b></b>
	*post:<b></b>
	*@param dos variables integer and one constant.
	*/
	
	public static void totalPriceCentro(int location,int priceCentro,int TOTAL_WORK){
		Scanner sc = new Scanner(System.in);
		
		int total=0;
		int ptc=0;
		if(priceCentro<80000){
			if(location==1){
				ptc= priceCentro+120000;
			}else if(location==2){
				ptc= priceCentro+50000;
			}else if(location==3){
				ptc= priceCentro+120000;
			}
		}else if(priceCentro>=300000){
			if(location==1){
				ptc= priceCentro;
			}else if(location==2){
				ptc= priceCentro;
			}else if(location==3){
				ptc= priceCentro;
			}
		}else{
			if(location==1){
				ptc= priceCentro+28000;
			}else if(location==2){
				ptc= priceCentro;
			}else if(location==3){
				ptc= priceCentro+55000;
			}
		}
		total=ptc+TOTAL_WORK;
		System.out.println("The price ------Ferreteria del centro ------------ ");
		System.out.println("The price of work in Ferreteria del centro is: "+priceCentro+"NO DOMICILE");
		System.out.println("The price of work in Ferreteria del centro is: "+ptc);
		System.out.println("The price of work in Ferreteria del centro IN TOTAL: "+total);
	}
	/**
	*compare price, to know the cost including the address according to where it is located. It also gives the total value that it will cost to carry out the work, in Ferreteria del barrio.
	*pre:<b></br>
	*post:<b></b>
	*@param dos variables integer and one constant.
	*/
	public static void totalPriceBarrio(int location,int priceBarrio,int TOTAL_WORK){
		Scanner sc = new Scanner(System.in);
		
		int total=0;
		int ptb=0;
		if(priceBarrio<80000){
			if(location==1){
				ptb= priceBarrio+120000;
			}else if(location==2){
				ptb= priceBarrio+50000;
			}else if(location==3){
				ptb= priceBarrio+120000;
			}
		}else if(priceBarrio>=300000){
			if(location==1){
				ptb= priceBarrio;
			}else if(location==2){
				ptb= priceBarrio;
			}else if(location==3){
				ptb= priceBarrio;
			}
		}else{
			if(location==1){
				ptb= priceBarrio+28000;
			}else if(location==2){
				ptb= priceBarrio;
			}else if(location==3){
				ptb= priceBarrio+55000;
			}
		}
		total = ptb+TOTAL_WORK;
		System.out.println("The price ------Ferreteria del barrio ------------ ");
		System.out.println("The price of work in Ferreteria del barrio is: "+priceBarrio+"NO DOMICILE");
		System.out.println("The price of work in Ferreteria del barrio is: "+ptb);
		System.out.println("The price of work in Ferreteria del barrio IN TOTAL: "+total);
	}
	//4
	/**
	*compares 3 arrays, data by data in the same position to know which of the 3 arrays contains the smallest value.
	*pre:<b></br>
	*post:<b></br>
	*@param 3 string list of string and one string de of int.
	*/
	public static void bestPrice(int pHome[],int pBarrio [],int pCentro [],String name_materials []){
		
		String barrio = "Ferreteria del barrio";
		String centro = "Ferreteria del centro";
		String  home= "HomeCenter";
		String todos= "The prices are the same";
		String hc= "HomeCenter and Ferreteria del centro";
		String hb="HomeCenter and Ferreteria del barrio";
		String cb="Ferreteria del centro and Ferreteria del barrio";
		String [] esta = new String[name_materials.length];
		String [] bestpe = new String[name_materials.length];
		int []  bp= new int[name_materials.length];
				System.out.println("------------------------------------------------------");
		for(int i=0; i<pHome.length;i++){
			if(pHome[i]==pBarrio[i]){
				esta[i]=hb;
				bp[i] = pHome[i];
				if(pHome[i]==pCentro[i]){
					esta[i]=todos;
					bp[i] = pHome[i];
				}
			}
			if(pHome[i]==pCentro[i]){
				esta[i]=hc;
				bp[i] = pHome[i];
				if(pHome[i]==pBarrio[i]){
					esta[i]=todos;
					bp[i] = pHome[i];
				}
			}
			if(pCentro[i]==pBarrio[i]){
				esta[i]=cb;
				bp[i] = pCentro[i];
				if (pHome[i]==pCentro[i]){
					esta[i]=todos;
					bp[i] = pHome[i];
				}
			}
			
			if (pHome[i]<pCentro[i]){
				if (pHome[i]<pBarrio[i]){
					esta[i]=home;
					bp[i] = pHome[i];		
				}else if(pCentro[i]<pHome[i]){
					esta[i]=centro;
					bp[i] = pCentro[i];	
				}
			}else if(pCentro[i]<pBarrio[i]){
				esta[i]=centro;
				bp[i] = pCentro[i];
						
			}else if(pBarrio[i]<pCentro[i]){
				esta[i]=barrio;
				bp[i] = pBarrio[i];
			}
		}
		for(int i=0; i<name_materials.length;i++){
			System.out.println("For the material "+(name_materials[i])+" it is better to buy it in: "+(esta[i])+" el price is: "+(bp[i]));
		}
		
	}
	//5
	/**
	*calculates the size of an array, the array blackwork.
	*<b>pre:<b></br>
	*<b>post:<b></br>
	*@param a string list of string.
	*@return a variable integer, is variable is the size of an array.
	*/
	public static int sizeBlackWork(int utilization []){
		int sizebw = 0;
		for (int i=0; i<utilization.length;i++){
			if(utilization[i]==1){
				sizebw = sizebw+1;
			}
		}
		return sizebw;
	}
	/**
	*calculates the size of an array, the array whitework..
	*<b>post:<b></br>
	*<b>post:<b></br>
	*@param a string list of string.
	*@return a variable integer, is variable is the size of an array.
	*/
	public static int sizewhiteWork(int utilization []){
		int sizeww = 0;
		for (int i=0; i<utilization.length;i++){
			if(utilization[i]==1){
				sizeww = sizeww+1;
			}
		}
		return sizeww;
	}
	/**
	*calculates the size of an array, the array painting.
	*<b>post:<b></br>
	*<b>post:<b></br>
	*@param a string list of string.
	*@return a variable integer, is variable is the size of an array.
	*/
	public static int sizePainting(int utilization []){
		int sizepp = 0;
		for (int i=0; i<utilization.length;i++){
			if(utilization[i]==1){
				sizepp = sizepp+1;
			}
		}
		return sizepp;
	}
	/**
	*fill the arrangement of the blackwork.
	*<b>post:<b></br>
	*<b>post:<b></br>
	*@param a integer variable, integer variablenamed sizeb, a string list of string name_materials.
	*@return a array of String. List of work blackwork.
	*/
	public static String[] typeUtilizationB(int utilization [],int sizeb,String name_materials[]){
		String [] blackworkk = new String[sizeb];
		for (int i=0; i<utilization.length;i++){
			if(utilization[i]==1){
				blackworkk [i]= name_materials[i];
			
			}
		}
		return blackworkk;
	}
	/**
	*fill the arrangement of the whitework.
	*<b>post:<b></br>
	*<b>post:<b></br>
	*@param a integer variable, integer variablenamed sizew, a string list of string name_materials.
	*@return a array of String. List of work whitework.
	*/
	public static String[] typeUtilizationw(int utilization [],int sizew,String name_materials[]){
		String [] whiteworkk = new String[sizew];
		for (int i=0; i<utilization.length;i++){
			if(utilization[i]==2){
				whiteworkk [i] = name_materials[i];
			}
		}
		return whiteworkk;
	}
	/**
	*fill the arrangement of the work painting.
	*<b>post:<b></br>
	*<b>post:<b></br>
	*@param a integer variable, integer variablenamed sizep, a string list of string name_materials.
	*@return a array of String. list of work painting
	*/
	public static String[] typeUtilizationp(int utilization [],int sizep,String name_materials[]){
		String [] paintingg = new String[sizep];
		
		for (int i=0; i<name_materials.length;i++){
			if(utilization[i]==3){
				paintingg [i] = name_materials[i];
			}
		}
		return paintingg;
	}
	/**
	*It asks the user which work they want to see.
	*<b>pre:the user must enter a whole number.</br>
	*<b>post:<b></br>
	*@param 
	*@return a variable integer, her name is whole.
	*/
	public static int typeUtilizationMaterials(){
		Scanner sc = new Scanner(System.in);
		
		int to =0;
		System.out.println("\nwhich use do you want to display");
		System.out.println("1. blackwork");
		System.out.println("2. whiteWork"); 
		System.out.println("3. painting");
		to = sc.nextInt();
		
		return to;
	}
	/**
	*reads an integer variable, shows the user a list of String by console, depending on the value of the integer variable.
	*pre:the arrays must have the lists that the user types.
	*<b>post:<b></br> 
	*@param a string list of string name_materials, integer variable, a list of string of String called blackwork, a list of string of String called whitework, a list of string of String called painting.
	*/
	
	public static void typeUtilizationMat(String[] name_materials,int type,String[] blackwork,String[] whitework,String[] painting){
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<name_materials.length;i++){
			if(type==1){
				System.out.println("-"+(blackwork[i]));
			}
			if(type==2){	
				System.out.println("-"+(whitework[i]));	
			}
			if(type==3){
				System.out.println("-"+(painting[i]));
				
			}
		}
	}
	
}