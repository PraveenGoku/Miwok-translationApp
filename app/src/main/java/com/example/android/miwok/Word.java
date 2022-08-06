package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word(String DefaultTranslation,String MiwokTranslation, int AudioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceId = AudioResourceId;
    }
    public Word(String DefaultTranslation,String MiwokTranslation, int ImageResourceId, int AudioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = AudioResourceId;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {return mImageResourceId; }

    public int getAudioResourceId() {return mAudioResourceId;}
}
