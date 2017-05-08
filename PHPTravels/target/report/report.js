$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "SearchFeature",
  "description": "This feature deals with the search functionality of the application PHPTravels",
  "id": "searchfeature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Check response searching valid data",
  "description": "",
  "id": "searchfeature;check-response-searching-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC_1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Navigate to URL \u0027http://www.phptravels.net/\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter a valid location as \u003clocation\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter a valid check in date as \u003ccheck in date\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter a valid check out date as \u003ccheck out date\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select number of adults as \u003cadults\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Select number of child as \u003cchild\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Press Search button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Select star grade as \u003cstar grade\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select price range as \u003cprice range\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Press Search blue button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "reload page",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "searchfeature;check-response-searching-valid-data;",
  "rows": [
    {
      "cells": [
        "location",
        "check in date",
        "check out date",
        "adults",
        "child",
        "star grade",
        "price range"
      ],
      "line": 19,
      "id": "searchfeature;check-response-searching-valid-data;;1"
    },
    {
      "cells": [
        "Barranquilla,Colombia",
        "05/10/2017",
        "05/11/2017",
        "1",
        "0",
        "2",
        "25:1525"
      ],
      "line": 20,
      "id": "searchfeature;check-response-searching-valid-data;;2"
    },
    {
      "cells": [
        "Amsterdam, Netherlands",
        "05/11/2017",
        "05/17/2017",
        "2",
        "0",
        "1",
        "25:25"
      ],
      "line": 21,
      "id": "searchfeature;check-response-searching-valid-data;;3"
    },
    {
      "cells": [
        "Riviera Maya, Mexico",
        "05/19/2017",
        "05/21/2017",
        "3",
        "0",
        "3",
        "225:925"
      ],
      "line": 22,
      "id": "searchfeature;check-response-searching-valid-data;;4"
    },
    {
      "cells": [
        "Florida, Colombia",
        "05/12/2017",
        "05/26/2017",
        "4",
        "0",
        "4",
        "625:1025"
      ],
      "line": 23,
      "id": "searchfeature;check-response-searching-valid-data;;5"
    },
    {
      "cells": [
        "Havana, Cuba",
        "05/23/2017",
        "05/29/2017",
        "5",
        "0",
        "5",
        "1325:1725"
      ],
      "line": 24,
      "id": "searchfeature;check-response-searching-valid-data;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 28671823034,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Check response searching valid data",
  "description": "",
  "id": "searchfeature;check-response-searching-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC_1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Navigate to URL \u0027http://www.phptravels.net/\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter a valid location as Barranquilla,Colombia",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter a valid check in date as 05/10/2017",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter a valid check out date as 05/11/2017",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select number of adults as 1",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Select number of child as 0",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Press Search button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Select star grade as 2",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select price range as 25:1525",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Press Search blue button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "reload page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.navigateToURLHttpWwwPhptravelsNet()"
});
