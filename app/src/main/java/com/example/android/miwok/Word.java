package com.example.android.miwok;

/**
 * Created by sxhs on 2017/8/24.
 */

public class Word {


    private String mDefaultTranslation;

    private String mMiwakTranslation;

    /**
     * 先令图片为-1，如果后面有图片，并且赋予了新值，则有了图片，如果没有，则还是-1
     */
    private int mImageResourceId= NO_IMAGE_PROVIDED;

    private int mVoiceResourceId;
    /** 定义一个常量，用来代表没有图片 */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String DefaultTranslation, String MiwakTranslation,int voiceResourceId) {
        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwakTranslation = MiwakTranslation;
        this.mVoiceResourceId=voiceResourceId;
    }

    /**
     *
     * @param DefaultTranslation   翻译后的
     * @param MiwakTranslation      未翻译的
     * @param ImageResourceId       图片资源id
     */
    public Word(String DefaultTranslation, String MiwakTranslation,int ImageResourceId,int voiceResourceId) {
        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwakTranslation = MiwakTranslation;
        this.mImageResourceId=ImageResourceId;
        this.mVoiceResourceId=voiceResourceId;
    }

    public String getmDefaultTranslation() {

        return mDefaultTranslation;
    }

    public int getmVoiceResourceId() {
        return mVoiceResourceId;
    }

    public String getmMiwakTranslation() {

        return mMiwakTranslation;
    }

    public int getmMinwakImage() {
        return mImageResourceId;
    }
    /**
          *如果有图片，返回ttrue，如果没有返回false
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwakTranslation='" + mMiwakTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mVoiceResourceId=" + mVoiceResourceId +
                '}';
    }
}
