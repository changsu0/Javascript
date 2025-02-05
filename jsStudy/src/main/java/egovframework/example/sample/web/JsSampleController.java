/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Class Name : EgovSampleController.java
 * @Description : EgovSample Controller Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2009.03.16           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */

@Controller
public class JsSampleController {

	/**
	 * 화면 이동한다.
	 * @param model
	 * @return "jsSample"
	 * @exception Exception
	 */
	@RequestMapping(value = "/jsSample.do")
	public String viewJsSample(ModelMap model) throws Exception {

		return "jsStudy/jsSample";
	}

	// cs
	// jh
	// dh
	// es
	
	/**
	 * 화면 이동한다.
	 * @param model
	 * @return "jsSample"
	 * @exception Exception
	 */
	@RequestMapping(value = "/jsSampleCS.do")
	public String viewJsSampleCS(ModelMap model) throws Exception {
		
		return "jsStudy/jsSampleCS";
	}
	
	/**
	 * 화면 이동한다.
	 * @param model
	 * @return "jsSample"
	 * @exception Exception
	 */
	@RequestMapping(value = "/jsSampleJH.do")
	public String viewJsSampleJH(ModelMap model) throws Exception {
		
		return "jsStudy/jsSampleJH";
	}
	
	/**
	 * 화면 이동한다.
	 * @param model
	 * @return "jsSample"
	 * @exception Exception
	 */
	@RequestMapping(value = "/jsSampleDH.do")
	public String viewJsSampleDH(ModelMap model) throws Exception {
		
		return "jsStudy/jsSampleDH";
	}
	
	/**
	 * 화면 이동한다.
	 * @param model
	 * @return "jsSample"
	 * @exception Exception
	 */
	@RequestMapping(value = "/jsSampleES.do")
	public String viewJsSampleES(ModelMap model) throws Exception {
		
		return "jsStudy/jsSampleES";
	}

}
