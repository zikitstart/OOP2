package transport;

import java.time.LocalDate;

public class Car {
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public Key() {
            this(false,false);
        }
        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean getKeylessAccess() {
            return keylessAccess;
        }
    }
    public static class Insurance {
        private final LocalDate insuranceValidityPeriod;
        private final double theCostOfInsurance;
        private final String insuranceNumber;

        public Insurance(LocalDate insuranceValidityPeriod, double theCostOfInsurance, String insuranceNumber) {
            if (insuranceValidityPeriod == null) {
                this.insuranceValidityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }
            if (theCostOfInsurance <= 0.0) {
                this.theCostOfInsurance = 0.0;
            } else {
                this.theCostOfInsurance = theCostOfInsurance;
            }
            if (insuranceNumber == null) {
                this.insuranceNumber = "default";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }
        public Insurance() {
            this(null,3_000D,null);
        }
        public LocalDate getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }
        public double getTheCostOfInsurance() {
            return theCostOfInsurance;
        }
        public String getInsuranceNumber() {
            return insuranceNumber;
        }
        public void checkInsuranceValidityPeriod() {
            if (insuranceValidityPeriod.isBefore(LocalDate.now()) || insuranceValidityPeriod.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку.!");
            }
        }
        public void checkInsuranceNumber() {
            if (insuranceNumber.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String rubberType;
    private Key key;
    private Insurance insurance;
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               String rubberType ,
               Key key,
               Insurance insurance) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.equals("")) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (transmission == null || transmission.equals("")) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.equals("")) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.equals("")) {
            this.registrationNumber = "(х000хх000)";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 1;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (rubberType == null || rubberType.equals("")) {
            this.rubberType = "default";
        } else {
            this.rubberType = rubberType;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.insurance = insurance;
    }

    public Object changeRubber() {
        if (rubberType.equals("летняя")) {
            rubberType = "зимняя";
        } else {
            rubberType = "летняя";
        }
        return rubberType;
    }
    public boolean correctRegistrationNumber() {
        if (registrationNumber.length() != 9){
            return false;
        }
        char [] chars = registrationNumber.toCharArray();
        if(!Character.isAlphabetic(chars[0])||!Character.isAlphabetic(chars[4])||!Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1])||!Character.isDigit(chars[2])||!Character.isDigit(chars[3])||!Character.isDigit(chars[6])||!Character.isDigit(chars[7])||!Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public String getRubberType() {
        return rubberType;
    }
    public Key getKey() {
        return key;
    }
    public Insurance getInsurance() {
        return insurance;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public void setRubberType(String rubberType) {
        this.rubberType = rubberType;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}
