// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: interview_scheduling.proto

// Protobuf Java Version: 3.25.1
package com.recruitment.grpc.interview;

/**
 * Protobuf type {@code AvailabilityRequest}
 */
public final class AvailabilityRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AvailabilityRequest)
    AvailabilityRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AvailabilityRequest.newBuilder() to construct.
  private AvailabilityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AvailabilityRequest() {
    userId_ = "";
    role_ = "";
    availableTimes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AvailabilityRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.recruitment.grpc.interview.InterviewSchedulingProto.internal_static_AvailabilityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.recruitment.grpc.interview.InterviewSchedulingProto.internal_static_AvailabilityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.recruitment.grpc.interview.AvailabilityRequest.class, com.recruitment.grpc.interview.AvailabilityRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object role_ = "";
  /**
   * <pre>
   * candidate or interviewer
   * </pre>
   *
   * <code>string role = 2;</code>
   * @return The role.
   */
  @java.lang.Override
  public java.lang.String getRole() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      role_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * candidate or interviewer
   * </pre>
   *
   * <code>string role = 2;</code>
   * @return The bytes for role.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRoleBytes() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      role_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AVAILABLE_TIMES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList availableTimes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * ISO-8601 strings
   * </pre>
   *
   * <code>repeated string available_times = 3;</code>
   * @return A list containing the availableTimes.
   */
  public com.google.protobuf.ProtocolStringList
      getAvailableTimesList() {
    return availableTimes_;
  }
  /**
   * <pre>
   * ISO-8601 strings
   * </pre>
   *
   * <code>repeated string available_times = 3;</code>
   * @return The count of availableTimes.
   */
  public int getAvailableTimesCount() {
    return availableTimes_.size();
  }
  /**
   * <pre>
   * ISO-8601 strings
   * </pre>
   *
   * <code>repeated string available_times = 3;</code>
   * @param index The index of the element to return.
   * @return The availableTimes at the given index.
   */
  public java.lang.String getAvailableTimes(int index) {
    return availableTimes_.get(index);
  }
  /**
   * <pre>
   * ISO-8601 strings
   * </pre>
   *
   * <code>repeated string available_times = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the availableTimes at the given index.
   */
  public com.google.protobuf.ByteString
      getAvailableTimesBytes(int index) {
    return availableTimes_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, role_);
    }
    for (int i = 0; i < availableTimes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, availableTimes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, role_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < availableTimes_.size(); i++) {
        dataSize += computeStringSizeNoTag(availableTimes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAvailableTimesList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.recruitment.grpc.interview.AvailabilityRequest)) {
      return super.equals(obj);
    }
    com.recruitment.grpc.interview.AvailabilityRequest other = (com.recruitment.grpc.interview.AvailabilityRequest) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getRole()
        .equals(other.getRole())) return false;
    if (!getAvailableTimesList()
        .equals(other.getAvailableTimesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + getRole().hashCode();
    if (getAvailableTimesCount() > 0) {
      hash = (37 * hash) + AVAILABLE_TIMES_FIELD_NUMBER;
      hash = (53 * hash) + getAvailableTimesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.recruitment.grpc.interview.AvailabilityRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.recruitment.grpc.interview.AvailabilityRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.recruitment.grpc.interview.AvailabilityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.recruitment.grpc.interview.AvailabilityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.recruitment.grpc.interview.AvailabilityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.recruitment.grpc.interview.AvailabilityRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.recruitment.grpc.interview.AvailabilityRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.recruitment.grpc.interview.AvailabilityRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.recruitment.grpc.interview.AvailabilityRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.recruitment.grpc.interview.AvailabilityRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.recruitment.grpc.interview.AvailabilityRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.recruitment.grpc.interview.AvailabilityRequest parseFrom(
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
  public static Builder newBuilder(com.recruitment.grpc.interview.AvailabilityRequest prototype) {
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
   * Protobuf type {@code AvailabilityRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AvailabilityRequest)
      com.recruitment.grpc.interview.AvailabilityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.recruitment.grpc.interview.InterviewSchedulingProto.internal_static_AvailabilityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.recruitment.grpc.interview.InterviewSchedulingProto.internal_static_AvailabilityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.recruitment.grpc.interview.AvailabilityRequest.class, com.recruitment.grpc.interview.AvailabilityRequest.Builder.class);
    }

    // Construct using com.recruitment.grpc.interview.AvailabilityRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userId_ = "";
      role_ = "";
      availableTimes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.recruitment.grpc.interview.InterviewSchedulingProto.internal_static_AvailabilityRequest_descriptor;
    }

    @java.lang.Override
    public com.recruitment.grpc.interview.AvailabilityRequest getDefaultInstanceForType() {
      return com.recruitment.grpc.interview.AvailabilityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.recruitment.grpc.interview.AvailabilityRequest build() {
      com.recruitment.grpc.interview.AvailabilityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.recruitment.grpc.interview.AvailabilityRequest buildPartial() {
      com.recruitment.grpc.interview.AvailabilityRequest result = new com.recruitment.grpc.interview.AvailabilityRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.recruitment.grpc.interview.AvailabilityRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.role_ = role_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        availableTimes_.makeImmutable();
        result.availableTimes_ = availableTimes_;
      }
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
      if (other instanceof com.recruitment.grpc.interview.AvailabilityRequest) {
        return mergeFrom((com.recruitment.grpc.interview.AvailabilityRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.recruitment.grpc.interview.AvailabilityRequest other) {
      if (other == com.recruitment.grpc.interview.AvailabilityRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRole().isEmpty()) {
        role_ = other.role_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.availableTimes_.isEmpty()) {
        if (availableTimes_.isEmpty()) {
          availableTimes_ = other.availableTimes_;
          bitField0_ |= 0x00000004;
        } else {
          ensureAvailableTimesIsMutable();
          availableTimes_.addAll(other.availableTimes_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              role_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAvailableTimesIsMutable();
              availableTimes_.add(s);
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1;</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object role_ = "";
    /**
     * <pre>
     * candidate or interviewer
     * </pre>
     *
     * <code>string role = 2;</code>
     * @return The role.
     */
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        role_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * candidate or interviewer
     * </pre>
     *
     * <code>string role = 2;</code>
     * @return The bytes for role.
     */
    public com.google.protobuf.ByteString
        getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        role_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * candidate or interviewer
     * </pre>
     *
     * <code>string role = 2;</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      role_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * candidate or interviewer
     * </pre>
     *
     * <code>string role = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      role_ = getDefaultInstance().getRole();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * candidate or interviewer
     * </pre>
     *
     * <code>string role = 2;</code>
     * @param value The bytes for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      role_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList availableTimes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAvailableTimesIsMutable() {
      if (!availableTimes_.isModifiable()) {
        availableTimes_ = new com.google.protobuf.LazyStringArrayList(availableTimes_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * ISO-8601 strings
     * </pre>
     *
     * <code>repeated string available_times = 3;</code>
     * @return A list containing the availableTimes.
     */
    public com.google.protobuf.ProtocolStringList
        getAvailableTimesList() {
      availableTimes_.makeImmutable();
      return availableTimes_;
    }
    /**
     * <pre>
     * ISO-8601 strings
     * </pre>
     *
     * <code>repeated string available_times = 3;</code>
     * @return The count of availableTimes.
     */
    public int getAvailableTimesCount() {
      return availableTimes_.size();
    }
    /**
     * <pre>
     * ISO-8601 strings
     * </pre>
     *
     * <code>repeated string available_times = 3;</code>
     * @param index The index of the element to return.
     * @return The availableTimes at the given index.
     */
    public java.lang.String getAvailableTimes(int index) {
      return availableTimes_.get(index);
    }
    /**
     * <pre>
     * ISO-8601 strings
     * </pre>
     *
     * <code>repeated string available_times = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the availableTimes at the given index.
     */
    public com.google.protobuf.ByteString
        getAvailableTimesBytes(int index) {
      return availableTimes_.getByteString(index);
    }
    /**
     * <pre>
     * ISO-8601 strings
     * </pre>
     *
     * <code>repeated string available_times = 3;</code>
     * @param index The index to set the value at.
     * @param value The availableTimes to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableTimes(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAvailableTimesIsMutable();
      availableTimes_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ISO-8601 strings
     * </pre>
     *
     * <code>repeated string available_times = 3;</code>
     * @param value The availableTimes to add.
     * @return This builder for chaining.
     */
    public Builder addAvailableTimes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAvailableTimesIsMutable();
      availableTimes_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ISO-8601 strings
     * </pre>
     *
     * <code>repeated string available_times = 3;</code>
     * @param values The availableTimes to add.
     * @return This builder for chaining.
     */
    public Builder addAllAvailableTimes(
        java.lang.Iterable<java.lang.String> values) {
      ensureAvailableTimesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, availableTimes_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ISO-8601 strings
     * </pre>
     *
     * <code>repeated string available_times = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailableTimes() {
      availableTimes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ISO-8601 strings
     * </pre>
     *
     * <code>repeated string available_times = 3;</code>
     * @param value The bytes of the availableTimes to add.
     * @return This builder for chaining.
     */
    public Builder addAvailableTimesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAvailableTimesIsMutable();
      availableTimes_.add(value);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:AvailabilityRequest)
  }

  // @@protoc_insertion_point(class_scope:AvailabilityRequest)
  private static final com.recruitment.grpc.interview.AvailabilityRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.recruitment.grpc.interview.AvailabilityRequest();
  }

  public static com.recruitment.grpc.interview.AvailabilityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AvailabilityRequest>
      PARSER = new com.google.protobuf.AbstractParser<AvailabilityRequest>() {
    @java.lang.Override
    public AvailabilityRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AvailabilityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AvailabilityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.recruitment.grpc.interview.AvailabilityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

