package com.fs.uiapplication;

import com.fs.uiapplication.slice.DependentLayoutAbilitySlice;
import com.fs.uiapplication.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());

        // Set an action route.
        addActionRoute("action.dependentlayout", DependentLayoutAbilitySlice.class.getName());
    }
}
