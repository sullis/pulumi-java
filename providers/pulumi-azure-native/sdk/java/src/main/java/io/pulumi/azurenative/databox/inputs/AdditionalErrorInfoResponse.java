// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional error info.
 * 
 */
public final class AdditionalErrorInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdditionalErrorInfoResponse Empty = new AdditionalErrorInfoResponse();

    /**
     * Additional error info.
     * 
     */
    @InputImport(name="info")
    private final @Nullable Object info;

    public Optional<Object> getInfo() {
        return this.info == null ? Optional.empty() : Optional.ofNullable(this.info);
    }

    /**
     * Additional error type.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public AdditionalErrorInfoResponse(
        @Nullable Object info,
        @Nullable String type) {
        this.info = info;
        this.type = type;
    }

    private AdditionalErrorInfoResponse() {
        this.info = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalErrorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object info;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalErrorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.info = defaults.info;
    	      this.type = defaults.type;
        }

        public Builder setInfo(@Nullable Object info) {
            this.info = info;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public AdditionalErrorInfoResponse build() {
            return new AdditionalErrorInfoResponse(info, type);
        }
    }
}
