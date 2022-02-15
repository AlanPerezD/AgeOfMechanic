package net.fabricmc.ageofmechanic.item;

import net.fabricmc.ageofmechanic.AgeOfMechanic;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems{

    public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item registerItem(String name, Item item){
        return net.minecraft.util.registry.Registry.register(Registry.ITEM, new Identifier(AgeOfMechanic.MOD_ID, name), item);
    }
    public static void registerModItems(){
        AgeOfMechanic.LOGGER.info("Registering Mod Items For" + AgeOfMechanic.MOD_ID);
    }
}
