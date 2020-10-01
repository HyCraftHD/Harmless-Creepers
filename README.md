# Hharmless-Creepers

[
![Curseforge Downloads](http://cf.way2muchnoise.eu/harmless-creepers.svg)
![Curseforge Versions](http://cf.way2muchnoise.eu/versions/harmless-creepers.svg)
](https://www.curseforge.com/minecraft/mc-mods/harmless-creepers)
[
![Discord](https://img.shields.io/discord/297104769649213441?label=Discord)
](https://discordapp.com/invite/QXbWS36)

### This mod adds a command to disable creeper explosion block damage.

- Download on [curseforge](https://www.curseforge.com/minecraft/mc-mods/harmless-creepers).  
- Find more information on our [website](https://u-team.info/mods/harmlesscreepers).
- Updates can be found in the [changelog](CHANGELOG.md).

### How to build this mod

#### Setup Eclipse
- ``./gradlew genEclipseRuns eclipse``
- Import project as existing workspace

#### Setup IntelliJ IDEA
- ``./gradlew genIntellijRuns``
- Import as gradle project

#### Build
- ``./gradlew build``

### How to include this mod

- Repository: [repo.u-team.info](https://repo.u-team.info)
- Artifact: **info.u-team:harmless_creepers-${config.forge.mcversion}:${config.harmlesscreepers.version}** 
- *{config.forge.mcversion}* is the minecraft version.
- *{config.harmlesscreepers.version}* is the harmlesscreepers version.

#### Using in Forge Gradle 3:
```gradle
repositories {
    maven { url = "https://repo.u-team.info" }
}

dependencies {
  compileOnly fg.deobf("info.u-team:harmless_creepers-${config.forge.mcversion}:${config.harmlesscreepers.version}")
}
```

### License

- This mod is licensed under apache 2 license. For more information see [here](LICENSE).  
- This mod can be packed in any curseforge modpack you like.

### Issues

- Please report issues to the [github issues](../../issues).
- Include your minecraft version, forge version and mod version.
- Upload your log on [gist](https://gist.github.com) or [pastebin](https://pastebin.com) and include link in your report.
