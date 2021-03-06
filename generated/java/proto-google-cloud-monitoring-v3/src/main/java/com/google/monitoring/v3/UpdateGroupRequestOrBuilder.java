// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

public interface UpdateGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.UpdateGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The new definition of the group.  All fields of the existing group,
   * excepting `name`, are replaced with the corresponding fields of this group.
   * </pre>
   *
   * <code>optional .google.monitoring.v3.Group group = 2;</code>
   */
  boolean hasGroup();
  /**
   * <pre>
   * The new definition of the group.  All fields of the existing group,
   * excepting `name`, are replaced with the corresponding fields of this group.
   * </pre>
   *
   * <code>optional .google.monitoring.v3.Group group = 2;</code>
   */
  com.google.monitoring.v3.Group getGroup();
  /**
   * <pre>
   * The new definition of the group.  All fields of the existing group,
   * excepting `name`, are replaced with the corresponding fields of this group.
   * </pre>
   *
   * <code>optional .google.monitoring.v3.Group group = 2;</code>
   */
  com.google.monitoring.v3.GroupOrBuilder getGroupOrBuilder();

  /**
   * <pre>
   * If true, validate this request but do not update the existing group.
   * </pre>
   *
   * <code>optional bool validate_only = 3;</code>
   */
  boolean getValidateOnly();
}
