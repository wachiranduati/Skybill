package android.example.skybill;

public class MyBills {
    private String mBillCompanyLogo;
    private String mBillCompanyName;
    private String mPrice;
    private String mCode;

    public MyBills(String mBillCompanyLogo, String mBillCompanyName, String mPrice, String mCode) {
        this.mBillCompanyLogo = mBillCompanyLogo;
        this.mBillCompanyName = mBillCompanyName;
        this.mPrice = mPrice;
        this.mCode = mCode;
    }

    public String getmBillCompanyLogo() {
        return mBillCompanyLogo;
    }

    public String getmBillCompanyName() {
        return mBillCompanyName;
    }

    public String getmPrice() {
        return mPrice;
    }

    public String getmCode() {
        return mCode;
    }
}
