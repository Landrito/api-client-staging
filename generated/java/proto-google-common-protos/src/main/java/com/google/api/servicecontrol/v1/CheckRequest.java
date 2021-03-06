// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/service_controller.proto

package com.google.api.servicecontrol.v1;

/**
 * <pre>
 * Request message for the Check method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicecontrol.v1.CheckRequest}
 */
public  final class CheckRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.servicecontrol.v1.CheckRequest)
    CheckRequestOrBuilder {
  // Use CheckRequest.newBuilder() to construct.
  private CheckRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckRequest() {
    serviceName_ = "";
    serviceConfigId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CheckRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceName_ = s;
            break;
          }
          case 18: {
            com.google.api.servicecontrol.v1.Operation.Builder subBuilder = null;
            if (operation_ != null) {
              subBuilder = operation_.toBuilder();
            }
            operation_ = input.readMessage(com.google.api.servicecontrol.v1.Operation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operation_);
              operation_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceConfigId_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.servicecontrol.v1.ServiceControllerProto.internal_static_google_api_servicecontrol_v1_CheckRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicecontrol.v1.ServiceControllerProto.internal_static_google_api_servicecontrol_v1_CheckRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicecontrol.v1.CheckRequest.class, com.google.api.servicecontrol.v1.CheckRequest.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceName_;
  /**
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   * See [google.api.Service][google.api.Service] for the definition of a service name.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   * See [google.api.Service][google.api.Service] for the definition of a service name.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATION_FIELD_NUMBER = 2;
  private com.google.api.servicecontrol.v1.Operation operation_;
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  public boolean hasOperation() {
    return operation_ != null;
  }
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  public com.google.api.servicecontrol.v1.Operation getOperation() {
    return operation_ == null ? com.google.api.servicecontrol.v1.Operation.getDefaultInstance() : operation_;
  }
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  public com.google.api.servicecontrol.v1.OperationOrBuilder getOperationOrBuilder() {
    return getOperation();
  }

  public static final int SERVICE_CONFIG_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object serviceConfigId_;
  /**
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request.
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>optional string service_config_id = 4;</code>
   */
  public java.lang.String getServiceConfigId() {
    java.lang.Object ref = serviceConfigId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceConfigId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request.
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>optional string service_config_id = 4;</code>
   */
  public com.google.protobuf.ByteString
      getServiceConfigIdBytes() {
    java.lang.Object ref = serviceConfigId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceConfigId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getServiceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
    }
    if (operation_ != null) {
      output.writeMessage(2, getOperation());
    }
    if (!getServiceConfigIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, serviceConfigId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServiceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
    }
    if (operation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOperation());
    }
    if (!getServiceConfigIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, serviceConfigId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.api.servicecontrol.v1.CheckRequest)) {
      return super.equals(obj);
    }
    com.google.api.servicecontrol.v1.CheckRequest other = (com.google.api.servicecontrol.v1.CheckRequest) obj;

    boolean result = true;
    result = result && getServiceName()
        .equals(other.getServiceName());
    result = result && (hasOperation() == other.hasOperation());
    if (hasOperation()) {
      result = result && getOperation()
          .equals(other.getOperation());
    }
    result = result && getServiceConfigId()
        .equals(other.getServiceConfigId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    if (hasOperation()) {
      hash = (37 * hash) + OPERATION_FIELD_NUMBER;
      hash = (53 * hash) + getOperation().hashCode();
    }
    hash = (37 * hash) + SERVICE_CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceConfigId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicecontrol.v1.CheckRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.servicecontrol.v1.CheckRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Request message for the Check method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicecontrol.v1.CheckRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicecontrol.v1.CheckRequest)
      com.google.api.servicecontrol.v1.CheckRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.servicecontrol.v1.ServiceControllerProto.internal_static_google_api_servicecontrol_v1_CheckRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicecontrol.v1.ServiceControllerProto.internal_static_google_api_servicecontrol_v1_CheckRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicecontrol.v1.CheckRequest.class, com.google.api.servicecontrol.v1.CheckRequest.Builder.class);
    }

    // Construct using com.google.api.servicecontrol.v1.CheckRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      serviceName_ = "";

      if (operationBuilder_ == null) {
        operation_ = null;
      } else {
        operation_ = null;
        operationBuilder_ = null;
      }
      serviceConfigId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.servicecontrol.v1.ServiceControllerProto.internal_static_google_api_servicecontrol_v1_CheckRequest_descriptor;
    }

    public com.google.api.servicecontrol.v1.CheckRequest getDefaultInstanceForType() {
      return com.google.api.servicecontrol.v1.CheckRequest.getDefaultInstance();
    }

    public com.google.api.servicecontrol.v1.CheckRequest build() {
      com.google.api.servicecontrol.v1.CheckRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.servicecontrol.v1.CheckRequest buildPartial() {
      com.google.api.servicecontrol.v1.CheckRequest result = new com.google.api.servicecontrol.v1.CheckRequest(this);
      result.serviceName_ = serviceName_;
      if (operationBuilder_ == null) {
        result.operation_ = operation_;
      } else {
        result.operation_ = operationBuilder_.build();
      }
      result.serviceConfigId_ = serviceConfigId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.servicecontrol.v1.CheckRequest) {
        return mergeFrom((com.google.api.servicecontrol.v1.CheckRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicecontrol.v1.CheckRequest other) {
      if (other == com.google.api.servicecontrol.v1.CheckRequest.getDefaultInstance()) return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (other.hasOperation()) {
        mergeOperation(other.getOperation());
      }
      if (!other.getServiceConfigId().isEmpty()) {
        serviceConfigId_ = other.serviceConfigId_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.servicecontrol.v1.CheckRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.servicecontrol.v1.CheckRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceName_ = "";
    /**
     * <pre>
     * The service name as specified in its service configuration. For example,
     * `"pubsub.googleapis.com"`.
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The service name as specified in its service configuration. For example,
     * `"pubsub.googleapis.com"`.
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The service name as specified in its service configuration. For example,
     * `"pubsub.googleapis.com"`.
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder setServiceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The service name as specified in its service configuration. For example,
     * `"pubsub.googleapis.com"`.
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder clearServiceName() {
      
      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The service name as specified in its service configuration. For example,
     * `"pubsub.googleapis.com"`.
     * See [google.api.Service][google.api.Service] for the definition of a service name.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceName_ = value;
      onChanged();
      return this;
    }

    private com.google.api.servicecontrol.v1.Operation operation_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.servicecontrol.v1.Operation, com.google.api.servicecontrol.v1.Operation.Builder, com.google.api.servicecontrol.v1.OperationOrBuilder> operationBuilder_;
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public boolean hasOperation() {
      return operationBuilder_ != null || operation_ != null;
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public com.google.api.servicecontrol.v1.Operation getOperation() {
      if (operationBuilder_ == null) {
        return operation_ == null ? com.google.api.servicecontrol.v1.Operation.getDefaultInstance() : operation_;
      } else {
        return operationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public Builder setOperation(com.google.api.servicecontrol.v1.Operation value) {
      if (operationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operation_ = value;
        onChanged();
      } else {
        operationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public Builder setOperation(
        com.google.api.servicecontrol.v1.Operation.Builder builderForValue) {
      if (operationBuilder_ == null) {
        operation_ = builderForValue.build();
        onChanged();
      } else {
        operationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public Builder mergeOperation(com.google.api.servicecontrol.v1.Operation value) {
      if (operationBuilder_ == null) {
        if (operation_ != null) {
          operation_ =
            com.google.api.servicecontrol.v1.Operation.newBuilder(operation_).mergeFrom(value).buildPartial();
        } else {
          operation_ = value;
        }
        onChanged();
      } else {
        operationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public Builder clearOperation() {
      if (operationBuilder_ == null) {
        operation_ = null;
        onChanged();
      } else {
        operation_ = null;
        operationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public com.google.api.servicecontrol.v1.Operation.Builder getOperationBuilder() {
      
      onChanged();
      return getOperationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    public com.google.api.servicecontrol.v1.OperationOrBuilder getOperationOrBuilder() {
      if (operationBuilder_ != null) {
        return operationBuilder_.getMessageOrBuilder();
      } else {
        return operation_ == null ?
            com.google.api.servicecontrol.v1.Operation.getDefaultInstance() : operation_;
      }
    }
    /**
     * <pre>
     * The operation to be checked.
     * </pre>
     *
     * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.servicecontrol.v1.Operation, com.google.api.servicecontrol.v1.Operation.Builder, com.google.api.servicecontrol.v1.OperationOrBuilder> 
        getOperationFieldBuilder() {
      if (operationBuilder_ == null) {
        operationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.servicecontrol.v1.Operation, com.google.api.servicecontrol.v1.Operation.Builder, com.google.api.servicecontrol.v1.OperationOrBuilder>(
                getOperation(),
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      return operationBuilder_;
    }

    private java.lang.Object serviceConfigId_ = "";
    /**
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request.
     * If unspecified or no matching version can be found, the
     * latest one will be used.
     * </pre>
     *
     * <code>optional string service_config_id = 4;</code>
     */
    public java.lang.String getServiceConfigId() {
      java.lang.Object ref = serviceConfigId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceConfigId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request.
     * If unspecified or no matching version can be found, the
     * latest one will be used.
     * </pre>
     *
     * <code>optional string service_config_id = 4;</code>
     */
    public com.google.protobuf.ByteString
        getServiceConfigIdBytes() {
      java.lang.Object ref = serviceConfigId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceConfigId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request.
     * If unspecified or no matching version can be found, the
     * latest one will be used.
     * </pre>
     *
     * <code>optional string service_config_id = 4;</code>
     */
    public Builder setServiceConfigId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceConfigId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request.
     * If unspecified or no matching version can be found, the
     * latest one will be used.
     * </pre>
     *
     * <code>optional string service_config_id = 4;</code>
     */
    public Builder clearServiceConfigId() {
      
      serviceConfigId_ = getDefaultInstance().getServiceConfigId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies which version of service configuration should be used to process
     * the request.
     * If unspecified or no matching version can be found, the
     * latest one will be used.
     * </pre>
     *
     * <code>optional string service_config_id = 4;</code>
     */
    public Builder setServiceConfigIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceConfigId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.servicecontrol.v1.CheckRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.CheckRequest)
  private static final com.google.api.servicecontrol.v1.CheckRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.servicecontrol.v1.CheckRequest();
  }

  public static com.google.api.servicecontrol.v1.CheckRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckRequest>
      PARSER = new com.google.protobuf.AbstractParser<CheckRequest>() {
    public CheckRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CheckRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckRequest> getParserForType() {
    return PARSER;
  }

  public com.google.api.servicecontrol.v1.CheckRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

