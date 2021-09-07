// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.block.server._generated.proto.hello;

/**
 * Protobuf type {@code MultiplyRequest}
 */
public final class MultiplyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MultiplyRequest)
    MultiplyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiplyRequest.newBuilder() to construct.
  private MultiplyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiplyRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiplyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiplyRequest(
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
          case 8: {

            numOne_ = input.readInt32();
            break;
          }
          case 16: {

            numTwo_ = input.readInt32();
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
    return com.block.server._generated.proto.hello.Helloworld.internal_static_MultiplyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.block.server._generated.proto.hello.Helloworld.internal_static_MultiplyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.block.server._generated.proto.hello.MultiplyRequest.class, com.block.server._generated.proto.hello.MultiplyRequest.Builder.class);
  }

  public static final int NUMONE_FIELD_NUMBER = 1;
  private int numOne_;
  /**
   * <code>int32 numOne = 1;</code>
   * @return The numOne.
   */
  @java.lang.Override
  public int getNumOne() {
    return numOne_;
  }

  public static final int NUMTWO_FIELD_NUMBER = 2;
  private int numTwo_;
  /**
   * <code>int32 numTwo = 2;</code>
   * @return The numTwo.
   */
  @java.lang.Override
  public int getNumTwo() {
    return numTwo_;
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
    if (numOne_ != 0) {
      output.writeInt32(1, numOne_);
    }
    if (numTwo_ != 0) {
      output.writeInt32(2, numTwo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numOne_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, numOne_);
    }
    if (numTwo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, numTwo_);
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
    if (!(obj instanceof com.block.server._generated.proto.hello.MultiplyRequest)) {
      return super.equals(obj);
    }
    com.block.server._generated.proto.hello.MultiplyRequest other = (com.block.server._generated.proto.hello.MultiplyRequest) obj;

    if (getNumOne()
        != other.getNumOne()) return false;
    if (getNumTwo()
        != other.getNumTwo()) return false;
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
    hash = (37 * hash) + NUMONE_FIELD_NUMBER;
    hash = (53 * hash) + getNumOne();
    hash = (37 * hash) + NUMTWO_FIELD_NUMBER;
    hash = (53 * hash) + getNumTwo();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.block.server._generated.proto.hello.MultiplyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.block.server._generated.proto.hello.MultiplyRequest parseFrom(
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
  public static Builder newBuilder(com.block.server._generated.proto.hello.MultiplyRequest prototype) {
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
   * Protobuf type {@code MultiplyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MultiplyRequest)
      com.block.server._generated.proto.hello.MultiplyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.block.server._generated.proto.hello.Helloworld.internal_static_MultiplyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.block.server._generated.proto.hello.Helloworld.internal_static_MultiplyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.block.server._generated.proto.hello.MultiplyRequest.class, com.block.server._generated.proto.hello.MultiplyRequest.Builder.class);
    }

    // Construct using com.block.server._generated.proto.hello.MultiplyRequest.newBuilder()
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
      numOne_ = 0;

      numTwo_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.block.server._generated.proto.hello.Helloworld.internal_static_MultiplyRequest_descriptor;
    }

    @java.lang.Override
    public com.block.server._generated.proto.hello.MultiplyRequest getDefaultInstanceForType() {
      return com.block.server._generated.proto.hello.MultiplyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.block.server._generated.proto.hello.MultiplyRequest build() {
      com.block.server._generated.proto.hello.MultiplyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.block.server._generated.proto.hello.MultiplyRequest buildPartial() {
      com.block.server._generated.proto.hello.MultiplyRequest result = new com.block.server._generated.proto.hello.MultiplyRequest(this);
      result.numOne_ = numOne_;
      result.numTwo_ = numTwo_;
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
      if (other instanceof com.block.server._generated.proto.hello.MultiplyRequest) {
        return mergeFrom((com.block.server._generated.proto.hello.MultiplyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.block.server._generated.proto.hello.MultiplyRequest other) {
      if (other == com.block.server._generated.proto.hello.MultiplyRequest.getDefaultInstance()) return this;
      if (other.getNumOne() != 0) {
        setNumOne(other.getNumOne());
      }
      if (other.getNumTwo() != 0) {
        setNumTwo(other.getNumTwo());
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
      com.block.server._generated.proto.hello.MultiplyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.block.server._generated.proto.hello.MultiplyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int numOne_ ;
    /**
     * <code>int32 numOne = 1;</code>
     * @return The numOne.
     */
    @java.lang.Override
    public int getNumOne() {
      return numOne_;
    }
    /**
     * <code>int32 numOne = 1;</code>
     * @param value The numOne to set.
     * @return This builder for chaining.
     */
    public Builder setNumOne(int value) {
      
      numOne_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numOne = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumOne() {
      
      numOne_ = 0;
      onChanged();
      return this;
    }

    private int numTwo_ ;
    /**
     * <code>int32 numTwo = 2;</code>
     * @return The numTwo.
     */
    @java.lang.Override
    public int getNumTwo() {
      return numTwo_;
    }
    /**
     * <code>int32 numTwo = 2;</code>
     * @param value The numTwo to set.
     * @return This builder for chaining.
     */
    public Builder setNumTwo(int value) {
      
      numTwo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numTwo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumTwo() {
      
      numTwo_ = 0;
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


    // @@protoc_insertion_point(builder_scope:MultiplyRequest)
  }

  // @@protoc_insertion_point(class_scope:MultiplyRequest)
  private static final com.block.server._generated.proto.hello.MultiplyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.block.server._generated.proto.hello.MultiplyRequest();
  }

  public static com.block.server._generated.proto.hello.MultiplyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiplyRequest>
      PARSER = new com.google.protobuf.AbstractParser<MultiplyRequest>() {
    @java.lang.Override
    public MultiplyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiplyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiplyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiplyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.block.server._generated.proto.hello.MultiplyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

