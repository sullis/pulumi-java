// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings concerning lockbox.
 * 
 */
public final class PropertiesResponseLockbox extends io.pulumi.resources.InvokeArgs {

    public static final PropertiesResponseLockbox Empty = new PropertiesResponseLockbox();

    /**
     * lockbox configuration
     * 
     */
    @InputImport(name="state")
    private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public PropertiesResponseLockbox(@Nullable String state) {
        this.state = state;
    }

    private PropertiesResponseLockbox() {
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertiesResponseLockbox defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertiesResponseLockbox defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public PropertiesResponseLockbox build() {
            return new PropertiesResponseLockbox(state);
        }
    }
}
