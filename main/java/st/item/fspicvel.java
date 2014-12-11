package st.item;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class fspicvel extends ItemTool{
	private static final Set field_150916_c = Sets.newHashSet(new Block[] {
			Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, 
			Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium,Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, 
			Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.ice, Blocks.netherrack, 
			Blocks.lapis_ore, Blocks.lapis_block, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail,Blocks.chest, 
	});

	public fspicvel(ToolMaterial material){
		super(0.0F, material, field_150916_c);
	}

	public boolean func_150897_b(Block block){
			return block == Blocks.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : (block != Blocks.diamond_block && block != Blocks.diamond_ore ? 
			(block != Blocks.emerald_ore && block != Blocks.emerald_block ? (block != Blocks.gold_block && block != Blocks.gold_ore ? 
			(block != Blocks.iron_block && block != Blocks.iron_ore ? (block != Blocks.lapis_block && block != Blocks.lapis_ore ? 
			(block != Blocks.redstone_ore && block != Blocks.lit_redstone_ore ? (block.getMaterial() == Material.rock ? true : 
			(block.getMaterial() == Material.iron ? true : block.getMaterial() == Material.anvil)) : 
			this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : 
			this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) :
			this.toolMaterial.getHarvestLevel() >= 2) || block == Blocks.snow_layer ? true : block == Blocks.snow;
	}

	public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_){
		return p_150893_2_.getMaterial() != Material.iron && p_150893_2_.getMaterial()
		!= Material.anvil && p_150893_2_.getMaterial() != Material.rock ? super.func_150893_a(p_150893_1_, p_150893_2_) : 
		this.efficiencyOnProperMaterial;
	}

	public float func_150893_b(ItemStack p_150893_1_, Block p_150893_2_){
		return p_150893_2_.getMaterial() != Material.wood && p_150893_2_.getMaterial() != Material.plants && p_150893_2_.getMaterial() 
		!= Material.vine ? super.func_150893_a(p_150893_1_, p_150893_2_) : this.efficiencyOnProperMaterial;
	}
}
