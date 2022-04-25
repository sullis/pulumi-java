// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The key authorization type integration runtime.
 * 
 */
public final class LinkedIntegrationRuntimeKeyAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedIntegrationRuntimeKeyAuthorizationArgs Empty = new LinkedIntegrationRuntimeKeyAuthorizationArgs();

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is &#39;Key&#39;.
     * 
     */
    @Import(name="authorizationType", required=true)
    private Output<String> authorizationType;

    /**
     * @return The authorization type for integration runtime sharing.
     * Expected value is &#39;Key&#39;.
     * 
     */
    public Output<String> authorizationType() {
        return this.authorizationType;
    }

    /**
     * The key used for authorization.
     * 
     */
    @Import(name="key", required=true)
    private Output<SecureStringArgs> key;

    /**
     * @return The key used for authorization.
     * 
     */
    public Output<SecureStringArgs> key() {
        return this.key;
    }

    private LinkedIntegrationRuntimeKeyAuthorizationArgs() {}

    private LinkedIntegrationRuntimeKeyAuthorizationArgs(LinkedIntegrationRuntimeKeyAuthorizationArgs $) {
        this.authorizationType = $.authorizationType;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedIntegrationRuntimeKeyAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedIntegrationRuntimeKeyAuthorizationArgs $;

        public Builder() {
            $ = new LinkedIntegrationRuntimeKeyAuthorizationArgs();
        }

        public Builder(LinkedIntegrationRuntimeKeyAuthorizationArgs defaults) {
            $ = new LinkedIntegrationRuntimeKeyAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationType The authorization type for integration runtime sharing.
         * Expected value is &#39;Key&#39;.
         * 
         * @return builder
         * 
         */
        public Builder authorizationType(Output<String> authorizationType) {
            $.authorizationType = authorizationType;
            return this;
        }

        /**
         * @param authorizationType The authorization type for integration runtime sharing.
         * Expected value is &#39;Key&#39;.
         * 
         * @return builder
         * 
         */
        public Builder authorizationType(String authorizationType) {
            return authorizationType(Output.of(authorizationType));
        }

        /**
         * @param key The key used for authorization.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<SecureStringArgs> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key used for authorization.
         * 
         * @return builder
         * 
         */
        public Builder key(SecureStringArgs key) {
            return key(Output.of(key));
        }

        public LinkedIntegrationRuntimeKeyAuthorizationArgs build() {
            $.authorizationType = Codegen.stringProp("authorizationType").output().arg($.authorizationType).require();
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
