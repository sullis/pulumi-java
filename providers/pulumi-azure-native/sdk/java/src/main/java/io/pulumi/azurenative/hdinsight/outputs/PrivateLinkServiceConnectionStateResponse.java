// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateLinkServiceConnectionStateResponse {
    /**
     * Whether there is further actions.
     * 
     */
    private final @Nullable String actionsRequired;
    /**
     * The optional description of the status.
     * 
     */
    private final @Nullable String description;
    /**
     * The concrete private link service connection.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"actionsRequired","description","status"})
    private PrivateLinkServiceConnectionStateResponse(
        @Nullable String actionsRequired,
        @Nullable String description,
        String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Whether there is further actions.
     * 
    */
    public Optional<String> getActionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }
    /**
     * The optional description of the status.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The concrete private link service connection.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private @Nullable String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(actionsRequired, description, status);
        }
    }
}