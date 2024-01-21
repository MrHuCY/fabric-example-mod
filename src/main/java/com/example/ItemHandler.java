package com.example;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemHandler {
    public static void doItemReg(){
        FabricItemSettings itemSettings = new FabricItemSettings();
        itemSettings.maxCount(4);
        Gun item = new Gun(itemSettings);
        Registry.register(Registries.ITEM, new Identifier("examplemod", "gun"), item);
    }
}
