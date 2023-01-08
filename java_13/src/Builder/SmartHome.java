//package Builder;
//
//public class SmartHome {
//    private final String name;
//    private final int serialNumber;
//    private final String addressName;
//    private final String addressNumber;
//    private final String city;
//    private final String country;
//    private final int light1PortNum;
//    private final int light2PortNum;
//    private final int door1PortNum;
//    private final int door2PortNum;
//    private final int microwavePortNum;
//    private final int tvPortNum;
//    private final int waterHeaterPortNum;
//    private SmartHome() {};
//    public static class SmartHomeBuilder {
//        private String name;
//        private int serialNumber;
//        private String addressName;
//        private String addressNumber;
//        private String city;
//        private String country;
//        private String postalCode;
//        private int light1PortNum;
//        private int light2PortNum;
//        private int door1PortNum;
//        private int door2PortNum;
//        private int microwavePortNum;
//        private int tvPortNum;
//        private int waterHeaterPortNum;
//    }
//
//    public SmartHomeBuilder withName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public SmartHomeBuilder withSerialNumber(int serialNumber) {
//        this.serialNumber = serialNumber;
//        return this;
//    }
//}
