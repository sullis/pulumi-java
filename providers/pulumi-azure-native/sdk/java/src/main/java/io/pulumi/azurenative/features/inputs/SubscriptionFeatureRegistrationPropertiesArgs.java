// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.features.inputs;

import io.pulumi.azurenative.features.enums.SubscriptionFeatureRegistrationState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionFeatureRegistrationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionFeatureRegistrationPropertiesArgs Empty = new SubscriptionFeatureRegistrationPropertiesArgs();

    /**
     * The feature description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Key-value pairs for meta data.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Indicates whether feature should be displayed in Portal.
     * 
     */
    @InputImport(name="shouldFeatureDisplayInPortal")
    private final @Nullable Input<Boolean> shouldFeatureDisplayInPortal;

    public Input<Boolean> getShouldFeatureDisplayInPortal() {
        return this.shouldFeatureDisplayInPortal == null ? Input.empty() : this.shouldFeatureDisplayInPortal;
    }

    /**
     * The state.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<Either<String,SubscriptionFeatureRegistrationState>> state;

    public Input<Either<String,SubscriptionFeatureRegistrationState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public SubscriptionFeatureRegistrationPropertiesArgs(
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<Boolean> shouldFeatureDisplayInPortal,
        @Nullable Input<Either<String,SubscriptionFeatureRegistrationState>> state) {
        this.description = description;
        this.metadata = metadata;
        this.shouldFeatureDisplayInPortal = shouldFeatureDisplayInPortal == null ? Input.ofNullable(false) : shouldFeatureDisplayInPortal;
        this.state = state;
    }

    private SubscriptionFeatureRegistrationPropertiesArgs() {
        this.description = Input.empty();
        this.metadata = Input.empty();
        this.shouldFeatureDisplayInPortal = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionFeatureRegistrationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<Boolean> shouldFeatureDisplayInPortal;
        private @Nullable Input<Either<String,SubscriptionFeatureRegistrationState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionFeatureRegistrationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.metadata = defaults.metadata;
    	      this.shouldFeatureDisplayInPortal = defaults.shouldFeatureDisplayInPortal;
    	      this.state = defaults.state;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setShouldFeatureDisplayInPortal(@Nullable Input<Boolean> shouldFeatureDisplayInPortal) {
            this.shouldFeatureDisplayInPortal = shouldFeatureDisplayInPortal;
            return this;
        }

        public Builder setShouldFeatureDisplayInPortal(@Nullable Boolean shouldFeatureDisplayInPortal) {
            this.shouldFeatureDisplayInPortal = Input.ofNullable(shouldFeatureDisplayInPortal);
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,SubscriptionFeatureRegistrationState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,SubscriptionFeatureRegistrationState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public SubscriptionFeatureRegistrationPropertiesArgs build() {
            return new SubscriptionFeatureRegistrationPropertiesArgs(description, metadata, shouldFeatureDisplayInPortal, state);
        }
    }
}
