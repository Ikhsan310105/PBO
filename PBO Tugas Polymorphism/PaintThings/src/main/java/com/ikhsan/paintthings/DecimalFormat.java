package com.ikhsan.paintthings;

public class DecimalFormat {
    private String fmt;
    
    public DecimalFormat(String fmt) {
        this.fmt = fmt;
    }
    public String format(double number) {
        if ("0.#".equals(fmt)){
            return String.format("%.1f", number);
        }
        return "Wrong";
    }
}
