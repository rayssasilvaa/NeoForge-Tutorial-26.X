package net.yssa.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yssa.tutorialmod.TutorialMod;

public class ModItems {

    //Lista de itens que sera registrada no MOD_ID
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

    public static final DeferredItem<Item> AKIRA = ITEMS.registerSimpleItem("akira");
    public static final DeferredItem<Item> RAW_AKIRA = ITEMS.registerSimpleItem("raw_akira");

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

}
