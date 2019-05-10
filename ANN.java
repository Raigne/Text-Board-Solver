import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ANN {
	
	public static String[][] readFile(String numbers[][]) throws IOException{
		File file = new File("C:/Users/Derrick Gaban/Documents/CSVRead/InputNaTalaga.csv"); 
		BufferedReader bufRdr  = new BufferedReader(new FileReader(file));
		String line = null;
		int row = 0;                                                                 
		int col = 0;
		bufRdr.ready();
		while((line = bufRdr.readLine())!= null){		
			try{
				
				StringTokenizer st = new StringTokenizer(line,";");	
				col=0;
				while (st.hasMoreTokens()){
					numbers[row][col] = st.nextToken().replace("﻿", "");
					col++;
				}
				row++;
			}catch(NullPointerException e){
				e.printStackTrace();
			}	
		}
		bufRdr.close();
		return numbers;
	}

	public static double[][] dblInputInter(double dblNumber[][]){
		int intCtr=0,intCtr2=0; 
		for(intCtr=0;intCtr<300;intCtr++){
			for(intCtr2=0;intCtr2<9;intCtr2++){
				//if wrong put abs
				dblNumber[intCtr][intCtr2]=Math.abs(2*((dblNumber[intCtr][intCtr2]-1)/(5-1))-1);
				//System.out.println(dblNumber[intCtr][intCtr2]);
			}
		}	
		return dblNumber;
	}
	
	public static double[] dblInputSoma(double dblNumber[][]){
		int intCtr, intCtr2, intCtr3;
		double dblSoma[] = new double[10];
		double[][] dblWeight = 
		{{0.2791, 0.6934, -1.6029, -0.7566, 1.36, -0.3357, 0.2437, 0.1567, 1.7829}
		,{0.7804, -1.2699, -0.5276, 0.6579, 1.0066, 1.0278, 0.2153, -1.3642, -0.4633}
		,{1.0633,	-0.6931,	1.6869,	0.355,	-0.5978,	-0.685,	0.0124,	2.051,	-0.5422} 
		,{-1.1464,	0.0957,	-1.3749,	-1.7079,	1.2253,	0.8181,	-0.4239,	1.1092,	-1.7687}
		,{-0.5252,	0.201,	-0.4996,	0.0759,	0.4789,	1.5278,	0.3838,	-2.2536,	-0.4301}
		,{0.3546	,1.6536	,0.3654	,-0.3907	,0.75	,0.3278	,0.3521	,1.3839	,1.1992}
		,{0.7001,	1.816,	0.879,	-2.4486,	-0.3908,	-1.7072,	0.3223,	1.8346,	1.301}
		,{0.4567,	1.533,	-1.543,	0.582,	0.8769,	0.9437,	0.0342,	-2.6473,	-0.8701}
		,{0.82313,	0.754,	1.234,	0.0893,	-0.5963,	0.5972,	0.2234,	-2.3566,	-0.6406}
		,{0.6763,	0.3064,	0.5678,	-2.296,	1.4321,	0.8321,	0.7329,	0.3563,	-0.9531}};
		
		double [] dblBias = {0.6763,0.3064,0.5678,-2.296,1.4321,0.8321,0.7329,0.3563,-0.9531}; 
		
		for(intCtr=0;intCtr<10;intCtr++){
			for(intCtr3=0;intCtr3<9;intCtr3++){
				for(intCtr2=0;intCtr2<300;intCtr2++){
					dblSoma[intCtr] = Math.abs(Math.tanh(((dblNumber[intCtr2][0]*dblWeight[intCtr][0])+(dblNumber[intCtr2][1]*dblWeight[intCtr][1])+(dblNumber[intCtr2][2]*dblWeight[intCtr][2])+(dblNumber[intCtr2][3]*dblWeight[intCtr][3])+(dblNumber[intCtr2][4]*dblWeight[intCtr][4])+(dblNumber[intCtr2][5]*dblWeight[intCtr][5])+(dblNumber[intCtr2][6]*dblWeight[intCtr][6])+(dblNumber[intCtr2][7]*dblWeight[intCtr][7])+(dblNumber[intCtr2][8]*dblWeight[intCtr][8]))+dblBias[intCtr3]));
				}
			}
		}
		return dblSoma;
	}
	
	public static double [] dblOutSoma(double [] dblSoma){
		int intCtr=0;
		double dblOut [] = new double [10];
		double dblWeight[][] = {{0.3302,	1.7392,	-2.5437,	1.8934,	-1.7873,	0.2107,	0.4359,	2.8439,	-2.6763}
		,{-0.8733,	-1.3075,	0.2425,	0.8372,	-0.0103,	-0.5864,	0.3156,	-0.7507,	-0.7572}
		,{0.9024,	-1.7732,	-0.2785,	-0.4739,	1.1094,	0.8285,	-1.1691,	0.139,	2.6028}
		,{2.0235,	-2.1527,	0.9138,	-0.2736,	1.3558,	-0.401,	-1.0519,	-1.7989,	0.7352}
		,{0.3446,	-0.9434,	1.2573,	-2.042,	0.3334,	0.4256,	-0.3066,	-2.2854,	-0.4904}
		,{2.3164,	0.115,	-0.8112,	1.7412,	-0.1844,	2.8109,	-2.0002,	1.6839	,0.4791}
		,{-1.3248	,1.7714,	-0.1366,	0.3769,	-2.9829,	0.5748,	1.0121,	2.0585,	-1.4754}
		,{-1.6594,	-1.9235,	2.089,	-1.6919,	1.1664,	-2.0105,	-0.4216,	-1.7984,	-0.2013}
		,{-0.1736,	-0.3279,	1.1847,	-0.2187,	-0.5104,	1.0482,	-0.5872,	0.2406,	-1.0571}
		,{-0.2204,	1.1891,	0.9629,	-1.2909,	-0.441,	1.7465,	2.0436,	0.6757,	1.4487}};
		double dblBias[] = {-0.4165, -0.6269, 0.3945, 0.1956, -0.3635, -0.4587, -1.0922, 0.5288, -0.9344};
		
		for(intCtr = 0; intCtr < 9; intCtr++){
			dblOut[intCtr] = Math.abs(Math.tanh((dblSoma[intCtr]*dblWeight[intCtr][0])+(dblSoma[intCtr]*dblWeight[intCtr][1]+(dblSoma[intCtr]*dblWeight[intCtr][2])+(dblSoma[intCtr]*dblWeight[intCtr][3])+(dblSoma[intCtr]*dblWeight[intCtr][4])+(dblSoma[intCtr]*dblWeight[intCtr][5])+(dblSoma[intCtr]*dblWeight[intCtr][6])+(dblSoma[intCtr]*dblWeight[intCtr][7])+(dblSoma[intCtr]*dblWeight[intCtr][8])+dblBias[intCtr])));
		}
		return dblOut;
	}

	public static double[] dblOutInter(double [] dblOSoma){
		int intCtr2=0;
		double dblInter [] = new double[9];
		for(intCtr2=0;intCtr2 <9; intCtr2++){
			dblInter[intCtr2]= Math.abs(((26-6)/2)*(1 - Math.tanh(dblOSoma[intCtr2])));
			System.out.println("Output: "+" " +dblInter[intCtr2]);
		}
		
		return dblOSoma;
	}
	
	public static void main(String args[]) throws IOException{
		int intCtr=0,intCtr2=0;
		double dblOutInter [] = new double[8];
		double dblOut [] = new double[10];
		String strNumber[][] = new String[300][9];
		readFile(strNumber);
		//readOutPut(strOutput);
		double[][] dblNumber = new double[300][9];
		double dblSoma[] = new double[10];
		double dblOSoma[] = new double[10];
		for(intCtr=0;intCtr<300;intCtr++){
			for(intCtr2=0;intCtr2<9;intCtr2++){
				dblNumber[intCtr][intCtr2]=Double.parseDouble((strNumber[intCtr][intCtr2]));
			}
		}
		dblInputInter(dblNumber);
		for(intCtr=0;intCtr<300;intCtr++){
			for(intCtr2=0;intCtr2<9;intCtr2++){
				System.out.println(dblNumber[intCtr][intCtr2]);
			}
		}
		
		dblSoma = dblInputSoma(dblNumber);
		int ctr=0, ctr2 = 0;
		for(double  d : dblSoma){
			dblOSoma[ctr]= d;
			ctr++;
		}
		
		dblOutInter = dblOutSoma(dblOSoma);
		for(double e : dblOutInter){
			dblOut[ctr2] = e;
			ctr2++;
		}
		dblOutInter(dblOut);
		/*int intCounter =0;
		
		for(double a : dblOutInter){
			dblOut[intCounter] = a;
			intCounter++;
			System.out.println(dblOut[intCounter]);
		}*/
		/*for (int a=0;a<9;a++)
			System.out.println(dblOut[a]);*/
	}
}