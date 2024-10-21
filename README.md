# UnknownAnimeGamePS
- Contributors are always welcome
- Updated to 5.0

English | [简体中文](README_zh-CN.md)

## Current features


* Logging in
* Combat
* Friends list
* Teleportation
* Gacha system
* Activity (-)
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
| [GenshinImpact_5.1.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.001) | 10.0 GB | 20.0 GB | cbe2934260fda10ab8cdaca80ef69cb3 |
| [GenshinImpact_5.1.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.002) | 10.0 GB | 20.0 GB | df706bb5e83dde4d3df7276a1210a8fb |
| [GenshinImpact_5.1.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.003) | 10.0 GB | 20.0 GB | dd7062a4abde83f02f184fe081eb2006 |
| [GenshinImpact_5.1.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.004) | 10.0 GB | 20.0 GB | bd2ffa879db43c05f88f7f1235f50df8 |
| [GenshinImpact_5.1.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.005) | 10.0 GB | 20.0 GB | e3beb938f521be5a74431716394baee3 |
| [GenshinImpact_5.1.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.006) | 10.0 GB | 20.0 GB | f59a086e986cce9f9e98e2d3c44212c8 |
| [GenshinImpact_5.1.0.zip.007](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.007) | 5.94 GB | 11.89 GB | 0e165aec640ca7025f9d52b0f53a4223 |
| [Audio_Chinese_.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/Audio_Chinese_5.1.0.zip) | 13.09 GB | 26.19 GB | 216b3e53f3c5c7e1290891696b2bbc66 |
| [Audio_English(US)_5.1.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/Audio_English(US)_5.1.0.zip) | 15.09 GB | 30.20 GB | ecd59f31ec48c50f9051fdad39603d67 |
| [Audio_Korean_5.1.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/Audio_Korean_5.1.0.zip) | 12.84 GB | 25.68 GB | 8bf09bd07413189b69a5a0512df97335 |
| [Audio_Japanese_5.1.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/Audio_Japanese_5.1.0.zip) | 17.00 GB | 34.01 GB | 95efbd23e1bde2eb574f8090cc118109 |

- Or get the 5.0.0 -> 5.1.0 hdiffs:


| Download link | Package size | Decompressed package size | MD5 checksum |
| :---: | :---: | :---: | :---: |
| [game_5.0.0_5.1.0_hdiff_YqcpfTRBIuOIwHrO.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/game_5.0.0_5.1.0_hdiff_YqcpfTRBIuOIwHrO.zip) | 18.00 GB | 36.67 | 3d628fcde7aaf5b242e253188885ef8d |
| [audio_ko-kr_5.0.0_5.1.0_hdiff_PumQPsFuEgvDnZyX.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ko-kr_5.0.0_5.1.0_hdiff_PumQPsFuEgvDnZyX.zip) |0.51 GB | 1.12 GB | 0d77474fe49e46cdfc20298034501019 |
| [audio_en-us_5.0.0_5.1.0_hdiff_jRxUUsOrikPdkOPL.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_en-us_5.0.0_5.1.0_hdiff_jRxUUsOrikPdkOPL.zip) | 0.51 GB | 1.11 GB | 501590a0aa8a67e0101e827be5c16cef |
| [audio_ja-jp_5.0.0_5.1.0_hdiff_cSIWEmsNoqluMIrF.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ja-jp_5.0.0_5.1.0_hdiff_cSIWEmsNoqluMIrF.zip) | 0.54 GB | 1.35 GB | de00c4d5d02dead7b8e80c68ab57db17 |
| [audio_zh-cn_5.0.0_5.1.0_hdiff_bktSOAPsrWSJHOII.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_zh-cn_5.0.0_5.1.0_hdiff_bktSOAPsrWSJHOII.zip) | 0.74 GB | 1.17 GB | 1e988fbd3a6854e885564e3cca56fb65 |


- Download the patch from [here](https://watchandy.me/5.0.0/version.dll).
- Put the `version.dll` in to the folder of your game client.

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

### Resources credit
- Dimbreath | AnimeGameData (BinOutput, ExcelBinOutput, TextMap) - https://github.com/DimbreathBot/AnimeGameData
- Hiro420 | GS_Lua (Scripts) - https://github.com/Hiro420/GS_Lua/tree/5.0.0
- YuukiPS | GC-Resources (ScriptSceneData, Server) - https://gitlab.com/YuukiPS/GC-Resources
