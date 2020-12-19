
package net.thijnmens.enhanchedtools.block;

import net.thijnmens.enhanchedtools.procedure.ProcedureReinforcedObsidianOnBlockRightClicked;
import net.thijnmens.enhanchedtools.creativetab.TabEnhancedTools;
import net.thijnmens.enhanchedtools.ElementsEnhanchedTools;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@ElementsEnhanchedTools.ModElement.Tag
public class BlockReinforcedObsidian extends ElementsEnhanchedTools.ModElement {
	@GameRegistry.ObjectHolder("enhanchedtools:reinforcedobsidian")
	public static final Block block = null;
	public BlockReinforcedObsidian(ElementsEnhanchedTools instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("reinforcedobsidian"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("enhanchedtools:reinforcedobsidian", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("reinforcedobsidian");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 5);
			setHardness(100F);
			setResistance(1200F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabEnhancedTools.tab);
		}

		@Override
		public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
			return false;
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction,
				float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureReinforcedObsidianOnBlockRightClicked.executeProcedure($_dependencies);
			}
			return true;
		}
	}
}
