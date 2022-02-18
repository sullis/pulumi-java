// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.enums.State;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings concerning lockbox.
 * 
 */
public final class PropertiesLockboxArgs extends io.pulumi.resources.ResourceArgs {

    public static final PropertiesLockboxArgs Empty = new PropertiesLockboxArgs();

    /**
     * lockbox configuration
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<Either<String,State>> state;

    public Input<Either<String,State>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public PropertiesLockboxArgs(@Nullable Input<Either<String,State>> state) {
        this.state = state;
    }

    private PropertiesLockboxArgs() {
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertiesLockboxArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,State>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertiesLockboxArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder setState(@Nullable Input<Either<String,State>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,State> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public PropertiesLockboxArgs build() {
            return new PropertiesLockboxArgs(state);
        }
    }
}
