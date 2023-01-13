Feature: Google - Search "Serenity BDD"

Scenario: Successful redirection of Google website
Given Browser "<browser>" and website "<website>" are open
When User enters "Serenity BDD" text onto search bar
And click on Google Search button
Then Website redirection is successful

Examples:
 browser | website 				   | searchData |
 chrome  | https://www.google.com/ | Serenity BDD