package com.damai.social.share;

import android.content.Context;

/**
 * ClassName: DMSocialShareConfig
 * Description: 第三方信息配置
 */
public class DMSocialShareConfig {
    public Context context;
    public String wechatAppId;
    public String qqAppId;
    public String sinaAppKey;
    public String alipayAppId;

    private DMSocialShareConfig(final Builder builder) {
        this.context = builder.context;
        this.wechatAppId = builder.wechatAppId;
        this.qqAppId = builder.qqAppId;
        this.sinaAppKey = builder.sinaAppKey;
        this.alipayAppId = builder.alipayAppId;
    }

    public static class Builder {
        private Context context;
        private String qqAppId;
        private String sinaAppKey;
        private String wechatAppId;
        private String alipayAppId;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder configWeChat(String weChatAppId) {
            this.wechatAppId = weChatAppId;
            return this;
        }

        public Builder configQQ(String qqAppId) {
            this.qqAppId = qqAppId;
            return this;
        }

        public Builder configSina(String appKey) {
            this.sinaAppKey = appKey;
            return this;
        }

        public Builder configAlipay(String alipayAppId){
            this.alipayAppId = alipayAppId;
            return this;
        }

        public DMSocialShareConfig build() {
            return new DMSocialShareConfig(Builder.this);
        }
    }

}
