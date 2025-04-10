### Workflow

1. A SOAP client (like SOAP UI or Postman with XML) sends the request in xml format
    
    ```xml
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                      xmlns:stud="http://example.com/students">
       <soapenv:Header/>
       <soapenv:Body>
          <stud:GetStudentRequest>
             <name>John</name>
          </stud:GetStudentRequest>
       </soapenv:Body>
    </soapenv:Envelope>
    ```
    
2. `MessageDispatcherServlet` Intercepts the Request and try to route them to SOAP endpoints.
3. Spring Looks for Matching `@Endpoint`
    
    Spring WS uses:
    
    - **Namespace URI**: `http://example.com/students`
    - **Local Part (XML element)**: `GetStudentRequest`
4. JAXB Unmarshals the XML into Java Object
    1. Spring uses JAXB to convert the `<GetStudentRequest>` XML element into a Java object of this class.
5. Endpoint Method Calls Service Logic
6. JAXB Marshals the Java Response to XML
7. SOAP Response Goes Back to the Client
