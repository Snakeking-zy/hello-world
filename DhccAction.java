package com.dhcc.common.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.dhcc.common.utils.JSONUtil;
import com.eway.framework.extcomponent.security.action.SecurityAction;
import com.opensymphony.webwork.ServletActionContext;

public class DhccAction extends SecurityAction {

    
    /**
     * 作用：异步方式向前台页面发送信息
     * 作者：zyxun
     * 日期：2012-07-12
     * @param mapRtn
     * 			返回的信息
     */
    public void responseWrite(Map<String,Object> mapRtn){
    	HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		try {
			response.getWriter().write(JSONUtil.map2json(mapRtn));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * 作用：异步方式向前台页面发送信息
     * 作者：zyxun
     * 日期：2012-07-12
     * @param strRtn
     * 			返回的信息
     */
    public void responseWrite(String strRtn){
    	HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		try {
			if (strRtn != null) {
				response.getWriter().write(strRtn);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
