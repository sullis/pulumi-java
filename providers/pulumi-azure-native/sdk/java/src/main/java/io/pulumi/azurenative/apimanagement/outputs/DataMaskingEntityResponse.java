// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataMaskingEntityResponse {
    /**
     * Data masking mode.
     * 
     */
    private final @Nullable String mode;
    /**
     * The name of an entity to mask (e.g. a name of a header or a query parameter).
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"mode","value"})
    private DataMaskingEntityResponse(
        @Nullable String mode,
        @Nullable String value) {
        this.mode = mode;
        this.value = value;
    }

    /**
     * Data masking mode.
     * 
    */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The name of an entity to mask (e.g. a name of a header or a query parameter).
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataMaskingEntityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mode;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DataMaskingEntityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.value = defaults.value;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public DataMaskingEntityResponse build() {
            return new DataMaskingEntityResponse(mode, value);
        }
    }
}