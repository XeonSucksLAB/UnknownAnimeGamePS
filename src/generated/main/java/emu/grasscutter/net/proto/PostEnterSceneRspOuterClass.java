// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostEnterSceneRsp.proto

package emu.grasscutter.net.proto;

public final class PostEnterSceneRspOuterClass {
  private PostEnterSceneRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PostEnterSceneRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PostEnterSceneRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 enter_scene_token = 8;</code>
     * @return The enterSceneToken.
     */
    int getEnterSceneToken();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 22743
   * </pre>
   *
   * Protobuf type {@code PostEnterSceneRsp}
   */
  public static final class PostEnterSceneRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PostEnterSceneRsp)
      PostEnterSceneRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PostEnterSceneRsp.newBuilder() to construct.
    private PostEnterSceneRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PostEnterSceneRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PostEnterSceneRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PostEnterSceneRsp(
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
            case 64: {

              enterSceneToken_ = input.readUInt32();
              break;
            }
            case 104: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.internal_static_PostEnterSceneRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.internal_static_PostEnterSceneRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp.class, emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp.Builder.class);
    }

    public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 8;
    private int enterSceneToken_;
    /**
     * <code>uint32 enter_scene_token = 8;</code>
     * @return The enterSceneToken.
     */
    @java.lang.Override
    public int getEnterSceneToken() {
      return enterSceneToken_;
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (enterSceneToken_ != 0) {
        output.writeUInt32(8, enterSceneToken_);
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (enterSceneToken_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, enterSceneToken_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp other = (emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp) obj;

      if (getEnterSceneToken()
          != other.getEnterSceneToken()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + ENTER_SCENE_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getEnterSceneToken();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp prototype) {
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
     * CmdId: 22743
     * </pre>
     *
     * Protobuf type {@code PostEnterSceneRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PostEnterSceneRsp)
        emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.internal_static_PostEnterSceneRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.internal_static_PostEnterSceneRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp.class, emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp.newBuilder()
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
        enterSceneToken_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.internal_static_PostEnterSceneRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp build() {
        emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp buildPartial() {
        emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp result = new emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp(this);
        result.enterSceneToken_ = enterSceneToken_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp other) {
        if (other == emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp.getDefaultInstance()) return this;
        if (other.getEnterSceneToken() != 0) {
          setEnterSceneToken(other.getEnterSceneToken());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int enterSceneToken_ ;
      /**
       * <code>uint32 enter_scene_token = 8;</code>
       * @return The enterSceneToken.
       */
      @java.lang.Override
      public int getEnterSceneToken() {
        return enterSceneToken_;
      }
      /**
       * <code>uint32 enter_scene_token = 8;</code>
       * @param value The enterSceneToken to set.
       * @return This builder for chaining.
       */
      public Builder setEnterSceneToken(int value) {
        
        enterSceneToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 enter_scene_token = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterSceneToken() {
        
        enterSceneToken_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PostEnterSceneRsp)
    }

    // @@protoc_insertion_point(class_scope:PostEnterSceneRsp)
    private static final emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp();
    }

    public static emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PostEnterSceneRsp>
        PARSER = new com.google.protobuf.AbstractParser<PostEnterSceneRsp>() {
      @java.lang.Override
      public PostEnterSceneRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PostEnterSceneRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PostEnterSceneRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PostEnterSceneRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostEnterSceneRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostEnterSceneRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PostEnterSceneRsp.proto\"?\n\021PostEnterSc" +
      "eneRsp\022\031\n\021enter_scene_token\030\010 \001(\r\022\017\n\007ret" +
      "code\030\r \001(\005B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PostEnterSceneRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PostEnterSceneRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostEnterSceneRsp_descriptor,
        new java.lang.String[] { "EnterSceneToken", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
