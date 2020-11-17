package mvc.models;

import javax.persistence.*;
import java.util.List;


@Entity
public class InputModel {
    //region Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer inputId;

    @Version
    private Integer version;

    private String text;
    private String password;
    private boolean checkbox1;
    private boolean checkbox2;
    private boolean checkbox3;
    //Lob in order to make a larger value to be put into the database
    @Lob
    private String notes;
    private String radio;
    private String color;

    @ElementCollection
    private List<String> selectList;
    //endregion

    //region Constructors
    public InputModel() {}
    //endregion

    //region Setters and Getters
    public Integer getInputId() {
        return inputId;
    }

    public void setInputId(Integer inputId) {
        this.inputId = inputId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isCheckbox1() {
        return checkbox1;
    }

    public void setCheckbox1(boolean checkbox1) {
        this.checkbox1 = checkbox1;
    }

    public boolean isCheckbox2() {
        return checkbox2;
    }

    public void setCheckbox2(boolean checkbox2) {
        this.checkbox2 = checkbox2;
    }

    public boolean isCheckbox3() {
        return checkbox3;
    }

    public void setCheckbox3(boolean checkbox3) {
        this.checkbox3 = checkbox3;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getSelectList() {
        return selectList;
    }

    public void setSelectList(List<String> selectList) {
        this.selectList = selectList;
    }
    //endregion

    //region Methods
    public String toString() {
        return "Text: " + getText() + "\n" +
                "Password: " + getPassword() + "\n" +
                "Checkbox 1: " + isCheckbox1() + "\n" +
                "Checkbox 2: " + isCheckbox2() + "\n" +
                "Checkbox 3: " + isCheckbox3() + "\n" +
                "Notes: " + getNotes() + "\n";
    }
}
