package enumeraciones;

public enum MarcaAuto {
    TOYOTA("CAMRY", "COROLLA", "RAV4", "TACOMA"),
    HONDA("ACCORD", "CIVIC", "CR-V", "PILOT"),
    FORD("FIESTA", "FOCUS", "MUSTANG", "F-150"),
    CHEVROLET("CAMARO", "CORVETTE", "MALIBU", "SILVERADO"),
    NISSAN("ALTIMA", "FRONTIER", "MAXIMA", "ROGUE"),
    BMW("X1", "X3", "X5", "X7"),
    MERCEDES_BENZ("C-CLASS", "E-CLASS", "GLA", "GLE"),
    AUDI("A3", "A4", "Q5", "Q7"),
    VOLKSWAGEN("JETTA", "GOLF", "PASSAT", "TIGUAN"),
    HYUNDAI("ELANTRA", "SONATA", "TUCSON", "SANTA FE"),
    KIA("FORTE", "OPTIMA", "SPORTAGE", "SOUL"),
    LEXUS("ES", "IS", "NX", "RX"),
    MAZDA("3", "6", "CX-5", "MX-5"),
    SUBARU("IMPREZA", "FORESTER", "OUTBACK", "CROSSTREK"),
    GMC("SIERRA", "YUKON", "ACADIA", "TERRAIN"),
    RAM("1500", "2500", "3500", "5500"),
    JEEP("WRANGLER", "GRAND CHEROKEE", "GLADIATOR", "COMPASS"),
    DODGE("CHALLENGER", "CHARGER", "JOURNEY", "DURANGO"),
    LAND_ROVER("DISCOVERY", "RANGE ROVER", "DEFENDER", "EVOQUE"),
    PORSCHE("911", "CAYENNE", "MACAN", "PANAMERA");

    private String[] modelos;

    MarcaAuto(String... modelos) {
        this.modelos = modelos;
    }

    public String[] getModelos() {
        return modelos;
    }
}
