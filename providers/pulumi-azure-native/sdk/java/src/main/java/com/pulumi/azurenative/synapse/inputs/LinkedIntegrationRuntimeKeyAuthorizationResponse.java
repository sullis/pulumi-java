// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.azurenative.synapse.inputs.SecureStringResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The key authorization type integration runtime.
 * 
 */
public final class LinkedIntegrationRuntimeKeyAuthorizationResponse extends com.pulumi.resources.InvokeArgs {

    public static final LinkedIntegrationRuntimeKeyAuthorizationResponse Empty = new LinkedIntegrationRuntimeKeyAuthorizationResponse();

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is &#39;Key&#39;.
     * 
     */
    @Import(name="authorizationType", required=true)
    private String authorizationType;

    /**
     * @return The authorization type for integration runtime sharing.
     * Expected value is &#39;Key&#39;.
     * 
     */
    public String authorizationType() {
        return this.authorizationType;
    }

    /**
     * The key used for authorization.
     * 
     */
    @Import(name="key", required=true)
    private SecureStringResponse key;

    /**
     * @return The key used for authorization.
     * 
     */
    public SecureStringResponse key() {
        return this.key;
    }

    private LinkedIntegrationRuntimeKeyAuthorizationResponse() {}

    private LinkedIntegrationRuntimeKeyAuthorizationResponse(LinkedIntegrationRuntimeKeyAuthorizationResponse $) {
        this.authorizationType = $.authorizationType;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedIntegrationRuntimeKeyAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedIntegrationRuntimeKeyAuthorizationResponse $;

        public Builder() {
            $ = new LinkedIntegrationRuntimeKeyAuthorizationResponse();
        }

        public Builder(LinkedIntegrationRuntimeKeyAuthorizationResponse defaults) {
            $ = new LinkedIntegrationRuntimeKeyAuthorizationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationType The authorization type for integration runtime sharing.
         * Expected value is &#39;Key&#39;.
         * 
         * @return builder
         * 
         */
        public Builder authorizationType(String authorizationType) {
            $.authorizationType = authorizationType;
            return this;
        }

        /**
         * @param key The key used for authorization.
         * 
         * @return builder
         * 
         */
        public Builder key(SecureStringResponse key) {
            $.key = key;
            return this;
        }

        public LinkedIntegrationRuntimeKeyAuthorizationResponse build() {
            $.authorizationType = Codegen.stringProp("authorizationType").arg($.authorizationType).require();
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
