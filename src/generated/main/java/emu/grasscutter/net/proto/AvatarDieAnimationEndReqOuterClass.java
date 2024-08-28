// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarDieAnimationEndReq.proto

package emu.grasscutter.net.proto;

public final class AvatarDieAnimationEndReqOuterClass {
  private AvatarDieAnimationEndReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarDieAnimationEndReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarDieAnimationEndReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector reborn_pos = 13;</code>
     * @return Whether the rebornPos field is set.
     */
    boolean hasRebornPos();
    /**
     * <code>.Vector reborn_pos = 13;</code>
     * @return The rebornPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getRebornPos();
    /**
     * <code>.Vector reborn_pos = 13;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder();

    /**
     * <code>uint64 die_guid = 12;</code>
     * @return The dieGuid.
     */
    long getDieGuid();

    /**
     * <code>uint32 skill_id = 7;</code>
     * @return The skillId.
     */
    int getSkillId();
  }
  /**
   * <pre>
   * CmdId: 943
   * </pre>
   *
   * Protobuf type {@code AvatarDieAnimationEndReq}
   */
  public static final class AvatarDieAnimationEndReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarDieAnimationEndReq)
      AvatarDieAnimationEndReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarDieAnimationEndReq.newBuilder() to construct.
    private AvatarDieAnimationEndReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarDieAnimationEndReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarDieAnimationEndReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarDieAnimationEndReq(
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
            case 56: {

              skillId_ = input.readUInt32();
              break;
            }
            case 96: {

              dieGuid_ = input.readUInt64();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (rebornPos_ != null) {
                subBuilder = rebornPos_.toBuilder();
              }
              rebornPos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rebornPos_);
                rebornPos_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.class, emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.Builder.class);
    }

    public static final int REBORN_POS_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector rebornPos_;
    /**
     * <code>.Vector reborn_pos = 13;</code>
     * @return Whether the rebornPos field is set.
     */
    @java.lang.Override
    public boolean hasRebornPos() {
      return rebornPos_ != null;
    }
    /**
     * <code>.Vector reborn_pos = 13;</code>
     * @return The rebornPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getRebornPos() {
      return rebornPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rebornPos_;
    }
    /**
     * <code>.Vector reborn_pos = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder() {
      return getRebornPos();
    }

    public static final int DIE_GUID_FIELD_NUMBER = 12;
    private long dieGuid_;
    /**
     * <code>uint64 die_guid = 12;</code>
     * @return The dieGuid.
     */
    @java.lang.Override
    public long getDieGuid() {
      return dieGuid_;
    }

    public static final int SKILL_ID_FIELD_NUMBER = 7;
    private int skillId_;
    /**
     * <code>uint32 skill_id = 7;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
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
      if (skillId_ != 0) {
        output.writeUInt32(7, skillId_);
      }
      if (dieGuid_ != 0L) {
        output.writeUInt64(12, dieGuid_);
      }
      if (rebornPos_ != null) {
        output.writeMessage(13, getRebornPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, skillId_);
      }
      if (dieGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, dieGuid_);
      }
      if (rebornPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getRebornPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq other = (emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq) obj;

      if (hasRebornPos() != other.hasRebornPos()) return false;
      if (hasRebornPos()) {
        if (!getRebornPos()
            .equals(other.getRebornPos())) return false;
      }
      if (getDieGuid()
          != other.getDieGuid()) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
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
      if (hasRebornPos()) {
        hash = (37 * hash) + REBORN_POS_FIELD_NUMBER;
        hash = (53 * hash) + getRebornPos().hashCode();
      }
      hash = (37 * hash) + DIE_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDieGuid());
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq prototype) {
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
     * <pre>
     * CmdId: 943
     * </pre>
     *
     * Protobuf type {@code AvatarDieAnimationEndReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarDieAnimationEndReq)
        emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.class, emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.newBuilder()
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
        if (rebornPosBuilder_ == null) {
          rebornPos_ = null;
        } else {
          rebornPos_ = null;
          rebornPosBuilder_ = null;
        }
        dieGuid_ = 0L;

        skillId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq build() {
        emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq buildPartial() {
        emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq result = new emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq(this);
        if (rebornPosBuilder_ == null) {
          result.rebornPos_ = rebornPos_;
        } else {
          result.rebornPos_ = rebornPosBuilder_.build();
        }
        result.dieGuid_ = dieGuid_;
        result.skillId_ = skillId_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq other) {
        if (other == emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.getDefaultInstance()) return this;
        if (other.hasRebornPos()) {
          mergeRebornPos(other.getRebornPos());
        }
        if (other.getDieGuid() != 0L) {
          setDieGuid(other.getDieGuid());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
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
        emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector rebornPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> rebornPosBuilder_;
      /**
       * <code>.Vector reborn_pos = 13;</code>
       * @return Whether the rebornPos field is set.
       */
      public boolean hasRebornPos() {
        return rebornPosBuilder_ != null || rebornPos_ != null;
      }
      /**
       * <code>.Vector reborn_pos = 13;</code>
       * @return The rebornPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getRebornPos() {
        if (rebornPosBuilder_ == null) {
          return rebornPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rebornPos_;
        } else {
          return rebornPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector reborn_pos = 13;</code>
       */
      public Builder setRebornPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rebornPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rebornPos_ = value;
          onChanged();
        } else {
          rebornPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector reborn_pos = 13;</code>
       */
      public Builder setRebornPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rebornPosBuilder_ == null) {
          rebornPos_ = builderForValue.build();
          onChanged();
        } else {
          rebornPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector reborn_pos = 13;</code>
       */
      public Builder mergeRebornPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rebornPosBuilder_ == null) {
          if (rebornPos_ != null) {
            rebornPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(rebornPos_).mergeFrom(value).buildPartial();
          } else {
            rebornPos_ = value;
          }
          onChanged();
        } else {
          rebornPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector reborn_pos = 13;</code>
       */
      public Builder clearRebornPos() {
        if (rebornPosBuilder_ == null) {
          rebornPos_ = null;
          onChanged();
        } else {
          rebornPos_ = null;
          rebornPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector reborn_pos = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getRebornPosBuilder() {
        
        onChanged();
        return getRebornPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector reborn_pos = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder() {
        if (rebornPosBuilder_ != null) {
          return rebornPosBuilder_.getMessageOrBuilder();
        } else {
          return rebornPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rebornPos_;
        }
      }
      /**
       * <code>.Vector reborn_pos = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getRebornPosFieldBuilder() {
        if (rebornPosBuilder_ == null) {
          rebornPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getRebornPos(),
                  getParentForChildren(),
                  isClean());
          rebornPos_ = null;
        }
        return rebornPosBuilder_;
      }

      private long dieGuid_ ;
      /**
       * <code>uint64 die_guid = 12;</code>
       * @return The dieGuid.
       */
      @java.lang.Override
      public long getDieGuid() {
        return dieGuid_;
      }
      /**
       * <code>uint64 die_guid = 12;</code>
       * @param value The dieGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDieGuid(long value) {
        
        dieGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 die_guid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDieGuid() {
        
        dieGuid_ = 0L;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 7;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 7;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarDieAnimationEndReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarDieAnimationEndReq)
    private static final emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq();
    }

    public static emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarDieAnimationEndReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarDieAnimationEndReq>() {
      @java.lang.Override
      public AvatarDieAnimationEndReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarDieAnimationEndReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarDieAnimationEndReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarDieAnimationEndReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarDieAnimationEndReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarDieAnimationEndReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AvatarDieAnimationEndReq.proto\032\014Vector" +
      ".proto\"[\n\030AvatarDieAnimationEndReq\022\033\n\nre" +
      "born_pos\030\r \001(\0132\007.Vector\022\020\n\010die_guid\030\014 \001(" +
      "\004\022\020\n\010skill_id\030\007 \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_AvatarDieAnimationEndReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarDieAnimationEndReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarDieAnimationEndReq_descriptor,
        new java.lang.String[] { "RebornPos", "DieGuid", "SkillId", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
