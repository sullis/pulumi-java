// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.outputs;

import io.pulumi.awsnative.opensearchservice.outputs.DomainClusterConfig;
import io.pulumi.awsnative.opensearchservice.outputs.DomainCognitoOptions;
import io.pulumi.awsnative.opensearchservice.outputs.DomainEBSOptions;
import io.pulumi.awsnative.opensearchservice.outputs.DomainEncryptionAtRestOptions;
import io.pulumi.awsnative.opensearchservice.outputs.DomainEndpointOptions;
import io.pulumi.awsnative.opensearchservice.outputs.DomainNodeToNodeEncryptionOptions;
import io.pulumi.awsnative.opensearchservice.outputs.DomainServiceSoftwareOptions;
import io.pulumi.awsnative.opensearchservice.outputs.DomainSnapshotOptions;
import io.pulumi.awsnative.opensearchservice.outputs.DomainTag;
import io.pulumi.awsnative.opensearchservice.outputs.DomainVPCOptions;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDomainResult {
    private final @Nullable Object accessPolicies;
    private final @Nullable Object advancedOptions;
    private final @Nullable String arn;
    private final @Nullable DomainClusterConfig clusterConfig;
    private final @Nullable DomainCognitoOptions cognitoOptions;
    private final @Nullable String domainArn;
    private final @Nullable String domainEndpoint;
    private final @Nullable DomainEndpointOptions domainEndpointOptions;
    private final @Nullable Object domainEndpoints;
    private final @Nullable DomainEBSOptions eBSOptions;
    private final @Nullable DomainEncryptionAtRestOptions encryptionAtRestOptions;
    private final @Nullable String engineVersion;
    private final @Nullable String id;
    private final @Nullable Object logPublishingOptions;
    private final @Nullable DomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
    private final @Nullable DomainServiceSoftwareOptions serviceSoftwareOptions;
    private final @Nullable DomainSnapshotOptions snapshotOptions;
    private final @Nullable List<DomainTag> tags;
    private final @Nullable DomainVPCOptions vPCOptions;

    @OutputCustomType.Constructor({"accessPolicies","advancedOptions","arn","clusterConfig","cognitoOptions","domainArn","domainEndpoint","domainEndpointOptions","domainEndpoints","eBSOptions","encryptionAtRestOptions","engineVersion","id","logPublishingOptions","nodeToNodeEncryptionOptions","serviceSoftwareOptions","snapshotOptions","tags","vPCOptions"})
    private GetDomainResult(
        @Nullable Object accessPolicies,
        @Nullable Object advancedOptions,
        @Nullable String arn,
        @Nullable DomainClusterConfig clusterConfig,
        @Nullable DomainCognitoOptions cognitoOptions,
        @Nullable String domainArn,
        @Nullable String domainEndpoint,
        @Nullable DomainEndpointOptions domainEndpointOptions,
        @Nullable Object domainEndpoints,
        @Nullable DomainEBSOptions eBSOptions,
        @Nullable DomainEncryptionAtRestOptions encryptionAtRestOptions,
        @Nullable String engineVersion,
        @Nullable String id,
        @Nullable Object logPublishingOptions,
        @Nullable DomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions,
        @Nullable DomainServiceSoftwareOptions serviceSoftwareOptions,
        @Nullable DomainSnapshotOptions snapshotOptions,
        @Nullable List<DomainTag> tags,
        @Nullable DomainVPCOptions vPCOptions) {
        this.accessPolicies = accessPolicies;
        this.advancedOptions = advancedOptions;
        this.arn = arn;
        this.clusterConfig = clusterConfig;
        this.cognitoOptions = cognitoOptions;
        this.domainArn = domainArn;
        this.domainEndpoint = domainEndpoint;
        this.domainEndpointOptions = domainEndpointOptions;
        this.domainEndpoints = domainEndpoints;
        this.eBSOptions = eBSOptions;
        this.encryptionAtRestOptions = encryptionAtRestOptions;
        this.engineVersion = engineVersion;
        this.id = id;
        this.logPublishingOptions = logPublishingOptions;
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
        this.serviceSoftwareOptions = serviceSoftwareOptions;
        this.snapshotOptions = snapshotOptions;
        this.tags = tags;
        this.vPCOptions = vPCOptions;
    }

    public Optional<Object> getAccessPolicies() {
        return Optional.ofNullable(this.accessPolicies);
    }
    public Optional<Object> getAdvancedOptions() {
        return Optional.ofNullable(this.advancedOptions);
    }
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<DomainClusterConfig> getClusterConfig() {
        return Optional.ofNullable(this.clusterConfig);
    }
    public Optional<DomainCognitoOptions> getCognitoOptions() {
        return Optional.ofNullable(this.cognitoOptions);
    }
    public Optional<String> getDomainArn() {
        return Optional.ofNullable(this.domainArn);
    }
    public Optional<String> getDomainEndpoint() {
        return Optional.ofNullable(this.domainEndpoint);
    }
    public Optional<DomainEndpointOptions> getDomainEndpointOptions() {
        return Optional.ofNullable(this.domainEndpointOptions);
    }
    public Optional<Object> getDomainEndpoints() {
        return Optional.ofNullable(this.domainEndpoints);
    }
    public Optional<DomainEBSOptions> getEBSOptions() {
        return Optional.ofNullable(this.eBSOptions);
    }
    public Optional<DomainEncryptionAtRestOptions> getEncryptionAtRestOptions() {
        return Optional.ofNullable(this.encryptionAtRestOptions);
    }
    public Optional<String> getEngineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Object> getLogPublishingOptions() {
        return Optional.ofNullable(this.logPublishingOptions);
    }
    public Optional<DomainNodeToNodeEncryptionOptions> getNodeToNodeEncryptionOptions() {
        return Optional.ofNullable(this.nodeToNodeEncryptionOptions);
    }
    public Optional<DomainServiceSoftwareOptions> getServiceSoftwareOptions() {
        return Optional.ofNullable(this.serviceSoftwareOptions);
    }
    public Optional<DomainSnapshotOptions> getSnapshotOptions() {
        return Optional.ofNullable(this.snapshotOptions);
    }
    public List<DomainTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<DomainVPCOptions> getVPCOptions() {
        return Optional.ofNullable(this.vPCOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accessPolicies;
        private @Nullable Object advancedOptions;
        private @Nullable String arn;
        private @Nullable DomainClusterConfig clusterConfig;
        private @Nullable DomainCognitoOptions cognitoOptions;
        private @Nullable String domainArn;
        private @Nullable String domainEndpoint;
        private @Nullable DomainEndpointOptions domainEndpointOptions;
        private @Nullable Object domainEndpoints;
        private @Nullable DomainEBSOptions eBSOptions;
        private @Nullable DomainEncryptionAtRestOptions encryptionAtRestOptions;
        private @Nullable String engineVersion;
        private @Nullable String id;
        private @Nullable Object logPublishingOptions;
        private @Nullable DomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
        private @Nullable DomainServiceSoftwareOptions serviceSoftwareOptions;
        private @Nullable DomainSnapshotOptions snapshotOptions;
        private @Nullable List<DomainTag> tags;
        private @Nullable DomainVPCOptions vPCOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.advancedOptions = defaults.advancedOptions;
    	      this.arn = defaults.arn;
    	      this.clusterConfig = defaults.clusterConfig;
    	      this.cognitoOptions = defaults.cognitoOptions;
    	      this.domainArn = defaults.domainArn;
    	      this.domainEndpoint = defaults.domainEndpoint;
    	      this.domainEndpointOptions = defaults.domainEndpointOptions;
    	      this.domainEndpoints = defaults.domainEndpoints;
    	      this.eBSOptions = defaults.eBSOptions;
    	      this.encryptionAtRestOptions = defaults.encryptionAtRestOptions;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.logPublishingOptions = defaults.logPublishingOptions;
    	      this.nodeToNodeEncryptionOptions = defaults.nodeToNodeEncryptionOptions;
    	      this.serviceSoftwareOptions = defaults.serviceSoftwareOptions;
    	      this.snapshotOptions = defaults.snapshotOptions;
    	      this.tags = defaults.tags;
    	      this.vPCOptions = defaults.vPCOptions;
        }

        public Builder setAccessPolicies(@Nullable Object accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }

        public Builder setAdvancedOptions(@Nullable Object advancedOptions) {
            this.advancedOptions = advancedOptions;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setClusterConfig(@Nullable DomainClusterConfig clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }

        public Builder setCognitoOptions(@Nullable DomainCognitoOptions cognitoOptions) {
            this.cognitoOptions = cognitoOptions;
            return this;
        }

        public Builder setDomainArn(@Nullable String domainArn) {
            this.domainArn = domainArn;
            return this;
        }

        public Builder setDomainEndpoint(@Nullable String domainEndpoint) {
            this.domainEndpoint = domainEndpoint;
            return this;
        }

        public Builder setDomainEndpointOptions(@Nullable DomainEndpointOptions domainEndpointOptions) {
            this.domainEndpointOptions = domainEndpointOptions;
            return this;
        }

        public Builder setDomainEndpoints(@Nullable Object domainEndpoints) {
            this.domainEndpoints = domainEndpoints;
            return this;
        }

        public Builder setEBSOptions(@Nullable DomainEBSOptions eBSOptions) {
            this.eBSOptions = eBSOptions;
            return this;
        }

        public Builder setEncryptionAtRestOptions(@Nullable DomainEncryptionAtRestOptions encryptionAtRestOptions) {
            this.encryptionAtRestOptions = encryptionAtRestOptions;
            return this;
        }

        public Builder setEngineVersion(@Nullable String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLogPublishingOptions(@Nullable Object logPublishingOptions) {
            this.logPublishingOptions = logPublishingOptions;
            return this;
        }

        public Builder setNodeToNodeEncryptionOptions(@Nullable DomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
            this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
            return this;
        }

        public Builder setServiceSoftwareOptions(@Nullable DomainServiceSoftwareOptions serviceSoftwareOptions) {
            this.serviceSoftwareOptions = serviceSoftwareOptions;
            return this;
        }

        public Builder setSnapshotOptions(@Nullable DomainSnapshotOptions snapshotOptions) {
            this.snapshotOptions = snapshotOptions;
            return this;
        }

        public Builder setTags(@Nullable List<DomainTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVPCOptions(@Nullable DomainVPCOptions vPCOptions) {
            this.vPCOptions = vPCOptions;
            return this;
        }

        public GetDomainResult build() {
            return new GetDomainResult(accessPolicies, advancedOptions, arn, clusterConfig, cognitoOptions, domainArn, domainEndpoint, domainEndpointOptions, domainEndpoints, eBSOptions, encryptionAtRestOptions, engineVersion, id, logPublishingOptions, nodeToNodeEncryptionOptions, serviceSoftwareOptions, snapshotOptions, tags, vPCOptions);
        }
    }
}
