import calvaryCCH.workflows.LoginPageWorkflow as login

//Launch application
login.openUrl(url)

//Pass different username and passwords
login.loginToApplication(username, password)

//Assertion
login.loginInvalidCredsText()

