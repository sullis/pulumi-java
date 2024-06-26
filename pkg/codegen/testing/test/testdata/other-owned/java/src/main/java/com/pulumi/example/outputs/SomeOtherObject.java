// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SomeOtherObject {
    private @Nullable String baz;

    private SomeOtherObject() {}
    public Optional<String> baz() {
        return Optional.ofNullable(this.baz);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SomeOtherObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String baz;
        public Builder() {}
        public Builder(SomeOtherObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baz = defaults.baz;
        }

        @CustomType.Setter
        public Builder baz(@Nullable String baz) {

            this.baz = baz;
            return this;
        }
        public SomeOtherObject build() {
            final var _resultValue = new SomeOtherObject();
            _resultValue.baz = baz;
            return _resultValue;
        }
    }
}
