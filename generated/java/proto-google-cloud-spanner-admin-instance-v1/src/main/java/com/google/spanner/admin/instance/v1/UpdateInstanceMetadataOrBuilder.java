// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

public interface UpdateInstanceMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.instance.v1.UpdateInstanceMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The desired end state of the update.
   * </pre>
   *
   * <code>optional .google.spanner.admin.instance.v1.Instance instance = 1;</code>
   */
  boolean hasInstance();
  /**
   * <pre>
   * The desired end state of the update.
   * </pre>
   *
   * <code>optional .google.spanner.admin.instance.v1.Instance instance = 1;</code>
   */
  com.google.spanner.admin.instance.v1.Instance getInstance();
  /**
   * <pre>
   * The desired end state of the update.
   * </pre>
   *
   * <code>optional .google.spanner.admin.instance.v1.Instance instance = 1;</code>
   */
  com.google.spanner.admin.instance.v1.InstanceOrBuilder getInstanceOrBuilder();

  /**
   * <pre>
   * The time at which [UpdateInstance][google.spanner.admin.instance.v1.InstanceAdmin.UpdateInstance]
   * request was received.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
   */
  boolean hasStartTime();
  /**
   * <pre>
   * The time at which [UpdateInstance][google.spanner.admin.instance.v1.InstanceAdmin.UpdateInstance]
   * request was received.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * The time at which [UpdateInstance][google.spanner.admin.instance.v1.InstanceAdmin.UpdateInstance]
   * request was received.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * The time at which this operation was cancelled. If set, this operation is
   * in the process of undoing itself (which is guaranteed to succeed) and
   * cannot be cancelled again.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp cancel_time = 3;</code>
   */
  boolean hasCancelTime();
  /**
   * <pre>
   * The time at which this operation was cancelled. If set, this operation is
   * in the process of undoing itself (which is guaranteed to succeed) and
   * cannot be cancelled again.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp cancel_time = 3;</code>
   */
  com.google.protobuf.Timestamp getCancelTime();
  /**
   * <pre>
   * The time at which this operation was cancelled. If set, this operation is
   * in the process of undoing itself (which is guaranteed to succeed) and
   * cannot be cancelled again.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp cancel_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCancelTimeOrBuilder();

  /**
   * <pre>
   * The time at which this operation failed or was completed successfully.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_time = 4;</code>
   */
  boolean hasEndTime();
  /**
   * <pre>
   * The time at which this operation failed or was completed successfully.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_time = 4;</code>
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * The time at which this operation failed or was completed successfully.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp end_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}