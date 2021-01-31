package aplication;

/**
 *
 * @author cherecho
 */
public class Main34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Array
        
        int array[] = {12,1,8,9,34,56,4,3,2,10};
        double media = 0.0;
        
        //Promedio
        
        for (int i=0; i < array.length; i++) {
            media = media + array[i];
        }
        
        media = media / array.length;
        System.out.println(media);
        
        //Maximo y minimo
        
        int i, max, min;
 
		min=max=array[0];
 
		for(i = 0; i < array.length; i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
			if(max<array[i])
			{
				max=array[i];
			}
		}
        
        //Resultado
        
        System.out.println("El máximo es " + max + " y el minimo es " + min);
        
    }
    
    
}
