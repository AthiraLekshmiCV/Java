package nipals_pca;


 /*
 * @author Athira Lekshmi
 */
public class NIPALS_PCA {

    static double[][] center(double[][] input) {

                double[] centered= new double[input[0].length];
		double[][] out = new double[input.length][input[0].length];
                centered=mean(input);
		for(int i = 0; i < input[0].length; i++)
			for(int j = 0; j < input.length; j++) {
				out[j][i]=centered[i]-input[j][i];
                               
                                
			}  
		return out;
    }
    
    static double[]  mean(double[][] data){
        
        double average[] = new double[data[0].length];
        for(int i=0;i<data[0].length;i++){
            double total = 0;
            for(int j=0;j<data.length;j++){
                  total = total + data[j][i];
            }
            average[i] = total / data.length;
            
        }
        return average;
        
    }
    
    static double[][] transpose(double[][] mat){
       
        double[][] transpose=new double[mat[0].length][mat.length];
        for ( int c = 0 ; c < mat.length ; c++ ){
             for ( int d = 0 ; d < mat[0].length ; d++ ){               
                transpose[d][c] = mat[c][d];
         }
      }
      return transpose;
    }
    
      static double dot(double[] t1){
        double r=0;
       for(int i=0;i<t1.length;i++){
            r+=(t1[i]*t1[i]);
        
        }
        return r;
    }
      
    static double[] multiplication(double[][] mat1,double[] mat2){
      
        int n=mat1.length,m=mat1[0].length;
        double[] multi=new double[mat1.length];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                multi[i]+=(mat1[i][j]*mat2[j]);
            }   
        }    
        return multi;
    }
  
    static double[][] subtract(double[][] mat,double[][] pca){
    
        double[][] res=new double[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                res[i][j]=mat[i][j]-pca[i][j];
                
            }    
        }
        return res;
    
    }
    
    static double norm(double[] data){
     
        double res=0.0;
        for(int i=0;i<data.length;i++){
                res+=(data[i]*data[i]);
        
        }
        res=res/Math.sqrt(res);
        return res;
        
    }
    
     static void nipals(double[][] mat){
        
        int numofpc=5;
        double[][] transpose=new double[mat[0].length][mat.length];
        double[] p=new double[mat[0].length];
        double[] t=new double[mat.length];
        double[] t_old=new double[mat.length];
        double[] temp=new double[mat.length];
        double[][] E=new double[mat.length][mat[0].length];
        double val=0,threshold=0.00000001,d=0;
	int count=0;
       
        for(int i=0;i<numofpc;i++){
            // Column vector t
            for(int j = 0; j < t.length; j++) {
		t[j] = mat[j][i]; 
                
            }
         
            do{
                // to find loading p
                /*
                1. Multiply transpose of data matrix with column vector
                2. Divide by the dot product col_vect.col_vect
                */
                double[][]trans=transpose(mat);
                p=multiplication(trans,t);
                val=dot(t);
                for(int k=0;k<p.length;k++){
                    p[k]/=val;
                    //System.out.println(p[k]);
                }
                
                //NORMALIZING THE P VECTOR
                
                d=norm(p);
                for(int k=0;k<p.length;k++){
                        p[k]/=d;
                
                }
               
                t_old=t;
                //FINDING T VECTOR
                /*
                1. Multiply the data matrix with p matrix
                2. Divide by the dot product p
                */
                t=multiplication(mat,p);
                val=dot(p);
                for(int k=0;k<t.length;k++){
                    t[k]/=val;
                    
                }
               
                
                //TO CHECK CONVERGENCE
                for(int k=0;k<t_old.length;k++){
                    temp[k]=t_old[i]-t[i];
                
                }
                d=norm(temp);
          
                
                
            }while(d>threshold);
            
            
            for(int n=0;n<t.length;n++){
                for(int m=0;m<p.length;m++){
                   
                    E[n][m]=(t[n]*p[m]);
                }
            }
            System.out.println("P["+i+"]");
            for(int n=0;n<p.length;n++){
                p[n]*=-1;
                System.out.print(p[n]+" ");
            }
            System.out.println();
            System.out.println("T["+i+"]");
            for(int n=0;n<t.length;n++){
                System.out.print(t[n]+" ");
            }
            System.out.println();
            
            
            
            double[][] result=subtract(mat,E);
            
            mat=result;
            
         
            
      
        
            
            }
            
           
     
        
        }
        
     
    public static void main(String[] args) {
        double[][] data = {{0.537667139546100,-1.34988694015652,0.671497133608081,0.888395631757642,-0.102242446085491},
                          {1.83388501459509,3.03492346633185,-1.20748692268504,-1.14707010696915,-0.241447041607358}, 
			  {-2.25884686100365,0.725404224946106,0.717238651328839,-1.06887045816803,0.319206739165502},
                          {0.862173320368121,-0.0630548731896562,1.63023528916473,-0.809498694424876,0.312858596637428},
                          {0.318765239858981,0.714742903826096,0.488893770311789,-2.94428416199490,-0.864879917324457},
                          {-1.30768829630527,-0.204966058299775,1.03469300991786,1.43838029281510,-0.0300512961962686},
                          {-0.433592022305684,-0.124144348216312,0.726885133383238,0.325190539456198,-0.164879019209038},
                          {0.342624466538650,1.48969760778547,-0.303440924786016,-0.754928319169703,0.627707287528727},
                          {3.57839693972576,1.40903448980048,0.293871467096658,1.37029854009523,1.09326566903948},
                          {2.76943702988488,1.41719241342961,-0.787282803758638,-1.71151641885370,1.10927329761440}
        };
       // double[][] data={{1,2,3},{2,4,8}};
        // HERE WE AREF FINDING TWO PCA COMPONENTS
        int no_of_pca=5;
        double[][] norm_data=center(data);
  
  
        nipals(norm_data);
   
      
		
        
    }
   
}
    
