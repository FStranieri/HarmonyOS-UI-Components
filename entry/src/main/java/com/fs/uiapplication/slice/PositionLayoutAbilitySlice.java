package com.fs.uiapplication.slice;

import com.fs.uiapplication.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.*;
import ohos.agp.components.Component.DraggedListener;

public class PositionLayoutAbilitySlice extends AbilitySlice {

    private DraggedListener draggedListener = new DraggedListener() {
        @Override
        public void onDragDown(Component component, DragInfo dragInfo) {
        }

        @Override
        public void onDragStart(Component component, DragInfo dragInfo) {

        }

        @Override
        public void onDragUpdate(Component component, DragInfo dragInfo) {
            component.setPosition(dragInfo.updatePoint.getPointXToInt(), dragInfo.updatePoint.getPointYToInt());
        }

        @Override
        public void onDragEnd(Component component, DragInfo dragInfo) {

        }

        @Override
        public void onDragCancel(Component component, DragInfo dragInfo) {

        }

        @Override
        public boolean onDragPreAccept(Component component, int dragDirection) {
            return false;
        }
    };

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_position_layout);

        PositionLayout posLayout = (PositionLayout) findComponentById(ResourceTable.Id_position);

        Text top = (Text) findComponentById(ResourceTable.Id_position_text_1);
        top.setDraggedListener(Component.DRAG_HORIZONTAL_VERTICAL, draggedListener);

        Text middle = (Text) findComponentById(ResourceTable.Id_position_text_2);
        middle.setDraggedListener(Component.DRAG_HORIZONTAL_VERTICAL, draggedListener);

        Text bottom = (Text) findComponentById(ResourceTable.Id_position_text_3);
        bottom.setDraggedListener(Component.DRAG_HORIZONTAL_VERTICAL, draggedListener);

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
