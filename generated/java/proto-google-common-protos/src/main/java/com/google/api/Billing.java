// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/billing.proto

package com.google.api;

/**
 * <pre>
 * Billing related configuration of the service.
 * The following example shows how to configure metrics for billing:
 *     metrics:
 *     - name: library.googleapis.com/read_calls
 *       metric_kind: DELTA
 *       value_type: INT64
 *     - name: library.googleapis.com/write_calls
 *       metric_kind: DELTA
 *       value_type: INT64
 *     billing:
 *       metrics:
 *       - library.googleapis.com/read_calls
 *       - library.googleapis.com/write_calls
 * The next example shows how to enable billing status check and customize the
 * check behavior. It makes sure billing status check is included in the `Check`
 * method of [Service Control API](https://cloud.google.com/service-control/).
 * In the example, "google.storage.Get" method can be served when the billing
 * status is either `current` or `delinquent`, while "google.storage.Write"
 * method can only be served when the billing status is `current`:
 *     billing:
 *       rules:
 *       - selector: google.storage.Get
 *         allowed_statuses:
 *         - current
 *         - delinquent
 *       - selector: google.storage.Write
 *         allowed_statuses: current
 * Mostly services should only allow `current` status when serving requests.
 * In addition, services can choose to allow both `current` and `delinquent`
 * statuses when serving read-only requests to resources. If there's no
 * matching selector for operation, no billing status check will be performed.
 * </pre>
 *
 * Protobuf type {@code google.api.Billing}
 */
