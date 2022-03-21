// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notebooks;

import io.pulumi.azurenative.notebooks.inputs.NotebookResourceSystemDataArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotebookProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotebookProxyArgs Empty = new NotebookProxyArgs();

    /**
     * The friendly string identifier of the creator of the NotebookProxy resource.
     * 
     */
    @Import(name="hostname")
      private final @Nullable Output<String> hostname;

    public Output<String> getHostname() {
        return this.hostname == null ? Output.empty() : this.hostname;
    }

    /**
     * The public DNS name
     * 
     */
    @Import(name="publicDns")
      private final @Nullable Output<String> publicDns;

    public Output<String> getPublicDns() {
        return this.publicDns == null ? Output.empty() : this.publicDns;
    }

    /**
     * Allow public network access on a V-Net locked notebook resource
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<String> publicNetworkAccess;

    public Output<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Output.empty() : this.publicNetworkAccess;
    }

    /**
     * The region of the NotebookProxy resource.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Output.empty() : this.resourceName;
    }

    /**
     * The alternate application ID used for auth token request in the data plane
     * 
     */
    @Import(name="secondaryAppId")
      private final @Nullable Output<String> secondaryAppId;

    public Output<String> getSecondaryAppId() {
        return this.secondaryAppId == null ? Output.empty() : this.secondaryAppId;
    }

    /**
     * System data for notebook resource
     * 
     */
    @Import(name="systemData")
      private final @Nullable Output<NotebookResourceSystemDataArgs> systemData;

    public Output<NotebookResourceSystemDataArgs> getSystemData() {
        return this.systemData == null ? Output.empty() : this.systemData;
    }

    public NotebookProxyArgs(
        @Nullable Output<String> hostname,
        @Nullable Output<String> publicDns,
        @Nullable Output<String> publicNetworkAccess,
        @Nullable Output<String> region,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<String> secondaryAppId,
        @Nullable Output<NotebookResourceSystemDataArgs> systemData) {
        this.hostname = hostname;
        this.publicDns = publicDns;
        this.publicNetworkAccess = publicNetworkAccess;
        this.region = region;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.secondaryAppId = secondaryAppId;
        this.systemData = systemData;
    }

    private NotebookProxyArgs() {
        this.hostname = Output.empty();
        this.publicDns = Output.empty();
        this.publicNetworkAccess = Output.empty();
        this.region = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
        this.secondaryAppId = Output.empty();
        this.systemData = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostname;
        private @Nullable Output<String> publicDns;
        private @Nullable Output<String> publicNetworkAccess;
        private @Nullable Output<String> region;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<String> secondaryAppId;
        private @Nullable Output<NotebookResourceSystemDataArgs> systemData;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.publicDns = defaults.publicDns;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.region = defaults.region;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.secondaryAppId = defaults.secondaryAppId;
    	      this.systemData = defaults.systemData;
        }

        public Builder hostname(@Nullable Output<String> hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = Output.ofNullable(hostname);
            return this;
        }
        public Builder publicDns(@Nullable Output<String> publicDns) {
            this.publicDns = publicDns;
            return this;
        }
        public Builder publicDns(@Nullable String publicDns) {
            this.publicDns = Output.ofNullable(publicDns);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Output<String> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = Output.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Output.ofNullable(resourceName);
            return this;
        }
        public Builder secondaryAppId(@Nullable Output<String> secondaryAppId) {
            this.secondaryAppId = secondaryAppId;
            return this;
        }
        public Builder secondaryAppId(@Nullable String secondaryAppId) {
            this.secondaryAppId = Output.ofNullable(secondaryAppId);
            return this;
        }
        public Builder systemData(@Nullable Output<NotebookResourceSystemDataArgs> systemData) {
            this.systemData = systemData;
            return this;
        }
        public Builder systemData(@Nullable NotebookResourceSystemDataArgs systemData) {
            this.systemData = Output.ofNullable(systemData);
            return this;
        }        public NotebookProxyArgs build() {
            return new NotebookProxyArgs(hostname, publicDns, publicNetworkAccess, region, resourceGroupName, resourceName, secondaryAppId, systemData);
        }
    }
}
