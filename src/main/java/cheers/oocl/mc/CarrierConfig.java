package cheers.oocl.mc;

/**
 * @Author DASON
 * @Date 2017/12/20 21:02
 */
public enum CarrierConfig{
    CTL_SHA,CTL_SHZ;

    public String value() {
        int carrierId = 1;
        String value;
       if (1 == carrierId) {
           value =  OOCLConfig.getValue(this.toString());
       } else {
           value = null;
       }
       return value;
    }

    public static void  main(String[] args) {
        System.out.println(OOCLConfig.valueOf("CTL_SHA"));
        System.out.println(OOCLConfig.valueOf(OOCLConfig.class, "CTL_SHA"));
        System.out.println(CarrierConfig.CTL_SHZ);
        System.out.println(CarrierConfig.CTL_SHA.value());
    }
}
