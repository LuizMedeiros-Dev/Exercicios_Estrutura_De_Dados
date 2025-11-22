package ed_blinear;


class Busca{
	public static boolean linear (int x, int dados []){
                int n = dados.length;
		for (int i = 0; i < n; i++)
			if (x == dados[i])                             
				return true;                 
                return false;                        
	}
     
}
