// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRegistrationActivationKeyResult {
    /**
     * Azure Stack activation key.
     * 
     */
    private final @Nullable String activationKey;

    @OutputCustomType.Constructor({"activationKey"})
    private GetRegistrationActivationKeyResult(@Nullable String activationKey) {
        this.activationKey = activationKey;
    }

    /**
     * Azure Stack activation key.
     * 
     */
    public Optional<String> getActivationKey() {
        return Optional.ofNullable(this.activationKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistrationActivationKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistrationActivationKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
        }

        public Builder setActivationKey(@Nullable String activationKey) {
            this.activationKey = activationKey;
            return this;
        }

        public GetRegistrationActivationKeyResult build() {
            return new GetRegistrationActivationKeyResult(activationKey);
        }
    }
}
