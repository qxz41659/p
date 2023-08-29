package p.p;

import java.io.Serializable;

public class cpbbj implements Cloneable, Serializable {
    private String name;
    private String zodiac;
    private String results;
    public cpbbj(){
    }

    public cpbbj(String name, String zodiac, String results) {
        this.name = name;
        this.zodiac = zodiac;
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    @Override
    protected cpbbj clone() throws CloneNotSupportedException {
        return (cpbbj) super.clone();
    }
}
