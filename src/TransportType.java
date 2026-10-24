public enum TransportType {
    MOTORCYCLE("Delivery asigned to motorcycle"),
    BICYCLE("Delivery asigned to bicycle"),
    CAR("Delivery asigned to car");

    private final String message;

    TransportType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}