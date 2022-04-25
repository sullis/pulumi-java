// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.ScaleRuleAuthResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App container Custom scaling rule.
 * 
 */
public final class HttpScaleRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpScaleRuleResponse Empty = new HttpScaleRuleResponse();

    /**
     * Authentication secrets for the custom scale rule.
     * 
     */
    @Import(name="auth")
    private @Nullable List<ScaleRuleAuthResponse> auth;

    /**
     * @return Authentication secrets for the custom scale rule.
     * 
     */
    public Optional<List<ScaleRuleAuthResponse>> auth() {
        return Optional.ofNullable(this.auth);
    }

    /**
     * Metadata properties to describe http scale rule.
     * 
     */
    @Import(name="metadata")
    private @Nullable Map<String,String> metadata;

    /**
     * @return Metadata properties to describe http scale rule.
     * 
     */
    public Optional<Map<String,String>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    private HttpScaleRuleResponse() {}

    private HttpScaleRuleResponse(HttpScaleRuleResponse $) {
        this.auth = $.auth;
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpScaleRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpScaleRuleResponse $;

        public Builder() {
            $ = new HttpScaleRuleResponse();
        }

        public Builder(HttpScaleRuleResponse defaults) {
            $ = new HttpScaleRuleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param auth Authentication secrets for the custom scale rule.
         * 
         * @return builder
         * 
         */
        public Builder auth(@Nullable List<ScaleRuleAuthResponse> auth) {
            $.auth = auth;
            return this;
        }

        /**
         * @param auth Authentication secrets for the custom scale rule.
         * 
         * @return builder
         * 
         */
        public Builder auth(ScaleRuleAuthResponse... auth) {
            return auth(List.of(auth));
        }

        /**
         * @param metadata Metadata properties to describe http scale rule.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Map<String,String> metadata) {
            $.metadata = metadata;
            return this;
        }

        public HttpScaleRuleResponse build() {
            return $;
        }
    }

}
