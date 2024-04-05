
import java.util.ArrayList;
import java.util.List;
//por aqui se encontraba


abstract class Payment {
    abstract void calculateTotalAmount();
}


class Cash extends Payment {
    @Override
    void calculateTotalAmount() {
        System.out.println("Estoy pagando con efectivo");
    }
}



////



class Check extends Payment {
    @Override
    void calculateTotalAmount() {
        System.out.println("Estoy pagando con cheque");
    }
}
class CreditCard extends Payment {
    @Override
    void calculateTotalAmount() {
        System.out.println("Estoy pagando con tarjeta de crédito");
    }
}