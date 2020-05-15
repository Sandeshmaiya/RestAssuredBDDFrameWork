$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/s.maiya/eclipse-workspace/17_07_2019_Selinium/ApiFrameWork-BDD/src/main/java/com/qa/features/Addplace.feature");
formatter.feature({
  "line": 1,
  "name": "Validiating place apis",
  "description": "",
  "id": "validiating-place-apis",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify if place been added",
  "description": "",
  "id": "validiating-place-apis;verify-if-place-been-added",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@AddPlace"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Add place payload with \"\u003cname\u003e\" and  \"\u003clanguage\u003e\" and \"\u003caddress\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user calls \"AddPlaceAPI\" api with Post http request",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "api call is success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "\"status\" value is \"OK\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "\"scope\" value is \"APP\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "validiating-place-apis;verify-if-place-been-added;",
  "rows": [
    {
      "cells": [
        "name",
        "language",
        "address"
      ],
      "line": 12,
      "id": "validiating-place-apis;verify-if-place-been-added;;1"
    },
    {
      "cells": [
        "sandesh",
        "English",
        "maruthiexten banalore"
      ],
      "line": 13,
      "id": "validiating-place-apis;verify-if-place-been-added;;2"
    },
    {
      "cells": [
        "sandesh123",
        "Tamil",
        "maruthiexten3 banalore"
      ],
      "line": 14,
      "id": "validiating-place-apis;verify-if-place-been-added;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Verify if place been added",
  "description": "",
  "id": "validiating-place-apis;verify-if-place-been-added;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@AddPlace"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Add place payload with \"sandesh\" and  \"English\" and \"maruthiexten banalore\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user calls \"AddPlaceAPI\" api with Post http request",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "api call is success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "\"status\" value is \"OK\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "\"scope\" value is \"APP\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "sandesh",
      "offset": 24
    },
    {
      "val": "English",
      "offset": 39
    },
    {
      "val": "maruthiexten banalore",
      "offset": 53
    }
  ],
  "location": "AppPlacePostApi.add_place_payload_with_and_and(String,String,String)"
});
formatter.result({
  "duration": 1465634600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AddPlaceAPI",
      "offset": 12
    }
  ],
  "location": "AppPlacePostApi.user_calls_api_with_Post_http_request(String)"
});
