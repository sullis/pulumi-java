// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProgressPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProgressPropertiesResponse Empty = new ProgressPropertiesResponse();

    /**
     * The percentage complete of the copy operation.
     * 
     */
    @InputImport(name="percentage")
    private final @Nullable String percentage;

    public Optional<String> getPercentage() {
        return this.percentage == null ? Optional.empty() : Optional.ofNullable(this.percentage);
    }

    public ProgressPropertiesResponse(@Nullable String percentage) {
        this.percentage = percentage;
    }

    private ProgressPropertiesResponse() {
        this.percentage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProgressPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(ProgressPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentage = defaults.percentage;
        }

        public Builder setPercentage(@Nullable String percentage) {
            this.percentage = percentage;
            return this;
        }

        public ProgressPropertiesResponse build() {
            return new ProgressPropertiesResponse(percentage);
        }
    }
}
