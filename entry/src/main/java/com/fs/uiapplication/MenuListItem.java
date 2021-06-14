package com.fs.uiapplication;

public class MenuListItem {
    private MenuOption optionType;
    private String name;

    public MenuListItem(MenuOption optionType, String name) {
        this.optionType = optionType;
        this.name = name;
    }

    public MenuOption getOptionType() {
        return optionType;
    }

    public void setId(MenuOption optionType) {
        this.optionType = optionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
