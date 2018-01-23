package com.company;

public class TemperatureConverter {
    public String start;
    public String result;
    TemperatureConverter(String start, String result){
        this.start = start;
        this.result = result;}

        public double converter(double temp){
            if (start.equals("F") && result.equals("C")){return convertFtoC(temp);}
            else if (start.equals("F") && result.equals("K")){return convertFtoK(temp);}
            else if (start.equals("C") && result.equals("F")){return convertCtoF(temp);}
            else if (start.equals("C") && result.equals("K")){return convertCtoK(temp);}
            else if (start.equals("K") && result.equals("F")){return convertKtoF(temp);}
            else if (start.equals("K") && result.equals("C")){return convertKtoC(temp);}
            return temp;
        }

    private double convertFtoC(double F){
        return (F - 32) * 5 / 9;
    }

    private double convertFtoK(double F){
        return (F - 32) * 5 / 9 + 273.15;
    }
    private double convertCtoF(double C){
        return (C * 9 / 5) + 32;
    }

    private double convertCtoK(double C){
        return (C + 273.15);
    }

    private double convertKtoC(double K){
        return (K - 273.15);
    }

    private double convertKtoF(double K){
        return (K - 273.15) * 9 / 5 + 32;
    }
}
