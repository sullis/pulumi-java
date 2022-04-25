// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager.outputs;

import com.pulumi.awsnative.networkmanager.outputs.LinkBandwidth;
import com.pulumi.awsnative.networkmanager.outputs.LinkTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLinkResult {
    /**
     * @return The Bandwidth for the link.
     * 
     */
    private final @Nullable LinkBandwidth bandwidth;
    /**
     * @return The description of the link.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The Amazon Resource Name (ARN) of the link.
     * 
     */
    private final @Nullable String linkArn;
    /**
     * @return The ID of the link.
     * 
     */
    private final @Nullable String linkId;
    /**
     * @return The provider of the link.
     * 
     */
    private final @Nullable String provider;
    /**
     * @return The tags for the link.
     * 
     */
    private final @Nullable List<LinkTag> tags;
    /**
     * @return The type of the link.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private GetLinkResult(
        @CustomType.Parameter("bandwidth") @Nullable LinkBandwidth bandwidth,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("linkArn") @Nullable String linkArn,
        @CustomType.Parameter("linkId") @Nullable String linkId,
        @CustomType.Parameter("provider") @Nullable String provider,
        @CustomType.Parameter("tags") @Nullable List<LinkTag> tags,
        @CustomType.Parameter("type") @Nullable String type) {
        this.bandwidth = bandwidth;
        this.description = description;
        this.linkArn = linkArn;
        this.linkId = linkId;
        this.provider = provider;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The Bandwidth for the link.
     * 
     */
    public Optional<LinkBandwidth> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }
    /**
     * @return The description of the link.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the link.
     * 
     */
    public Optional<String> linkArn() {
        return Optional.ofNullable(this.linkArn);
    }
    /**
     * @return The ID of the link.
     * 
     */
    public Optional<String> linkId() {
        return Optional.ofNullable(this.linkId);
    }
    /**
     * @return The provider of the link.
     * 
     */
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    /**
     * @return The tags for the link.
     * 
     */
    public List<LinkTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The type of the link.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LinkBandwidth bandwidth;
        private @Nullable String description;
        private @Nullable String linkArn;
        private @Nullable String linkId;
        private @Nullable String provider;
        private @Nullable List<LinkTag> tags;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.description = defaults.description;
    	      this.linkArn = defaults.linkArn;
    	      this.linkId = defaults.linkId;
    	      this.provider = defaults.provider;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder bandwidth(@Nullable LinkBandwidth bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder linkArn(@Nullable String linkArn) {
            this.linkArn = linkArn;
            return this;
        }
        public Builder linkId(@Nullable String linkId) {
            this.linkId = linkId;
            return this;
        }
        public Builder provider(@Nullable String provider) {
            this.provider = provider;
            return this;
        }
        public Builder tags(@Nullable List<LinkTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(LinkTag... tags) {
            return tags(List.of(tags));
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public GetLinkResult build() {
            return new GetLinkResult(bandwidth, description, linkArn, linkId, provider, tags, type);
        }
    }
}
