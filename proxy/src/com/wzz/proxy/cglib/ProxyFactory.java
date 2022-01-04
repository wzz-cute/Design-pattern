package com.wzz.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Optional;

public class ProxyFactory implements MethodInterceptor {

	//ά��һ��Ŀ�����
	private Object target;
	
	//������������һ��������Ķ���
	public ProxyFactory(Object target) {
		this.target = target;
	}

	//����һ���������:  �� target ����Ĵ������

	/**
	 *	ʹ��cglib���ڴ��д���һ�������࣬�̳е�ǰҪ��������࣬
	 *	������ķ����뱻������һ����ֻ���м����һ��Ĵ����
	 * @return
	 */
	public Object getProxyInstance() {
		//1. ����һ��������
		Enhancer enhancer = new Enhancer();
		//2. ���ø���
		enhancer.setSuperclass(target.getClass());
		//3. ���ûص�����
		enhancer.setCallback(this);
		//4. ����������󣬼��������
		return enhancer.create();
		
	}
	

	//��д  intercept �����������Ŀ�����ķ���
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Cglib����ģʽ ~~ ��ʼ");
		Object returnVal = method.invoke(target, args);
		System.out.println("Cglib����ģʽ ~~ �ύ");
		return returnVal;
	}

}
