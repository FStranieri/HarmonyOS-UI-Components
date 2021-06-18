package com.fs.uiapplication.slice;

import com.fs.uiapplication.*;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ListContainer;

import java.util.ArrayList;
import java.util.List;

public class MainAbilitySlice extends AbilitySlice {

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        initListContainer();
    }

    private void initListContainer() {
        ListContainer listContainer = (ListContainer) findComponentById(ResourceTable.Id_list_container);
        List<MenuListItem> list = getData();
        MenuItemsAdapter sampleItemProvider = new MenuItemsAdapter(list, this);
        listContainer.setItemProvider(sampleItemProvider);
        listContainer.setItemClickedListener(new ListContainer.ItemClickedListener() {
            @Override
            public void onItemClicked(ListContainer listContainer, Component component, int i, long l) {
                MenuListItem listItem = (MenuListItem) listContainer.getItemProvider().getItem(i);
                switchAbility(listItem.getOptionType());
            }
        });
    }
    private ArrayList<MenuListItem> getData() {
        ArrayList<MenuListItem> options = new ArrayList<>();
        options.add(new MenuListItem(MenuOption.DIRECTIONAL_LAYOUT, "DirectionalLayout"));
        options.add(new MenuListItem(MenuOption.DEPENDENT_LAYOUT, "DependentLayout"));
        options.add(new MenuListItem(MenuOption.STACK_LAYOUT, "StackLayout"));
        options.add(new MenuListItem(MenuOption.TABLE_LAYOUT, "TableLayout"));
        options.add(new MenuListItem(MenuOption.POSITION_LAYOUT, "PositionLayout"));
        options.add(new MenuListItem(MenuOption.ADAPTIVE_BOX_LAYOUT, "AdaptiveBoxLayout"));
        return options;
    }

    private void switchAbility(MenuOption option){
        switch (option) {
            case DIRECTIONAL_LAYOUT:
                present(new DirectionalLayoutAbilitySlice(), new Intent());
                break;
            case DEPENDENT_LAYOUT:
                present(new DependentLayoutAbilitySlice(), new Intent());
                break;
            case STACK_LAYOUT:
                present(new StackLayoutAbilitySlice(), new Intent());
                break;
            case TABLE_LAYOUT:
                present(new TableLayoutAbilitySlice(), new Intent());
                break;
            case POSITION_LAYOUT:
                present(new PositionLayoutAbilitySlice(), new Intent());
                break;
            case ADAPTIVE_BOX_LAYOUT:
                present(new AdaptiveBoxLayoutAbilitySlice(), new Intent());
                break;
        }
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }


}
