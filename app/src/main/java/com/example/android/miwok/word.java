package com.example.android.miwok;

public class word {
    private String defaultTranslation;
    private String frenchTranslation;
    private int imageId=NO_IMAGE;
    private static final int NO_IMAGE=-1;
    //CONSTRUCTOR
    public word(String deftranslation,String mitranslation)
    {
        defaultTranslation=deftranslation;
        frenchTranslation=mitranslation;
    }
    public word(String deftranslation,String mitranslation, int imageresourceId)
    {
        defaultTranslation=deftranslation;
        frenchTranslation=mitranslation;
        imageId=imageresourceId;
    }
    //fucvtion to return default translation
    public String getDefaultTranslation()
    {
        return defaultTranslation;
    }
    //fucvtion to return miwok translation

    public String getFrenchTranslation()
    {
        return frenchTranslation;
    }
    public int getImgageId(){
        return imageId;
    }
    //Because phrase doesnt have any image
    public boolean checkImage(){
        return imageId!=NO_IMAGE;
    }
}
