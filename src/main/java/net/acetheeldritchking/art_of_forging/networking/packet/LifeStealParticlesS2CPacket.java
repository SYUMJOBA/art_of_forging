package net.acetheeldritchking.art_of_forging.networking.packet;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import se.mickelus.mutil.network.AbstractPacket;

public class LifeStealParticlesS2CPacket extends AbstractPacket {
    private double xPos;
    private double yPos;
    private double zPos;

    public LifeStealParticlesS2CPacket() {
    }

    public LifeStealParticlesS2CPacket(double xPos, double yPos, double zPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
    }

    @Override
    public void toBytes(FriendlyByteBuf buf) {
        buf.writeDouble(xPos);
        buf.writeDouble(yPos);
        buf.writeDouble(zPos);
    }

    @Override
    public void fromBytes(FriendlyByteBuf buf) {
        this.xPos = buf.readDouble();
        this.yPos = buf.readDouble();
        this.zPos = buf.readDouble();
    }

    @Override
    public void handle(Player player) {
        // Runs on the client main thread (server to client)
        LifeStealPacketHandler.doLifestealParticles(this.xPos, this.yPos, this.zPos);
    }
}
