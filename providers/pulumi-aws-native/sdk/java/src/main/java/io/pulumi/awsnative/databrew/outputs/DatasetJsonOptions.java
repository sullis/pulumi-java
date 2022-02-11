// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetJsonOptions {
    private final @Nullable Boolean multiLine;

    @OutputCustomType.Constructor({"multiLine"})
    private DatasetJsonOptions(@Nullable Boolean multiLine) {
        this.multiLine = multiLine;
    }

    public Optional<Boolean> getMultiLine() {
        return Optional.ofNullable(this.multiLine);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetJsonOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean multiLine;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetJsonOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiLine = defaults.multiLine;
        }

        public Builder setMultiLine(@Nullable Boolean multiLine) {
            this.multiLine = multiLine;
            return this;
        }

        public DatasetJsonOptions build() {
            return new DatasetJsonOptions(multiLine);
        }
    }
}
