package mysticwater.items;

import mysticwater.MysticWater;
import mysticwater.base.BaseItem;
import mysticwater.lib.Strings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FirePlate extends BaseItem
{
	public FirePlate()
	{
		this.setUnlocalizedName(Strings.FirePlateName);
		this.setCreativeTab(MysticWater.getCreativTab());
		
	}
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean b)
	{
		EntityPlayer player = (EntityPlayer) entity;
		
		if(player.inventory.hasItem(this))
		{
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40, 1));
		}
	}
	
}
