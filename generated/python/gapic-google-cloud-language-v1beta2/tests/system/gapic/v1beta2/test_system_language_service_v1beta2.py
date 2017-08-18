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

import time
import unittest

from google.cloud import language_v1beta2
from google.cloud.language_v1beta2 import enums
from google.cloud.proto.language.v1beta2 import language_service_pb2


class TestSystemLanguageService(unittest.TestCase):
    def test_analyze_sentiment(self):

        client = language_v1beta2.LanguageServiceClient()
        content = 'Hello, world!'
        type_ = enums.Document.Type.PLAIN_TEXT
        document = {'content': content, 'type': type_}
        response = client.analyze_sentiment(document)
