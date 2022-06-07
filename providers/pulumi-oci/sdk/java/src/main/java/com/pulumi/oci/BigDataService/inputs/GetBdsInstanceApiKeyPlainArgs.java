// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.BigDataService.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBdsInstanceApiKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBdsInstanceApiKeyPlainArgs Empty = new GetBdsInstanceApiKeyPlainArgs();

    /**
     * The API key identifier.
     * 
     */
    @Import(name="apiKeyId", required=true)
    private String apiKeyId;

    /**
     * @return The API key identifier.
     * 
     */
    public String apiKeyId() {
        return this.apiKeyId;
    }

    /**
     * The OCID of the cluster.
     * 
     */
    @Import(name="bdsInstanceId", required=true)
    private String bdsInstanceId;

    /**
     * @return The OCID of the cluster.
     * 
     */
    public String bdsInstanceId() {
        return this.bdsInstanceId;
    }

    private GetBdsInstanceApiKeyPlainArgs() {}

    private GetBdsInstanceApiKeyPlainArgs(GetBdsInstanceApiKeyPlainArgs $) {
        this.apiKeyId = $.apiKeyId;
        this.bdsInstanceId = $.bdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBdsInstanceApiKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBdsInstanceApiKeyPlainArgs $;

        public Builder() {
            $ = new GetBdsInstanceApiKeyPlainArgs();
        }

        public Builder(GetBdsInstanceApiKeyPlainArgs defaults) {
            $ = new GetBdsInstanceApiKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKeyId The API key identifier.
         * 
         * @return builder
         * 
         */
        public Builder apiKeyId(String apiKeyId) {
            $.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * @param bdsInstanceId The OCID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            $.bdsInstanceId = bdsInstanceId;
            return this;
        }

        public GetBdsInstanceApiKeyPlainArgs build() {
            $.apiKeyId = Objects.requireNonNull($.apiKeyId, "expected parameter 'apiKeyId' to be non-null");
            $.bdsInstanceId = Objects.requireNonNull($.bdsInstanceId, "expected parameter 'bdsInstanceId' to be non-null");
            return $;
        }
    }

}
