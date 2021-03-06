/*
 * Copyright (c) 2018-2020 C4
 *
 * This file is part of Construct's Armory, a mod made for Minecraft.
 *
 * Construct's Armory is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Construct's Armory is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Construct's Armory.  If not, see <https://www.gnu.org/licenses/>.
 */

package c4.conarm.lib.traits;

import c4.conarm.lib.armor.ArmorModifications;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import slimeknights.tconstruct.library.modifiers.ModifierNBT;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class AbstractArmorTrait extends AbstractTrait implements IArmorTrait, IArmorAbility {

    public AbstractArmorTrait(String identifier, TextFormatting color) {
        super(identifier + "_armor", color);
    }

    public AbstractArmorTrait(String identifier, int color) {
        super(identifier + "_armor", color);
    }

    @Override
    public ArmorModifications getModifications(EntityPlayer player, ArmorModifications mods, ItemStack armor, DamageSource source, double damage, int slot) {
        return mods;
    }

    @Override
    public void onItemPickup(ItemStack armor, EntityItem item, EntityItemPickupEvent evt) {
        //NO-OP
    }

    @Override
    public float onHeal(ItemStack armor, EntityPlayer player, float amount, float newAmount, LivingHealEvent evt) {
        return newAmount;
    }

    @Override
    public float onHurt(ItemStack armor, EntityPlayer player, DamageSource source, float damage, float newDamage, LivingHurtEvent evt) {
        return newDamage;
    }

    @Override
    public float onDamaged(ItemStack armor, EntityPlayer player, DamageSource source, float damage, float newDamage, LivingDamageEvent evt) {
        return newDamage;
    }

    @Override
    public void onKnockback(ItemStack armor, EntityPlayer player, LivingKnockBackEvent evt) {
        //NO-OP;
    }

    @Override
    public void onFalling(ItemStack armor, EntityPlayer player, LivingFallEvent evt) {
        //NO-OP
    }

    @Override
    public void onJumping(ItemStack armor, EntityPlayer player, LivingEvent.LivingJumpEvent evt) {
        //NO-OP
    }

    @Override
    public void onAbilityTick(int level, World world, EntityPlayer player) {
        //NO-OP
    }

    @Override
    public void onArmorEquipped(ItemStack armor, EntityPlayer player, int slot) {
        //NO-OP
    }

    @Override
    public void onArmorRemoved(ItemStack armor, EntityPlayer player, int slot) {
        //NO-OP
    }

    @Override
    public int onArmorDamage(ItemStack armor, DamageSource source, int damage, int newDamage, EntityPlayer player, int slot) {
        return newDamage;
    }

    @Override
    public int onArmorHeal(ItemStack armor, DamageSource source, int amount, int newAmount, EntityPlayer player, int slot) {
        return newAmount;
    }

    @Override
    public int getAbilityLevel(ModifierNBT data) {
        return data.level;
    }

    @Override
    public boolean disableRendering(ItemStack armor, EntityLivingBase entityLivingBase) {
        return false;
    }
}
