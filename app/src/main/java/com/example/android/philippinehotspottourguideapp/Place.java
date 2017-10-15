/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.philippinehotspottourguideapp;

/**
 * {@link Place} represents a place that the user wants to see.
 * It contains resource IDs for the name of the place, address, contact number, and
 * optional image file.
 */
public class Place {


    /** String resource ID for the name of the place */
    private int mNameOfPlaceId;

    /** String resource ID for the adress of the */
    private int mAddressId;

    /** String resource ID for the ContactNumber or what the place is known for*/
    private int mContactNumberId;

    /** Image resource ID for the place */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this place */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object.
     *
     * @param nameOfPlaceId is the string resource ID for the place
     * @param addressId is the string resource Id for the address of the place
     * @param contactNumberId is the resource ID for the contact Number or for what the place
     *                        is known for or date of Fiesta
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Place(int nameOfPlaceId, int addressId, int contactNumberId, int imageResourceId) {
        mNameOfPlaceId = nameOfPlaceId;
        mAddressId = addressId;
        mContactNumberId = contactNumberId;
        mImageResourceId = imageResourceId;
    }

    public Place(int nameOfPlaceId, int addressId, int contactNumberId) {
        mNameOfPlaceId = nameOfPlaceId;
        mAddressId = addressId;
        mContactNumberId = contactNumberId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the name of place, address and contact number/known for resource ID of the word.
     */
    public int getNameOfPlaceId() {
        return mNameOfPlaceId;
    }
    public int getAddressId() { return mAddressId;}
    public int getContactNumberId() {  return mContactNumberId;}
}