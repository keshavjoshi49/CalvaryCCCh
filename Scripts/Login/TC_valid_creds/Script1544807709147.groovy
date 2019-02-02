import calvaryCCH.workflows.LoginPageWorkflow as login
import calvaryCCH.workflows.mediaCenterPageWorkflow as mcp

//Launch application
login.openUrl(url)

//Pass different username and passwords
login.loginToApplication(username, password)

//Assertion
mcp.mcpAdminMenuText()
