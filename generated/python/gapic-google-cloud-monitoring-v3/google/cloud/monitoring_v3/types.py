# Copyright 2017, Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

from __future__ import absolute_import
import sys

from google.gax.utils.messages import get_messages

from google.api import distribution_pb2
from google.api import http_pb2
from google.api import label_pb2
from google.api import metric_pb2 as api_metric_pb2
from google.api import monitored_resource_pb2
from google.cloud.proto.monitoring.v3 import common_pb2
from google.cloud.proto.monitoring.v3 import group_pb2
from google.cloud.proto.monitoring.v3 import group_service_pb2
from google.cloud.proto.monitoring.v3 import metric_pb2 as v3_metric_pb2
from google.cloud.proto.monitoring.v3 import metric_service_pb2
from google.protobuf import any_pb2
from google.protobuf import descriptor_pb2
from google.protobuf import duration_pb2
from google.protobuf import empty_pb2
from google.protobuf import timestamp_pb2
from google.rpc import status_pb2

names = []
for module in (distribution_pb2, http_pb2, label_pb2, api_metric_pb2,
               monitored_resource_pb2, common_pb2, group_pb2,
               group_service_pb2, v3_metric_pb2, metric_service_pb2, any_pb2,
               descriptor_pb2, duration_pb2, empty_pb2, timestamp_pb2,
               status_pb2, ):
    for name, message in get_messages(module).items():
        message.__module__ = 'google.cloud.monitoring_v3.types'
        setattr(sys.modules[__name__], name, message)
        names.append(name)

__all__ = tuple(sorted(names))