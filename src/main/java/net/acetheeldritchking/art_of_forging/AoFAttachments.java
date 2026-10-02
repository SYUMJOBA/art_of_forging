package net.acetheeldritchking.art_of_forging;

import net.acetheeldritchking.art_of_forging.capabilities.carnage.PlayerCarnage;
import net.acetheeldritchking.art_of_forging.capabilities.conquer.PlayerConquer;
import net.acetheeldritchking.art_of_forging.capabilities.devouring.PlayerDevouring;
import net.acetheeldritchking.art_of_forging.capabilities.karma.PlayerKarma;
import net.acetheeldritchking.art_of_forging.capabilities.soulCharge.PlayerSoulCharge;
import net.acetheeldritchking.art_of_forging.capabilities.subjugation.PlayerSubjugation;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

/**
 * NeoForge data attachments, replacing the Forge capability system used on 1.20.1.
 * Each attachment stores a small per-player stat and persists through save/load and
 * (via copyOnDeath) through player death.
 */
public class AoFAttachments {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES =
            DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, ArtOfForging.MOD_ID);

    public static final Supplier<AttachmentType<PlayerCarnage>> CARNAGE = ATTACHMENT_TYPES.register(
            "carnage", () -> AttachmentType.builder(PlayerCarnage::new)
                    .serialize(PlayerCarnage.CODEC).copyOnDeath().build());

    public static final Supplier<AttachmentType<PlayerConquer>> CONQUER = ATTACHMENT_TYPES.register(
            "conquer", () -> AttachmentType.builder(PlayerConquer::new)
                    .serialize(PlayerConquer.CODEC).copyOnDeath().build());

    public static final Supplier<AttachmentType<PlayerDevouring>> DEVOURING = ATTACHMENT_TYPES.register(
            "devouring", () -> AttachmentType.builder(PlayerDevouring::new)
                    .serialize(PlayerDevouring.CODEC).copyOnDeath().build());

    public static final Supplier<AttachmentType<PlayerKarma>> KARMA = ATTACHMENT_TYPES.register(
            "karma", () -> AttachmentType.builder(PlayerKarma::new)
                    .serialize(PlayerKarma.CODEC).copyOnDeath().build());

    public static final Supplier<AttachmentType<PlayerSoulCharge>> SOUL_CHARGE = ATTACHMENT_TYPES.register(
            "soul_charge", () -> AttachmentType.builder(PlayerSoulCharge::new)
                    .serialize(PlayerSoulCharge.CODEC).copyOnDeath().build());

    public static final Supplier<AttachmentType<PlayerSubjugation>> SUBJUGATION = ATTACHMENT_TYPES.register(
            "subjugation", () -> AttachmentType.builder(PlayerSubjugation::new)
                    .serialize(PlayerSubjugation.CODEC).copyOnDeath().build());
}
