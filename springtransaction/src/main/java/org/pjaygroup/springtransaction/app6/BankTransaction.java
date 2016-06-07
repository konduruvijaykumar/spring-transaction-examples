/**
 * 
 */
package org.pjaygroup.springtransaction.app6;

/**
 * @author Vijay Konduru
 *
 */
public interface BankTransaction {
	void transferFunds(int accNumber1, int accNumber2, int amount) throws Exception;
	void selectData();
	void tryPrint();
}
