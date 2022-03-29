public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Cafe Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.5;
        double precioCafeFiltro = 2.1;
        double precioCafeLeche = 4.0;
        double precioCapu = 5.3;
    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = true;
        boolean estaListoOrden4 = true;
    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1);
        System.out.println(cliente1 + mensajeListo);
        System.out.println(mensajeMostrarTotal + precioCafeFiltro);

         // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
        if(estaListoOrden4) {
            System.out.println(saludoGeneral + cliente4);
            System.out.println(cliente4 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCapu);
        }
        else {
            System.out.println(saludoGeneral + cliente4);
            System.out.println(cliente4 + mensajePendiente);
        
        }

        if(estaListoOrden2) {
            System.out.println(saludoGeneral + cliente2);
            System.out.println(cliente2 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCafeLeche*2 );
        }
        else {
            System.out.println(saludoGeneral + cliente2);
            System.out.println(cliente2 + mensajePendiente);
        
        }

        if(estaListoOrden3) {
            System.out.println(saludoGeneral + cliente3);
            System.out.println(cliente3 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCafeFiltro );
        }
        else {
            System.out.println(saludoGeneral + cliente3);
            System.out.println(cliente3 + mensajePendiente);
        
        }

        
        
    }
}
