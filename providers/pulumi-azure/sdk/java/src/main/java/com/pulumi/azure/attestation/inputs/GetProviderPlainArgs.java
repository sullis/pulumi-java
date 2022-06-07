// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.attestation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProviderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProviderPlainArgs Empty = new GetProviderPlainArgs();

    /**
     * The name of this Attestation Provider.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this Attestation Provider.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Attestation Provider exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the Attestation Provider exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetProviderPlainArgs() {}

    private GetProviderPlainArgs(GetProviderPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProviderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProviderPlainArgs $;

        public Builder() {
            $ = new GetProviderPlainArgs();
        }

        public Builder(GetProviderPlainArgs defaults) {
            $ = new GetProviderPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this Attestation Provider.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Attestation Provider exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetProviderPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
