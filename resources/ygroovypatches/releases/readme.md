Place all Patches in this folder. Patterns specified in the custom `GroovyPatchesSystemSetup` will be used during evaluation of the suitable for execution groovy-based patches.

Sample import patterns:

```
INIT: "/releases/**/**/*.groovy"
UPDATE: "/releases/2.0/**/*.groovy"
```

Sample folder structure:

```
1.0/20220125/0001_HYB-1.groovy
1.0/20220125/0002_HYB-2.groovy
1.0/20230510/0001_HYB-23.groovy
2.0/20230510/0001_HYB-23.groovy
```