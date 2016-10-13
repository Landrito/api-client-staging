/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.errorreporting.spi.v1beta1;

import com.google.api.gax.grpc.CallContext;
import com.google.api.gax.grpc.PageStreamingDescriptor;
import com.google.api.gax.grpc.PagedListResponseImpl;
import com.google.api.gax.grpc.UnaryApiCallable;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorEvent;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupStats;
import com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse;
import com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Wrapper class to contain paged response types for page streaming methods. Each static class
 * inside this wrapper class is used as the return type of one of an API method that implements the
 * page streaming pattern.
 */
@javax.annotation.Generated("by GAPIC")
public class PagedResponseWrappers {

  public static class ListGroupStatsPagedResponse
      extends PagedListResponseImpl<
          ListGroupStatsRequest, ListGroupStatsResponse, ErrorGroupStats> {

    public ListGroupStatsPagedResponse(
        UnaryApiCallable<ListGroupStatsRequest, ListGroupStatsResponse> callable,
        PageStreamingDescriptor<ListGroupStatsRequest, ListGroupStatsResponse, ErrorGroupStats>
            pageDescriptor,
        ListGroupStatsRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }

  public static class ListEventsPagedResponse
      extends PagedListResponseImpl<ListEventsRequest, ListEventsResponse, ErrorEvent> {

    public ListEventsPagedResponse(
        UnaryApiCallable<ListEventsRequest, ListEventsResponse> callable,
        PageStreamingDescriptor<ListEventsRequest, ListEventsResponse, ErrorEvent> pageDescriptor,
        ListEventsRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }
}
