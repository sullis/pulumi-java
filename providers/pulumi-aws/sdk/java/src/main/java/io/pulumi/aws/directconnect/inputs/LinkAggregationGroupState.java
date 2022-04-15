// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkAggregationGroupState extends io.pulumi.resources.ResourceArgs {

    public static final LinkAggregationGroupState Empty = new LinkAggregationGroupState();

    /**
     * The ARN of the LAG.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The ID of an existing dedicated connection to migrate to the LAG.
     * 
     */
    @Import(name="connectionId")
      private final @Nullable Output<String> connectionId;

    public Output<String> connectionId() {
        return this.connectionId == null ? Codegen.empty() : this.connectionId;
    }

    /**
     * The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
     * 
     */
    @Import(name="connectionsBandwidth")
      private final @Nullable Output<String> connectionsBandwidth;

    public Output<String> connectionsBandwidth() {
        return this.connectionsBandwidth == null ? Codegen.empty() : this.connectionsBandwidth;
    }

    /**
     * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> forceDestroy() {
        return this.forceDestroy == null ? Codegen.empty() : this.forceDestroy;
    }

    /**
     * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    @Import(name="hasLogicalRedundancy")
      private final @Nullable Output<String> hasLogicalRedundancy;

    public Output<String> hasLogicalRedundancy() {
        return this.hasLogicalRedundancy == null ? Codegen.empty() : this.hasLogicalRedundancy;
    }

    @Import(name="jumboFrameCapable")
      private final @Nullable Output<Boolean> jumboFrameCapable;

    public Output<Boolean> jumboFrameCapable() {
        return this.jumboFrameCapable == null ? Codegen.empty() : this.jumboFrameCapable;
    }

    /**
     * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the LAG.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the AWS account that owns the LAG.
     * 
     */
    @Import(name="ownerAccountId")
      private final @Nullable Output<String> ownerAccountId;

    public Output<String> ownerAccountId() {
        return this.ownerAccountId == null ? Codegen.empty() : this.ownerAccountId;
    }

    /**
     * The name of the service provider associated with the LAG.
     * 
     */
    @Import(name="providerName")
      private final @Nullable Output<String> providerName;

    public Output<String> providerName() {
        return this.providerName == null ? Codegen.empty() : this.providerName;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public LinkAggregationGroupState(
        @Nullable Output<String> arn,
        @Nullable Output<String> connectionId,
        @Nullable Output<String> connectionsBandwidth,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<String> hasLogicalRedundancy,
        @Nullable Output<Boolean> jumboFrameCapable,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> ownerAccountId,
        @Nullable Output<String> providerName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.connectionId = connectionId;
        this.connectionsBandwidth = connectionsBandwidth;
        this.forceDestroy = forceDestroy;
        this.hasLogicalRedundancy = hasLogicalRedundancy;
        this.jumboFrameCapable = jumboFrameCapable;
        this.location = location;
        this.name = name;
        this.ownerAccountId = ownerAccountId;
        this.providerName = providerName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private LinkAggregationGroupState() {
        this.arn = Codegen.empty();
        this.connectionId = Codegen.empty();
        this.connectionsBandwidth = Codegen.empty();
        this.forceDestroy = Codegen.empty();
        this.hasLogicalRedundancy = Codegen.empty();
        this.jumboFrameCapable = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.ownerAccountId = Codegen.empty();
        this.providerName = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkAggregationGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> connectionId;
        private @Nullable Output<String> connectionsBandwidth;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<String> hasLogicalRedundancy;
        private @Nullable Output<Boolean> jumboFrameCapable;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ownerAccountId;
        private @Nullable Output<String> providerName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkAggregationGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.connectionId = defaults.connectionId;
    	      this.connectionsBandwidth = defaults.connectionsBandwidth;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.hasLogicalRedundancy = defaults.hasLogicalRedundancy;
    	      this.jumboFrameCapable = defaults.jumboFrameCapable;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.ownerAccountId = defaults.ownerAccountId;
    	      this.providerName = defaults.providerName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder connectionId(@Nullable Output<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Builder connectionId(@Nullable String connectionId) {
            this.connectionId = Codegen.ofNullable(connectionId);
            return this;
        }
        public Builder connectionsBandwidth(@Nullable Output<String> connectionsBandwidth) {
            this.connectionsBandwidth = connectionsBandwidth;
            return this;
        }
        public Builder connectionsBandwidth(@Nullable String connectionsBandwidth) {
            this.connectionsBandwidth = Codegen.ofNullable(connectionsBandwidth);
            return this;
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Codegen.ofNullable(forceDestroy);
            return this;
        }
        public Builder hasLogicalRedundancy(@Nullable Output<String> hasLogicalRedundancy) {
            this.hasLogicalRedundancy = hasLogicalRedundancy;
            return this;
        }
        public Builder hasLogicalRedundancy(@Nullable String hasLogicalRedundancy) {
            this.hasLogicalRedundancy = Codegen.ofNullable(hasLogicalRedundancy);
            return this;
        }
        public Builder jumboFrameCapable(@Nullable Output<Boolean> jumboFrameCapable) {
            this.jumboFrameCapable = jumboFrameCapable;
            return this;
        }
        public Builder jumboFrameCapable(@Nullable Boolean jumboFrameCapable) {
            this.jumboFrameCapable = Codegen.ofNullable(jumboFrameCapable);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder ownerAccountId(@Nullable Output<String> ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Builder ownerAccountId(@Nullable String ownerAccountId) {
            this.ownerAccountId = Codegen.ofNullable(ownerAccountId);
            return this;
        }
        public Builder providerName(@Nullable Output<String> providerName) {
            this.providerName = providerName;
            return this;
        }
        public Builder providerName(@Nullable String providerName) {
            this.providerName = Codegen.ofNullable(providerName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public LinkAggregationGroupState build() {
            return new LinkAggregationGroupState(arn, connectionId, connectionsBandwidth, forceDestroy, hasLogicalRedundancy, jumboFrameCapable, location, name, ownerAccountId, providerName, tags, tagsAll);
        }
    }
}
