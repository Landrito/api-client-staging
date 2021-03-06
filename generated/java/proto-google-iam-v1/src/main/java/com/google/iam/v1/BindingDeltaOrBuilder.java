// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/policy.proto

package com.google.iam.v1;

public interface BindingDeltaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.v1.BindingDelta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The action that was performed on a Binding.
   * Required
   * </pre>
   *
   * <code>optional .google.iam.v1.BindingDelta.Action action = 1;</code>
   */
  int getActionValue();
  /**
   * <pre>
   * The action that was performed on a Binding.
   * Required
   * </pre>
   *
   * <code>optional .google.iam.v1.BindingDelta.Action action = 1;</code>
   */
  com.google.iam.v1.BindingDelta.Action getAction();

  /**
   * <pre>
   * Role that is assigned to `members`.
   * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
   * Required
   * </pre>
   *
   * <code>optional string role = 2;</code>
   */
  java.lang.String getRole();
  /**
   * <pre>
   * Role that is assigned to `members`.
   * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
   * Required
   * </pre>
   *
   * <code>optional string role = 2;</code>
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <pre>
   * A single identity requesting access for a Cloud Platform resource.
   * Follows the same format of Binding.members.
   * Required
   * </pre>
   *
   * <code>optional string member = 3;</code>
   */
  java.lang.String getMember();
  /**
   * <pre>
   * A single identity requesting access for a Cloud Platform resource.
   * Follows the same format of Binding.members.
   * Required
   * </pre>
   *
   * <code>optional string member = 3;</code>
   */
  com.google.protobuf.ByteString
      getMemberBytes();
}
