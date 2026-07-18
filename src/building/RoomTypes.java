package building;

public enum RoomTypes {
    LIVING_ROOM("Living Room"),
    BED_ROOM("Bed Room"),
    BATH_ROOM("Bath Room"),
    PATIO("Patio");

    private String explanation;
    RoomTypes(String explanation) {
        this.explanation= explanation;
    }
    public String getExplanation() {
        return explanation;
    }
}
