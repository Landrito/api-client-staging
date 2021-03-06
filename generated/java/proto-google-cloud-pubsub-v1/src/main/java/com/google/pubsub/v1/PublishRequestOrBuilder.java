// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface PublishRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.PublishRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The messages in the request will be published on this topic.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>optional string topic = 1;</code>
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * The messages in the request will be published on this topic.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>optional string topic = 1;</code>
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
   */
  java.util.List<com.google.pubsub.v1.PubsubMessage> 
      getMessagesList();
  /**
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
   */
  com.google.pubsub.v1.PubsubMessage getMessages(int index);
  /**
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
   */
  int getMessagesCount();
  /**
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
   */
  java.util.List<? extends com.google.pubsub.v1.PubsubMessageOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
   */
  com.google.pubsub.v1.PubsubMessageOrBuilder getMessagesOrBuilder(
      int index);
}
