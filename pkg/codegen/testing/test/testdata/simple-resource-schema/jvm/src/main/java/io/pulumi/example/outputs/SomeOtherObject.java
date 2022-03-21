// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SomeOtherObject {
    private final @Nullable String baz;

    @CustomType.Constructor
    private SomeOtherObject(@CustomType.Parameter("baz") @Nullable String baz) {
        this.baz = baz;
    }

    public Optional<String> getBaz() {
        return Optional.ofNullable(this.baz);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SomeOtherObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String baz;

        public Builder() {
    	      // Empty
        }

        public Builder(SomeOtherObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baz = defaults.baz;
        }

        public Builder baz(@Nullable String baz) {
            this.baz = baz;
            return this;
        }        public SomeOtherObject build() {
            return new SomeOtherObject(baz);
        }
    }
}
