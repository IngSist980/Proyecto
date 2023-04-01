package towerDefense;

/**
 *
 * @author Ryan Morales
 */
public class Caballero extends Tropa{
   
    super(15, 2);
    }

    @Override
    public boolean venceA(Tropa tropa) {
        return tropa instanceof Arquero;
    }
    
    
}
