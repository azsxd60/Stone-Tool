package st.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class sarmor extends ItemArmor {

	public sarmor(ArmorMaterial armorMaterial, int renderindex, int armorType) {
		super(armorMaterial, renderindex, armorType);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return "st:textures/models/armor/armor_2.png";
		}
		return "st:textures/models/armor/armor_1.png";
	}
}
