// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.outputs;

import io.pulumi.awsnative.location.enums.PlaceIndexIntendedUse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PlaceIndexDataSourceConfiguration {
    private final @Nullable PlaceIndexIntendedUse intendedUse;

    @OutputCustomType.Constructor({"intendedUse"})
    private PlaceIndexDataSourceConfiguration(@Nullable PlaceIndexIntendedUse intendedUse) {
        this.intendedUse = intendedUse;
    }

    public Optional<PlaceIndexIntendedUse> getIntendedUse() {
        return Optional.ofNullable(this.intendedUse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlaceIndexDataSourceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PlaceIndexIntendedUse intendedUse;

        public Builder() {
    	      // Empty
        }

        public Builder(PlaceIndexDataSourceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intendedUse = defaults.intendedUse;
        }

        public Builder setIntendedUse(@Nullable PlaceIndexIntendedUse intendedUse) {
            this.intendedUse = intendedUse;
            return this;
        }

        public PlaceIndexDataSourceConfiguration build() {
            return new PlaceIndexDataSourceConfiguration(intendedUse);
        }
    }
}
