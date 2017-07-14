/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

package com.mobi_29thjune_prod.services.calculator.services;
import com.mobi_29thjune_prod.services.calculator.*;
import java.util.List;

import com.wavemaker.runtime.soap.util.SoapSettingsResolver;
import com.wavemaker.runtime.soap.SoapServiceSettings;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.xml.ws.BindingProvider;



@Service
public class CalculatorService{

    @Autowired
    @Qualifier("CalculatorSoapServiceSettings")
    private SoapServiceSettings soapServiceSettings;


	public AddResponse add(  com.mobi_29thjune_prod.services.calculator.Add parameters )
	          {
 	    Calculator calculator = new Calculator();
 CalculatorSoap calculatorsoap = calculator.getCalculatorSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)calculatorsoap, soapServiceSettings);
 return calculatorsoap.add(parameters );
	}

	public DivideResponse divide(  com.mobi_29thjune_prod.services.calculator.Divide parameters )
	          {
 	    Calculator calculator = new Calculator();
 CalculatorSoap calculatorsoap = calculator.getCalculatorSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)calculatorsoap, soapServiceSettings);
 return calculatorsoap.divide(parameters );
	}

	public MultiplyResponse multiply(  com.mobi_29thjune_prod.services.calculator.Multiply parameters )
	          {
 	    Calculator calculator = new Calculator();
 CalculatorSoap calculatorsoap = calculator.getCalculatorSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)calculatorsoap, soapServiceSettings);
 return calculatorsoap.multiply(parameters );
	}

	public SubtractResponse subtract(  com.mobi_29thjune_prod.services.calculator.Subtract parameters )
	          {
 	    Calculator calculator = new Calculator();
 CalculatorSoap calculatorsoap = calculator.getCalculatorSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)calculatorsoap, soapServiceSettings);
 return calculatorsoap.subtract(parameters );
	}
}