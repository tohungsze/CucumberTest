Feature: MM Login Feature File
@musiciansManager
Scenario: Login scenario test for Musicians Manager

Given mmnavigate to Musicians Manager
When mmuser logs in
Then mmhome page should be displayed