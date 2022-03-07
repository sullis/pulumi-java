// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift;

import io.pulumi.awsnative.gamelift.inputs.AliasRoutingStrategyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * A human-readable description of the alias.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A routing configuration that specifies where traffic is directed for this alias, such as to a fleet or to a message.
     * 
     */
    @InputImport(name="routingStrategy", required=true)
      private final Input<AliasRoutingStrategyArgs> routingStrategy;

    public Input<AliasRoutingStrategyArgs> getRoutingStrategy() {
        return this.routingStrategy;
    }

    public AliasArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<AliasRoutingStrategyArgs> routingStrategy) {
        this.description = description;
        this.name = name;
        this.routingStrategy = Objects.requireNonNull(routingStrategy, "expected parameter 'routingStrategy' to be non-null");
    }

    private AliasArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.routingStrategy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<AliasRoutingStrategyArgs> routingStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.routingStrategy = defaults.routingStrategy;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRoutingStrategy(Input<AliasRoutingStrategyArgs> routingStrategy) {
            this.routingStrategy = Objects.requireNonNull(routingStrategy);
            return this;
        }

        public Builder setRoutingStrategy(AliasRoutingStrategyArgs routingStrategy) {
            this.routingStrategy = Input.of(Objects.requireNonNull(routingStrategy));
            return this;
        }
        public AliasArgs build() {
            return new AliasArgs(description, name, routingStrategy);
        }
    }
}