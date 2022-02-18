// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.autonomousdevelopmentplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDataPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataPoolArgs Empty = new GetDataPoolArgs();

    /**
     * The name of the ADP account
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the Data Pool
     * 
     */
    @InputImport(name="dataPoolName", required=true)
    private final String dataPoolName;

    public String getDataPoolName() {
        return this.dataPoolName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDataPoolArgs(
        String accountName,
        String dataPoolName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataPoolName = Objects.requireNonNull(dataPoolName, "expected parameter 'dataPoolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDataPoolArgs() {
        this.accountName = null;
        this.dataPoolName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String dataPoolName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataPoolName = defaults.dataPoolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setDataPoolName(String dataPoolName) {
            this.dataPoolName = Objects.requireNonNull(dataPoolName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetDataPoolArgs build() {
            return new GetDataPoolArgs(accountName, dataPoolName, resourceGroupName);
        }
    }
}
