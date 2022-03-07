// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A CAA record.
 * 
 */
public final class CaaRecordResponse extends io.pulumi.resources.InvokeArgs {

    public static final CaaRecordResponse Empty = new CaaRecordResponse();

    /**
     * The flags for this CAA record as an integer between 0 and 255.
     * 
     */
    @InputImport(name="flags")
      private final @Nullable Integer flags;

    public Optional<Integer> getFlags() {
        return this.flags == null ? Optional.empty() : Optional.ofNullable(this.flags);
    }

    /**
     * The tag for this CAA record.
     * 
     */
    @InputImport(name="tag")
      private final @Nullable String tag;

    public Optional<String> getTag() {
        return this.tag == null ? Optional.empty() : Optional.ofNullable(this.tag);
    }

    /**
     * The value for this CAA record.
     * 
     */
    @InputImport(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public CaaRecordResponse(
        @Nullable Integer flags,
        @Nullable String tag,
        @Nullable String value) {
        this.flags = flags;
        this.tag = tag;
        this.value = value;
    }

    private CaaRecordResponse() {
        this.flags = null;
        this.tag = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaaRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer flags;
        private @Nullable String tag;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CaaRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flags = defaults.flags;
    	      this.tag = defaults.tag;
    	      this.value = defaults.value;
        }

        public Builder setFlags(@Nullable Integer flags) {
            this.flags = flags;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public CaaRecordResponse build() {
            return new CaaRecordResponse(flags, tag, value);
        }
    }
}