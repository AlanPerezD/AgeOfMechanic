package net.fabricmc.ageofmechanic.item;

import net.fabricmc.ageofmechanic.AgeOfMechanic;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FLINT_PICKAXE = FabricItemGroupBuilder.build(new Identifier(AgeOfMechanic.MOD_ID,
            "flint"), () -> new ItemStack(ModItems.FLINT_PICKAXE));
    }

