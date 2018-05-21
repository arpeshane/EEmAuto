package com.nice.eem.viewResolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.nice.eem.excelutil.ConcentrixFinalReport;

import java.util.Locale;

/**
 * Created by aboullaite on 2017-02-24.
 */
public class ExcelViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        ConcentrixFinalReport view = new ConcentrixFinalReport();
        return view;
    }
}
