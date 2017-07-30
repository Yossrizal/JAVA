
public class Segitiga extends BangunRuang{
	
	float xy;
	//override
	public float Luas(int x, int y) {
    	return ((float)0.5*(x*y));
    }
    //override
    public float Keliling(int x, int y){
    	xy = x + y;
    	return xy;
    }
    
    public float Keliling(float xy, int z){
    	return (xy+z);
    }
    
    
    
    
}