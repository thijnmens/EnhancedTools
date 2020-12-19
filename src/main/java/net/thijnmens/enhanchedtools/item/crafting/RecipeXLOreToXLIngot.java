
package net.thijnmens.enhanchedtools.item.crafting;

import net.thijnmens.enhanchedtools.item.ItemXLIngot;
import net.thijnmens.enhanchedtools.block.BlockXLOre;
import net.thijnmens.enhanchedtools.ElementsEnhanchedTools;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsEnhanchedTools.ModElement.Tag
public class RecipeXLOreToXLIngot extends ElementsEnhanchedTools.ModElement {
	public RecipeXLOreToXLIngot(ElementsEnhanchedTools instance) {
		super(instance, 4);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockXLOre.block, (int) (1)), new ItemStack(ItemXLIngot.block, (int) (1)), 10F);
	}
}
