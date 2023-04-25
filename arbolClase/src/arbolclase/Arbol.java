package arbolclase;

/**
 *
 * @author Ryan Morales. 
 */
public class Arbol {
    private Nodo raiz; 
    public void inserta(int x){
        if(raiz==null){//Si no hay elementos en el árbol, se crea la raíz. 
            raiz = new Nodo(x);
            
        
        
            
        }else{
            
            insertaR(raiz, x);//Hago un llamado al método insertaR que será
                              //recursivo  
            
        }
        
    
    }
    
    private void insertaR(Nodo n, int x){
        if(x<=n.getId()){//el valor a insertar x debe ir a la izquierda.
           if(n.getHijoIzq()==null){//pregunto si el hijo izq tiene algo. 
               n.setHijoIzq(new Nodo(x));//si no existe lo creo. 
               
           
           }else{//si el valor a insertar x debe ir a la derecha. 
               if(n.getHijoDer()==null){//Pregunto si el hijo der tiene algo. 
                   n.setHijoDer(new Nodo(x));//si no existe lo creo. 
                   
               
               }else{
                   insertaR(n.getHijoDer(),x);//Si existe bajo recursivamente
                                               //a el. 
               
               }
               
               
           
           }
        
        }
    
    }
    
}
