// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CrystalLinkSettleInfo.proto

package emu.grasscutter.net.proto;

public final class CrystalLinkSettleInfoOuterClass {
  private CrystalLinkSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CrystalLinkSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CrystalLinkSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 kill_elite_monster_num = 2;</code>
     * @return The killEliteMonsterNum.
     */
    int getKillEliteMonsterNum();

    /**
     * <code>uint32 final_score = 6;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_new_record = 13;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 difficulty_id = 9;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();

    /**
     * <code>uint32 kill_normal_mosnter_num = 3;</code>
     * @return The killNormalMosnterNum.
     */
    int getKillNormalMosnterNum();
  }
  /**
   * Protobuf type {@code CrystalLinkSettleInfo}
   */
  public static final class CrystalLinkSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CrystalLinkSettleInfo)
      CrystalLinkSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CrystalLinkSettleInfo.newBuilder() to construct.
    private CrystalLinkSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CrystalLinkSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CrystalLinkSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CrystalLinkSettleInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {

              killEliteMonsterNum_ = input.readUInt32();
              break;
            }
            case 24: {

              killNormalMosnterNum_ = input.readUInt32();
              break;
            }
            case 48: {

              finalScore_ = input.readUInt32();
              break;
            }
            case 72: {

              difficultyId_ = input.readUInt32();
              break;
            }
            case 96: {

              levelId_ = input.readUInt32();
              break;
            }
            case 104: {

              isNewRecord_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.class, emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.Builder.class);
    }

    public static final int KILL_ELITE_MONSTER_NUM_FIELD_NUMBER = 2;
    private int killEliteMonsterNum_;
    /**
     * <code>uint32 kill_elite_monster_num = 2;</code>
     * @return The killEliteMonsterNum.
     */
    @java.lang.Override
    public int getKillEliteMonsterNum() {
      return killEliteMonsterNum_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 6;
    private int finalScore_;
    /**
     * <code>uint32 final_score = 6;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 12;
    private int levelId_;
    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 13;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 13;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 9;
    private int difficultyId_;
    /**
     * <code>uint32 difficulty_id = 9;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
    }

    public static final int KILL_NORMAL_MOSNTER_NUM_FIELD_NUMBER = 3;
    private int killNormalMosnterNum_;
    /**
     * <code>uint32 kill_normal_mosnter_num = 3;</code>
     * @return The killNormalMosnterNum.
     */
    @java.lang.Override
    public int getKillNormalMosnterNum() {
      return killNormalMosnterNum_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (killEliteMonsterNum_ != 0) {
        output.writeUInt32(2, killEliteMonsterNum_);
      }
      if (killNormalMosnterNum_ != 0) {
        output.writeUInt32(3, killNormalMosnterNum_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(6, finalScore_);
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(9, difficultyId_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(12, levelId_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(13, isNewRecord_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (killEliteMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, killEliteMonsterNum_);
      }
      if (killNormalMosnterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, killNormalMosnterNum_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, finalScore_);
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, difficultyId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, levelId_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isNewRecord_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo other = (emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo) obj;

      if (getKillEliteMonsterNum()
          != other.getKillEliteMonsterNum()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
      if (getKillNormalMosnterNum()
          != other.getKillNormalMosnterNum()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + KILL_ELITE_MONSTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillEliteMonsterNum();
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (37 * hash) + KILL_NORMAL_MOSNTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillNormalMosnterNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CrystalLinkSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CrystalLinkSettleInfo)
        emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.class, emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        killEliteMonsterNum_ = 0;

        finalScore_ = 0;

        levelId_ = 0;

        isNewRecord_ = false;

        difficultyId_ = 0;

        killNormalMosnterNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo build() {
        emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo buildPartial() {
        emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo result = new emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo(this);
        result.killEliteMonsterNum_ = killEliteMonsterNum_;
        result.finalScore_ = finalScore_;
        result.levelId_ = levelId_;
        result.isNewRecord_ = isNewRecord_;
        result.difficultyId_ = difficultyId_;
        result.killNormalMosnterNum_ = killNormalMosnterNum_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo other) {
        if (other == emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.getDefaultInstance()) return this;
        if (other.getKillEliteMonsterNum() != 0) {
          setKillEliteMonsterNum(other.getKillEliteMonsterNum());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
        }
        if (other.getKillNormalMosnterNum() != 0) {
          setKillNormalMosnterNum(other.getKillNormalMosnterNum());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int killEliteMonsterNum_ ;
      /**
       * <code>uint32 kill_elite_monster_num = 2;</code>
       * @return The killEliteMonsterNum.
       */
      @java.lang.Override
      public int getKillEliteMonsterNum() {
        return killEliteMonsterNum_;
      }
      /**
       * <code>uint32 kill_elite_monster_num = 2;</code>
       * @param value The killEliteMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillEliteMonsterNum(int value) {
        
        killEliteMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_elite_monster_num = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillEliteMonsterNum() {
        
        killEliteMonsterNum_ = 0;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 6;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 6;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 12;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 12;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 13;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 13;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 9;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 9;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
        onChanged();
        return this;
      }

      private int killNormalMosnterNum_ ;
      /**
       * <code>uint32 kill_normal_mosnter_num = 3;</code>
       * @return The killNormalMosnterNum.
       */
      @java.lang.Override
      public int getKillNormalMosnterNum() {
        return killNormalMosnterNum_;
      }
      /**
       * <code>uint32 kill_normal_mosnter_num = 3;</code>
       * @param value The killNormalMosnterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillNormalMosnterNum(int value) {
        
        killNormalMosnterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_normal_mosnter_num = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillNormalMosnterNum() {
        
        killNormalMosnterNum_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CrystalLinkSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:CrystalLinkSettleInfo)
    private static final emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo();
    }

    public static emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CrystalLinkSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<CrystalLinkSettleInfo>() {
      @java.lang.Override
      public CrystalLinkSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CrystalLinkSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CrystalLinkSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrystalLinkSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CrystalLinkSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CrystalLinkSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033CrystalLinkSettleInfo.proto\"\255\001\n\025Crysta" +
      "lLinkSettleInfo\022\036\n\026kill_elite_monster_nu" +
      "m\030\002 \001(\r\022\023\n\013final_score\030\006 \001(\r\022\020\n\010level_id" +
      "\030\014 \001(\r\022\025\n\ris_new_record\030\r \001(\010\022\025\n\rdifficu" +
      "lty_id\030\t \001(\r\022\037\n\027kill_normal_mosnter_num\030" +
      "\003 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CrystalLinkSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CrystalLinkSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CrystalLinkSettleInfo_descriptor,
        new java.lang.String[] { "KillEliteMonsterNum", "FinalScore", "LevelId", "IsNewRecord", "DifficultyId", "KillNormalMosnterNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}