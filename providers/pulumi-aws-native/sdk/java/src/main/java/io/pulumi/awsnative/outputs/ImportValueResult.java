// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImportValueResult {
    private final @Nullable Object value;

    @OutputCustomType.Constructor({"value"})
    private ImportValueResult(@Nullable Object value) {
        this.value = value;
    }

    public Optional<Object> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImportValueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(ImportValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = value;
            return this;
        }

        public ImportValueResult build() {
            return new ImportValueResult(value);
        }
    }
}
