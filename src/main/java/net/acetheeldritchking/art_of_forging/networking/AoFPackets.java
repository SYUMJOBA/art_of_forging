package net.acetheeldritchking.art_of_forging.networking;

import net.acetheeldritchking.art_of_forging.ArtOfForging;
import net.acetheeldritchking.art_of_forging.networking.packet.LifeStealParticlesS2CPacket;
import net.acetheeldritchking.art_of_forging.networking.packet.SoulChargedParticlesS2CPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import se.mickelus.mutil.network.AbstractPacket;
import se.mickelus.mutil.network.PacketHandler;

public class AoFPackets {
    public static final PacketHandler packetHandler =
            new PacketHandler(ArtOfForging.MOD_ID, "aof_packets", "1.0");

    public static void registerPayloads(RegisterPayloadHandlersEvent event) {
        // Server to Client
        packetHandler.registerClientBoundPacket(LifeStealParticlesS2CPacket.class, LifeStealParticlesS2CPacket::new);
        packetHandler.registerClientBoundPacket(SoulChargedParticlesS2CPacket.class, SoulChargedParticlesS2CPacket::new);
        packetHandler.registerPayloads(event);
    }

    public static void sendToPlayer(AbstractPacket message, ServerPlayer player) {
        packetHandler.sendTo(message, player);
    }

    /** Sends to all players near the given entity (used for particle effects around a target). */
    public static void sendToEntity(AbstractPacket message, LivingEntity entity) {
        if (entity.level() instanceof ServerLevel serverLevel) {
            packetHandler.sendToAllPlayersNear(message, entity.blockPosition(), 64.0, serverLevel.dimension());
        }
    }
}
