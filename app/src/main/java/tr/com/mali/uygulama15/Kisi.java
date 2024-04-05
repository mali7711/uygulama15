package tr.com.mali.uygulama15;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Kisi implements Parcelable {
    protected Kisi(Parcel in) {
        AdSoyad = in.readString();

        sifre = in.readString();
    }

    public static final Creator<Kisi> CREATOR = new Creator<Kisi>() {
        @Override
        public Kisi createFromParcel(Parcel in) {
            return new Kisi(in);
        }

        @Override
        public Kisi[] newArray(int size) {
            return new Kisi[size];
        }
    };

    public String getAdSoyad() {
        return AdSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        AdSoyad = adSoyad;
    }



    public String getsifre() {
        return sifre;
    }

    public void setsifre(String phone) {
        sifre = sifre;
    }

    private String AdSoyad;

    private String sifre;

    public Kisi(String adSoyad, String sifre) {
        AdSoyad = adSoyad;
        this.sifre = sifre;

        ;

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(AdSoyad);

        dest.writeString(sifre);
    }
}
