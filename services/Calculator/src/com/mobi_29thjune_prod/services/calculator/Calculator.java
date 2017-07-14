/*Generated by WaveMaker Studio*/
package com.mobi_29thjune_prod.services.calculator;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2017-07-04T06:37:22.711Z
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "Calculator", 
                  wsdlLocation = "Calculator.wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class Calculator extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "Calculator");
    public final static QName CalculatorSoap = new QName("http://tempuri.org/", "CalculatorSoap");
    public final static QName CalculatorSoap12 = new QName("http://tempuri.org/", "CalculatorSoap12");
    static {
        URL url = Calculator.class.getResource("Calculator.wsdl");
        if (url == null) {
            url = Calculator.class.getClassLoader().getResource("Calculator.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(Calculator.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "Calculator.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public Calculator(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Calculator(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Calculator() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Calculator(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Calculator(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Calculator(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap")
    public CalculatorSoap getCalculatorSoap() {
        return super.getPort(CalculatorSoap, CalculatorSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap")
    public CalculatorSoap getCalculatorSoap(WebServiceFeature... features) {
        return super.getPort(CalculatorSoap, CalculatorSoap.class, features);
    }
    /**
     *
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap12")
    public CalculatorSoap getCalculatorSoap12() {
        return super.getPort(CalculatorSoap12, CalculatorSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap12")
    public CalculatorSoap getCalculatorSoap12(WebServiceFeature... features) {
        return super.getPort(CalculatorSoap12, CalculatorSoap.class, features);
    }

}