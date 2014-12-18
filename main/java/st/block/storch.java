package st.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class storch
  extends Block
{
  public storch()
  {
    super(Material.circuits);
    setTickRandomly(true);
    setHardness(0.0F);
    setLightLevel(0.9375F);
    setStepSound(soundTypeWood);
  }
  
  public AxisAlignedBB getCollisionBoundingBoxFromPool(World paramWorld, int paramInt1, int paramInt2, int paramInt3)
  {
    return null;
  }
  
  public boolean isOpaqueCube()
  {
    return false;
  }
  
  public boolean renderAsNormalBlock()
  {
    return false;
  }
  
  public int getRenderType()
  {
    return 2;
  }
  
  private boolean func_150107_m(World paramWorld, int paramInt1, int paramInt2, int paramInt3)
  {
    if (World.doesBlockHaveSolidTopSurface(paramWorld, paramInt1, paramInt2, paramInt3)) {
      return true;
    }
    Block localBlock = paramWorld.getBlock(paramInt1, paramInt2, paramInt3);
    if ((localBlock == Blocks.fence) || (localBlock == Blocks.nether_brick_fence) || (localBlock == Blocks.glass) || (localBlock == Blocks.cobblestone_wall)) {
      return true;
    }
    return false;
  }
  
  public boolean canPlaceBlockAt(World paramWorld, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramWorld.isBlockNormalCubeDefault(paramInt1 - 1, paramInt2, paramInt3, true)) {
      return true;
    }
    if (paramWorld.isBlockNormalCubeDefault(paramInt1 + 1, paramInt2, paramInt3, true)) {
      return true;
    }
    if (paramWorld.isBlockNormalCubeDefault(paramInt1, paramInt2, paramInt3 - 1, true)) {
      return true;
    }
    if (paramWorld.isBlockNormalCubeDefault(paramInt1, paramInt2, paramInt3 + 1, true)) {
      return true;
    }
    if (func_150107_m(paramWorld, paramInt1, paramInt2 - 1, paramInt3)) {
      return true;
    }
    return false;
  }
  
  public int onBlockPlaced(World paramWorld, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
  {
    int i = paramInt5;
    if ((paramInt4 == 1) && (func_150107_m(paramWorld, paramInt1, paramInt2 - 1, paramInt3))) {
      i = 5;
    }
    if ((paramInt4 == 2) && (paramWorld.isBlockNormalCubeDefault(paramInt1, paramInt2, paramInt3 + 1, true))) {
      i = 4;
    }
    if ((paramInt4 == 3) && (paramWorld.isBlockNormalCubeDefault(paramInt1, paramInt2, paramInt3 - 1, true))) {
      i = 3;
    }
    if ((paramInt4 == 4) && (paramWorld.isBlockNormalCubeDefault(paramInt1 + 1, paramInt2, paramInt3, true))) {
      i = 2;
    }
    if ((paramInt4 == 5) && (paramWorld.isBlockNormalCubeDefault(paramInt1 - 1, paramInt2, paramInt3, true))) {
      i = 1;
    }
    return i;
  }
  
  public void updateTick(World paramWorld, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
  {
    super.updateTick(paramWorld, paramInt1, paramInt2, paramInt3, paramRandom);
    if (paramWorld.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 0) {
      onBlockAdded(paramWorld, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public void onBlockAdded(World paramWorld, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramWorld.getBlockMetadata(paramInt1, paramInt2, paramInt3) == 0) {
      if (paramWorld.isBlockNormalCubeDefault(paramInt1 - 1, paramInt2, paramInt3, true)) {
        paramWorld.setBlockMetadataWithNotify(paramInt1, paramInt2, paramInt3, 1, 2);
      } else if (paramWorld.isBlockNormalCubeDefault(paramInt1 + 1, paramInt2, paramInt3, true)) {
        paramWorld.setBlockMetadataWithNotify(paramInt1, paramInt2, paramInt3, 2, 2);
      } else if (paramWorld.isBlockNormalCubeDefault(paramInt1, paramInt2, paramInt3 - 1, true)) {
        paramWorld.setBlockMetadataWithNotify(paramInt1, paramInt2, paramInt3, 3, 2);
      } else if (paramWorld.isBlockNormalCubeDefault(paramInt1, paramInt2, paramInt3 + 1, true)) {
        paramWorld.setBlockMetadataWithNotify(paramInt1, paramInt2, paramInt3, 4, 2);
      } else if (func_150107_m(paramWorld, paramInt1, paramInt2 - 1, paramInt3)) {
        paramWorld.setBlockMetadataWithNotify(paramInt1, paramInt2, paramInt3, 5, 2);
      }
    }
    func_150109_e(paramWorld, paramInt1, paramInt2, paramInt3);
  }
  
  public void onNeighborBlockChange(World paramWorld, int paramInt1, int paramInt2, int paramInt3, Block paramBlock)
  {
    func_150108_b(paramWorld, paramInt1, paramInt2, paramInt3, paramBlock);
  }
  
  protected boolean func_150108_b(World paramWorld, int paramInt1, int paramInt2, int paramInt3, Block paramBlock)
  {
    if (func_150109_e(paramWorld, paramInt1, paramInt2, paramInt3))
    {
      int i = paramWorld.getBlockMetadata(paramInt1, paramInt2, paramInt3);
      int j = 0;
      if ((!paramWorld.isBlockNormalCubeDefault(paramInt1 - 1, paramInt2, paramInt3, true)) && (i == 1)) {
        j = 1;
      }
      if ((!paramWorld.isBlockNormalCubeDefault(paramInt1 + 1, paramInt2, paramInt3, true)) && (i == 2)) {
        j = 1;
      }
      if ((!paramWorld.isBlockNormalCubeDefault(paramInt1, paramInt2, paramInt3 - 1, true)) && (i == 3)) {
        j = 1;
      }
      if ((!paramWorld.isBlockNormalCubeDefault(paramInt1, paramInt2, paramInt3 + 1, true)) && (i == 4)) {
        j = 1;
      }
      if ((!func_150107_m(paramWorld, paramInt1, paramInt2 - 1, paramInt3)) && (i == 5)) {
        j = 1;
      }
      if (j != 0)
      {
        dropBlockAsItem(paramWorld, paramInt1, paramInt2, paramInt3, paramWorld.getBlockMetadata(paramInt1, paramInt2, paramInt3), 0);
        paramWorld.setBlockToAir(paramInt1, paramInt2, paramInt3);
        return true;
      }
    }
    else
    {
      return true;
    }
    return false;
  }
  
  protected boolean func_150109_e(World paramWorld, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!canPlaceBlockAt(paramWorld, paramInt1, paramInt2, paramInt3))
    {
      if (paramWorld.getBlock(paramInt1, paramInt2, paramInt3) == this)
      {
        dropBlockAsItem(paramWorld, paramInt1, paramInt2, paramInt3, paramWorld.getBlockMetadata(paramInt1, paramInt2, paramInt3), 0);
        paramWorld.setBlockToAir(paramInt1, paramInt2, paramInt3);
      }
      return false;
    }
    return true;
  }
  
  public MovingObjectPosition collisionRayTrace(World paramWorld, int paramInt1, int paramInt2, int paramInt3, Vec3 paramVec31, Vec3 paramVec32)
  {
    int i = paramWorld.getBlockMetadata(paramInt1, paramInt2, paramInt3) & 0x7;
    
    float f = 0.15F;
    if (i == 1)
    {
      setBlockBounds(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
    }
    else if (i == 2)
    {
      setBlockBounds(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
    }
    else if (i == 3)
    {
      setBlockBounds(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
    }
    else if (i == 4)
    {
      setBlockBounds(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
    }
    else
    {
      f = 0.1F;
      setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
    }
    return super.collisionRayTrace(paramWorld, paramInt1, paramInt2, paramInt3, paramVec31, paramVec32);
  }
  
  public void randomDisplayTick(World paramWorld, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
  {
    int i = paramWorld.getBlockMetadata(paramInt1, paramInt2, paramInt3);
    double d1 = paramInt1 + 0.5F;
    double d2 = paramInt2 + 0.7F;
    double d3 = paramInt3 + 0.5F;
    double d4 = 0.219999998807907D;
    double d5 = 0.2700000107288361D;
    if (i == 1)
    {
      paramWorld.spawnParticle("smoke", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
      paramWorld.spawnParticle("flame", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
    }
    else if (i == 2)
    {
      paramWorld.spawnParticle("smoke", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
      paramWorld.spawnParticle("flame", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
    }
    else if (i == 3)
    {
      paramWorld.spawnParticle("smoke", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
      paramWorld.spawnParticle("flame", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
    }
    else if (i == 4)
    {
      paramWorld.spawnParticle("smoke", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
      paramWorld.spawnParticle("flame", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
    }
    else
    {
      paramWorld.spawnParticle("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
      paramWorld.spawnParticle("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
    }
  }
}