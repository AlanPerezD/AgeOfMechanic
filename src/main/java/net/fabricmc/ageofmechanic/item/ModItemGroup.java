package net.fabricmc.ageofmechanic.item;

import net.fabricmc.ageofmechanic.AgeOfMechanic;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup NEOLITHIC = FabricItemGroupBuilder.build(new Identifier(AgeOfMechanic.MOD_ID,
            "neolithic"), () -> new ItemStack(ModItems.FLINT_PICKAXE));

    //public static final ItemGroup COPPER = FabricItemGroupBuilder.build(new Identifier(AgeOfMechanic.MOD_ID,
    //        "copper"), () -> new ItemStack(ModItems.COPPER_PICKAXE));


    }