public  final class Billing extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.Billing)
    BillingOrBuilder {
  // Use Billing.newBuilder() to construct.
  private Billing(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Billing() {
    metrics_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    rules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Billing(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              metrics_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            metrics_.add(s);
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              rules_ = new java.util.ArrayList<com.google.api.BillingStatusRule>();
              mutable_bitField0_ |= 0x00000002;
            }
            rules_.add(
                input.readMessage(com.google.api.BillingStatusRule.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        metrics_ = metrics_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        rules_ = java.util.Collections.unmodifiableList(rules_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.BillingProto.internal_static_google_api_Billing_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.BillingProto.internal_static_google_api_Billing_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.Billing.class, com.google.api.Billing.Builder.class);
  }

  public static final int METRICS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList metrics_;
  /**
   * <pre>
   * Names of the metrics to report to billing. Each name must
   * be defined in [Service.metrics][google.api.Service.metrics] section.
   * </pre>
   *
   * <code>repeated string metrics = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMetricsList() {
    return metrics_;
  }
  /**
   * <pre>
   * Names of the metrics to report to billing. Each name must
   * be defined in [Service.metrics][google.api.Service.metrics] section.
   * </pre>
   *
   * <code>repeated string metrics = 1;</code>
   */
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   * <pre>
   * Names of the metrics to report to billing. Each name must
   * be defined in [Service.metrics][google.api.Service.metrics] section.
   * </pre>
   *
   * <code>repeated string metrics = 1;</code>
   */
  public java.lang.String getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   * <pre>
   * Names of the metrics to report to billing. Each name must
   * be defined in [Service.metrics][google.api.Service.metrics] section.
   * </pre>
   *
   * <code>repeated string metrics = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMetricsBytes(int index) {
    return metrics_.getByteString(index);
  }

  public static final int RULES_FIELD_NUMBER = 5;
  private java.util.List<com.google.api.BillingStatusRule> rules_;
  /**
   * <pre>
   * A list of billing status rules for configuring billing status check.
   * </pre>
   *
   * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
   */
  public java.util.List<com.google.api.BillingStatusRule> getRulesList() {
    return rules_;
  }
  /**
   * <pre>
   * A list of billing status rules for configuring billing status check.
   * </pre>
   *
   * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
   */
  public java.util.List<? extends com.google.api.BillingStatusRuleOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <pre>
   * A list of billing status rules for configuring billing status check.
   * </pre>
   *
   * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
   */
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <pre>
   * A list of billing status rules for configuring billing status check.
   * </pre>
   *
   * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
   */
  public com.google.api.BillingStatusRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <pre>
   * A list of billing status rules for configuring billing status check.
   * </pre>
   *
   * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
   */
  public com.google.api.BillingStatusRuleOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
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
    for (int i = 0; i < metrics_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metrics_.getRaw(i));
    }
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(5, rules_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < metrics_.size(); i++) {
        dataSize += computeStringSizeNoTag(metrics_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMetricsList().size();
    }
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, rules_.get(i));
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
    if (!(obj instanceof com.google.api.Billing)) {
      return super.equals(obj);
    }
    com.google.api.Billing other = (com.google.api.Billing) obj;

    boolean result = true;
    result = result && getMetricsList()
        .equals(other.getMetricsList());
    result = result && getRulesList()
        .equals(other.getRulesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    if (getRulesCount() > 0) {
      hash = (37 * hash) + RULES_FIELD_NUMBER;
      hash = (53 * hash) + getRulesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.Billing parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Billing parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Billing parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Billing parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Billing parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Billing parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.Billing parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.Billing parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.Billing parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Billing parseFrom(
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
  public static Builder newBuilder(com.google.api.Billing prototype) {
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
   * Billing related configuration of the service.
   * The following example shows how to configure metrics for billing:
   *     metrics:
   *     - name: library.googleapis.com/read_calls
   *       metric_kind: DELTA
   *       value_type: INT64
   *     - name: library.googleapis.com/write_calls
   *       metric_kind: DELTA
   *       value_type: INT64
   *     billing:
   *       metrics:
   *       - library.googleapis.com/read_calls
   *       - library.googleapis.com/write_calls
   * The next example shows how to enable billing status check and customize the
   * check behavior. It makes sure billing status check is included in the `Check`
   * method of [Service Control API](https://cloud.google.com/service-control/).
   * In the example, "google.storage.Get" method can be served when the billing
   * status is either `current` or `delinquent`, while "google.storage.Write"
   * method can only be served when the billing status is `current`:
   *     billing:
   *       rules:
   *       - selector: google.storage.Get
   *         allowed_statuses:
   *         - current
   *         - delinquent
   *       - selector: google.storage.Write
   *         allowed_statuses: current
   * Mostly services should only allow `current` status when serving requests.
   * In addition, services can choose to allow both `current` and `delinquent`
   * statuses when serving read-only requests to resources. If there's no
   * matching selector for operation, no billing status check will be performed.
   * </pre>
   *
   * Protobuf type {@code google.api.Billing}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Billing)
      com.google.api.BillingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.BillingProto.internal_static_google_api_Billing_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.BillingProto.internal_static_google_api_Billing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.Billing.class, com.google.api.Billing.Builder.class);
    }

    // Construct using com.google.api.Billing.newBuilder()
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
        getRulesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      metrics_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.BillingProto.internal_static_google_api_Billing_descriptor;
    }

    public com.google.api.Billing getDefaultInstanceForType() {
      return com.google.api.Billing.getDefaultInstance();
    }

    public com.google.api.Billing build() {
      com.google.api.Billing result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.Billing buildPartial() {
      com.google.api.Billing result = new com.google.api.Billing(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        metrics_ = metrics_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.metrics_ = metrics_;
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
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
      if (other instanceof com.google.api.Billing) {
        return mergeFrom((com.google.api.Billing)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.Billing other) {
      if (other == com.google.api.Billing.getDefaultInstance()) return this;
      if (!other.metrics_.isEmpty()) {
        if (metrics_.isEmpty()) {
          metrics_ = other.metrics_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMetricsIsMutable();
          metrics_.addAll(other.metrics_);
        }
        onChanged();
      }
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000002);
            rulesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRulesFieldBuilder() : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
          }
        }
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
      com.google.api.Billing parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.Billing) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList metrics_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        metrics_ = new com.google.protobuf.LazyStringArrayList(metrics_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Names of the metrics to report to billing. Each name must
     * be defined in [Service.metrics][google.api.Service.metrics] section.
     * </pre>
     *
     * <code>repeated string metrics = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMetricsList() {
      return metrics_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Names of the metrics to report to billing. Each name must
     * be defined in [Service.metrics][google.api.Service.metrics] section.
     * </pre>
     *
     * <code>repeated string metrics = 1;</code>
     */
    public int getMetricsCount() {
      return metrics_.size();
    }
    /**
     * <pre>
     * Names of the metrics to report to billing. Each name must
     * be defined in [Service.metrics][google.api.Service.metrics] section.
     * </pre>
     *
     * <code>repeated string metrics = 1;</code>
     */
    public java.lang.String getMetrics(int index) {
      return metrics_.get(index);
    }
    /**
     * <pre>
     * Names of the metrics to report to billing. Each name must
     * be defined in [Service.metrics][google.api.Service.metrics] section.
     * </pre>
     *
     * <code>repeated string metrics = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMetricsBytes(int index) {
      return metrics_.getByteString(index);
    }
    /**
     * <pre>
     * Names of the metrics to report to billing. Each name must
     * be defined in [Service.metrics][google.api.Service.metrics] section.
     * </pre>
     *
     * <code>repeated string metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMetricsIsMutable();
      metrics_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Names of the metrics to report to billing. Each name must
     * be defined in [Service.metrics][google.api.Service.metrics] section.
     * </pre>
     *
     * <code>repeated string metrics = 1;</code>
     */
    public Builder addMetrics(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMetricsIsMutable();
      metrics_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Names of the metrics to report to billing. Each name must
     * be defined in [Service.metrics][google.api.Service.metrics] section.
     * </pre>
     *
     * <code>repeated string metrics = 1;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<java.lang.String> values) {
      ensureMetricsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, metrics_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Names of the metrics to report to billing. Each name must
     * be defined in [Service.metrics][google.api.Service.metrics] section.
     * </pre>
     *
     * <code>repeated string metrics = 1;</code>
     */
    public Builder clearMetrics() {
      metrics_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Names of the metrics to report to billing. Each name must
     * be defined in [Service.metrics][google.api.Service.metrics] section.
     * </pre>
     *
     * <code>repeated string metrics = 1;</code>
     */
    public Builder addMetricsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMetricsIsMutable();
      metrics_.add(value);
      onChanged();
      return this;
    }

    private java.util.List<com.google.api.BillingStatusRule> rules_ =
      java.util.Collections.emptyList();
    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        rules_ = new java.util.ArrayList<com.google.api.BillingStatusRule>(rules_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.BillingStatusRule, com.google.api.BillingStatusRule.Builder, com.google.api.BillingStatusRuleOrBuilder> rulesBuilder_;

    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public java.util.List<com.google.api.BillingStatusRule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public com.google.api.BillingStatusRule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public Builder setRules(
        int index, com.google.api.BillingStatusRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public Builder setRules(
        int index, com.google.api.BillingStatusRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public Builder addRules(com.google.api.BillingStatusRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public Builder addRules(
        int index, com.google.api.BillingStatusRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public Builder addRules(
        com.google.api.BillingStatusRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public Builder addRules(
        int index, com.google.api.BillingStatusRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.google.api.BillingStatusRule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public com.google.api.BillingStatusRule.Builder getRulesBuilder(
        int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public com.google.api.BillingStatusRuleOrBuilder getRulesOrBuilder(
        int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);  } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public java.util.List<? extends com.google.api.BillingStatusRuleOrBuilder> 
         getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public com.google.api.BillingStatusRule.Builder addRulesBuilder() {
      return getRulesFieldBuilder().addBuilder(
          com.google.api.BillingStatusRule.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public com.google.api.BillingStatusRule.Builder addRulesBuilder(
        int index) {
      return getRulesFieldBuilder().addBuilder(
          index, com.google.api.BillingStatusRule.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of billing status rules for configuring billing status check.
     * </pre>
     *
     * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
     */
    public java.util.List<com.google.api.BillingStatusRule.Builder> 
         getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.BillingStatusRule, com.google.api.BillingStatusRule.Builder, com.google.api.BillingStatusRuleOrBuilder> 
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.BillingStatusRule, com.google.api.BillingStatusRule.Builder, com.google.api.BillingStatusRuleOrBuilder>(
                rules_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        rules_ = null;
      }
      return rulesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.Billing)
  }

  // @@protoc_insertion_point(class_scope:google.api.Billing)
  private static final com.google.api.Billing DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.Billing();
  }

  public static com.google.api.Billing getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Billing>
      PARSER = new com.google.protobuf.AbstractParser<Billing>() {
    public Billing parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Billing(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Billing> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Billing> getParserForType() {
    return PARSER;
  }

  public com.google.api.Billing getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

