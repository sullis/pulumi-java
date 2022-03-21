// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.outputs;

import io.pulumi.awsnative.networkmanager.outputs.GlobalNetworkTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGlobalNetworkResult {
    /**
     * The Amazon Resource Name (ARN) of the global network.
     * 
     */
    private final @Nullable String arn;
    /**
     * The description of the global network.
     * 
     */
    private final @Nullable String description;
    /**
     * The ID of the global network.
     * 
     */
    private final @Nullable String id;
    /**
     * The tags for the global network.
     * 
     */
    private final @Nullable List<GlobalNetworkTag> tags;

    @CustomType.Constructor
    private GetGlobalNetworkResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("tags") @Nullable List<GlobalNetworkTag> tags) {
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the global network.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The description of the global network.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The ID of the global network.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The tags for the global network.
     * 
    */
    public List<GlobalNetworkTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalNetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable List<GlobalNetworkTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder tags(@Nullable List<GlobalNetworkTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(GlobalNetworkTag... tags) {
            return tags(List.of(tags));
        }        public GetGlobalNetworkResult build() {
            return new GetGlobalNetworkResult(arn, description, id, tags);
        }
    }
}
