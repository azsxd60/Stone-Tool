package st;


import st.block.stblock;
import st.block.stlamp;
import st.block.storch;
import st.item.fsaxe;
import st.item.fshoe;
import st.item.fspickaxe;
import st.item.fspicvel;
import st.item.fsshovel;
import st.item.fssword;
import st.item.sarmor;
import st.item.saxehead;
import st.item.shelmet;
import st.item.shoehead;
import st.item.spickaxehead;
import st.item.spicvelhead;
import st.item.sshovelhead;
import st.item.sstick;
import st.item.sswordhead;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "st", name = "Stone Tool", version = "1.3")
public class stcore {
	
	public static Item sstick;
	
	public static Item spickaxehead;
	public static Item sshovelhead;
	public static Item saxehead;
	public static Item shoehead;
	public static Item sswordhead;
	public static Item spicvelhead;
	
	public static Item fspickaxe;
	public static Item fsshovel;
	public static Item fsaxe;
	public static Item fshoe;
	public static Item fssword;
	public static Item fspicvel;
	
	public static Item shelmet;
	public static Item schestplate;
	public static Item sleggings;
	public static Item sboots;
	
	public static final Item.ToolMaterial FsMaterial = EnumHelper.addToolMaterial("FsMaterial", 1, 251, 5F, 0F, 5);
	public static final Item.ToolMaterial FsMaterial2 = EnumHelper.addToolMaterial("FsMaterial2", 1, 502, 5F, 1F, 5);
	public static final ItemArmor.ArmorMaterial SArmorMaterial = EnumHelper.addArmorMaterial("SArmorMaterial", 55, new int[]{2,4,2,2}, 5);
	
	public static Block stblock;
	public static Block stlamp;
	public static Block storch;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/Block init and registering
		//Config handling
		
		//Blocks
		stblock = new stblock(Material.cloth).setBlockName("Stblock").setBlockTextureName("st:stblock").setCreativeTab(tabsttool);
		stlamp = new stlamp(Material.rock).setBlockName("Stlamp").setBlockTextureName("st:stlamp").setCreativeTab(tabsttool);
		storch = new storch().setBlockName("Storch").setBlockTextureName("st:storch").setCreativeTab(tabsttool);
		
		//Stick&ToolHead
		sstick = new sstick().setUnlocalizedName("Sstick").setTextureName("st:sstick").setCreativeTab(tabsttool);
		spickaxehead = new spickaxehead().setUnlocalizedName("Spickaxehead").setTextureName("st:s_pickaxe_h").setCreativeTab(tabsttool);
		sshovelhead = new sshovelhead().setUnlocalizedName("Sshovelhead").setTextureName("st:s_shovel_h").setCreativeTab(tabsttool);
		saxehead = new saxehead().setUnlocalizedName("Saxehead").setTextureName("st:s_axe_h").setCreativeTab(tabsttool);
		shoehead = new shoehead().setUnlocalizedName("Shoehead").setTextureName("st:s_hoe_h").setCreativeTab(tabsttool);
		sswordhead = new sswordhead().setUnlocalizedName("Sswordhead").setTextureName("st:s_sword_h").setCreativeTab(tabsttool);
		spicvelhead = new spicvelhead().setUnlocalizedName("Spicvelhead").setTextureName("st:s_picvel_h").setCreativeTab(tabsttool);
		
		//Tool
		fspickaxe = new fspickaxe(FsMaterial).setUnlocalizedName("Fspickaxe").setTextureName("st:fs_pickaxe").setCreativeTab(tabsttool);
		fsshovel = new fsshovel(FsMaterial).setUnlocalizedName("Fsshovel").setTextureName("st:fs_shovel").setCreativeTab(tabsttool);
		fsaxe = new fsaxe(FsMaterial).setUnlocalizedName("Fsaxe").setTextureName("st:fs_axe").setCreativeTab(tabsttool);
		fshoe = new fshoe(FsMaterial).setUnlocalizedName("Fshoe").setTextureName("st:fs_hoe").setCreativeTab(tabsttool);
		fssword = new fssword(FsMaterial).setUnlocalizedName("Fssword").setTextureName("st:fs_sword").setCreativeTab(tabsttool);
		fspicvel = new fspicvel(FsMaterial2).setUnlocalizedName("Fspicvel").setTextureName("st:fs_picvel").setCreativeTab(tabsttool);
		
