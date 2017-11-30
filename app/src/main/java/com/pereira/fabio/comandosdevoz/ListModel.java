package com.pereira.fabio.comandosdevoz;

/**
 * Created by fabiopereira on 11/28/17.
 */

public class ListModel {

    private int descriptionImageId;

    private String message;

    private int arrowImageId;
    public ListModel(int descriptionImageId, String message, int arrowImageId){
        this.descriptionImageId = descriptionImageId;
        this.message = message;
        this.arrowImageId = arrowImageId;
    }

    public void setDescriptionImageId(int descriptionImageId) {
        this.descriptionImageId = descriptionImageId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setArrowImageId(int arrowImageId) {
        this.arrowImageId = arrowImageId;
    }

    public int getDescriptionImageId() {
        return descriptionImageId;
    }

    public String getMessage() {
        return message;
    }

    public int getArrowImageId() {
        return arrowImageId;
    }
}
