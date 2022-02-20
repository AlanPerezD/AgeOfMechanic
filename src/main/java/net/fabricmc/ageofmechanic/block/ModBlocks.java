package net.fabricmc.ageofmechanic.block;

import net.fabricmc.ageofmechanic.AgeOfMechanic;
import net.fabricmc.ageofmechanic.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block DEMO_BLOCK = registerBlock("demo_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool()), ModItemGroup.NEOLITHIC);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(AgeOfMechanic.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(AgeOfMechanic.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlock() {
        AgeOfMechanic.LOGGER.info("Registering ModBlock for" + AgeOfMechanic.MOD_ID);
    }
}
