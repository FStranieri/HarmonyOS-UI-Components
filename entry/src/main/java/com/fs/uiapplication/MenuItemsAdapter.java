package com.fs.uiapplication;
import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.*;
import java.util.List;

public class MenuItemsAdapter extends BaseItemProvider{
        private List<MenuListItem> list;
        private AbilitySlice slice;
        public MenuItemsAdapter(List<MenuListItem> list, AbilitySlice slice) {
            this.list = list;
            this.slice = slice;
        }
        @Override
        public int getCount() {
            return list == null ? 0 : list.size();
        }
        @Override
        public Object getItem(int position) {
            if (list != null && position >= 0 && position < list.size()){
                return list.get(position);
            }
            return null;
        }
        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public Component getComponent(int position, Component convertComponent, ComponentContainer componentContainer) {
            final Component cpt;
            if (convertComponent == null) {
                cpt = LayoutScatter.getInstance(slice).parse(ResourceTable.Layout_menu_list_item, null, false);
            } else {
                cpt = convertComponent;
            }
            MenuListItem sampleItem = list.get(position);
            Text text = (Text) cpt.findComponentById(ResourceTable.Id_item_index);
            text.setText(sampleItem.getName());
            return cpt;
        }
}
