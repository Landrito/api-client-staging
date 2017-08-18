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

from google.cloud import vision_v1
from google.cloud.proto.vision.v1 import image_annotator_pb2
from google.cloud.vision_v1 import enums


class TestSystemImageAnnotator(unittest.TestCase):
    def test_batch_annotate_images(self):

        client = vision_v1.ImageAnnotatorClient()
        gcs_image_uri = 'gs://gapic-toolkit/President_Barack_Obama.jpg'
        source = {'gcs_image_uri': gcs_image_uri}
        image = {'source': source}
        type_ = enums.Feature.Type.FACE_DETECTION
        features_element = {'type': type_}
        features = [features_element]
        requests_element = {'image': image, 'features': features}
        requests = [requests_element]
        response = client.batch_annotate_images(requests)
