// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiKeyPlainArgs Empty = new GetApiKeyPlainArgs();

    /**
     * A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
     * 
     */
    @Import(name="aPIKeyId", required=true)
    private String aPIKeyId;

    /**
     * @return A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
     * 
     */
    public String aPIKeyId() {
        return this.aPIKeyId;
    }

    private GetApiKeyPlainArgs() {}

    private GetApiKeyPlainArgs(GetApiKeyPlainArgs $) {
        this.aPIKeyId = $.aPIKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiKeyPlainArgs $;

        public Builder() {
            $ = new GetApiKeyPlainArgs();
        }

        public Builder(GetApiKeyPlainArgs defaults) {
            $ = new GetApiKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aPIKeyId A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
         * 
         * @return builder
         * 
         */
        public Builder aPIKeyId(String aPIKeyId) {
            $.aPIKeyId = aPIKeyId;
            return this;
        }

        public GetApiKeyPlainArgs build() {
            $.aPIKeyId = Objects.requireNonNull($.aPIKeyId, "expected parameter 'aPIKeyId' to be non-null");
            return $;
        }
    }

}
