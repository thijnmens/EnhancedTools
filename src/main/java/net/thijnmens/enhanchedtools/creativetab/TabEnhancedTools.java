
package net.thijnmens.enhanchedtools.creativetab;

import net.thijnmens.enhanchedtools.block.BlockXLOre;
import net.thijnmens.enhanchedtools.ElementsEnhanchedTools;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsEnhanchedTools.ModElement.Tag
public class TabEnhancedTools extends ElementsEnhanchedTools.ModElement {
	public TabEnhancedTools(ElementsEnhanchedTools instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabenhancedtools") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockXLOre.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
