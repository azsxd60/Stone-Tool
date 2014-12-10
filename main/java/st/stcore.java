package st;


import st.block.stblock;
import st.item.fsaxe;
import st.item.fshoe;
import st.item.fspickaxe;
import st.item.fsshovel;
import st.item.fssword;
import st.item.saxehead;
import st.item.shoehead;
import st.item.spickaxehead;
import st.item.sshovelhead;
import st.item.sstick;
import st.item.sswordhead;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "st", name = "Stone Tool", version = "1.0.1")
public class stcore {
	
	public static Item sstick;
	
	public static Item spickaxehead;
	public static Item sshovelhead;
	public static Item saxehead;
	public static Item shoehead;
	public static Item sswordhead;
	
	public static Item fspickaxe;
	public static Item fsshovel;
	public static Item fsaxe;
	public static Item fshoe;
	public static Item fssword;
	
	public static final Item.ToolMaterial FsMaterial = EnumHelper.addToolMaterial("FsMaterial", 1, 251, 5F, 2.5F, 5);
	public static Block stblock;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/Block init and registering
		//Config handling
		
		stblock = new stblock(Material.cloth).setBlockName("Stblock").setBlockTextureName("st:stblock");
		GameRegistry.registerBlock(stblock, stblock.getUnlocalizedName().substring(5));
		
		sstick = new sstick().setUnlocalizedName("Sstick").setTextureName("st:sstick");
		GameRegistry.registerItem(sstick, sstick.getUnlocalizedName().substring(5));
		spickaxehead = new spickaxehead().setUnlocalizedName("Spickaxehead").setTextureName("st:s_pickaxe_h");
		GameRegistry.registerItem(spickaxehead, spickaxehead.getUnlocalizedName().substring(5));
		sshovelhead = new sshovelhead().setUnlocalizedName("Sshovelhead").setTextureName("st:s_shovel_h");
		GameRegistry.registerItem(sshovelhead, sshovelhead.getUnlocalizedName().substring(5));
		saxehead = new saxehead().setUnlocalizedName("Saxehead").setTextureName("st:s_axe_h");
		GameRegistry.registerItem(saxehead, saxehead.getUnlocalizedName().substring(5));
		shoehead = new shoehead().setUnlocalizedName("Shoehead").setTextureName("st:s_hoe_h");
		GameRegistry.registerItem(shoehead, shoehead.getUnlocalizedName().substring(5));
		sswordhead = new sswordhead().setUnlocalizedName("Sswordhead").setTextureName("st:s_sword_h");
		GameRegistry.registerItem(sswordhead, sswordhead.getUnlocalizedName().substring(5));
		
		fspickaxe = new fspickaxe(FsMaterial).setUnlocalizedName("Fspickaxe").setTextureName("st:fs_pickaxe");
		GameRegistry.registerItem(fspickaxe, fspickaxe.getUnlocalizedName().substring(5));
		fsshovel = new fsshovel(FsMaterial).setUnlocalizedName("Fsshovel").setTextureName("st:fs_shovel");
		GameRegistry.registerItem(fsshovel, fsshovel.getUnlocalizedName().substring(5));
		fsaxe = new fsaxe(FsMaterial).setUnlocalizedName("Fsaxe").setTextureName("st:fs_axe");
		GameRegistry.registerItem(fsaxe, fsaxe.getUnlocalizedName().substring(5));
		fshoe = new fshoe(FsMaterial).setUnlocalizedName("Fshoe").setTextureName("st:fs_hoe");
		GameRegistry.registerItem(fshoe, fshoe.getUnlocalizedName().substring(5));
		fssword = new fssword(FsMaterial).setUnlocalizedName("Fssword").setTextureName("st:fs_sword");
		GameRegistry.registerItem(fssword, fssword.getUnlocalizedName().substring(5));
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI and Packet Registering
		
        GameRegistry.addRecipe(new ItemStack(stblock),
                "##",
                "##",'#', Blocks.cobblestone
        );
        
        GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone,16),
                "##",
                "##",'#', stblock
        );
 
        GameRegistry.addRecipe(new ItemStack(sstick),
                "#",
                "#",'#', Blocks.cobblestone
        );
        
        GameRegistry.addRecipe(new ItemStack(spickaxehead),
                "##",
                "# ",'#', stblock
        );
        
        GameRegistry.addRecipe(new ItemStack(sshovelhead),
                "#",'#', stblock
        );
        
        GameRegistry.addRecipe(new ItemStack(saxehead),
                " #",
                "##",'#', stblock
        );
        
        GameRegistry.addRecipe(new ItemStack(shoehead),
                "##",'#', stblock
        );
        
        GameRegistry.addRecipe(new ItemStack(sswordhead),
                "#",
                "#",'#', stblock
        );
        
        GameRegistry.addRecipe(new ItemStack(fspickaxe),
                "W",
                "#",'W', spickaxehead,'#',sstick
        );
        GameRegistry.addRecipe(new ItemStack(fsshovel),
                "W",
                "#",'W', sshovelhead,'#',sstick
        );
        GameRegistry.addRecipe(new ItemStack(fsaxe),
                "W",
                "#",'W', saxehead,'#',sstick
        );
        GameRegistry.addRecipe(new ItemStack(fshoe),
                "W",
                "#",'W', shoehead,'#',sstick
        );
        GameRegistry.addRecipe(new ItemStack(fssword),
                "W",
                "#",'W', sswordhead,'#',sstick
        );


        
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
