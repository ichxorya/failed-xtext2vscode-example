/*
 * generated by Xtext 2.29.0
 */
package uet.dsl.block.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uet.dsl.block.BlockRuntimeModule;
import uet.dsl.block.BlockStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class BlockIdeSetup extends BlockStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new BlockRuntimeModule(), new BlockIdeModule()));
	}
	
}
