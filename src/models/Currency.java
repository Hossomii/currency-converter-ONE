package models;

public class Currency {
    // Final para que os valores não mudem depois de criados.
    private final String code; // USD, EUR, BRL
    private final String name; // Nome da Moeda
    private final double rateToBrl;

    public Currency(String code, String name, double rateToBrl) {
        this.code = code;
        this.name = name;
        this.rateToBrl = rateToBrl;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getRateToBrl() {
        return rateToBrl;
    }
}
