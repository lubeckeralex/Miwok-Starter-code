package com.example.android.miwok;

public class Word {

    //Default translations
    private String mDefaultTranslation;

    //Miwok translation for the Word
    private String mMiwokTranslation;

    /**
     * Constructor
     * @param defaultTranslation is the word for default lang.
     * @param miwokTranslation Miwok's translation.
     */
    Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     *
     * @return JUST STRING!
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


}
