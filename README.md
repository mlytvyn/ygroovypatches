Template for Groovy-based patching framework for SAP Commerce Cloud (Hybris)
=====================

# How to use

* Checkout core extension `groovypatches` into the custom folder of the Project, https://github.com/mlytvyn/groovypatches 
* Checkout `ygroovypatches` template extension
* Temporary declare dependency on `ygroovypatches` in the `localextensions.xml`
* Create new extension from the `ygroovypatches` template extension

```
ant extgen -Dtemplate=ygroovypatches
```
* Replace `ygroovypatches` dependency with newly created extension name
* Customize generated `GroovyPatchesSystemSetup` with suitable `INIT` and `UPDATE` patterns for patches
* Extend and customize beans declared in the `groovypatches-beans.xml`, provide required properties for each new bean value
* Customize generated `<?>GroovypatchesCurrentEnvironmentProvider`, responsible for target environment detection