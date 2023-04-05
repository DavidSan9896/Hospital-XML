package presenter;

import view.View;

public class Presenter {
    private View view;

    public Presenter() {
        view = new View();
    }

    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.run();
    }

    private void run() {
        try {
            int option = 0;
            do {
                switch (option){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        View.print("Hasta Luego");
                        break;
                    default:
                }
            }while ((option = view.menu())!= 5 );
        }catch (NumberFormatException e){
            View.print("Solo se permiten Valores Numericos");
        }
    }
}
