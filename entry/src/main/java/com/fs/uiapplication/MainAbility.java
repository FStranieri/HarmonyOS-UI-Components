package com.fs.uiapplication;

import com.fs.uiapplication.slice.*;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());

        // Set an action route.
        addActionRoute("action.directionallayout", DirectionalLayoutAbilitySlice.class.getName());
        addActionRoute("action.dependentlayout", DependentLayoutAbilitySlice.class.getName());
        addActionRoute("action.stacklayout", StackLayoutAbilitySlice.class.getName());
        addActionRoute("action.tablelayout", TableLayoutAbilitySlice.class.getName());
        addActionRoute("action.adaptiveboxlayout", AdaptiveBoxLayoutAbilitySlice.class.getName());
        addActionRoute("action.positionlayout", PositionLayoutAbilitySlice.class.getName());
    }

}
