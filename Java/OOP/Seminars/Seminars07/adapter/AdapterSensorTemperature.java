package Java.OOP.Seminars.Seminars07.adapter;

import java.time.LocalDateTime;

public class AdapterSensorTemperature implements MeteoSensor {

    SensorTemperature sensor;

    public AdapterSensorTemperature(SensorTemperature sensor) {
        this.sensor = sensor;
    }

    @Override
    public int getId() {
        return sensor.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensor.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(sensor.year(),1,1,0,0);
        dateTime = dateTime.plusDays(sensor.day() - 1);
        dateTime = dateTime.plusSeconds(sensor.second());
        return dateTime;
    }
}
