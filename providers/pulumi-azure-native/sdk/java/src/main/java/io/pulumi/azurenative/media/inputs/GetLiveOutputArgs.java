// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLiveOutputArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLiveOutputArgs Empty = new GetLiveOutputArgs();

    /**
     * The Media Services account name.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the live event, maximum length is 32.
     * 
     */
    @InputImport(name="liveEventName", required=true)
      private final String liveEventName;

    public String getLiveEventName() {
        return this.liveEventName;
    }

    /**
     * The name of the live output.
     * 
     */
    @InputImport(name="liveOutputName", required=true)
      private final String liveOutputName;

    public String getLiveOutputName() {
        return this.liveOutputName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetLiveOutputArgs(
        String accountName,
        String liveEventName,
        String liveOutputName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.liveEventName = Objects.requireNonNull(liveEventName, "expected parameter 'liveEventName' to be non-null");
        this.liveOutputName = Objects.requireNonNull(liveOutputName, "expected parameter 'liveOutputName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetLiveOutputArgs() {
        this.accountName = null;
        this.liveEventName = null;
        this.liveOutputName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String liveEventName;
        private String liveOutputName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLiveOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.liveEventName = defaults.liveEventName;
    	      this.liveOutputName = defaults.liveOutputName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setLiveEventName(String liveEventName) {
            this.liveEventName = Objects.requireNonNull(liveEventName);
            return this;
        }

        public Builder setLiveOutputName(String liveOutputName) {
            this.liveOutputName = Objects.requireNonNull(liveOutputName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetLiveOutputArgs build() {
            return new GetLiveOutputArgs(accountName, liveEventName, liveOutputName, resourceGroupName);
        }
    }
}