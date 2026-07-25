package net.acetheeldritchking.art_of_forging.item.modular;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import se.mickelus.tetra.gui.GuiModuleOffsets;
import se.mickelus.tetra.items.modular.ModularItem;
import top.theillusivec4.curios.api.type.capability.ICurio;

public class ModularArtifact extends ModularItem implements ICurio {
    public final static String artifactCasing = "artifact/casing";
    public final static String artifactInternal = "artifact/internal";

    public final static String artifactAttachment = "artifact/attachment";

    public static final String identifier = "modular_artifact";

    private static final GuiModuleOffsets majorOffsets = new GuiModuleOffsets(-13, -1, 3, 19);
    private static final GuiModuleOffsets minorOffsets = new GuiModuleOffsets(6, 1);

    public ModularArtifact() {
        super(new Item.Properties().stacksTo(1).fireResistant());

        canHone = false;

        majorModuleKeys = new String[]{artifactCasing, artifactInternal};
        minorModuleKeys = new String[]{artifactAttachment};

        requiredModules = new String[]{artifactCasing, artifactInternal};

        // The remove schematic is registered globally by Tetra (SchematicRegistry) on 1.21,
        // so it no longer needs to be registered per-item here.
    }

    // getAllModules is inherited from IModularItem's default implementation, which reads
    // the module keys from the stack's data components on 1.21.

    @Override
    @OnlyIn(Dist.CLIENT)
    public GuiModuleOffsets getMajorGuiOffsets(ItemStack itemStack) {
        return majorOffsets;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GuiModuleOffsets getMinorGuiOffsets(ItemStack itemStack) {
        return minorOffsets;
    }

    @Override
    public ItemStack getStack() {
        return null;
    }
}
