package net.acetheeldritchking.art_of_forging;

import net.acetheeldritchking.art_of_forging.item.custom.AncientItem;
import net.acetheeldritchking.art_of_forging.item.custom.EnigmaticConstructItem;
import net.acetheeldritchking.art_of_forging.item.custom.LifeFiberItem;
import net.acetheeldritchking.art_of_forging.item.custom.SigilOfEdenItem;
import net.acetheeldritchking.art_of_forging.item.modular.ModularArtifact;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AoFRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, ArtOfForging.MOD_ID);

    //               //
    // Modular Items //
    //               //
    // Modular Artifact
    public static final DeferredHolder<Item, ? extends Item> MODULAR_ARTIFACT = ITEMS.register(ModularArtifact.identifier, ModularArtifact::new);

    public static final DeferredHolder<Item, ? extends Item> CURIOUS_ARTIFACT = ITEMS.register("curious_artifact",
            () -> new Item(new Item.Properties()));


    //        //
    // INGOTS //
    //        //
    // Resonant Alloy
    public static final DeferredHolder<Item, ? extends Item> RESONANT_ALLOY = ITEMS.register("resonant_alloy",
            () -> new Item(new Item.Properties().fireResistant()));

    // Forged Steel
    public static final DeferredHolder<Item, ? extends Item> FORGED_STEEL_INGOT = ITEMS.register("forged_steel_ingot",
            () -> new Item(new Item.Properties().fireResistant()));

    // Vobrite Crystal
    public static DeferredHolder<Item, ? extends Item> VOBRITE_CRYSTAL = ITEMS.register("vobrite_crystal",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).
                    fireResistant()));

    // Vobrivium Ingot
    public static DeferredHolder<Item, ? extends Item> VOBRIVIUM_INGOT = ITEMS.register("vobrivium_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).
                    fireResistant()));

    // Endsteel
    public static DeferredHolder<Item, ? extends Item> ENDSTEEL_INGOT = ITEMS.register("endsteel_ingot",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.UNCOMMON).fireResistant()));


    //          //
    // TREASURE //
    //          //
    // Life Fiber
    public static DeferredHolder<Item, ? extends Item> LIFE_FIBER = ITEMS.register("life_fiber",
            () -> new LifeFiberItem(new Item.Properties().rarity(Rarity.RARE)));

    // Fang Charm
    public static final DeferredHolder<Item, ? extends Item> FANG_CHARM = ITEMS.register("fang_charm",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));

    // Sigil of Eden
    public static DeferredHolder<Item, ? extends Item> SIGIL_OF_EDEN = ITEMS.register("sigil_of_eden",
            () -> new SigilOfEdenItem(new Item.Properties().
                    rarity(Rarity.EPIC).stacksTo(1).fireResistant()));

    // Enigmatic Construct
    public static DeferredHolder<Item, ? extends Item> ENIGMATIC_CONSTRUCT = ITEMS.register("enigmatic_construct",
            () -> new EnigmaticConstructItem(new Item.Properties().
                    rarity(Rarity.EPIC).fireResistant().stacksTo(1)));

    // Ancient Axe head
    public static DeferredHolder<Item, ? extends Item> ANCIENT_AXE = ITEMS.register("ancient_axe",
            () -> new AncientItem(new Item.Properties().
                    rarity(Rarity.EPIC).fireResistant().stacksTo(1)));

    // Ancient Blade
    public static DeferredHolder<Item, ? extends Item> ANCIENT_BLADE = ITEMS.register("ancient_blade",
            () -> new AncientItem(new Item.Properties().
                    rarity(Rarity.EPIC).fireResistant().stacksTo(1)));

    // Ancient Flail
    public static DeferredHolder<Item, ? extends Item> ANCIENT_FLAIL = ITEMS.register("ancient_flail",
            () -> new AncientItem(new Item.Properties().
                    rarity(Rarity.EPIC).fireResistant().stacksTo(1)));

    // Demonic Axe Head
    public static DeferredHolder<Item, ? extends Item> DEMONIC_AXE = ITEMS.register("demonic_axe",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.EPIC).fireResistant().stacksTo(1)));

    // Demonic Blade
    public static DeferredHolder<Item, ? extends Item> DEMONIC_BLADE = ITEMS.register("demonic_blade",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.EPIC).fireResistant().stacksTo(1)));

    // Demonic Flail
    public static DeferredHolder<Item, ? extends Item> DEMONIC_FLAIL = ITEMS.register("demonic_flail",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.EPIC).fireResistant().stacksTo(1)));

    // Devil's Soul Gem
    public static DeferredHolder<Item, ? extends Item> DEVILS_SOUL_GEM = ITEMS.register("devils_soul_gem",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.EPIC).stacksTo(1).fireResistant()));

    // Rending Scissor Red
    public static DeferredHolder<Item, ? extends Item> RENDING_SCISSOR_RED = ITEMS.register("rending_scissor_red",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.EPIC).stacksTo(1).fireResistant()));

    // Rending Scissor Purple
    public static DeferredHolder<Item, ? extends Item> RENDING_SCISSOR_PURPLE = ITEMS.register("rending_scissor_purple",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.EPIC).stacksTo(1).fireResistant()));

    // Rending Scissor Complete
    public static DeferredHolder<Item, ? extends Item> RENDING_SCISSOR_COMPLETE = ITEMS.register("rending_scissor_complete",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.EPIC).stacksTo(1).fireResistant()));


    //      //
    // MISC //
    //      //
    // Nano-Insectoid
    public static DeferredHolder<Item, ? extends Item> NANO_INSECTOID = ITEMS.register("nano_insectoid",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.UNCOMMON).stacksTo(16)));

    // Encoded Canister
    public static DeferredHolder<Item, ? extends Item> ENCODED_CANISTER = ITEMS.register("encoded_canister",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.UNCOMMON).stacksTo(16)));

    // Esoteric Codex
    public static DeferredHolder<Item, ? extends Item> ESOTERIC_CODEX = ITEMS.register("esoteric_codex",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.RARE).stacksTo(1)));

    // Mark of The Architect
    public static DeferredHolder<Item, ? extends Item> MARK_OF_THE_ARCHITECT = ITEMS.register("mark_of_the_architect",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.EPIC).stacksTo(1)));

    // Shockwave Chamber
    public static DeferredHolder<Item, ? extends Item> SHOCKWAVE_CHAMBER = ITEMS.register("shockwave_chamber",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.RARE).stacksTo(16)));


    //           //
    // MOB DROPS //
    //           //
    // Dragon Soul
    public static DeferredHolder<Item, ? extends Item> DRAGON_SOUL = ITEMS.register("dragon_soul",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.RARE).fireResistant()));

    // Shards of Malice
    public static DeferredHolder<Item, ? extends Item> SHARDS_OF_MALICE = ITEMS.register("shards_of_malice",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.UNCOMMON).fireResistant()));

    // Potent Mixture
    public static DeferredHolder<Item, ? extends Item> POTENT_MIXTURE = ITEMS.register("potent_mixture",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.RARE)));

    // Heart of Ender
    public static DeferredHolder<Item, ? extends Item> HEART_OF_ENDER = ITEMS.register("heart_of_ender",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.RARE)));

    // Eerie Shard
    public static DeferredHolder<Item, ? extends Item> EERIE_SHARD = ITEMS.register("eerie_shard",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.RARE).stacksTo(16)));

    // Soul Ember
    public static DeferredHolder<Item, ? extends Item> SOUL_EMBER = ITEMS.register("soul_ember",
            () -> new Item(new Item.Properties()));

    // Fragment of Eden
    public static DeferredHolder<Item, ? extends Item> FRAGMENT_OF_EDEN = ITEMS.register("fragment_of_eden",
            () -> new Item(new Item.Properties().
                    rarity(Rarity.RARE).stacksTo(16)));


}
