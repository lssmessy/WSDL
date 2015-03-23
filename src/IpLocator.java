import java.awt.List;
import java.util.ArrayList;

import net.webservicex.*;

public class IpLocator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length!=1)
		{
			System.out.println("Not a valid argument");
		}
		else{
			String ip=args[0];
			
			GeoIPService service=new GeoIPService();//SEI or stub
			GeoIPServiceSoap soap=service.getGeoIPServiceSoap();//SOAP
			try 
			{
				GeoIP geoIp=soap.getGeoIP(ip);//Actual webservice WSDL
				String country=geoIp.getCountryName();
				System.out.println(country);
			}
			catch(Exception e){
				System.out.println(e);
			}
			}
			//It call the actual webservice and get the response for the argument
			
			
			
			
		}

	}


