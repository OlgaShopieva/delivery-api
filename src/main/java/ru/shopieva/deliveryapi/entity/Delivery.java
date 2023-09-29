package ru.shopieva.deliveryapi.entity;


import lombok.Data;

@Data
public class Delivery {

    private long id;
    private TimeSlot timeSlot;

}
