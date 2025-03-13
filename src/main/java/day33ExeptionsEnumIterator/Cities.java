package day33ExeptionsEnumIterator;

public enum Cities {// Standalone tek başına ayakta durabilen uygulama
    ADANA(01,"Adana","0100"),
    ADIYAMAN(02,"Adıyaman","0200");

    private final int plateCode;

    private final String cityName;

    private final String postCode;


    Cities(int plateCode, String cityName, String postCode) {
        this.plateCode = plateCode;
        this.cityName = cityName;
        this.postCode = postCode;
    }

    public int getPlateCode() {
        return plateCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPostCode() {
        return postCode;
    }
}
