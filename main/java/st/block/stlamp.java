package st.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class stlamp extends Block {

	public stlamp(Material material) {
		super(material);
        setHardness(1.0F);
        setResistance(10F);
        setStepSound(Block.soundTypeStone);
        setLightLevel(1.0F);
	}
}


