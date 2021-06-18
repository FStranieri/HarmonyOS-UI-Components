package com.fs.uiapplication.slice;

import com.fs.uiapplication.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.Text;

public class StackLayoutAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_stack_layout);

        ComponentContainer stackLayout = (ComponentContainer) findComponentById(ResourceTable.Id_stacklayout);

        Text green = (Text) findComponentById(ResourceTable.Id_bottom);
        green.setClickedListener(stackLayout::moveChildToFront);

        Text red = (Text) findComponentById(ResourceTable.Id_middle);
        red.setClickedListener(stackLayout::moveChildToFront);

        Text blue = (Text) findComponentById(ResourceTable.Id_top);
        blue.setClickedListener(stackLayout::moveChildToFront);
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
