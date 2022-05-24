/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi_123200029;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MovieView view = new MovieView();
        ModelMovie model = new ModelMovie();
        ControllerMovie controller = new ControllerMovie(model, view);
    }
    
}
