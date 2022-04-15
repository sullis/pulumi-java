// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAccessScopeTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkInsightsAccessScopeResult {
    private final @Nullable String createdDate;
    private final @Nullable String networkInsightsAccessScopeArn;
    private final @Nullable String networkInsightsAccessScopeId;
    private final @Nullable List<NetworkInsightsAccessScopeTag> tags;
    private final @Nullable String updatedDate;

    @CustomType.Constructor
    private GetNetworkInsightsAccessScopeResult(
        @CustomType.Parameter("createdDate") @Nullable String createdDate,
        @CustomType.Parameter("networkInsightsAccessScopeArn") @Nullable String networkInsightsAccessScopeArn,
        @CustomType.Parameter("networkInsightsAccessScopeId") @Nullable String networkInsightsAccessScopeId,
        @CustomType.Parameter("tags") @Nullable List<NetworkInsightsAccessScopeTag> tags,
        @CustomType.Parameter("updatedDate") @Nullable String updatedDate) {
        this.createdDate = createdDate;
        this.networkInsightsAccessScopeArn = networkInsightsAccessScopeArn;
        this.networkInsightsAccessScopeId = networkInsightsAccessScopeId;
        this.tags = tags;
        this.updatedDate = updatedDate;
    }

    public Optional<String> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }
    public Optional<String> networkInsightsAccessScopeArn() {
        return Optional.ofNullable(this.networkInsightsAccessScopeArn);
    }
    public Optional<String> networkInsightsAccessScopeId() {
        return Optional.ofNullable(this.networkInsightsAccessScopeId);
    }
    public List<NetworkInsightsAccessScopeTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> updatedDate() {
        return Optional.ofNullable(this.updatedDate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsAccessScopeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdDate;
        private @Nullable String networkInsightsAccessScopeArn;
        private @Nullable String networkInsightsAccessScopeId;
        private @Nullable List<NetworkInsightsAccessScopeTag> tags;
        private @Nullable String updatedDate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInsightsAccessScopeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.networkInsightsAccessScopeArn = defaults.networkInsightsAccessScopeArn;
    	      this.networkInsightsAccessScopeId = defaults.networkInsightsAccessScopeId;
    	      this.tags = defaults.tags;
    	      this.updatedDate = defaults.updatedDate;
        }

        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Builder networkInsightsAccessScopeArn(@Nullable String networkInsightsAccessScopeArn) {
            this.networkInsightsAccessScopeArn = networkInsightsAccessScopeArn;
            return this;
        }
        public Builder networkInsightsAccessScopeId(@Nullable String networkInsightsAccessScopeId) {
            this.networkInsightsAccessScopeId = networkInsightsAccessScopeId;
            return this;
        }
        public Builder tags(@Nullable List<NetworkInsightsAccessScopeTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(NetworkInsightsAccessScopeTag... tags) {
            return tags(List.of(tags));
        }
        public Builder updatedDate(@Nullable String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }        public GetNetworkInsightsAccessScopeResult build() {
            return new GetNetworkInsightsAccessScopeResult(createdDate, networkInsightsAccessScopeArn, networkInsightsAccessScopeId, tags, updatedDate);
        }
    }
}