		//Armor
		shelmet = new sarmor(SArmorMaterial, 0, 0).setUnlocalizedName("Shelmet").setTextureName("st:s_helmet").setCreativeTab(tabsttool);
		schestplate = new sarmor(SArmorMaterial, 0, 1).setUnlocalizedName("Schestplate").setTextureName("st:s_chestplate").setCreativeTab(tabsttool);
		sleggings = new sarmor(SArmorMaterial, 0, 2).setUnlocalizedName("Sleggings").setTextureName("st:s_leggings").setCreativeTab(tabsttool);
		sboots = new sarmor(SArmorMaterial, 0, 3).setUnlocalizedName("Sboots").setTextureName("st:s_boots").setCreativeTab(tabsttool);
		
		//Blocks
		GameRegistry.registerBlock(stblock, stblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(storch, storch.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stlamp, stlamp.getUnlocalizedName().substring(5));
		
		//Stick&ToolHead
		GameRegistry.registerItem(sstick, sstick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spickaxehead, spickaxehead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sshovelhead, sshovelhead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(saxehead, saxehead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shoehead, shoehead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sswordhead, sswordhead.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(spicvelhead, spicvelhead.getUnlocalizedName().substring(5));
		
		//Tool
		GameRegistry.registerItem(fspickaxe, fspickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fsshovel, fsshovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fsaxe, fsaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fshoe, fshoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fssword, fssword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fspicvel, fspicvel.getUnlocalizedName().substring(5));
		
		//Armor
		GameRegistry.registerItem(shelmet, shelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(schestplate, schestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sleggings, sleggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sboots, sboots.getUnlocalizedName().substring(5));
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI and Packet Registering
		
		//Blocks
        GameRegistry.addRecipe(new ItemStack(stblock),"##","##",'#', Blocks.cobblestone);
        GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone,16),"##","##",'#', stblock);
        GameRegistry.addRecipe(new ItemStack(storch,4),"#","W",'#',new ItemStack(Items.coal,1,OreDictionary.WILDCARD_VALUE),'W',sstick);
        GameRegistry.addRecipe(new ItemStack(stlamp),"#","W",'#', stblock, 'W', storch);
        
        //Stick&ToolHead
        GameRegistry.addRecipe(new ItemStack(sstick),"#","#",'#', Blocks.cobblestone);
        GameRegistry.addRecipe(new ItemStack(spickaxehead),"##","# ",'#', stblock);
        GameRegistry.addRecipe(new ItemStack(sshovelhead),"#",'#', stblock);
        GameRegistry.addRecipe(new ItemStack(saxehead)," #","##",'#', stblock);
        GameRegistry.addRecipe(new ItemStack(shoehead),"##",'#', stblock);
        GameRegistry.addRecipe(new ItemStack(sswordhead),"#","#",'#', stblock);
        GameRegistry.addShapelessRecipe(new ItemStack(spicvelhead), spickaxehead, sshovelhead);
        
        //Tool
        GameRegistry.addRecipe(new ItemStack(fspickaxe),"W","#",'W', spickaxehead,'#',sstick);
        GameRegistry.addRecipe(new ItemStack(fsshovel),"W","#",'W', sshovelhead,'#',sstick);
        GameRegistry.addRecipe(new ItemStack(fsaxe),"W","#",'W', saxehead,'#',sstick);
        GameRegistry.addRecipe(new ItemStack(fshoe),"W","#",'W', shoehead,'#',sstick);
        GameRegistry.addRecipe(new ItemStack(fssword),"W","#",'W', sswordhead,'#',sstick);
        GameRegistry.addRecipe(new ItemStack(fspicvel),"W","#",'W', spicvelhead,'#',sstick);
        
        //Armor
        GameRegistry.addRecipe(new ItemStack(shelmet),"###","# #",'#',stblock);
        GameRegistry.addRecipe(new ItemStack(schestplate),"# #","###","###",'#',stblock);
        GameRegistry.addRecipe(new ItemStack(sleggings),"###","# #","# #",'#',stblock);
        GameRegistry.addRecipe(new ItemStack(sboots),"# #","# #",'#',stblock);


        
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
				
	}
	
	public static CreativeTabs tabsttool = new CreativeTabs("tabsttool"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(stblock).getItem();
			
		}
	};

}
