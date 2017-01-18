$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('musiciansManager.feature');
formatter.feature({
  "line": 1,
  "name": "MM Login Feature File",
  "description": "",
  "id": "mm-login-feature-file",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login scenario test for Musicians Manager",
  "description": "",
  "id": "mm-login-feature-file;login-scenario-test-for-musicians-manager",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@musiciansManager"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "mmnavigate to Musicians Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "mmuser logs in",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "mmhome page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "musiciansManager.mmGiven()"
});
formatter.result({
  "duration": 43219450671,
  "status": "passed"
});
formatter.match({
  "location": "musiciansManager.mmWhen()"
});
formatter.result({
  "duration": 3434593478,
  "status": "passed"
});
formatter.match({
  "location": "musiciansManager.mmThen()"
});
formatter.result({
  "duration": 852495652,
  "status": "passed"
});
formatter.uri('sample.feature');
formatter.feature({
  "line": 2,
  "name": "To test my cucumber test is running",
  "description": "I want to run a sample feature file.",
  "id": "to-test-my-cucumber-test-is-running",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "cucumber setup",
  "description": "",
  "id": "to-test-my-cucumber-test-is-running;cucumber-setup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "sample feature file is ready",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I run the feature file",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "run should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.givenStatment()"
});
formatter.result({
  "duration": 6153224,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.whenStatement()"
});
formatter.result({
  "duration": 109814,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.thenStatment()"
});
formatter.result({
  "duration": 101305,
  "status": "passed"
});
});