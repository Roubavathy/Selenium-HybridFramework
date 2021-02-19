$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "To test the freecrm application.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test the Login functionality.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To enter url and navigate to application.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepsDefinition.LoginStepDefinition.to_enter_url_and_navigate_to_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\".",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepsDefinition.LoginStepDefinition.to_enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the submit button.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepsDefinition.LoginStepDefinition.click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To test screenshot.",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepsDefinition.LoginStepDefinition.to_test_screenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepsDefinition.LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});