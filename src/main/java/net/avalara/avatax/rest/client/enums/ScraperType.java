import java.util.HashMap;

package net.avalara.avatax.rest.client.enums;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Type of verification task
 */
public enum ScraperType {
    /** 
     * Indicates that is is a login type
     */
    Login(1),

    /** 
     * Indicates that it is a Customer DOR Data type
     */
    CustomerDorData(2),

    private int value;
	private static Map map = new HashMap<>();
	
	private ScraperType(int value) {
		this.value = value;
	}
	
	static {
		for (ScraperType enumName : ScraperType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static ScraperType valueOf(int intValue) {
		return (ScraperType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
