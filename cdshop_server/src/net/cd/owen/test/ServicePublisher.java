package net.cd.owen.test;
import javax.xml.ws.Endpoint;

import net.cd.owen.service.productcatalog.ProductCatalogServiceImp;




	public class ServicePublisher {

		 

		  public static void main(String[] args)

		    {

		    //  Endpoint endpoint = Endpoint.create(new net.cd.owen.service.customer.CustomerServiceImp());
		      Endpoint endpoint = Endpoint.create(new net.cd.owen.service.customer.CustomerServiceImp());

		     // endpoint.publish("http://127.0.0.1:8080/cdshop_server/CustomerWs");
		      endpoint.publish("http://127.0.0.1:8080/cdshop_server/CustomerWs");
		    }

}
