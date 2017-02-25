package in.grounddevelopers.webapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
WebView webView;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView=(WebView)findViewById(R.id.webView);
        WebSettings param=webView.getSettings();
        param.setJavaScriptEnabled(true);
        Intent link=getIntent();
        String uri=link.getStringExtra("uri");
        webView.setWebViewClient(new MyWebviewClient());
        webView.loadUrl(uri);
    }
    private class MyWebviewClient extends WebViewClient{
        public MyWebviewClient(){}
        public void onPAgeFinished(WebView paramWebView,String paramString){
            super.onPageFinished(paramWebView,paramString);
            WebActivity.this.progressDialog.dismiss();

        }
        public void onPageStarted(WebView paramWebView,String paramString,Bitmap paramBitmap)
        {
            super.onPageStarted(paramWebView, paramString, paramBitmap);
            WebActivity.this.progressDialog=new ProgressDialog(WebActivity.this);
            WebActivity.this.progressDialog.setMessage("Please wait for loading");
            WebActivity.this.progressDialog.show();

        }
        public boolean shouldOverrideUrlLoading(WebView paramWebView,String paramString){
            paramWebView.loadUrl(paramString);
            return true;
        }
    }
}
