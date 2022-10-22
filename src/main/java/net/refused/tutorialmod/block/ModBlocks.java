package net.refused.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.refused.tutorialmod.TutorialMod;

public class ModBlocks {
    public static final Block MYTHERIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.MISC);
    public static final Block MYTHERIL_ORE = registerBlock("mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ItemGroup.MISC);
    public static final Block NETHERRACK_MYTHERIL_ORE = registerBlock("netherrack_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block RAW_MYTHERIL_BLOCK = registerBlock("raw_mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }

}
