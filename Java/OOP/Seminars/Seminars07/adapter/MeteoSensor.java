package Java.OOP.Seminars.Seminars07.adapter;

import java.time.LocalDateTime;

public interface MeteoSensor {

    int getId(); // идентификатор датчика

    Float getTemperature(); // температура датчика

    Float getHumidity(); // влажность

    Float getPressure(); // давление

    LocalDateTime getDateTime(); // время чтения данных датчика
}
