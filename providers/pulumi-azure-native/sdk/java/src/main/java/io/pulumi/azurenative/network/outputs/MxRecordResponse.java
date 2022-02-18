// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MxRecordResponse {
    /**
     * The domain name of the mail host for this MX record.
     * 
     */
    private final @Nullable String exchange;
    /**
     * The preference value for this MX record.
     * 
     */
    private final @Nullable Integer preference;

    @OutputCustomType.Constructor({"exchange","preference"})
    private MxRecordResponse(
        @Nullable String exchange,
        @Nullable Integer preference) {
        this.exchange = exchange;
        this.preference = preference;
    }

    /**
     * The domain name of the mail host for this MX record.
     * 
     */
    public Optional<String> getExchange() {
        return Optional.ofNullable(this.exchange);
    }
    /**
     * The preference value for this MX record.
     * 
     */
    public Optional<Integer> getPreference() {
        return Optional.ofNullable(this.preference);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MxRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exchange;
        private @Nullable Integer preference;

        public Builder() {
    	      // Empty
        }

        public Builder(MxRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exchange = defaults.exchange;
    	      this.preference = defaults.preference;
        }

        public Builder setExchange(@Nullable String exchange) {
            this.exchange = exchange;
            return this;
        }

        public Builder setPreference(@Nullable Integer preference) {
            this.preference = preference;
            return this;
        }

        public MxRecordResponse build() {
            return new MxRecordResponse(exchange, preference);
        }
    }
}
