package org.example.ubersocketserver.dto;

import lombok.*;
import org.example.ubersocketserver.models.ExactLocation;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideRequestDto {

    private Long passengerId;

//    private ExactLocation startLocation;

//    private ExactLocation endLocation;

    private List<Long> driverIds;

    private Long bookingId;
}