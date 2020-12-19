package net.thijnmens.enhanchedtools.procedure;

import net.thijnmens.enhanchedtools.ElementsEnhanchedTools;

import net.minecraft.entity.Entity;

@ElementsEnhanchedTools.ModElement.Tag
public class ProcedureXLIngotMobIsHitWithItem extends ElementsEnhanchedTools.ModElement {
	public ProcedureXLIngotMobIsHitWithItem(ElementsEnhanchedTools instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure XLIngotMobIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 5);
	}
}
