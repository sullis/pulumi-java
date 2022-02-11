// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedExecutionProperties extends io.pulumi.resources.InvokeArgs {

    public static final ManagedExecutionProperties Empty = new ManagedExecutionProperties();

    @InputImport(name="active")
    private final @Nullable Boolean active;

    public Optional<Boolean> getActive() {
        return this.active == null ? Optional.empty() : Optional.ofNullable(this.active);
    }

    public ManagedExecutionProperties(@Nullable Boolean active) {
        this.active = active;
    }

    private ManagedExecutionProperties() {
        this.active = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedExecutionProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean active;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedExecutionProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
        }

        public Builder setActive(@Nullable Boolean active) {
            this.active = active;
            return this;
        }

        public ManagedExecutionProperties build() {
            return new ManagedExecutionProperties(active);
        }
    }
}
