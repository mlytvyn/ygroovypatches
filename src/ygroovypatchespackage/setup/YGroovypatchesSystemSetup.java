package ygroovypatchespackage.setup;

import ygroovypatchespackage.constants.TsgroovypatchesConstants;
import com.github.mlytvyn.patches.groovy.setup.GroovyPatchesSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetupContext;

@SystemSetup(extension = YGroovypatchesConstants.EXTENSIONNAME)
public class YGroovypatchesSystemSetup extends GroovyPatchesSystemSetup {

    @SystemSetup(process = SystemSetup.Process.INIT)
    public void onInit(final SystemSetupContext context) {
        executePatches(context, "/releases/**/**/*.groovy");
    }

    @SystemSetup(process = SystemSetup.Process.UPDATE)
    public void onUpdate(final SystemSetupContext context) {
        executePatches(context, "/releases/2.0/**/*.groovy");
    }
}
