// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/resources.proto

package com.google.api.servicemanagement.v1;

public interface ManagedServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ManagedService)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the service. See the [overview](/service-management/overview)
   * for naming requirements.
   * </pre>
   *
   * <code>optional string service_name = 2;</code>
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * The name of the service. See the [overview](/service-management/overview)
   * for naming requirements.
   * </pre>
   *
   * <code>optional string service_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * ID of the project that produces and owns this service.
   * </pre>
   *
   * <code>optional string producer_project_id = 3;</code>
   */
  java.lang.String getProducerProjectId();
  /**
   * <pre>
   * ID of the project that produces and owns this service.
   * </pre>
   *
   * <code>optional string producer_project_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getProducerProjectIdBytes();
}
