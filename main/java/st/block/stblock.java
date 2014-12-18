package st.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class stblock extends Block {

	public stblock(Material material) {
		super(material);
        setHardness(0.02F);
        setResistance(20F);
        setStepSound(Block.soundTypeStone);
        setLightLevel(0.65F);
	}

}
