package com.example.demo.test;

import com.sun.javafx.fxml.builder.URLBuilder;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.web.util.UriBuilder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wzh
 * @ClassName: HttpUtil
 * @Description:
 * @Date: 2020/2/27 16:20
 */
public class HttpUtil {
    public static void main(String[] args) {
        // http://matchweb.sports.qq.com/kbs/list?columnId=100000&startTime=2016-09-08&endTime=2016-10-03
        String url="http://matchweb.sports.qq.com/kbs/list";
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("columnId", "100000"));
        params.add(new BasicNameValuePair("startTime", "2016-09-08"));
        params.add(new BasicNameValuePair("endTime", "2016-10-03"));
        HttpClientUtils.httpGet(url,params);
    }
}
