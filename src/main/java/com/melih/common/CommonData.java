package main.java.com.melih.common;

import lombok.Getter;
import lombok.Setter;

public class CommonData {
    private static CommonData instance;

    @Getter
    @Setter
    private CommonData() {

    }
}

