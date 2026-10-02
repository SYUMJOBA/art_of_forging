package net.acetheeldritchking.art_of_forging;

import com.mojang.logging.LogUtils;
import net.acetheeldritchking.art_of_forging.effects.*;
import net.acetheeldritchking.art_of_forging.effects.curio.*;
import net.acetheeldritchking.art_of_forging.effects.potion.PotionEffects;
import net.acetheeldritchking.art_of_forging.loot.ModLootModifiers;
import net.acetheeldritchking.art_of_forging.networking.AoFPackets;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.InterModComms;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(ArtOfForging.MOD_ID)
public class ArtOfForging {
    public static final String MOD_ID = "art_of_forging";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ArtOfForging(ModContainer modContainer) {
        IEventBus modBus = modContainer.getEventBus();

        // Curios IMC
        modBus.addListener(this::enqueueIMC);

        // Networking payloads
        modBus.addListener(AoFPackets::registerPayloads);

        // Items //
        AoFRegistry.ITEMS.register(modBus);

        // Loot Tables //
        ModLootModifiers.register(modBus);

        // Potion Effects //
        PotionEffects.register(modBus);

        // Data Attachments (formerly capabilities) //
        AoFAttachments.ATTACHMENT_TYPES.register(modBus);

        // Item Effects //
        NeoForge.EVENT_BUS.register(new WitheringEffect());
        NeoForge.EVENT_BUS.register(new StormCallerEffect());
        NeoForge.EVENT_BUS.register(new EvokingMawEffect());
        NeoForge.EVENT_BUS.register(new LifeStealEffect());
        NeoForge.EVENT_BUS.register(new KnockbackEffect());
        NeoForge.EVENT_BUS.register(new LifeFiberLossEffect());
        NeoForge.EVENT_BUS.register(new CavalryEffect());
        NeoForge.EVENT_BUS.register(new DismountingEffect());
        NeoForge.EVENT_BUS.register(new DragonMistEffect());
        NeoForge.EVENT_BUS.register(new DisorientingEffect());
        NeoForge.EVENT_BUS.register(new VengeanceEffect());
        NeoForge.EVENT_BUS.register(new ResolveEffect());
        NeoForge.EVENT_BUS.register(new DevouringEffect());
        NeoForge.EVENT_BUS.register(new InfernalRebukeEffect());
        NeoForge.EVENT_BUS.register(new HubrisEffect());
        NeoForge.EVENT_BUS.register(new SlaughteringEffect());
        NeoForge.EVENT_BUS.register(new CarnageEffect());
        NeoForge.EVENT_BUS.register(new JudgementEffect());
        NeoForge.EVENT_BUS.register(new RetributionEffect());
        NeoForge.EVENT_BUS.register(new EsotericEdgeEffect());
        NeoForge.EVENT_BUS.register(new FeastingEffect());
        NeoForge.EVENT_BUS.register(new NanoFusedEffect());
        NeoForge.EVENT_BUS.register(new BeheadingEffect());
        NeoForge.EVENT_BUS.register(new SoulChargedEffect());
        // SonicShockEffect is a Tetra ChargedAbilityEffect (wired via the ItemModularHandheld mixin),
        // not an event handler, so it must not be registered on the event bus on NeoForge.
        NeoForge.EVENT_BUS.register(new ConqueringEffect());
        NeoForge.EVENT_BUS.register(new SubjugationEffect());
        NeoForge.EVENT_BUS.register(new GoliathSlayerEffect());

        // Curio Effects //
        NeoForge.EVENT_BUS.register(new CurioFireResistanceEffect());
        NeoForge.EVENT_BUS.register(new CurioMagicResistanceEffect());
        NeoForge.EVENT_BUS.register(new CurioStrengthEffect());
        NeoForge.EVENT_BUS.register(new CurioRegenerationEffect());
        NeoForge.EVENT_BUS.register(new CurioKarmaEffect());
        NeoForge.EVENT_BUS.register(new CurioHasteEffect());
        NeoForge.EVENT_BUS.register(new CurioGlowingEffect());
    }

    // Curios Compat
    public void enqueueIMC(final InterModEnqueueEvent event) {
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE,
                () -> SlotTypePreset.CHARM.getMessageBuilder().size(1).build());
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            WitheringEffect.init();
            StormCallerEffect.init();
            EvokingMawEffect.init();
            LifeStealEffect.init();
            KnockbackEffect.init();
            LifeFiberLossEffect.init();
            CavalryEffect.init();
            DismountingEffect.init();
            DragonMistEffect.init();
            DisorientingEffect.init();
            VengeanceEffect.init();
            ResolveEffect.init();
            DevouringEffect.init();
            InfernalRebukeEffect.init();
            CarnageEffect.init();
            SlaughteringEffect.init();
            HubrisEffect.init();
            JudgementEffect.init();
            RetributionEffect.init();
            EsotericEdgeEffect.init();
            FeastingEffect.init();
            NanoFusedEffect.init();
            BeheadingEffect.init();
            SoulChargedEffect.init();
            SonicShockEffect.init();
            ConqueringEffect.init();
            SubjugationEffect.init();
            GoliathSlayerEffect.init();
            // Curio
            CurioFireResistanceEffect.init();
            CurioMagicResistanceEffect.init();
            CurioStrengthEffect.init();
            CurioRegenerationEffect.init();
            CurioKarmaEffect.init();
            CurioHasteEffect.init();
            CurioGlowingEffect.init();
        }
    }
}
