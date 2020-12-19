
package net.thijnmens.enhanchedtools.item;

import net.thijnmens.enhanchedtools.creativetab.TabEnhancedTools;
import net.thijnmens.enhanchedtools.ElementsEnhanchedTools;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsEnhanchedTools.ModElement.Tag
public class ItemXLArmorArmor extends ElementsEnhanchedTools.ModElement {
	@GameRegistry.ObjectHolder("enhanchedtools:xlarmorarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("enhanchedtools:xlarmorarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("enhanchedtools:xlarmorarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("enhanchedtools:xlarmorarmorboots")
	public static final Item boots = null;
	public ItemXLArmorArmor(ElementsEnhanchedTools instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("XLARMORARMOR", "enhanchedtools:xlarmor", 150, new int[]{20, 60, 50, 20}, 90,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("xlarmorarmorhelmet")
				.setRegistryName("xlarmorarmorhelmet").setCreativeTab(TabEnhancedTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("xlarmorarmorbody")
				.setRegistryName("xlarmorarmorbody").setCreativeTab(TabEnhancedTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("xlarmorarmorlegs")
				.setRegistryName("xlarmorarmorlegs").setCreativeTab(TabEnhancedTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("xlarmorarmorboots")
				.setRegistryName("xlarmorarmorboots").setCreativeTab(TabEnhancedTools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("enhanchedtools:xlarmorarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("enhanchedtools:xlarmorarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("enhanchedtools:xlarmorarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("enhanchedtools:xlarmorarmorboots", "inventory"));
	}
}
