package vn.com.example.demorecycleview.model;

public class Hero {
    private String mNameHero;
    private int mAvavatar;

    public Hero(String mNameHero, int mAvavatar) {
        this.mNameHero = mNameHero;
        this.mAvavatar = mAvavatar;
    }

    public String getmNameHero() {
        return mNameHero;
    }

    public void setmNameHero(String mNameHero) {
        this.mNameHero = mNameHero;
    }

    public int getmAvavatar() {
        return mAvavatar;
    }

    public void setmAvavatar(int mAvavatar) {
        this.mAvavatar = mAvavatar;
    }
}
