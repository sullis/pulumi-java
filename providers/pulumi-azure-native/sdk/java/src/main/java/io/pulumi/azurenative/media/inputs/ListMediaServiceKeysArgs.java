// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListMediaServiceKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListMediaServiceKeysArgs Empty = new ListMediaServiceKeysArgs();

    /**
     * Name of the Media Service.
     * 
     */
    @InputImport(name="mediaServiceName", required=true)
    private final String mediaServiceName;

    public String getMediaServiceName() {
        return this.mediaServiceName;
    }

    /**
     * Name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListMediaServiceKeysArgs(
        String mediaServiceName,
        String resourceGroupName) {
        this.mediaServiceName = Objects.requireNonNull(mediaServiceName, "expected parameter 'mediaServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListMediaServiceKeysArgs() {
        this.mediaServiceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMediaServiceKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mediaServiceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMediaServiceKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mediaServiceName = defaults.mediaServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setMediaServiceName(String mediaServiceName) {
            this.mediaServiceName = Objects.requireNonNull(mediaServiceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public ListMediaServiceKeysArgs build() {
            return new ListMediaServiceKeysArgs(mediaServiceName, resourceGroupName);
        }
    }
}
