// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public interface ErrorContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ErrorContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The HTTP request which was processed when the error was
   * triggered.
   * </pre>
   *
   * <code>optional .google.devtools.clouderrorreporting.v1beta1.HttpRequestContext http_request = 1;</code>
   */
  boolean hasHttpRequest();
  /**
   * <pre>
   * The HTTP request which was processed when the error was
   * triggered.
   * </pre>
   *
   * <code>optional .google.devtools.clouderrorreporting.v1beta1.HttpRequestContext http_request = 1;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext getHttpRequest();
  /**
   * <pre>
   * The HTTP request which was processed when the error was
   * triggered.
   * </pre>
   *
   * <code>optional .google.devtools.clouderrorreporting.v1beta1.HttpRequestContext http_request = 1;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContextOrBuilder getHttpRequestOrBuilder();

  /**
   * <pre>
   * The user who caused or was affected by the crash.
   * This can be a user ID, an email address, or an arbitrary token that
   * uniquely identifies the user.
   * When sending an error report, leave this field empty if the user was not
   * logged in. In this case the
   * Error Reporting system will use other data, such as remote IP address, to
   * distinguish affected users. See `affected_users_count` in
   * `ErrorGroupStats`.
   * </pre>
   *
   * <code>optional string user = 2;</code>
   */
  java.lang.String getUser();
  /**
   * <pre>
   * The user who caused or was affected by the crash.
   * This can be a user ID, an email address, or an arbitrary token that
   * uniquely identifies the user.
   * When sending an error report, leave this field empty if the user was not
   * logged in. In this case the
   * Error Reporting system will use other data, such as remote IP address, to
   * distinguish affected users. See `affected_users_count` in
   * `ErrorGroupStats`.
   * </pre>
   *
   * <code>optional string user = 2;</code>
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <pre>
   * The location in the source code where the decision was made to
   * report the error, usually the place where it was logged.
   * For a logged exception this would be the source line where the
   * exception is logged, usually close to the place where it was
   * caught. This value is in contrast to `Exception.cause_location`,
   * which describes the source line where the exception was thrown.
   * </pre>
   *
   * <code>optional .google.devtools.clouderrorreporting.v1beta1.SourceLocation report_location = 3;</code>
   */
  boolean hasReportLocation();
  /**
   * <pre>
   * The location in the source code where the decision was made to
   * report the error, usually the place where it was logged.
   * For a logged exception this would be the source line where the
   * exception is logged, usually close to the place where it was
   * caught. This value is in contrast to `Exception.cause_location`,
   * which describes the source line where the exception was thrown.
   * </pre>
   *
   * <code>optional .google.devtools.clouderrorreporting.v1beta1.SourceLocation report_location = 3;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.SourceLocation getReportLocation();
  /**
   * <pre>
   * The location in the source code where the decision was made to
   * report the error, usually the place where it was logged.
   * For a logged exception this would be the source line where the
   * exception is logged, usually close to the place where it was
   * caught. This value is in contrast to `Exception.cause_location`,
   * which describes the source line where the exception was thrown.
   * </pre>
   *
   * <code>optional .google.devtools.clouderrorreporting.v1beta1.SourceLocation report_location = 3;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.SourceLocationOrBuilder getReportLocationOrBuilder();
}
