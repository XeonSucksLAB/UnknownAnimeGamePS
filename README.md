# UnknownAnimeGamePS
- Contributors are always welcome
- Updated to 5.0

English | [简体中文](README_zh-cn.md)

## Current features


* Logging in
* Combat
* Friends list
* Teleportation
* Gacha system
* Co-op *partially* works (-)
* Spawning monsters via console
* Inventory features (receiving items/characters, upgrading items/characters, etc)
* Teapot

# Star History Chart
[![Star History Chart](https://api.star-history.com/svg?repos=XeonSucksLAB/UnknownAnimeGamePS&type=Date)](https://star-history.com/#XeonSucksLAB/UnknownAnimeGamePS&Date)

# Setup Guide

## Main Requirements

- Get [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Get [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- Get game version REL5.0.0 (If you don't have a 5.0.0 client, you can find it here and download it) :


| Download link | Package size | Decompressed package size | MD5 checksum |
| :---: | :---: | :---: | :---: |
| [GenshinImpact_5.0.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.001) | 10.0 GB | 20.0 GB | 1ebf5dbcbe43bebcda7a57a8d789092e |
| [GenshinImpact_5.0.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.002) | 10.0 GB | 20.0 GB | 57a67026c45d57c28e5b52e24e84cc04 |
| [GenshinImpact_5.0.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.003) | 10.0 GB | 20.0 GB | 5e66ff28eaf6ba89e49f153c0f077d34 |
| [GenshinImpact_5.0.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.004) | 10.0 GB | 20.0 GB | 39f014a760e27f77abed1989739c74c6 |
| [GenshinImpact_5.0.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.005) | 10.0 GB | 20.0 GB | 15f9405a199afba833f18fce288b9c7f |
| [GenshinImpact_5.0.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.006) | 10.0 GB | 20.0 GB | 881432ceab27987b1297c9eefb39f192 |
| [GenshinImpact_5.0.0.zip.007](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.007) | 3.78 GB | 7.57 GB | 951f91992b428385294baf9b6c764d49 |
| [Audio_Chinese_5.0.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/Audio_Chinese_5.0.0.zip) | 14.77 GB | 29.56 GB | 216b3e53f3c5c7e1290891696b2bbc66 |
| [Audio_English(US)_5.0.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/Audio_English(US)_5.0.0.zip) | 17.23 GB | 34.47 GB | ecd59f31ec48c50f9051fdad39603d67 |
| [Audio_Korean_5.0.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/Audio_Korean_5.0.0.zip) | 14.51 GB | 29.04 GB | 8bf09bd07413189b69a5a0512df97335 |
| [Audio_Japanese_5.0.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/Audio_Japanese_5.0.0.zip) | 19.37 GB | 38.76 GB | 95efbd23e1bde2eb574f8090cc118109 |

- Or get the 4.8.0 -> 5.0.0 hdiffs:


| Download link | Package size | Decompressed package size | MD5 checksum |
| :---: | :---: | :---: | :---: |
| [game_4.8.0_5.0.0_hdiff_wZvKsUhQtnBEutrh.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/game_4.8.0_5.0.0_hdiff_wZvKsUhQtnBEutrh.zip) | 19.52 GB | 39.86 | ec0cc740e01c374cd53d48219c1a4aff |
| [audio_ko-kr_4.8.0_5.0.0_hdiff_gTmBNUAGPpXxrRKC.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ko-kr_4.8.0_5.0.0_hdiff_gTmBNUAGPpXxrRKC.zip) | 0.60 GB | 1.31 GB | 64c52d4065a5d5983b37faeb9796a3eb |
| [audio_ja-jp_4.8.0_5.0.0_hdiff_LumPhRraNOjGJMnG.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ja-jp_4.8.0_5.0.0_hdiff_LumPhRraNOjGJMnG.zip) | 0.71 GB | 1.63 GB | 934899593f7234bec937fca98c0b0bed |
| [audio_zh-cn_4.8.0_5.0.0_hdiff_ZZiDHvYQeHGKuFeP.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_zh-cn_4.8.0_5.0.0_hdiff_ZZiDHvYQeHGKuFeP.zip) | 0.62 GB | 1.35 GB | c1073373d6c7b3680217335dc346de50 |
| [audio_en-us_4.8.0_5.0.0_hdiff_vsfAECOkroqoZSqK.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_en-us_4.8.0_5.0.0_hdiff_vsfAECOkroqoZSqK.zip) | 0.74 GB | 1.58 GB | b5cb77749a0e2fc0e85b6b1ee319a7e9 |


- Download the patch from here. [OSREL (Oversea Ver.)](https://watchandy.me/version.dll) [CNREL (China Ver.)](https://watchandy.me/cn/version.dll)
- Put the `version.dll` in to the folder of your game client.
- Download the old version of [mihoyonet.dll](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20231030132335_iOEfPMcbrXpiA8Ca/ScatteredFiles/GenshinImpact_Data/Plugins/mihoyonet.dll) (4.2.0).
- Put the old version of `mihoyonet.dll` in `GenshinImpact_Data/Plugins` folder.

### Notice

In the 5.0 version of UnknownAnimeGamePS Grasscutter fork, I've added an option called "useXorEncryption" in config.json, which is disabled by default. If the option is enabled, you won't be able to enter the game using the patch provided above, you will have to use a patch which patches the client's RSA key. Due to my skill issue, I am not able to provide a better patch for PC environment. If you have a better patch, please in contact with me on Discord (@watchandytw), thanks.

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
- Fiddler or any proxy is required.

