package com.kbstar.frame;

import java.util.List;

/** 
 * 
 * @author JinheeKIM 010-7659-0206
 *
 * @param <V1> UserDTO
 * @param <V2> AccountDTO
 * @param <V3> TransactionDTO
 * @param <K> String id
 * @param <P> String pwd
 */

public interface BankService<V1, V2, V3, K, P> {
	
	public void register(V1 v) throws Exception;

	public V1 login(K k, P p) throws Exception;
	//로그인 성공 시 v1(user)제공...!

	public V1 getUserInfo(K k) throws Exception;

	public void makeAccount(K k, double balance) throws Exception;

	public List<V2> getAllAcount(K k) throws Exception;

	public List<V3> getAllTr(String acc) throws Exception;

	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception;

}
