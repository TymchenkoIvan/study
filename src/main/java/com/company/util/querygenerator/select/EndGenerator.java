package com.company.util.querygenerator.select;

import com.company.service.bean.SortFormBean;

public class EndGenerator extends Generator{

	@Override
	protected StringBuilder append(SortFormBean bean, StringBuilder string) {
		string.append(QueryConstants.END);
		
		return string;
	}

}
