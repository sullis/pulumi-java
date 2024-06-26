// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.foobar.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopLevel {
    private @Nullable String buzz;

    private TopLevel() {}
    public Optional<String> buzz() {
        return Optional.ofNullable(this.buzz);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopLevel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String buzz;
        public Builder() {}
        public Builder(TopLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buzz = defaults.buzz;
        }

        @CustomType.Setter
        public Builder buzz(@Nullable String buzz) {

            this.buzz = buzz;
            return this;
        }
        public TopLevel build() {
            final var _resultValue = new TopLevel();
            _resultValue.buzz = buzz;
            return _resultValue;
        }
    }
}
