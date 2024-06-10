![Grasscutter](https://socialify.git.ci/Grasscutters/Grasscutter/image?description=1&forks=1&issues=1&language=1&logo=https%3A%2F%2Fs2.loli.net%2F2022%2F04%2F25%2FxOiJn7lCdcT5Mw1.png&name=1&owner=1&pulls=1&stargazers=1&theme=Light)
<div align="center"><img alt="Documentation" src="https://img.shields.io/badge/Wiki-Grasscutter-blue?style=for-the-badge&link=https://github.com/Grasscutters/Grasscutter/wiki&link=https://github.com/Grasscutters/Grasscutter/wiki"> <img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/Grasscutters/Grasscutter?logo=java&style=for-the-badge"> <img alt="GitHub" src="https://img.shields.io/github/license/Grasscutters/Grasscutter?style=for-the-badge"> <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Grasscutters/Grasscutter?style=for-the-badge"> <img alt="GitHub Workflow Status" src="https://img.shields.io/github/actions/workflow/status/Grasscutters/Grasscutter/build.yml?branch=development&logo=github&style=for-the-badge"></div>

<div align="center"><a href="https://discord.gg/T5vZU6UyeG"><img alt="Discord - Grasscutter" src="https://img.shields.io/discord/965284035985305680?label=Discord&logo=discord&style=for-the-badge"></a></div>

[EN](README.md) | [简中](docs/README_zh-CN.md) | [繁中](docs/README_zh-TW.md) | [FR](docs/README_fr-FR.md) | [ES](docs/README_es-ES.md) | [HE](docs/README_HE.md) | [RU](docs/README_ru-RU.md) | [PL](docs/README_pl-PL.md) | [ID](docs/README_id-ID.md) | [KR](docs/README_ko-KR.md) | [FIL/PH](docs/README_fil-PH.md) | [NL](docs/README_NL.md) | [JP](docs/README_ja-JP.md) | [IT](docs/README_it-IT.md) | [VI](docs/README_vi-VN.md)

**Attention:** We always welcome contributors to the project. Before adding your contribution, please carefully read our [Code of Conduct](https://github.com/Grasscutters/Grasscutter/blob/stable/CONTRIBUTING.md).

## Current features

* Logging in
* Combat
* Friends list
* Teleportation (?)
* Gacha system (-)
* Co-op *partially* works (-)
* Spawning monsters via console
* Inventory features (receiving items/characters, upgrading items/characters, etc)

# Setup Guide

## Main Requirements

- Get [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Get [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- Get game version REL4.7.0 (If you don't have a 4.7.0 client, you can find it here and download it) :


| Download link | Package size | MD5 checksum |
| :---: | :---: | :---: |
| [GenshinImpact_4.7.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.001) | 10.0 GB | 0790ed842a1732fb9e5530a826828440 |
| [GenshinImpact_4.7.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.002) | 10.0 GB | 6ac391b6a3a185bc8ab1e431f67ecd25 |
| [GenshinImpact_4.7.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.003) | 10.0 GB | 36460a467de4901f517f8ed9be6b877c |
| [GenshinImpact_4.7.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.004) | 10.0 GB | d1c0d81ab7aff5d5fb490cff20b9b87f |
| [GenshinImpact_4.7.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.005) | 10.0 GB | fec57d6f7f78c04309f16dfc2207cd6f |
| [GenshinImpact_4.7.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.006) | 10.0 GB | 84135fa7008156965514a6ec99c55c66 |


- Find the patch from somewhere on the internet.
- Put the `version.dll` in to the folder of your game client.
- Download the old version of [mihoyonet.dll](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20231030132335_iOEfPMcbrXpiA8Ca/ScatteredFiles/GenshinImpact_Data/Plugins/mihoyonet.dll) (4.2.0).
- Put the old version of `mihoyonet.dll` in `GenshinImpact_Data/Plugins` folder.

## Let's build the server

### 1. Clone the repository

```shell
git clone --recurse-submodules https://github.com/XeonSucksLAB/UnknownAnimeGamePS.git
cd UnknownAnimeGamePS
```

**Curiosity**: Grasscutter uses Gradle to handle dependencies and building.

### 2. Compile the actual Server

**Sidenote**: Make sure to append the right prefix and suffix based on your operating system (./ for linux | .\ for windows | add .bat for windows systems when compiling server JAR/handbook).

**Requirements**:

[Java Development Kit 17 | JDK](https://oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher

[Git](https://git-scm.com/downloads)

- **Sidenote**: Handbook generation may fail on some systems. To disable handbook generation, append `-PskipHandbook=1` to the `gradlew jar` command.

- **For Windows**:
```shell
.\gradlew.bat
.\gradlew.bat jar
```
*If you are wondering, the first command is to set up the environment while the 2nd one is for building the server JAR file.*

- **For Linux**:
```bash
chmod +x gradlew
./gradlew jar
```
*If you are wondering, the first command is to make the file executeable and for the rest refer to the windows explanation.*

### You can find the output JAR in the project root folder.

### Manually compile the handbook
```shell
./gradlew generateHandbook
```


## You're done with the building part!

- Launch the server.
- Launch the client and login.

- Enjoy!

### Troubleshooting

TO DO
