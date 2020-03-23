package com.kaleyra.patterns.builder;

import com.kaleyra.patterns.builder.Type;
import com.kaleyra.patterns.builder.Engine;
import com.kaleyra.patterns.builder.GPSNavigator;
import com.kaleyra.patterns.builder.Transmission;
import com.kaleyra.patterns.builder.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
