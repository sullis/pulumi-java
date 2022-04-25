// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TxtRecordResponse {
    /**
     * @return The text value of this TXT record.
     * 
     */
    private final @Nullable List<String> value;

    @CustomType.Constructor
    private TxtRecordResponse(@CustomType.Parameter("value") @Nullable List<String> value) {
        this.value = value;
    }

    /**
     * @return The text value of this TXT record.
     * 
     */
    public List<String> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TxtRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TxtRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable List<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(String... value) {
            return value(List.of(value));
        }        public TxtRecordResponse build() {
            return new TxtRecordResponse(value);
        }
    }
}
