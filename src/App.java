public class App {
    public static void main(String[] args) throws Exception {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaDeLaPerfil = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022) {
            System.out.println(" Películas más populares");
    }else {
        System.out.println(" Película Retro que vale la pena ver");
    }

    if (incluidoEnPlan && tipoPlan.equals("plus")) {
        System.out.println(" Disfrute de su películas");
    }else {
        System.out.println(" Película no disponible en este plan");
    }
    }
}
