$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("android_app.feature");
formatter.feature({
  "line": 1,
  "name": "Ionic App Feature",
  "description": "",
  "id": "ionic-app-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Intro Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AndroidApp.iAmOnIntroPage()"
});
formatter.result({
  "duration": 24030175628,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify user should be able to slide right on tutorial pages",
  "description": "",
  "id": "ionic-app-feature;verify-user-should-be-able-to-slide-right-on-tutorial-pages",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@swipe_test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I swipe right 3 times on tutorials slides",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify Continue button is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "AndroidApp.iSwipeRightTimesOnTutorialsSlides(int)"
});
formatter.result({
  "duration": 54317890293,
  "status": "passed"
});
formatter.match({
  "location": "AndroidApp.iVerifyContinueButtonIsDisplayed()"
});
formatter.result({
  "duration": 62640093,
  "status": "passed"
});
});