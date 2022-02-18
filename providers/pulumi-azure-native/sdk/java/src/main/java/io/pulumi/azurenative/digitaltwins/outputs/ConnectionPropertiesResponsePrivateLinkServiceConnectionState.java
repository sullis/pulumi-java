// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionPropertiesResponsePrivateLinkServiceConnectionState {
    /**
     * Actions required for a private endpoint connection.
     * 
     */
    private final @Nullable String actionsRequired;
    /**
     * The description for the current state of a private endpoint connection.
     * 
     */
    private final String description;
    /**
     * The status of a private endpoint connection.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"actionsRequired","description","status"})
    private ConnectionPropertiesResponsePrivateLinkServiceConnectionState(
        @Nullable String actionsRequired,
        String description,
        String status) {
        this.actionsRequired = actionsRequired;
        this.description = Objects.requireNonNull(description);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Actions required for a private endpoint connection.
     * 
     */
    public Optional<String> getActionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }
    /**
     * The description for the current state of a private endpoint connection.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The status of a private endpoint connection.
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionPropertiesResponsePrivateLinkServiceConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionPropertiesResponsePrivateLinkServiceConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public ConnectionPropertiesResponsePrivateLinkServiceConnectionState build() {
            return new ConnectionPropertiesResponsePrivateLinkServiceConnectionState(actionsRequired, description, status);
        }
    }
}
