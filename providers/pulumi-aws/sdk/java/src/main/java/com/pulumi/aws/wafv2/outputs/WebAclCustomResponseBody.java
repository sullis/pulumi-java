// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclCustomResponseBody {
    /**
     * @return The payload of the custom response.
     * 
     */
    private final String content;
    /**
     * @return The type of content in the payload that you are defining in the `content` argument. Valid values are `TEXT_PLAIN`, `TEXT_HTML`, or `APPLICATION_JSON`.
     * 
     */
    private final String contentType;
    /**
     * @return A unique key identifying the custom response body. This is referenced by the `custom_response_body_key` argument in the Custom Response block.
     * 
     */
    private final String key;

    @CustomType.Constructor
    private WebAclCustomResponseBody(
        @CustomType.Parameter("content") String content,
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("key") String key) {
        this.content = content;
        this.contentType = contentType;
        this.key = key;
    }

    /**
     * @return The payload of the custom response.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return The type of content in the payload that you are defining in the `content` argument. Valid values are `TEXT_PLAIN`, `TEXT_HTML`, or `APPLICATION_JSON`.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return A unique key identifying the custom response body. This is referenced by the `custom_response_body_key` argument in the Custom Response block.
     * 
     */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclCustomResponseBody defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String contentType;
        private String key;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclCustomResponseBody defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.key = defaults.key;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }        public WebAclCustomResponseBody build() {
            return new WebAclCustomResponseBody(content, contentType, key);
        }
    }
}
