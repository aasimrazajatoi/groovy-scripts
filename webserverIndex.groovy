def method = request.method

if (!session) {
    session = request.getSession(true)
}

if (!session.groovlet) {
    session.groovlet = 'Groovlets rock!'
}

html.html {
    head {
        title 'Groovlet information'
    }
    body {
        h2 'General information'
        h3 ' All you need to know about groovlet'
        ul {
            li "Method: ${method}"
            li "RequestURI: ${request.requestURI}"
            li "session.groovlet: ${session.groovlet}"
            li "application.version: ${context.version}"
        }
        
        h2 'Headers'
        h2 'Headers'
        ul {
            headers.each {
                li "${it.key} = ${it.value}"
            }
        }
    }
}
