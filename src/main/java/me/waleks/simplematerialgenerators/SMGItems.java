package me.waleks.simplematerialgenerators;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public final class SMGItems {

    private SMGItems() {}

    public static final ItemGroup SMG_ITEM_CATEGORY = new ItemGroup(
        new NamespacedKey(SimpleMaterialGenerators.getInstance(), "simplematerialgenerators"),
        new CustomItemStack(Material.SMOOTH_STONE, "&9简易材料生成器")
    );

    public static final SlimefunItemStack SMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
        "SMG_GENERATOR_MULTIBLOCK",
        Material.BEDROCK,
        "&9材料生成器 - 多方块结构",
        "",
        "&d该附属中的所有材料生成器",
        "&d都只需要像这样摆放",
        "&a在上方放置一个箱子即可"
    );
	
	/*	Template for adding more generator items
	public static final SlimefunItemStack SMG_GENERATOR_ = new SlimefunItemStack(
		"SMG_GENERATOR_",
		Material.,
		"& generator",
		"&6速度: &e t",
		"",
		"&9&o简易材料生成器"
	);
	*/

    public static final SlimefunItemStack SMG_GENERATOR_COBBLESTONE = new SlimefunItemStack(
        "SMG_GENERATOR_COBBLESTONE",
        Material.COBBLESTONE,
        "&7圆石生成器",
        "&6速度: &e4 t",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_STONE_BROKEN",
        Material.STONE,
        "&7圆石生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_STONE",
        Material.STONE,
        "&7石头生成器",
        "&6速度: &e8 t",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE_BROKEN",
        Material.SMOOTH_STONE,
        "&7平滑石头生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE",
        Material.SMOOTH_STONE,
        "&7平滑石头生成器",
        "&6速度: &e12 t",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL_BROKEN",
        Material.GRAVEL,
        "&7沙砾生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL",
        Material.ANDESITE,
        "&7沙砾生成器",
        "&6速度: &e6 t",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SAND_BROKEN",
        Material.SAND,
        "&e沙子生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SAND",
        Material.SANDSTONE,
        "&e沙子生成器",
        "&6速度: &e8 t",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GLASS = new SlimefunItemStack(
        "SMG_GENERATOR_GLASS",
        Material.GLASS,
        "&f玻璃生成器",
        "&6速度: &e12 t",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_NETHERRACK = new SlimefunItemStack(
        "SMG_GENERATOR_NETHERRACK",
        Material.NETHERRACK,
        "&c下界岩生成器",
        "&6速度: &e6 t",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SOUL_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SOUL_SAND",
        Material.SOUL_SAND,
        "&8灵魂沙生成器",
        "&6速度: &e8 t",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE_BADLY_FORMED = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE_BADLY_FORMED",
        Material.REDSTONE_BLOCK,
        "&c红石生成器 &8(错误形式)",
        "&8我得重新...",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE_BROKEN",
        Material.REDSTONE_BLOCK,
        "&c红石生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE",
        Material.REDSTONE_BLOCK,
        "&c红石生成器",
        "&6速度: &e24 t",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN_BADLY_FORMED = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN_BADLY_FORMED",
        Material.OBSIDIAN,
        "&5黑曜石生成器 &8(错误形式)",
        "&8我得重新...",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN_BROKEN",
        Material.OBSIDIAN,
        "&5黑曜石生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN",
        Material.OBSIDIAN,
        "&5黑曜石生成器",
        "&6速度: &e128 t",
        "",
        "&9&o简易材料生成器"
    );
}
